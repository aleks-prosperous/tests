package com.aspose.external.barcode.tester.releases.v76;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue34306
{
    final String _folder = Global.getTestDataFolder("Issues/Issue34306/");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test_Issue34306_getangle_test1_tif_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "getangle_test1.tif"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            double actualAngle = reader.getFoundBarCodes()[0].getRegion().getAngle();
            Assert.assertTrue(0 <= actualAngle && actualAngle <= 2, "Actual angle is out of range: (0,2). Test: @\'Issue34306\\getangle_test1.tif\' ");
        }
        System.out.println("Test for \"Issue34306\\getangle_test1.tif\" has completed successfully.");
    }

    @Test
    public void test_Issue34306_getangle_test2_tif_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "getangle_test2.tif"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            double actualAngle = reader.getFoundBarCodes()[0].getRegion().getAngle();
            Assert.assertTrue(2.4 <= actualAngle && actualAngle <= 4.4, "Actual angle is out of range: (2.4,4.4). Test: @\'Issue34306\\getangle_test2.tif\' ");
        }
        System.out.println("Test for \"Issue34306\\getangle_test2.tif\" has completed successfully.");
    }

    @Test
    public void test_Issue34306_getangle_test3_tif_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "getangle_test3.tif"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            double actualAngle = reader.getFoundBarCodes()[0].getRegion().getAngle();
            Assert.assertTrue(89 <= actualAngle && actualAngle <= 91, "Actual angle is out of range: (89,91). Test: @\'Issue34306\\getangle_test3.tif\' ");
        }
        System.out.println("Test for \"Issue34306\\getangle_test3.tif\" has completed successfully.");
    }

    @Test
    public void test_Issue34306_getangle_test4_tif_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "getangle_test4.tif"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            double actualAngle = reader.getFoundBarCodes()[0].getRegion().getAngle();
            Assert.assertTrue(179 <= actualAngle && actualAngle <= 181, "Actual angle is out of range: (179,181). Test: @\'Issue34306\\getangle_test4.tif\' ");
        }
        System.out.println("Test for \"Issue34306\\getangle_test4.tif\" has completed successfully.");
    }

    @Test
    public void test_Issue34306_getangle_test5_tif_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "getangle_test5.tif"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            double actualAngle = reader.getFoundBarCodes()[0].getRegion().getAngle();
            Assert.assertTrue(269 <= actualAngle && actualAngle <= 271, "Actual angle is out of range: (269,271). Test: @\'Issue34306\\getangle_test5.tif\' ");
        }
        System.out.println("Test for \"Issue34306\\getangle_test5.tif\" has completed successfully.");
    }

    @Test
    public void test_Issue34306_getangle_test6_tif_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "getangle_test6.tif"), DecodeType.QR);
        {
            reader.setQualitySettings(QualitySettings.getHighQuality());
            Assert.assertEquals(reader.readBarCodes().length, 1);
            double actualAngle = reader.getFoundBarCodes()[0].getRegion().getAngle();
            Assert.assertTrue(186 <= actualAngle && actualAngle <= 188, "Actual angle is out of range: (186,188). Test: @\'Issue34306\\getangle_test6.tif\' ");
        }
    }
}
