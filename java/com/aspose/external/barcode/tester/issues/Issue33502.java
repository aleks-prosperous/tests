package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue33502.")
public class Issue33502
{
    final String folder = Global.getTestDataFolder("Issues/Issue33502");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void test36828jpg()
    {
        String fileName = Global.pathCombine(folder, "36828.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 2);
            Assert.assertEquals("QES265", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("AUTOMATEDAPPROVAL", reader.getFoundBarCodes()[1].getCodeText());
        }
    }

        @Test
    public void test36828tif()
    {
        String fileName = Global.pathCombine(folder, "36828.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 2);
            Assert.assertEquals("QES265", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("AUTOMATEDAPPROVAL", reader.getFoundBarCodes()[1].getCodeText());
        }
    }

        @Test
    public void test36828jpgOnlySmall()
    {
        String fileName = Global.pathCombine(folder, "36828_smallercode.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("AUTOMATEDAPPROVAL", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test36828jpgOnlySmallDescaled()
    {
        String fileName = Global.pathCombine(folder, "36828_smallercode_descaled.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("AUTOMATEDAPPROVAL", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test42310jpg()
    {
        String fileName = Global.pathCombine(folder, "42310.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 2);
            Assert.assertEquals("QES149", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("AUTOMATEDAPPROVAL", reader.getFoundBarCodes()[1].getCodeText());
        }
    }

        @Test
    public void test42310tif()
    {
        String fileName = Global.pathCombine(folder, "42310.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 2);
            Assert.assertEquals("QES149", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("AUTOMATEDAPPROVAL", reader.getFoundBarCodes()[1].getCodeText());
        }
    }

        @Test
    public void test42310jpgAllTypes()
    {
        String fileName = Global.pathCombine(folder, "42310.jpg");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            Assert.assertEquals(reader.readBarCodes().length, 2);
            Assert.assertEquals("QES149", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("AUTOMATEDAPPROVAL", reader.getFoundBarCodes()[1].getCodeText());
        }
    }

        @Test
    public void test42310jpgOnlySmall()
    {
        String fileName = Global.pathCombine(folder, "42310_smallercode.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("AUTOMATEDAPPROVAL", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test46486jpg()
    {
        String fileName = Global.pathCombine(folder, "46486.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("QES1364", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test46486tiff()
    {
        String fileName = Global.pathCombine(folder, "46486.tiff");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("QES1364", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test46486jpg_descaled()
    {
        String fileName = Global.pathCombine(folder, "46486_descaled.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("QES1364", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}

