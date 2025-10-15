package com.aspose.external.barcode.tester.releases.v25_1;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.generation.TextAlignment;
import com.aspose.barcode.licensing.LicenseType;
import helpers.PdfComparer;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class Issue37929
{
    /// <summary>
    /// Path to folder with files for testing Issue37929.
    /// </summary>
    private static final String Folder = Global.getTestDataFolder("Issues/Issue37929");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense(LicenseType.Total);
    }


//    //[Test]
//    //generates test results
//    public void testDemo() throws IOException
//    {
//        PdfComparer.storePdfHelper(GetGeneratorTest1(), Folder, "TestPdf1.pdf");
//        PdfComparer.storePdfHelper(GetGeneratorTest2(), Folder, "TestPdf2.pdf");
//        PdfComparer.storePdfHelper(GetGeneratorTest3(), Folder, "TestPdf3.pdf");
//        PdfComparer.storePdfHelper(GetGeneratorTest4(), Folder, "TestPdf4.pdf");
//        PdfComparer.storePdfHelper(GetGeneratorTest5(), Folder, "TestPdf5.pdf");
//    }

    @Test(enabled = false)
    public void Compare_Pdf_Test1() throws IOException
    {
        PdfComparer.comparePdfHelper(GetGeneratorTest1(), Folder, "TestPdf1.pdf");
    }

    private BarcodeGenerator GetGeneratorTest1()
    {
        String codeText = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        return new BarcodeGenerator(EncodeTypes.CODE_128, codeText);
    }

    @Test(enabled = false)
    public void Compare_Pdf_Test2() throws IOException
    {
        PdfComparer.comparePdfHelper(GetGeneratorTest2(), Folder, "TestPdf2.pdf");
    }

    private BarcodeGenerator GetGeneratorTest2()
    {
        String codeText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit," +
                " sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut" +
                " enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi" +
                " ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate" +
                " velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non" +
                " proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        return new BarcodeGenerator(EncodeTypes.QR, codeText);
    }

    @Test(enabled = false)
    public void Compare_Pdf_Test3() throws IOException
    {
        PdfComparer.comparePdfHelper(GetGeneratorTest3(), Folder, "TestPdf3.pdf");
    }

    private BarcodeGenerator GetGeneratorTest3()
    {
        String codeText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";

        return new BarcodeGenerator(EncodeTypes.MAXI_CODE, codeText);
    }

    @Test(enabled = false)
    public void Compare_Pdf_Test4() throws IOException
    {
        PdfComparer.comparePdfHelper(GetGeneratorTest4(), Folder, "TestPdf4.pdf");
    }

    private BarcodeGenerator GetGeneratorTest4()
    {
        String codeText = "Lorem ipsum dolor";

        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.CODE_128, codeText);

        gen.getParameters().getCaptionAbove().setText("Caption above near");
        gen.getParameters().getCaptionAbove().setAlignment(TextAlignment.CENTER);
        gen.getParameters().getCaptionAbove().setVisible(true);

        gen.getParameters().getCaptionBelow().setText("Caption below far");
        gen.getParameters().getCaptionBelow().setAlignment(TextAlignment.LEFT);
        gen.getParameters().getCaptionBelow().setVisible(true);

        gen.getParameters().getBarcode().setBarColor(Color.RED);
        gen.getParameters().getBarcode().getCodeTextParameters().setColor(Color.GREEN);

        return gen;
    }

    @Test(enabled = false)
    public void Compare_Pdf_Test5() throws IOException
    {
        PdfComparer.comparePdfHelper(GetGeneratorTest5(), Folder, "TestPdf5.pdf");
    }

    private BarcodeGenerator GetGeneratorTest5()
    {
        String codeText = "Lorem ipsum dolor";

        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.QR, codeText);
        gen.getParameters().setRotationAngle(30);

        return gen;
    }

}
