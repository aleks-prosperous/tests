package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class BARCODJAVA30789
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
            String fileName = Global.pathCombine(Folder, "working_barcoderotate.jpg");


            BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);

            int counter = 0;
            for (BarCodeResult result : reader.readBarCodes())
            {
                counter++;
                Assert.assertNotNull(result.getCodeText());

                Assert.assertEquals(result.getCodeText(), "99344");
                Assert.assertNotNull(result.getCodeType());
            }

            Assert.assertEquals(counter, 1);

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
            String fileName = Global.pathCombine(Folder, "working_fullpagerotate.jpg");

            BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);

            int counter = 0;
            for (BarCodeResult result : reader.readBarCodes())
            {
                counter++;
                Assert.assertNotNull(result.getCodeText());

                Assert.assertEquals(result.getCodeText(), "99344");
                Assert.assertNotNull(result.getCodeType());
            }

            Assert.assertEquals(counter, 1);

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
            String fileName = Global.pathCombine(Folder, "Not_working_full_rotate_2.jpg");

            BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);

            int counter = 0;
            for (BarCodeResult result : reader.readBarCodes())
            {
                counter++;
                Assert.assertNotNull(result.getCodeText());

                Assert.assertEquals(result.getCodeText(), "99344");
                Assert.assertNotNull(result.getCodeType());
            }

            Assert.assertEquals(counter, 1);

        } catch (Exception e)
        {
            Assert.fail("Exception", e);
        }
    }

    @Test
    public void testFour()
    {
        try
        {
            String fileName = Global.pathCombine(Folder, "Notworking_barcode_rotate_2.jpg");

            BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);

            int counter = 0;
            for (BarCodeResult result : reader.readBarCodes())
            {
                counter++;
                Assert.assertNotNull(result.getCodeText());

                Assert.assertEquals(result.getCodeText(), "99344");
                Assert.assertNotNull(result.getCodeType());
            }

            Assert.assertEquals(counter, 1);

        } catch (Exception e)
        {
            Assert.fail("Exception", e);
        }
    }
}
