package com.aspose.external.barcode.tester.releases.v24_2;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BARCODEJAVA1332
{
    private final static String Folder = Global.getTestDataFolder("Issues/Issue34262");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testInputStreamCtor() throws IOException
    {
        String fileName = Global.pathCombine(Folder, "Canon2_20150828074557829_14.tif");
        InputStream is = Files.newInputStream(Paths.get(fileName));
        Rectangle barcodeAreaLocation = new Rectangle(70,1200, 400, 400);
        BarCodeReader reader = new BarCodeReader(is, barcodeAreaLocation, DecodeType.QR);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("F29406947", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void testFilePathCtor()
    {
        String fileName = Global.pathCombine(Folder, "Canon2_20150828074557829_14.tif");
//        Rectangle barcodeAreaLocation = new Rectangle(70,1200, 340, 340);
        Rectangle barcodeAreaLocation = new Rectangle(70,1200, 400, 400);
        BarCodeReader reader = new BarCodeReader(fileName, barcodeAreaLocation, DecodeType.QR);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("F29406947", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
