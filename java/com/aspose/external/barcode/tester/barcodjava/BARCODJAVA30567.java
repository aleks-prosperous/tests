package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class BARCODJAVA30567
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
            String fileName = Global.pathCombine(Folder, "aztec.png");
            BarCodeReader reader = new BarCodeReader(fileName, DecodeType.AZTEC);

            int counter = 0;
            for (BarCodeResult result : reader.readBarCodes())
            {
                counter++;
                Assert.assertNotNull(result.getCodeText());
                Assert.assertEquals(result.getCodeText(), "M1MALLARAPU/DIVYA     EC8KLJH CLTSEAUS 0575 253Y021C0095 13F>20B  M1253BUS 29037870892538102                          US1  >14cMDUCGFfTBVuSELT6/IDsTkJreBOq2CtzMIouXQIZAI4ghxSThGgd0VDKOi1CGSCz/6v32LXjpQ==");
                Assert.assertNotNull(result.getCodeType());
            }
            Assert.assertTrue(counter > 0);

        } catch (Exception e)
        {
            Assert.fail("Exception", e);
        }
    }
}
