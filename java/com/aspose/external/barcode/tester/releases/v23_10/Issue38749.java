package com.aspose.external.barcode.tester.releases.v23_10;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.CodeLocation;
import helpers.FrameworkTestUtils;
import helpers.IOTestUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;
import utils.TestExternalHelper;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class Issue38749
{
    private final static String Folder = Global.getTestDataFolder("Issues/Issue38749");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_swissQRCode_Compare_Above() throws IOException
    {
        readAndCompare("swissQRCode_Above.png", swissQRWithCross(CodeLocation.ABOVE));
    }
        
    @Test
    public void test_swissQRCode_Compare_Below() throws IOException
    {
        readAndCompare("swissQRCode_Below.png", swissQRWithCross(CodeLocation.BELOW));
    }
        
    @Test
    public void test_swissQRCode_Compare_None() throws IOException
    {
        readAndCompare("swissQRCode_None.png", swissQRWithCross(CodeLocation.NONE));
    }

    protected void readAndCompare(String filename, ComplexBarcodeGenerator generator) throws IOException
    {
        String path = FrameworkTestUtils.addFrameworkPostFixToFileName(Global.pathCombine(Folder, filename));
        InputStream ms = IOTestUtils.loadToMemoryStreamExternal(path);
        BufferedImage expected = ImageIO.read(ms);
        BufferedImage real = generator.generateBarCodeImage();
        TestExternalHelper.compareBitmaps(expected, real);
    }

    protected ComplexBarcodeGenerator swissQRWithCross(CodeLocation location)
    {

        SwissQRCodetext swissQRCode = new SwissQRCodetext();

        // Bill Details
        swissQRCode.getBill().setVersion(QrBillStandardVersion.V2_0);
        swissQRCode.getBill().setAccount("CH7430000002800102107");
        swissQRCode.getBill().setAmount(12.340d);
        swissQRCode.getBill().setCurrency("CHF");
        swissQRCode.getBill().setReference("reference");
        swissQRCode.getBill().setBillInformation("bill information");
        swissQRCode.getBill().setUnstructuredMessage("some message");

        // Creditor Address
        Address creditorAddress = new Address();
        creditorAddress.setName("Creditor Name");
        creditorAddress.setPostalCode("1234");
        creditorAddress.setTown("Creditor Town");
        creditorAddress.setCountryCode("CH");
        swissQRCode.getBill().setCreditor(creditorAddress);

        // Debtor Address
        Address debtorAddress = new Address();
        debtorAddress.setName("Debtor Name");
        debtorAddress.setPostalCode("4321");
        debtorAddress.setTown("Debtor Town");
        debtorAddress.setCountryCode("CH");
        swissQRCode.getBill().setDebtor(debtorAddress);

        ComplexBarcodeGenerator swissQRGenerator = new ComplexBarcodeGenerator(swissQRCode);
        swissQRGenerator.getParameters().getBarcode().getCodeTextParameters().setLocation(location);

        return swissQRGenerator;
    }
}
