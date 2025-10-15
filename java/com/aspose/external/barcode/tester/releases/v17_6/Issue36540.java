package com.aspose.external.barcode.tester.releases.v17_6;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Issue36540
{
    private class Code128DataPortionMoq
    {
        private int code128SubType;
        private String data;

        public Code128DataPortionMoq(int type, String data)
        {
            this.code128SubType = type;
            this.data = data;
        }
    }
    private static String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue36540");

        @Test
    public void testObtainStartSymbols() throws IOException
        {
        List<Code128DataPortionMoq> expectedCode128DataPortions = new ArrayList<Code128DataPortionMoq>();

        expectedCode128DataPortions.add(new Code128DataPortionMoq(Code128SubType.CODE_SET_A, "E"));
        expectedCode128DataPortions.add(new Code128DataPortionMoq(Code128SubType.CODE_SET_C, "70009450"));
        expectedCode128DataPortions.add(new Code128DataPortionMoq(Code128SubType.CODE_SET_A, "_REIN"));

        String fileName = Global.pathCombine(folder, "1bc.png");

        BufferedImage bitmap = ImageIO.read(new File(fileName));
        {
            BarCodeReader reader = new BarCodeReader(bitmap, DecodeType.CODE_128);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                BarCodeResult result = reader.getFoundBarCodes()[0];
                Assert.assertEquals(expectedCode128DataPortions.size(), result.getExtended().getCode128().getCode128DataPortions().length);
                for (int i = 0; i < expectedCode128DataPortions.size(); i++)
                {
                    Assert.assertEquals(expectedCode128DataPortions.get(i).code128SubType,
                            result.getExtended().getCode128().getCode128DataPortions()[i].getCode128SubType());
                    Assert.assertEquals(expectedCode128DataPortions.get(i).data, result.getExtended().getCode128().getCode128DataPortions()[i].getData());
                }
            }
        }
    }

        @Test
        //[Category("Code128")]
    public void testSubtypeBCode128()
    {
        Code128DataPortionMoq expectedCode128DataPortion = new Code128DataPortionMoq(Code128SubType.CODE_SET_B, "<FNC1>abc");

        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "code128_B.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            BarCodeResult result = reader.getFoundBarCodes()[0];
            Assert.assertEquals(1, result.getExtended().getCode128().getCode128DataPortions().length);
            Code128DataPortion actualCode128DataPortion = result.getExtended().getCode128().getCode128DataPortions()[0];
            Assert.assertEquals(expectedCode128DataPortion.data, actualCode128DataPortion.getData());
            Assert.assertEquals(expectedCode128DataPortion.code128SubType, actualCode128DataPortion.getCode128SubType());
        }
    }

        @Test
        //[Category("Code128")]
    public void testSubtypeCCode128()
    {
        Code128DataPortionMoq expectedCode128DataPortion = new Code128DataPortionMoq(Code128SubType.CODE_SET_C, "12345678");

        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "code128_C.png"), DecodeType.CODE_128);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            Assert.assertEquals(reader.readBarCodes().length, 1);
            BarCodeResult result = reader.getFoundBarCodes()[0];
            Assert.assertEquals(1, result.getExtended().getCode128().getCode128DataPortions().length);
            Code128DataPortion actualCode128DataPortion = result.getExtended().getCode128().getCode128DataPortions()[0];
            Assert.assertEquals(expectedCode128DataPortion.data, actualCode128DataPortion.getData());
            Assert.assertEquals(expectedCode128DataPortion.code128SubType, actualCode128DataPortion.getCode128SubType());
        }
    }

        @Test
    public void testNonCode128()
    {
        
                BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "Aspose.BarCodeAuto.bmp"),
                        DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            BarCodeResult result = reader.getFoundBarCodes()[0];
            Assert.assertEquals(0, result.getExtended().getCode128().getCode128DataPortions().length);
        }
    }

        @Test
        //[Category("Code128")]
    public void testSubtypesABC()
    {
        List<List<Code128DataPortionMoq>> expectedCode128DataPortions = new ArrayList<List<Code128DataPortionMoq>>();

        List<Code128DataPortionMoq> expectedCode128DataPortion = new ArrayList<Code128DataPortionMoq>();
        expectedCode128DataPortion.add(new Code128DataPortionMoq(Code128SubType.CODE_SET_C, "12345678"));
        expectedCode128DataPortions.add(expectedCode128DataPortion);

        expectedCode128DataPortion = new ArrayList<Code128DataPortionMoq>();
        expectedCode128DataPortion.add(new Code128DataPortionMoq(Code128SubType.CODE_SET_B, "<FNC1>abc"));
        expectedCode128DataPortions.add(expectedCode128DataPortion);

        expectedCode128DataPortion = new ArrayList<Code128DataPortionMoq>();
        expectedCode128DataPortion.add(new Code128DataPortionMoq(Code128SubType.CODE_SET_A, "4"));
        expectedCode128DataPortion.add(new Code128DataPortionMoq(Code128SubType.CODE_SET_B, "b"));
        expectedCode128DataPortion.add(new Code128DataPortionMoq(Code128SubType.CODE_SET_A, "I"));
        expectedCode128DataPortion.add(new Code128DataPortionMoq(Code128SubType.CODE_SET_B, "`uxj"));
        expectedCode128DataPortion.add(new Code128DataPortionMoq(Code128SubType.CODE_SET_A, "9G"));
        expectedCode128DataPortion.add(new Code128DataPortionMoq(Code128SubType.CODE_SET_B, "nlx"));
        expectedCode128DataPortions.add(expectedCode128DataPortion);

        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "code128_A_B_C.png"), DecodeType.CODE_128);
        {
            int i = 0;
            for(BarCodeResult result : reader.readBarCodes())
            {
                Assert.assertEquals(expectedCode128DataPortions.get(i).size(), result.getExtended().getCode128().getCode128DataPortions().length);
                for (int j = 0; j < expectedCode128DataPortions.get(i).size(); j++)
                {
                    int code128SubType = expectedCode128DataPortions.get(i).get(j).code128SubType;
                    String data = expectedCode128DataPortions.get(i).get(j).data;
                    Assert.assertEquals(expectedCode128DataPortions.get(i).get(j).code128SubType, code128SubType);
                    Assert.assertEquals(expectedCode128DataPortions.get(i).get(j).data, data);
                }
                i++;
            }
        }
    }

        @Test
        //[Category("Code128")]
    public void testSubtypeACode128()
    {
        List<Code128DataPortionMoq> expecteCode128DataPortions = new ArrayList<Code128DataPortionMoq>();

        expecteCode128DataPortions.add(new Code128DataPortionMoq(Code128SubType.CODE_SET_A, "4"));
        expecteCode128DataPortions.add(new Code128DataPortionMoq(Code128SubType.CODE_SET_B, "b"));
        expecteCode128DataPortions.add(new Code128DataPortionMoq(Code128SubType.CODE_SET_A, "I"));
        expecteCode128DataPortions.add(new Code128DataPortionMoq(Code128SubType.CODE_SET_B, "`uxj"));
        expecteCode128DataPortions.add(new Code128DataPortionMoq(Code128SubType.CODE_SET_A, "9G"));
        expecteCode128DataPortions.add(new Code128DataPortionMoq(Code128SubType.CODE_SET_B, "nlx"));

        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "code128_A.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            BarCodeResult result = reader.getFoundBarCodes()[0];
            Assert.assertEquals(expecteCode128DataPortions.size(), result.getExtended().getCode128().getCode128DataPortions().length);
            for (int i = 0; i < expecteCode128DataPortions.size(); i++)
            {
                int actualCode128SubType = result.getExtended().getCode128().getCode128DataPortions()[i].getCode128SubType();
                String actualData = result.getExtended().getCode128().getCode128DataPortions()[i].getData();
                Assert.assertEquals(expecteCode128DataPortions.get(i).code128SubType, actualCode128SubType);
                Assert.assertEquals(expecteCode128DataPortions.get(i).data, actualData);
            }
        }
    }
}
