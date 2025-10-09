package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class BARCODJAVA33393
{
    String folder = Global.getBarcodeJavaIssuesTestImagePath(this.getClass().getSimpleName());

    @BeforeClass
    public void setLicense() throws Exception
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

    @Test
    public void test()
    {
        try
        {
            BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "UK_0010210_A32405_A9499.jpg"), DecodeType.CODE_93);
            Assert.assertEquals(reader.readBarCodes().length, 1);
        } catch (Exception e)
        {
            Assert.fail("Exception", e);
        }
    }
}
