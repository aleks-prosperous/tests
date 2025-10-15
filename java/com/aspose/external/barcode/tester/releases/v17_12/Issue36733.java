package com.aspose.external.barcode.tester.releases.v17_12;

import com.aspose.barcode.BuildVersionInfo;
import com.aspose.barcode.License;
import com.aspose.barcode.PleaseReportException;
import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.time.format.DateTimeFormatter;

public class Issue36733
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue36733");

    @Test(enabled = false) // TODO Should be another message
    public void testExpiredSubscription() throws Exception
    {
        try
        {
            License lic = new License();
            lic.setLicense(folder + "Aspose.Total.Java.Expired.lic");
        } catch (PleaseReportException e)
        {
            String date = BuildVersionInfo.RELEASE_DATE.format(DateTimeFormatter.ofPattern("dd MMM yyyy"));
            Assert.assertTrue(e.getMessage().contains("The subscription included in this license allows free upgrades"));
            return;
        }
        Assert.fail("Should be exception thrown");
    }
}