package com.aspose.external.barcode.tester.releases.v18_11;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.BaseEncodeType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BARCODEJAVA608
{
    private String folder = Global.getGeneratedImagesFolder("barcodjava_issues" + File.separator + this.getClass().getSimpleName());

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test(expectedExceptions = com.aspose.barcode.BarCodeException.class,
    expectedExceptionsMessageRegExp = "Encode type cannot be empty")
    public void test1() throws IOException
    {
        String encodeType = null;
        String codeText = "76543";
        BaseEncodeType baseEncodeType = BaseEncodeType.parse(encodeType);
        BarcodeGenerator generator = new BarcodeGenerator(baseEncodeType, codeText);
        BufferedImage barcodeBitmap = generator.generateBarCodeImage();
        ImageIO.write(barcodeBitmap, "png", new File(folder + "test1.png"));
    }
}
