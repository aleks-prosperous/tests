package com.aspose.external.barcode.tester.releases.v20_1;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.SingleDecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BARCODEJAVA874
{
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test_BarCodeReader_Bitmap() throws IOException
    {
        String filename = Global.pathCombine(Global.getTestDataFolder("Recognition/1D/Code128/"), "bc-code128.png");
        String codetext = "12345678901234";
        SingleDecodeType readtype = DecodeType.CODE_128;
        BarCodeReader reader = new BarCodeReader(getBitmapFromFile(filename));
        reader.setBarCodeReadType(readtype);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
    }

    private BufferedImage getBitmapFromFile(String aFileName) throws IOException
    {
        return ImageIO.read(new File(aFileName));
    }
}
