package com.aspose.external.barcode.tester.releases.v20_7;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.BaseEncodeType;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.awt.image.BufferedImage;

public class Issue37514
{
    /// <summary>
    /// Path to folder with files for testing Issue37514.
    /// </summary>
    private String Folder = Global.getTestDataFolder("issues/Issue37514");

    @BeforeMethod
    public void SetUp()
    {
        LicenseAssistant.setupLicense();
    }

    private void GenerateAndRecognize(BaseEncodeType encType, String EncCodetext, BaseDecodeType decType,
                                      SingleDecodeType resCodeType, String resCodetext)
    {
        BarcodeGenerator generator = new BarcodeGenerator(encType, EncCodetext);
        {
            BufferedImage bmp = generator.generateBarCodeImage();
            {
                BarCodeReader reader = new BarCodeReader(bmp, decType);
                reader.setQualitySettings(QualitySettings.getHighPerformance());
                {
                    Assert.assertEquals(reader.readBarCodes().length, 1);
                    Assert.assertEquals(resCodetext, reader.getFoundBarCodes()[0].getCodeText());
                    Assert.assertEquals(resCodeType, reader.getFoundBarCodes()[0].getCodeType());
                }
            }
        }
    }

        @Test
    public void test_ITF6()
    {
        String fileName = Global.pathCombine(Folder, "ITF6.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.INTERLEAVED_2_OF_5, DecodeType.ITF_6);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123457", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.ITF_6, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
    public void test_FakeITF6()
    {
        String fileName = Global.pathCombine(Folder, "FakeITF6.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.INTERLEAVED_2_OF_5, DecodeType.ITF_6);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.INTERLEAVED_2_OF_5, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
    public void test_FakeITF6_ITF6()
    {
        String fileName = Global.pathCombine(Folder, "FakeITF6.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ITF_6);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.INTERLEAVED_2_OF_5, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
    public void test_GeneratedImages()
    {
        GenerateAndRecognize(EncodeTypes.ITF_6, "12345", DecodeType.ITF_6, DecodeType.ITF_6, "123457");
        GenerateAndRecognize(EncodeTypes.ITF_6, "123457", DecodeType.ITF_6, DecodeType.ITF_6, "123457");
        GenerateAndRecognize(EncodeTypes.ITF_6, "123456", DecodeType.ITF_6, DecodeType.ITF_6, "123457");
        GenerateAndRecognize(EncodeTypes.INTERLEAVED_2_OF_5, "123456", DecodeType.ITF_6, DecodeType.INTERLEAVED_2_OF_5, "123456");
        GenerateAndRecognize(EncodeTypes.ITF_6, "222222", DecodeType.ITF_6, DecodeType.ITF_6, "222228");
        GenerateAndRecognize(EncodeTypes.ITF_6, "22222", DecodeType.ITF_6, DecodeType.ITF_6, "222228");
    }

}
