package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


@Test(description = "Tests for Issue33317.")
public class Issue33317
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33317");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void recognize1RotatedProperties()
    {
        String fileName = Global.pathCombine(folder, "dut0hztd.bd4.bmp");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("REF:PP022531726|EX:a1a9a8aa-9444-4a09-86bc-f6d6351a7fc8|[B1]|X:70;Optimisation:OR;U:UK;CST:Reg 28;Regional:RReSA;AssetExposures:AEMP;PV:PM;AP:ApAct|CGEM:2.00%;CTTCB2:14.07%;FEQF:13.53%;INAW:8.00%;RMGF:11.17%;RMEC:15.07%;PDMCD:10.00%;PEPTF:15.00%;SBFR:11.16%;|1 of 1(100.0000%)|DFV:WEInt_SA_20120623|SW:1.0.0.1731|CS:a57a68fb", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void recognize1Rotated()
    {
        String fileName = Global.pathCombine(folder, "dut0hztd.bd4_rotated.jpg");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("REF:PP022531726|EX:a1a9a8aa-9444-4a09-86bc-f6d6351a7fc8|[B1]|X:70;Optimisation:OR;U:UK;CST:Reg 28;Regional:RReSA;AssetExposures:AEMP;PV:PM;AP:ApAct|CGEM:2.00%;CTTCB2:14.07%;FEQF:13.53%;INAW:8.00%;RMGF:11.17%;RMEC:15.07%;PDMCD:10.00%;PEPTF:15.00%;SBFR:11.16%;|1 of 1(100.0000%)|DFV:WEInt_SA_20120623|SW:1.0.0.1731|CS:a57a68fb", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void recognizeInputRotatedProperties()
    {
        String fileName = Global.pathCombine(folder, "input.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("REF:|EX:2eb26de3-e4fe-436b-a0b2-e1c08f89882a|[B1]|X:65;Optimisation:OR;U:UK;CST:Reg 28;Regional:RUC;AssetExposures:AEIP;PV:PI;AP:ApAct|CGEM:5.45%;CNTF:11.29%;FEQF:11.29%;INAW:13.18%;RBFB8:17.82%;REB2:13.15%;PDMCD:10.00%;SBFR:17.82%;|1 of 1(100.0000%)|DFV:WEInt_SA_20120623|SW:1.0.0.1869|CS:8460e54e", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void recognizeInputRotated()
    {
        String fileName = Global.pathCombine(folder, "input_rotated.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("REF:|EX:2eb26de3-e4fe-436b-a0b2-e1c08f89882a|[B1]|X:65;Optimisation:OR;U:UK;CST:Reg 28;Regional:RUC;AssetExposures:AEIP;PV:PI;AP:ApAct|CGEM:5.45%;CNTF:11.29%;FEQF:11.29%;INAW:13.18%;RBFB8:17.82%;REB2:13.15%;PDMCD:10.00%;SBFR:17.82%;|1 of 1(100.0000%)|DFV:WEInt_SA_20120623|SW:1.0.0.1869|CS:8460e54e", reader.getFoundBarCodes()[0].getCodeText());
    }
}

