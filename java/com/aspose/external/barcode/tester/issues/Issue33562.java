package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


@Test(description = "Tests for Issue33562.")
public class Issue33562
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33562");

    private /*Byte*/ byte[] OriginalTextInBytes = new byte[]{64, 10, 30, 13, 65, 78, 83, 73, 32, 54, 51, 54, 48, 49, 49, 48, 52, 48, 48, 48, 50, 68, 76, 48, 48, 52, 49, 48, 52, 54, 51, 90, 68, 48, 53, 48, 52, 48, 48, 48, 51, 68, 76, 68, 65, 81, 49, 54, 56, 54, 54, 53, 55, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 10, 68, 67, 83, 67, 72, 65, 75, 82, 65, 66, 79, 82, 84, 89, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 10, 68, 68, 69, 78, 10, 68, 65, 67, 83, 65, 85, 82, 65, 86, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 10, 68, 68, 70, 78, 10, 68, 65, 68, 78, 79, 78, 69, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 10, 68, 68, 71, 78, 10, 68, 67, 65, 68, 32, 32, 32, 32, 32, 10, 68, 67, 66, 66, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 10, 68, 67, 68, 78, 79, 78, 69, 32, 10, 68, 66, 68, 48, 55, 48, 54, 50, 48, 49, 50, 10, 68, 66, 66, 48, 51, 49, 54, 49, 57, 55, 57, 10, 68, 66, 65, 48, 51, 48, 53, 50, 48, 49, 52, 10, 68, 66, 67, 49, 10, 68, 65, 85, 48, 54, 55, 32, 105, 110, 10, 68, 65, 89, 66, 82, 79, 10, 68, 65, 71, 50, 52, 49, 52, 32, 83, 79, 67, 73, 69, 84, 89, 32, 68, 82, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 10, 68, 65, 73, 67, 76, 65, 89, 77, 79, 78, 84, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 10, 68, 65, 74, 68, 69, 10, 68, 65, 75, 49, 57, 55, 48, 51, 49, 55, 54, 49, 32, 32, 10, 68, 67, 70, 50, 48, 49, 50, 48, 55, 48, 54, 54, 56, 57, 53, 48, 57, 57, 49, 54, 56, 54, 54, 53, 55, 32, 32, 32, 10, 68, 67, 71, 85, 83, 65, 10, 68, 67, 85, 78, 79, 78, 69, 32, 10, 68, 65, 87, 49, 54, 49, 10, 68, 65, 72, 87, 72, 73, 84, 78, 69, 89, 32, 65, 80, 84, 83, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 10, 68, 68, 65, 77, 10, 68, 68, 66, 48, 50, 48, 56, 50, 48, 49, 48, 13, 90, 68, 13};

    private String OriginalText = "@\n" +
            "\u001E\r" +
            "ANSI 636011040002DL00410463ZD05040003DLDAQ1686657                  \n" +
            "DCSCHAKRABORTY                             \n" +
            "DDEN\n" +
            "DACSAURAV                                  \n" +
            "DDFN\n" +
            "DADNONE                                    \n" +
            "DDGN\n" +
            "DCAD     \n" +
            "DCBB           \n" +
            "DCDNONE \n" +
            "DBD07062012\n" +
            "DBB03161979\n" +
            "DBA03052014\n" +
            "DBC1\n" +
            "DAU067 in\n" +
            "DAYBRO\n" +
            "DAG2414 SOCIETY DR                    \n" +
            "DAICLAYMONT            \n" +
            "DAJDE\n" +
            "DAK197031761  \n" +
            "DCF2012070668950991686657   \n" +
            "DCGUSA\n" +
            "DCUNONE \n" +
            "DAW161\n" +
            "DAHWHITNEY APTS                       \n" +
            "DDAM\n" +
            "DDB02082010\r" +
            "ZD\r";

    /*public Issue33562()
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < OriginalTextInBytes.length; i++)
        {
            sb.append(OriginalTextInBytes[i]);
        }
        OriginalText = sb.toString();
    }*/

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test1()
    {
        String fileName = Global.pathCombine(folder, "reduced_img.jpg");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(OriginalText, reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test1Rotated()
    {
        String fileName = Global.pathCombine(folder, "reduced_img_rotated.jpg");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(OriginalText, reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test1RotatedAndCorrectedImage()
    {
        String fileName = Global.pathCombine(folder, "2d_bin2.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(OriginalText, reader.getFoundBarCodes()[0].getCodeText());
    }

}

