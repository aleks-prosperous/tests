package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


@Test(description = "Tests for Issue33463.")
public class Issue33463
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33463");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testFullImage()
    {
        String filename = Global.pathCombine(folder, "scan_POD_Consignment_3587822_tif.tif");
        final BarCodeReader reader = new BarCodeReader(filename, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 2);
        Assert.assertEquals("3587822", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("3587822", reader.getFoundBarCodes()[1].getCodeText());
    }

    @Test
    public void testFullOriginalImage()
    {
        String filename = Global.pathCombine(folder, "scan_POD_Consignment_3587822.jpg");
        final BarCodeReader reader = new BarCodeReader(filename, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 2);
        Assert.assertEquals("3587822", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("3587822", reader.getFoundBarCodes()[1].getCodeText());
    }

    @Test
    public void testFullOriginalImageAllTypes()
    {
        List<String> values = new ArrayList<String>();

        String filename = Global.pathCombine(folder, "scan_POD_Consignment_3587822.jpg");
        final BarCodeReader reader = new BarCodeReader(filename);
        for(BarCodeResult result : reader.readBarCodes())
        values.add(result.getCodeText());

        Assert.assertTrue(values.size() >= 2, "Must be 2, but on server 3 found");

        int count = 0;
        //foreach to while statements conversion
        Iterator tmp0 = (values).iterator();
        while (tmp0.hasNext())
        {
            String s = (String) tmp0.next();
            if ("3587822".equals(s))
            {
                count++;
            }
        }
        Assert.assertEquals(2, count);
    }
}

