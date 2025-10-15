package com.aspose.external.barcode.tester.releases.v19_12;

import com.aspose.external.barcode.tester.issues.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class SvmPerformanceTests
{
    private com.aspose.external.barcode.tester.releases.v80.Issue36196 Issue36196_CompoundImage;
    private Issue18355 Issue18355;
    private Issue33136 Issue33136;
    private Issue33171 Issue33171;
    private Issue33204 Issue33204;
    private Issue33324 Issue33324;
    private Issue33429 Issue33429;
    private Issue33463 Issue33463;
    private Issue33511 Issue33511;
    private Issue33569 Issue33569;
    private Issue33791 Issue33791;
    private com.aspose.external.barcode.tester.releases.v74.Issue33829 Issue33829;

    @BeforeMethod
    public void setUp()
    {
        Issue36196_CompoundImage = new com.aspose.external.barcode.tester.releases.v80.Issue36196();
        Issue18355 = new Issue18355();
        Issue33136 = new Issue33136();
        Issue33171 = new Issue33171();
        Issue33204 = new Issue33204();
        Issue33324 = new Issue33324();
        Issue33429 = new Issue33429();
        Issue33463 = new Issue33463();
        Issue33511 = new Issue33511();
        Issue33569 = new Issue33569();
        Issue33791 = new Issue33791();
        Issue33829 = new com.aspose.external.barcode.tester.releases.v74.Issue33829();

        Issue36196_CompoundImage.setupTestFixture();
        Issue18355.setUp();
        Issue33136.setUp();
        Issue33171.setUp();
        Issue33204.setUp();
        Issue33324.setUp();
        Issue33429.setUp();
        Issue33463.setUp();
        Issue33511.setUp();
        Issue33569.setUp();
        Issue33791.setUp();
        Issue33829.setUp();
    }

    // new - 103.34437128
    // old - 86.85027558
        @Test(enabled = false, description = "This test takes 15 minutes. Run it manually if needed.")
    public void SvmPerformanceTest() throws IOException
        {
        int count = 5;
        long timer = System.currentTimeMillis();
        for (int i = 0; i < count; i++)
        {
            Issue36196_CompoundImage.test_Issue36196_DOC00000010_tif_Code128();
            Issue18355.testAsposeBarcode_Error_Index_was_outside_the_bounds_of_the_array_tif_file();
            Issue33136.testcisco_MP_fax45tif();
            Issue33136.testCiscoPNG1();
            Issue33171.testFullImage();
            Issue33204.demoTest();
            Issue33324.RecognizeOriginal();
            Issue33429.test4();
            Issue33463.testFullOriginalImageAllTypes();
            Issue33511.test1AllTypes();
            Issue33569.converterFullImage();
            Issue33791.test03();
            Issue33829.testIssue33829();
        }
        timer = System.currentTimeMillis() - timer;
        double spentSec = (timer * 1000) / count;
        Assert.assertTrue(spentSec < 107);
    }
}
