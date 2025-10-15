package com.aspose.external.barcode.tester.releases.v17_12;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class Issue36690
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue36690");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testDatabarStackedBigSpaces1()
    {
        String file = folder + "DatabarStacked_(01)1606161353532.png";
        BarCodeReader reader = new BarCodeReader(file, DecodeType.DATABAR_STACKED);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(01)16061613535328", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testDatabarStackedBigSpaces2()
    {
        String file = folder + "DatabarStacked_(01)1150477234400.png";
        BarCodeReader reader = new BarCodeReader(file, DecodeType.DATABAR_STACKED);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(01)11504772344004", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testDatabarStackedBigSpaces3()
    {
        String file = folder + "DatabarStacked_(01)5824832995980.png";
        BarCodeReader reader = new BarCodeReader(file, DecodeType.DATABAR_STACKED);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(01)58248329959808", reader.getFoundBarCodes()[0].getCodeText());
    }
}
