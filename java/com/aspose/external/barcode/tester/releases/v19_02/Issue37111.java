package com.aspose.external.barcode.tester.releases.v19_02;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BaseDecodeType;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.MultyDecodeType;
import com.aspose.external.barcode.tester.helpers.TimeoutHelper;
import com.aspose.external.barcode.tester.helpers.TimeoutScanInfo;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.IOException;

public class Issue37111
{
    /// <summary>
    /// Path to folder with files for testing.
    /// </summary>
    private static final String Folder = Global.getIssuesTestImagePath("Issue37002");

//    private static final int MainTimeout = 90;
    private static final int MainTimeout = 13000; // //TODO BARCODEJAVA-859
    private static final int MainDeviance = 100;
    private static final BaseDecodeType MainReadType = new MultyDecodeType(DecodeType.CODE_128, DecodeType.INTERLEAVED_2_OF_5);

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    ////[Category("Timeout")]
    public void test_scan_Cropped_2018_6_22_15_01_18() throws IOException
    {
        TimeoutScanInfo lInfo = TimeoutHelper.recognizeWithAbortByTimeout(Folder, "scan_Cropped_2018_6_22_15_01_18.bmp", MainReadType, MainTimeout);
        TimeoutHelper.CheckAllowedTimeoutDeviance(lInfo, MainDeviance, true);
    }

    @Test
    ////[Category("Timeout")]
    public void test_scan_Cropped_2018_6_26_14_39_29() throws IOException
    {
        TimeoutScanInfo lInfo = TimeoutHelper.recognizeWithAbortByTimeout(Folder, "scan_Cropped_2018_6_26_14_39_29.bmp", MainReadType, MainTimeout);
        TimeoutHelper.CheckAllowedTimeoutDeviance(lInfo, MainDeviance, true);
    }

    @Test
    ////[Category("Timeout")]
    public void test_scan_Cropped_2018_6_26_16_10_30() throws IOException
    {
        TimeoutScanInfo lInfo = TimeoutHelper.recognizeWithAbortByTimeout(Folder, "scan_Cropped_2018_6_26_16_10_30.bmp", MainReadType, MainTimeout);
        TimeoutHelper.CheckAllowedTimeoutDeviance(lInfo, MainDeviance, true);
    }

    @Test
    ////[Category("Timeout")]
    public void test_scan_Cropped_2018_7_05_13_47_05() throws IOException
    {
        TimeoutScanInfo lInfo = TimeoutHelper.recognizeWithAbortByTimeout(Folder, "scan_Cropped_2018_7_05_13_47_05.bmp", MainReadType, MainTimeout);
        TimeoutHelper.CheckAllowedTimeoutDeviance(lInfo, MainDeviance, true);
    }

    @Test
    ////[Category("Timeout")]
    public void test_scan_Cropped_2018_7_05_13_49_12() throws IOException
    {
        TimeoutScanInfo lInfo = TimeoutHelper.recognizeWithAbortByTimeout(Folder, "scan_Cropped_2018_7_05_13_49_12.bmp", MainReadType, MainTimeout);
        TimeoutHelper.CheckAllowedTimeoutDeviance(lInfo, MainDeviance, true);
    }

    @Test
    ////[Category("Timeout")]
    public void test_scan_Cropped_2018_7_06_14_33_39() throws IOException
    {
        TimeoutScanInfo lInfo = TimeoutHelper.recognizeWithAbortByTimeout(Folder, "scan_Cropped_2018_7_06_14_33_39.bmp", MainReadType, MainTimeout);
        TimeoutHelper.CheckAllowedTimeoutDeviance(lInfo, MainDeviance, true);
    }

    @Test
    ////[Category("Timeout")]
    public void test_scan_Cropped_2018_7_06_15_19_15() throws IOException
    {
        TimeoutScanInfo lInfo = TimeoutHelper.recognizeWithAbortByTimeout(Folder, "scan_Cropped_2018_7_06_15_19_15.bmp", MainReadType, MainTimeout);
        TimeoutHelper.CheckAllowedTimeoutDeviance(lInfo, MainDeviance, true);
    }

    @Test
    ////[Category("Timeout")]
    public void test_scan_Cropped_2018_7_06_16_10_20() throws IOException
    {
        TimeoutScanInfo lInfo = TimeoutHelper.recognizeWithAbortByTimeout(Folder, "scan_Cropped_2018_7_06_16_10_20.bmp", MainReadType, MainTimeout);
        TimeoutHelper.CheckAllowedTimeoutDeviance(lInfo, MainDeviance, true);
    }


    @Test
    ////[Category("Timeout")]
    public void test_scan_Cropped_2018_7_09_17_18_48() throws IOException
    {
        TimeoutScanInfo lInfo = TimeoutHelper.recognizeWithAbortByTimeout(Folder, "scan_Cropped_2018_7_09_17_18_48.bmp", MainReadType, MainTimeout);
        TimeoutHelper.CheckAllowedTimeoutDeviance(lInfo, MainDeviance, true);
    }

    @Test
    ////[Category("Timeout")]
    public void test_scan_Cropped_2018_7_12_14_35_58() throws IOException
    {
        TimeoutScanInfo lInfo = TimeoutHelper.recognizeWithAbortByTimeout(Folder, "scan_Cropped_2018_7_12_14_35_58.bmp", MainReadType, MainTimeout);
        TimeoutHelper.CheckAllowedTimeoutDeviance(lInfo, MainDeviance, true);
    }

    @Test
    ////[Category("Timeout")]
    public void test_scan_Cropped_2018_7_12_14_57_05() throws IOException
    {
        TimeoutScanInfo lInfo = TimeoutHelper.recognizeWithAbortByTimeout(Folder, "scan_Cropped_2018_7_12_14_57_05.bmp", MainReadType, MainTimeout);
        TimeoutHelper.CheckAllowedTimeoutDeviance(lInfo, MainDeviance, true);
    }

    @Test
    ////[Category("Timeout")]
    public void test_scan_Cropped_2018_7_16_15_03_12() throws IOException
    {
        TimeoutScanInfo lInfo = TimeoutHelper.recognizeWithAbortByTimeout(Folder, "scan_Cropped_2018_7_16_15_03_12.bmp", MainReadType, MainTimeout);
        TimeoutHelper.CheckAllowedTimeoutDeviance(lInfo, MainDeviance, true);
    }

    @Test
    ////[Category("Timeout")]
    public void test_scan_Scanner_2018_6_22_15_02_17() throws IOException
    {
        TimeoutScanInfo lInfo = TimeoutHelper.recognizeWithAbortByTimeout(Folder, "scan_Scanner_2018_6_22_15_02_17.bmp", MainReadType, MainTimeout);
        TimeoutHelper.CheckAllowedTimeoutDeviance(lInfo, MainDeviance, true);
    }

    @Test
    ////[Category("Timeout")]
    public void test_scan_Scanner_2018_7_06_12_39_29() throws IOException
    {
        TimeoutScanInfo lInfo = TimeoutHelper.recognizeWithAbortByTimeout(Folder, "scan_Scanner_2018_7_06_12_39_29.bmp", MainReadType, MainTimeout);
        TimeoutHelper.CheckAllowedTimeoutDeviance(lInfo, MainDeviance, true);
    }
}
