package com.aspose.external.barcode.tester.releases.v17_11;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class Issue36675
{
    private String folder = Global.getTestDataFolder("Issues" + File.separatorChar + "Issue36675");

    /**
     * <p>
     * Prepares to run these tests.
     * </p>
     */
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testFakePharmacode()
    {
        String file = folder + "kc sample invoice 2_pdf_fakePharmacode.png";
        BarCodeReader reader = new BarCodeReader(file, DecodeType.PHARMACODE);
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
    }

    @Test
    public void testCode39StandardKCSampleInvoice2pdf()
    {
        String file = folder + "kc sample invoice 2_pdf_page1.png";
        BarCodeReader reader = new BarCodeReader(file);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("PCINKU17090117-1", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(DecodeType.CODE_39, reader.getFoundBarCodes()[0].getCodeType());
    }

    @Test
    public void testIncorrectException()
    {
        String file = folder + "SFINKU17090178-1_pdf_exception.png";
        BarCodeReader reader = new BarCodeReader(file, DecodeType.MICR_E_13_B);
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
    }

    @Test
    public void testCode39StandardSFINKU170901781pdf()
    {
        String file = folder + "SFINKU17090178-1_pdf_page1.png";
        BarCodeReader reader = new BarCodeReader(file);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("SFINKU17090178-1", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(DecodeType.CODE_39, reader.getFoundBarCodes()[0].getCodeType());
    }

    @Test
    public void testCode39StandardSFINKU170901781pdfPart()
    {
        String file = folder + "SKM_28717090618280_pdf_Code39Standard.png";
        BarCodeReader reader = new BarCodeReader(file, DecodeType.CODE_39);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("SZINKU17090094-1", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(DecodeType.CODE_39, reader.getFoundBarCodes()[0].getCodeType());
    }

    @Test
    public void testFakeMicrE13B()
    {
        String file = folder + "SKM_28717090618280_pdf_fakeMicrE13B.png";
        BarCodeReader reader = new BarCodeReader(file, DecodeType.MICR_E_13_B);
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
    }

    @Test
    public void testFakeMSI()
    {
        String file = folder + "SKM_28717090618280_pdf_fakeMsi.png";
        BarCodeReader reader = new BarCodeReader(file, DecodeType.MSI);
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
    }

    @Test
    public void testFakePharmacode2()
    {
        String file = folder + "SKM_28717090618280_pdf_fakePharmacode.png";
        BarCodeReader reader = new BarCodeReader(file, DecodeType.PHARMACODE);
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
    }

    @Test
    public void testCode39StandardSKM28717090618280pdf()
    {
        String file = folder + "SKM_28717090618280_pdf_page1.png";
        BarCodeReader reader = new BarCodeReader(file);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("SZINKU17090094-1", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(DecodeType.CODE_39, reader.getFoundBarCodes()[0].getCodeType());
    }
}
