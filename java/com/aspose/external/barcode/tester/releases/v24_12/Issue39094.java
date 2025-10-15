package com.aspose.external.barcode.tester.releases.v24_12;

import com.aspose.barcode.complexbarcode.MaxiCodeCodetextMode2;
import com.aspose.barcode.complexbarcode.MaxiCodeCodetextMode3;
import com.aspose.barcode.licensing.LicenseType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue39094
{
    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense(LicenseType.Total);
    }

    @Test
    public void testMaxiCodeCodetextMode2()
    {
        MaxiCodeCodetextMode2 maxiCode = new MaxiCodeCodetextMode2();
        try
        {
            String ct = maxiCode.getConstructedCodetext();
        }
        catch (Exception e)
        {
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void testMaxiCodeCodetextMode3()
    {
        MaxiCodeCodetextMode3 maxiCode = new MaxiCodeCodetextMode3();
        try
        {
            String ct = maxiCode.getConstructedCodetext();
        }
        catch (Exception e)
        {
            Assert.fail(e.getMessage());
        }
    }
}
