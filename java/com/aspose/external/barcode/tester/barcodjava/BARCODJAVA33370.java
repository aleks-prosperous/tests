package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class BARCODJAVA33370
{
    String Folder = Global.getBarcodeJavaIssuesTestImagePath(this.getClass().getSimpleName());

    @BeforeClass
    public void setLicense() throws Exception
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

    @Test
    public void testOne()
    {
        try
        {
            String fileName = Global.pathCombine(Folder, "gs1datamatrix1.gif");

            BarCodeReader reader = new BarCodeReader(fileName, DecodeType.GS_1_DATA_MATRIX);

            int counter = 0;
            for (BarCodeResult result : reader.readBarCodes())
            {
                counter++;
                Assert.assertNotNull(result.getCodeText());
                Assert.assertNotNull(result.getCodeType());
            }

            Assert.assertTrue(counter > 0);

        } catch (Exception e)
        {
            Assert.fail("Exception", e);
        }
    }

    @Test
    public void testTwo()
    {
        try
        {
            String fileName = Global.pathCombine(Folder, "gs1datamatrix2.gif");

            BarCodeReader reader = new BarCodeReader(fileName, DecodeType.GS_1_DATA_MATRIX);

            int counter = 0;
            for (BarCodeResult result : reader.readBarCodes())
            {
                counter++;
                Assert.assertNotNull(result.getCodeText());
                Assert.assertNotNull(result.getCodeType());
            }

            Assert.assertTrue(counter > 0);

        } catch (Exception e)
        {
            Assert.fail("Exception", e);
        }
    }

    @Test
    public void testThree()
    {
        try
        {
            String fileName = Global.pathCombine(Folder, "gs1-datamatrix-vs-ean-128.png");

            BarCodeReader reader = new BarCodeReader(fileName, DecodeType.GS_1_DATA_MATRIX);

            int counter = 0;
            for (BarCodeResult result : reader.readBarCodes())
            {
                counter++;
                Assert.assertNotNull(result.getCodeText());
                Assert.assertNotNull(result.getCodeType());
            }

            Assert.assertTrue(counter > 0);

        } catch (Exception e)
        {
            Assert.fail("Exception", e);
        }
    }
}
