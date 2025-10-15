package com.aspose.external.barcode.tester.releases.v19_4;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.MultyDecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;
import utils.TestExternalHelper;

import java.util.ArrayList;
import java.util.List;

public class Issue37145
{
    private static final String folder = Global.getTestDataFolder("Issues/Issue37145");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_example()
    {
        String fileName = folder + "example.jpg";
        BarCodeReader reader = new BarCodeReader(fileName,
                new MultyDecodeType(DecodeType.PDF_417, DecodeType.COMPACT_PDF_417));
        {
            List<Double> lAngles = new ArrayList<Double>();
            for(BarCodeResult result : reader.readBarCodes())
            lAngles.add(result.getRegion().getAngle());

            Assert.assertEquals(6, lAngles.size());



            //angles must be close to 90, +-3 degree
            for (int i = 0; i < lAngles.size(); ++i)
            {
                double checkedValue = lAngles.get(i);
                TestExternalHelper.assertValueCloseTo(checkedValue, 90, 3);
            }
        }
    }

}
