package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CollectionAssert;
import utils.LicenseAssistant;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Issue33887
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33887");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testIssue33887Page1PngCode39ExtendedCode39Standard() throws IOException
    {
        BufferedImage img = ImageIO.read(new File(folder + "Page1.png"));
        BarCodeReader reader = new BarCodeReader(img, DecodeType.scanSets(DecodeType.CODE_39_FULL_ASCII, DecodeType.CODE_39));
        {
            List<String> actualTexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            actualTexts.add(result.getCodeText());

            String[] expectedTexts = new String[2];
            expectedTexts[0] = "BA2100595";
            expectedTexts[1] = "BA2100595aR0002      +09012010+08062010";

            CollectionAssert.isSubsetOf(actualTexts, expectedTexts, " File 'Issue33887\\Page1.png': Expected and actual collections of code texts do not meet requirements.");
        }
    }
}
