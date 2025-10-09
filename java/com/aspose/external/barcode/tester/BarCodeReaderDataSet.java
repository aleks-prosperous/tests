package com.aspose.external.barcode.tester;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BaseDecodeType;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.MultyDecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class BarCodeReaderDataSet
{
    private String filename;
    private String codetext;
    private BaseDecodeType readtype;
    private Rectangle bitmapRect;

        @BeforeMethod
    public void SetupTestFixture()
    {
        filename = Global.pathCombine(Global.getTestDataFolder("Recognition\\1D\\Code128\\"), "bc-code128.png");
        codetext = "12345678901234";
        readtype = DecodeType.CODE_128;
        bitmapRect = new Rectangle(0, 0, 264, 120);
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }


        @Test
    public void test_SetBarCodeImage_Bitmap() throws IOException
        {
        BarCodeReader reader = new BarCodeReader();
        {
            reader.setBarCodeReadType(readtype);
            reader.setBarCodeImage(getBitmapFromFile(filename));
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_SetBarCodeImage_Bitmap_Rectangle() throws IOException
        {
        BarCodeReader reader = new BarCodeReader();
        {
            reader.setBarCodeReadType(readtype);
            reader.setBarCodeImage(getBitmapFromFile(filename), bitmapRect);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_SetBarCodeImage_Bitmap_RectangleArray() throws IOException
        {
        BarCodeReader reader = new BarCodeReader();
        {
            reader.setBarCodeReadType(readtype);
            reader.setBarCodeImage(getBitmapFromFile(filename), new Rectangle[] { bitmapRect });
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_SetBarCodeImage_string()
    {
        BarCodeReader reader = new BarCodeReader();
        {
            reader.setBarCodeReadType(readtype);
            reader.setBarCodeImage(filename);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_SetBarCodeImage_Stream() throws IOException
        {
        BarCodeReader reader = new BarCodeReader();
        {
            reader.setBarCodeReadType(readtype);
            reader.setBarCodeImage(getStreamFromFile(filename));
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_BarCodeReader_Bitmap() throws IOException
        {
        BarCodeReader reader = new BarCodeReader(getBitmapFromFile(filename));
        {
            reader.setBarCodeReadType(readtype);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_BarCodeReader_Bitmap_BaseDecodeTypeList() throws IOException
        {
        BarCodeReader reader = new BarCodeReader(getBitmapFromFile(filename), readtype, DecodeType.CODE_39_FULL_ASCII);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_BarCodeReader_Bitmap_BaseDecodeType() throws IOException
        {
        BarCodeReader reader = new BarCodeReader(getBitmapFromFile(filename), readtype);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_BarCodeReader_Bitmap_Rectangle_BaseDecodeTypeList() throws IOException
        {
        BarCodeReader reader = new BarCodeReader(getBitmapFromFile(filename), bitmapRect, readtype, DecodeType.CODE_39_FULL_ASCII);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_BarCodeReader_Bitmap_Rectangle_BaseDecodeType() throws IOException
        {
        BarCodeReader reader = new BarCodeReader(getBitmapFromFile(filename), bitmapRect, readtype);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_BarCodeReader_Bitmap_RectangleList_BaseDecodeTypeList() throws IOException
        {
        BarCodeReader reader = new BarCodeReader(getBitmapFromFile(filename), new Rectangle[] { bitmapRect }, new MultyDecodeType(readtype, DecodeType.CODE_39_FULL_ASCII));
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_BarCodeReader_Bitmap_RectangleList_BaseDecodeType() throws IOException
        {
        BarCodeReader reader = new BarCodeReader(getBitmapFromFile(filename), new Rectangle[] { bitmapRect }, readtype);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_BarCodeReader_string()
    {
        BarCodeReader reader = new BarCodeReader(filename);
        {
            reader.setBarCodeReadType(readtype);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_BarCodeReader_string_BaseDecodeTypeList()
    {
        BarCodeReader reader = new BarCodeReader(filename, readtype, DecodeType.CODE_39_FULL_ASCII);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_BarCodeReader_string_BaseDecodeType()
    {
        BarCodeReader reader = new BarCodeReader(filename, readtype);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_BarCodeReader_Stream() throws IOException
        {
        BarCodeReader reader = new BarCodeReader(getStreamFromFile(filename));
        {
            reader.setBarCodeReadType(readtype);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_BarCodeReader_Stream_BaseDecodeTypeList() throws IOException
        {
        BarCodeReader reader = new BarCodeReader(getStreamFromFile(filename), readtype, DecodeType.CODE_39_FULL_ASCII);
        {
            reader.setBarCodeReadType(readtype);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_BarCodeReader_Stream_BaseDecodeType() throws IOException
        {
        BarCodeReader reader = new BarCodeReader(getStreamFromFile(filename), readtype);
        {
            reader.setBarCodeReadType(readtype);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    private InputStream getStreamFromFile(String aFileName) throws IOException
    {
        File file = new File(aFileName);
        byte[] lBuff = new byte[(int) file.length()];
        //convert file into array of bytes
        FileInputStream fileInputStream = new FileInputStream(file);
        fileInputStream.read(lBuff);
        fileInputStream.close();

        ByteArrayInputStream lMStr = new ByteArrayInputStream(lBuff);

//        ByteArrayInputStream lMStr = new ByteArrayInputStream(lBuff);
//        lMStr.Position = 0;
        return lMStr;
    }

    private BufferedImage getBitmapFromFile(String aFileName) throws IOException
    {
        return ImageIO.read(new File(aFileName));
    }
}
