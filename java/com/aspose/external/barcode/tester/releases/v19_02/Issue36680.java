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

public class Issue36680
{
    /// <summary>
    /// Path to folder with files for testing.
    /// </summary>
    private static final String Folder = Global.getIssuesTestImagePath("Issue36680");

    private static final int MainTimeout = 1000;
    private static final int MainDeviance = 200;
    private static final BaseDecodeType MainReadType = new MultyDecodeType(DecodeType.CODE_128);

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_Prepoznava_edit_jpg() throws IOException
    {
        TimeoutScanInfo lInfo = TimeoutHelper.recognizeWithTimeout(Folder, "Prepoznava-edit.jpg", MainReadType, MainTimeout);
        TimeoutHelper.CheckAllowedTimeoutDeviance(lInfo, MainDeviance, true);
    }

    @Test
    public void test_Prepoznava_edit_png() throws IOException
    {
        TimeoutScanInfo lInfo = TimeoutHelper.recognizeWithTimeout(Folder, "Prepoznava-edit.png", MainReadType, MainTimeout);
        TimeoutHelper.CheckAllowedTimeoutDeviance(lInfo, MainDeviance, true);
    }
}
