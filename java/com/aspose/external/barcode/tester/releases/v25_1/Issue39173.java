package com.aspose.external.barcode.tester.releases.v25_1;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.AutoSizeMode;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.licensing.LicenseType;
import helpers.FrameworkTestUtils;
import helpers.IOTestUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class Issue39173
{
    static final String Folder = Global.getTestDataFolder("Issues/Issue39173");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense(LicenseType.Total);
    }



    @Test
        // [Category("QR")]
    public void test_RotatedQR() throws IOException
    {
        GenerateCompareRotatedQR(45, "qr45.png");
        GenerateCompareRotatedQR(135, "qr135.png");
        GenerateCompareRotatedQR(225, "qr225.png");
        GenerateCompareRotatedQR(315, "qr315.png");
    }

    private void GenerateCompareRotatedQR(float angle, String file) throws IOException
    {
        BufferedImage rotated = generateRotatedQR(angle);
        FrameworkTestUtils.compareBitmaps(rotated, Folder, file);
    }

    private void GenerateSaveRotatedQR(float angle, String file) throws IOException
    {
        String filename = Global.pathCombine(Folder, file);
        BufferedImage rotated = generateRotatedQR(angle);
        IOTestUtils.storeBitmapWithPostFix(filename, rotated);
    }

    private BufferedImage generateRotatedQR(float angle)
    {
        BufferedImage rotated = generateQR(angle);
        BufferedImage sizedAndRotated = generateQR(angle, rotated.getWidth(), rotated.getHeight());
        Assert.assertEquals(rotated.getWidth(), sizedAndRotated.getWidth());
        Assert.assertEquals(rotated.getHeight(), sizedAndRotated.getHeight());
        return sizedAndRotated;
    }

    private BufferedImage generateQR(Float angle)
    {
       return generateQR(angle, null, null);
    }

    private BufferedImage generateQR(Float angle, Integer width, Integer height)
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.QR, "Hello world!");
        if (angle != null)
        {
            generator.getParameters().setRotationAngle(angle);
        }
        if (width != null && height != null)
        {
            generator.getParameters().setAutoSizeMode(AutoSizeMode.NEAREST);
            generator.getParameters().getImageWidth().setPixels(width);
            generator.getParameters().getImageHeight().setPixels(height);
        }

        return generator.generateBarCodeImage();
    }
}
