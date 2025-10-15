package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeRecognitionException;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

@Test(description = "Tests for Issue-23729.")
public class Issue23729
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue23729");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

        @Test
    public void Usual()
    {
        String fileName = Global.pathCombine(folder, "aspose.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("755-ZZZZ-4567890-SAA", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void Empty()
    {
        try
        {
            BarCodeReader reader = new BarCodeReader();
            {
                reader.readBarCodes();
            }
        }
        catch (BarCodeRecognitionException e)
        {
            return;
        }
        Assert.fail("BarCodeRecognitionException expected");
    }

        @Test
    public void OnlyBarCodeReadType()
    {
        try
        {
            BarCodeReader reader = new BarCodeReader();
            {
                reader.setBarCodeReadType(DecodeType.QR);
                reader.readBarCodes();
            }
        }
        catch (BarCodeRecognitionException e)
        {
            return;
        }
        Assert.fail("BarCodeRecognitionException expected");
    }

        @Test
    public void WrongFileName1()
    {
        try
        {
            String fileName = Global.pathCombine(folder, "nofile.png");
            BarCodeReader reader = new BarCodeReader();
            {
                reader.setBarCodeImage(fileName);
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals("755-ZZZZ-4567890-SAA", reader.getFoundBarCodes()[0].getCodeText());
            }
        }
        catch (IllegalArgumentException e)
        {
            return;
        }
        Assert.fail("ArgumentException expected");
    }

        @Test
    public void WrongFileName2()
    {
        try
        {
            String fileName = Global.pathCombine(folder, "nofile.png");
            BarCodeReader reader = new BarCodeReader(fileName);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals("755-ZZZZ-4567890-SAA", reader.getFoundBarCodes()[0].getCodeText());
            }
        }
        catch (IllegalArgumentException e)
        {
            return;
        }
        Assert.fail("ArgumentException expected");
    }

        @Test
    public void OnlyFileName()
    {
        String fileName = Global.pathCombine(folder, "aspose.png");
        BarCodeReader reader = new BarCodeReader();
        {
            reader.setBarCodeImage(fileName);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("755-ZZZZ-4567890-SAA", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void FileNameAndReadType()
    {
        String fileName = Global.pathCombine(folder, "aspose.png");
        BarCodeReader reader = new BarCodeReader();
        {
            reader.setBarCodeImage(fileName);
            reader.setBarCodeReadType(DecodeType.QR);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("755-ZZZZ-4567890-SAA", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void FileNameAndWrongReadType()
    {
        String fileName = Global.pathCombine(folder, "aspose.png");
        BarCodeReader reader = new BarCodeReader();
        {
            reader.setBarCodeImage(fileName);
            reader.setBarCodeReadType(DecodeType.STANDARD_2_OF_5);
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
    public void OnlyBitmap() throws IOException
        {
        String fileName = Global.pathCombine(folder, "aspose.png");
        BarCodeReader reader = new BarCodeReader();
        {
            BufferedImage bmp = ImageIO.read(new File(fileName));
            {
                reader.setBarCodeImage(bmp);
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals("755-ZZZZ-4567890-SAA", reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

        @Test
    public void BitmapAndReadType() throws IOException
        {
        String fileName = Global.pathCombine(folder, "aspose.png");
        BarCodeReader reader = new BarCodeReader();
        {
            BufferedImage bmp = ImageIO.read(new File(fileName));
            {
                reader.setBarCodeImage(bmp);
                reader.setBarCodeReadType(DecodeType.QR);
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals("755-ZZZZ-4567890-SAA", reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

        @Test
    public void BitmapAndWrongReadType() throws IOException
        {
        String fileName = Global.pathCombine(folder, "aspose.png");
        BarCodeReader reader = new BarCodeReader();
        {
            BufferedImage bmp = ImageIO.read(new File(fileName));
            {
                reader.setBarCodeImage(bmp);
                reader.setBarCodeReadType(DecodeType.STANDARD_2_OF_5);
                Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
            }
        }
    }
}

