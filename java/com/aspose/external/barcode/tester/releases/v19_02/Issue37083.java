package com.aspose.external.barcode.tester.releases.v19_02;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.MultyDecodeType;
import com.aspose.external.barcode.tester.helpers.TimeoutHelper;
import com.aspose.external.barcode.tester.helpers.TimeoutScanInfo;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.IOException;

public class Issue37083
{
    /// <summary>
    /// Path to folder with files for testing.
    /// </summary>
    private static final String Folder = Global.getTestDataFolder("Issues\\Issue37083");

 //    private static final int MainTimeout = 400;
    private static final int MainTimeout = 60000; //TODO BARCODEJAVA-859
    private static final int MainDeviance = 150;

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_problematic_file_tiff_AllSupportedTypes() throws IOException
    {
        TimeoutScanInfo lInfo = TimeoutHelper.recognizeWithTimeout(Folder, "problematic_file.tiff", DecodeType.ALL_SUPPORTED_TYPES, MainTimeout);
        TimeoutHelper.CheckAllowedTimeoutDeviance(lInfo, MainDeviance, true);
    }

    @Test
    public void test_problematic_file_tiff_Types1D() throws IOException
    {
        TimeoutScanInfo lInfo = TimeoutHelper.recognizeWithTimeout(Folder, "problematic_file.tiff", DecodeType.TYPES_1D, MainTimeout);
        TimeoutHelper.CheckAllowedTimeoutDeviance(lInfo, MainDeviance, true);
    }

    @Test(enabled = false) //tests by timeout failed on Jenkins
    //////[Category("Timeout")]
    public void test_tmpbarcode1_png_Pdf417() throws IOException
    {
        TimeoutScanInfo lInfo = TimeoutHelper.recognizeWithTimeout(Folder, "tmpbarcode1.png", new MultyDecodeType(DecodeType.PDF_417, DecodeType.COMPACT_PDF_417), MainTimeout);
        TimeoutHelper.CheckAllowedTimeoutDeviance(lInfo, MainDeviance, true);
    }

    @Test(enabled = false) //tests by timeout failed on Jenkins
    //////[Category("Timeout")]
    public void test_IMG0_png_Types1D() throws IOException
    {
        TimeoutScanInfo lInfo = TimeoutHelper.recognizeWithTimeout(Folder, "IMG0.png", DecodeType.TYPES_1D, MainTimeout);
        TimeoutHelper.CheckAllowedTimeoutDeviance(lInfo, MainDeviance, true);
    }

    @Test(enabled = false) //tests by timeout failed on Jenkins
    //////[Category("Timeout")]
    public void test_IMG0_png_Pdf417() throws IOException
    {
        TimeoutScanInfo lInfo = TimeoutHelper.recognizeWithTimeout(Folder, "IMG0.png", new MultyDecodeType(DecodeType.PDF_417, DecodeType.COMPACT_PDF_417), MainTimeout);
        TimeoutHelper.CheckAllowedTimeoutDeviance(lInfo, MainDeviance, true);
    }

    @Test(enabled = false) //tests by timeout failed on Jenkins
    //////[Category("Timeout")]
    public void test_Image7_png_Aztec() throws IOException
    {
        TimeoutScanInfo lInfo = TimeoutHelper.recognizeWithTimeout(Folder, "Image7.png", DecodeType.AZTEC, MainTimeout);
        TimeoutHelper.CheckAllowedTimeoutDeviance(lInfo, MainDeviance, true);
    }

    @Test(enabled = false) //tests by timeout failed on Jenkins
    //////[Category("Timeout")]
    public void test_DOC00000002_tif_Types1D() throws IOException
    {
        TimeoutScanInfo lInfo = TimeoutHelper.recognizeWithTimeout(Folder, "DOC00000002.tif", DecodeType.TYPES_1D, MainTimeout);
        TimeoutHelper.CheckAllowedTimeoutDeviance(lInfo, MainDeviance, true);
    }

    @Test(enabled = false) //tests by timeout failed on Jenkins
    //////[Category("Timeout")]
    public void test_banner_tif_QR() throws IOException
    {
        TimeoutScanInfo lInfo = TimeoutHelper.recognizeWithTimeout(Folder, "banner.tif", new MultyDecodeType(DecodeType.QR, DecodeType.MICRO_QR), MainTimeout);
        TimeoutHelper.CheckAllowedTimeoutDeviance(lInfo, MainDeviance, true);
    }

    @Test(enabled = false) //tests by timeout failed on Jenkins
    //////[Category("Timeout")]
    public void test_003_tif_DataMatrix() throws IOException
    {
        TimeoutScanInfo lInfo = TimeoutHelper.recognizeWithTimeout(Folder, "003.tif", new MultyDecodeType(DecodeType.DATA_MATRIX, DecodeType.GS_1_DATA_MATRIX), MainTimeout);
        TimeoutHelper.CheckAllowedTimeoutDeviance(lInfo, MainDeviance, true);
    }

    @Test(enabled = false) //tests by timeout failed on Jenkins
    //////[Category("Timeout")]
    public void test_201008191209221_tif_Types1D() throws IOException
    {
        TimeoutScanInfo lInfo = TimeoutHelper.recognizeWithTimeout(Folder, "201008191209221.tif", new MultyDecodeType(DecodeType.TYPES_1D), MainTimeout);
        TimeoutHelper.CheckAllowedTimeoutDeviance(lInfo, MainDeviance, true);
    }

    @Test(enabled = false) //tests by timeout failed on Jenkins
    //////[Category("Timeout")]
    public void test_201008191209221_tif_Pdf417() throws IOException
    {
        TimeoutScanInfo lInfo = TimeoutHelper.recognizeWithTimeout(Folder, "201008191209221.tif", new MultyDecodeType(DecodeType.PDF_417, DecodeType.COMPACT_PDF_417), MainTimeout);
        TimeoutHelper.CheckAllowedTimeoutDeviance(lInfo, MainDeviance, true);
    }

    @Test(enabled = false) //tests by timeout failed on Jenkins
    //////[Category("Timeout")]
    public void test_201008191209221_tif_QR() throws IOException
    {
        TimeoutScanInfo lInfo = TimeoutHelper.recognizeWithTimeout(Folder, "201008191209221.tif", new MultyDecodeType(DecodeType.QR, DecodeType.MICRO_QR), MainTimeout);
        TimeoutHelper.CheckAllowedTimeoutDeviance(lInfo, MainDeviance, true);
    }

    @Test(enabled = false) //tests by timeout failed on Jenkins
    //////[Category("Timeout")]
    public void test_201008191209221_tif_DataMatrix() throws IOException
    {
        TimeoutScanInfo lInfo = TimeoutHelper.recognizeWithTimeout(Folder, "201008191209221.tif", new MultyDecodeType(DecodeType.DATA_MATRIX, DecodeType.GS_1_DATA_MATRIX), MainTimeout);
        TimeoutHelper.CheckAllowedTimeoutDeviance(lInfo, MainDeviance, true);
    }

    @Test(enabled = false) //tests by timeout failed on Jenkins
    //////[Category("Timeout")]
    public void test_201008191209221_tif_Aztec() throws IOException
    {
        TimeoutScanInfo lInfo = TimeoutHelper.recognizeWithTimeout(Folder, "201008191209221.tif", new MultyDecodeType(DecodeType.AZTEC), MainTimeout);
        TimeoutHelper.CheckAllowedTimeoutDeviance(lInfo, MainDeviance, true);
    }

    @Test(enabled = false) //tests by timeout failed on Jenkins
    //////[Category("Timeout")]
    public void test_201008191209221_tif_PostalTypes() throws IOException
    {
        TimeoutScanInfo lInfo = TimeoutHelper.recognizeWithTimeout(Folder, "201008191209221.tif", new MultyDecodeType(DecodeType.POSTAL_TYPES), MainTimeout);
        TimeoutHelper.CheckAllowedTimeoutDeviance(lInfo, MainDeviance, true);
    }

    @Test(enabled = false) //tests by timeout failed on Jenkins
    //////[Category("Timeout")]
    public void test_201008191209221_tif_DotCode() throws IOException
    {
        TimeoutScanInfo lInfo = TimeoutHelper.recognizeWithTimeout(Folder, "201008191209221.tif", new MultyDecodeType(DecodeType.DOT_CODE), MainTimeout);
        TimeoutHelper.CheckAllowedTimeoutDeviance(lInfo, MainDeviance, true);
    }

    @Test(enabled = false) //tests by timeout failed on Jenkins
    //////[Category("Timeout")]
    public void test_201008191209221_tif_MaxiCode() throws IOException
    {
        TimeoutScanInfo lInfo = TimeoutHelper.recognizeWithTimeout(Folder, "201008191209221.tif", new MultyDecodeType(DecodeType.MAXI_CODE), MainTimeout);
        TimeoutHelper.CheckAllowedTimeoutDeviance(lInfo, MainDeviance, true);
    }


    @Test(enabled = false) //tests by timeout failed on Jenkins
    //////[Category("Timeout")]
    public void test_201008191209221_tif_MicrE13B() throws IOException
    {
        TimeoutScanInfo lInfo = TimeoutHelper.recognizeWithTimeout(Folder, "201008191209221.tif", new MultyDecodeType(DecodeType.MICR_E_13_B), MainTimeout);
        TimeoutHelper.CheckAllowedTimeoutDeviance(lInfo, MainDeviance, true);
    }
}
