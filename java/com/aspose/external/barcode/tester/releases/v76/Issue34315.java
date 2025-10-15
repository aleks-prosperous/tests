package com.aspose.external.barcode.tester.releases.v76;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CollectionAssert;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Issue34315
{
    final String folder = Global.getTestDataFolder("Issues/Issue34315");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test_Issue34315_test1_png_DataMatrix() throws IOException
    {
        BufferedImage img = ImageIO.read(new File(Global.pathCombine(this.folder, "test1.png")));
        BarCodeReader reader = new BarCodeReader(img, DecodeType.DATA_MATRIX);
        {
            List<String> actualTexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            actualTexts.add(result.getCodeText());

            String[] expectedTexts = new String[4];
            expectedTexts[0] = "BERMA Macchine Budrio (BO)";
            expectedTexts[1] = "BERMA Macchine Budrio (BO)";
            expectedTexts[2] = "BERMA Macchine Budrio (BO)";
            expectedTexts[3] = "BERMA Macchine Budrio (BO)";

            CollectionAssert.isSubsetOf(actualTexts, expectedTexts, " File 'Issue34315\\test1.png': Expected and actual collections of code texts do not meet requirements.");
        }
        System.out.println("Test for \"Issue34315\\test1.png\" has completed successfully.");
    }

    @Test
    public void test_Issue34315_test2_png_DataMatrix() throws IOException
    {
        BufferedImage img = ImageIO.read(new File(Global.pathCombine(this.folder, "test2.png")));
        BarCodeReader reader = new BarCodeReader(img, DecodeType.DATA_MATRIX);
        {
            List<String> actualTexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            actualTexts.add(result.getCodeText());

            String[] expectedTexts = new String[6];
            expectedTexts[0] = "BERMA Macchine Budrio (BO)";
            expectedTexts[1] = "BERMA Macchine Budrio (BO)";
            expectedTexts[2] = "BERMA Macchine Budrio (BO)";
            expectedTexts[3] = "BERMA Macchine Budrio (BO)";
            expectedTexts[4] = "BERMA Macchine Budrio (BO)";
            expectedTexts[5] = "BERMA Macchine Budrio (BO)";

            CollectionAssert.isSubsetOf(actualTexts, expectedTexts, " File 'Issue34315\\test2.png': Expected and actual collections of code texts do not meet requirements.");
        }
        System.out.println("Test for \"Issue34315\\test2.png\" has completed successfully.");
    }
}
