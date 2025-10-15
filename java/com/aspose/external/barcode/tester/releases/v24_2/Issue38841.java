package com.aspose.external.barcode.tester.releases.v24_2;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Issue38841
{
    private String _folder = Global.getTestDataFolder("Issues\\Issue38841");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_NonBlockingFile()
    {
        BarCodeReader reader1 = new BarCodeReader(Global.pathCombine(this._folder, "qr_in1.png"), DecodeType.QR);
        BarCodeReader reader2 = new BarCodeReader(Global.pathCombine(this._folder, "qr_in1.png"), DecodeType.QR);
        {
            Assert.assertEquals(1, reader1.readBarCodes().length);
            Assert.assertEquals("http://my.opera.com/community/", reader1.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(1, reader2.readBarCodes().length);
            Assert.assertEquals("http://my.opera.com/community/", reader2.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_NonBlockingStream() throws IOException {
        InputStream fis = Files.newInputStream(Paths.get(Global.pathCombine(this._folder, "qr_in1.png")));
        {
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer, 0, buffer.length);
            InputStream lFstr = new ByteArrayInputStream(buffer);
            BarCodeReader reader1 = new BarCodeReader(lFstr, DecodeType.QR);
            {
                lFstr.reset();
//                lFstr.Position = 0;
                BarCodeReader reader2 = new BarCodeReader(lFstr, DecodeType.QR);
                {
                    Assert.assertEquals(1, reader1.readBarCodes().length);
                    Assert.assertEquals("http://my.opera.com/community/", reader1.getFoundBarCodes()[0].getCodeText());
                    Assert.assertEquals(1, reader2.readBarCodes().length);
                    Assert.assertEquals("http://my.opera.com/community/", reader2.getFoundBarCodes()[0].getCodeText());
                }
            }
        }
    }

    @Test
    public void test_NonBlockingBitmap() throws IOException {
        BufferedImage bmp = ImageIO.read(new File(Global.pathCombine(this._folder, "qr_in1.png")));
        {
            BarCodeReader reader1 = new BarCodeReader(bmp, DecodeType.QR);
            BarCodeReader reader2 = new BarCodeReader(bmp, DecodeType.QR);
            {
                Assert.assertEquals(1, reader1.readBarCodes().length);
                Assert.assertEquals("http://my.opera.com/community/", reader1.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(1, reader2.readBarCodes().length);
                Assert.assertEquals("http://my.opera.com/community/", reader2.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

    @Test
    public void test_StreamFromZeroPosition() throws IOException {
        ByteArrayOutputStream ms = new ByteArrayOutputStream();
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.QR, "http://my.opera.com/community/");
        {
            gen.save(ms, BarCodeImageFormat.PNG);
            BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(ms.toByteArray()), DecodeType.QR);
            {
                Assert.assertEquals(1, reader.readBarCodes().length);
                Assert.assertEquals("http://my.opera.com/community/", reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }
}
