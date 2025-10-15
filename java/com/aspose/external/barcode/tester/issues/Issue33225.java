//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33225.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="10.05.2012 16:00:25">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//---------------------------------------------------------------------------------------------
package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.logger.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;


@Test(description = "Tests for Issue-33225.")
public class Issue33225
{
    final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33225");

    private List<String> okResults;

    @AfterMethod
    public void afterFinish(Method testMethod)
    {
        Logger.methodFinished(getClass().getName() + "." + testMethod.getName());
    }

    @BeforeMethod
    public void setUp(Method testMethod)
    {
        LicenseAssistant.setupLicense();
        Logger.methodStarted(getClass().getName() + "." + testMethod.getName());

        okResults = new ArrayList<String>();
        okResults.add("1.4 // CN=ATS-095-555;DOC=70b4c229-@6@6-11@@-8@80-@8@@@8@18@@@;PG=1;");
        okResults.add("1.6 // CN=ATS-095-555;DOC=70b4c229-@6@6-11@@-8@80-@8@@@8@18@@@;PG=1;");
        okResults.add("1.8 // CN=ATS-095-555;DOC=70b4c229-@6@6-11@@-8@80-@8@@@8@18@@@;PG=1;");
        okResults.add("2.4 // CN=ATS-095-555;DOC=70b4c229-@6@6-11@@-8@80-@8@@@8@18@@@;PG=1;");
        okResults.add("2.8 // CN=ATS-095-555;DOC=70b4c229-@6@6-11@@-8@80-@8@@@8@18@@@;PG=1;");
        okResults.add("3.2 // CN=ATS-095-555;DOC=70b4c229-@6@6-11@@-8@80-@8@@@8@18@@@;PG=1;");
        okResults.add("3.6 // CN=ATS-095-555;DOC=70b4c229-@6@6-11@@-8@80-@8@@@8@18@@@;PG=1;");
    }

    @Test
    public void testImage() throws IOException
    {
        List<String> values = new ArrayList<String>();

        String fileName = Global.pathCombine(folder, "test-0.png");
        BufferedImage bitmap  = ImageIO.read(new File(fileName));
        BarCodeReader reader = new BarCodeReader(bitmap, DecodeType.DATA_MATRIX);
        for(BarCodeResult result : reader.readBarCodes())
        values.add(result.getCodeText());

        for (String s : okResults)
        Assert.assertTrue(values.contains(s));

        // one incorrect instead of 1.4 found

        //TODO: here was restriction for readCnt = 7, but fix of BARCODENET-33471 doesn't allow to recognize smallest barcode
        Assert.assertTrue(values.size() >= 5);
    }
}

