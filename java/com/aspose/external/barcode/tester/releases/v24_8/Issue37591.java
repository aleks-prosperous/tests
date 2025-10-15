package com.aspose.external.barcode.tester.releases.v24_8;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import helpers.FrameworkTestUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.IOException;

public class Issue37591
{
    private static final String Folder = Global.getTestDataFolder("Issues/Issue37591/java/");

    @BeforeMethod
    public void SetUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test(enabled = true) //TODO BARCODEJAVA-1948
    public void test_Codabar_WideNarrowRatio_Default() throws IOException {
        FrameworkTestUtils.generateAndCompare(Generator_Of_Test_Codabar_WideNarrowRatio_Default(), Folder, "Codabar_WideNarrowRatio_Default.png");
    }

    @Test(enabled = true) //TODO BARCODEJAVA-1948
    public void test_Codabar_WideNarrowRatio_3() throws IOException {
        FrameworkTestUtils.generateAndCompare(Generator_Of_Test_Codabar_WideNarrowRatio(3), Folder, "Codabar_WideNarrowRatio_3.png");
    }

    @Test(enabled = true) //TODO BARCODEJAVA-1948
    public void test_Codabar_WideNarrowRatio_4() throws IOException {
        FrameworkTestUtils.generateAndCompare(Generator_Of_Test_Codabar_WideNarrowRatio(4), Folder, "Codabar_WideNarrowRatio_4.png");
    }

    private BarcodeGenerator Generator_Of_Test_Codabar_WideNarrowRatio_Default()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.CODABAR);
        gen.getParameters().getBarcode().getXDimension().setPixels(3);
        return gen;
    }

    private BarcodeGenerator Generator_Of_Test_Codabar_WideNarrowRatio(float wideNarrowRatio)
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.CODABAR);
        gen.getParameters().getBarcode().getXDimension().setPixels(3);
        gen.getParameters().getBarcode().setWideNarrowRatio(wideNarrowRatio);
        return gen;
    }
}
