package com.aspose.external.barcode.tester.releases.v20_10;

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.awt.image.BufferedImage;

public class Issue37571
{
    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void SetUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_QR_ECI_AutoCompaction()
    {
        String codetext = "HTTP://XXX.YY/A/BB0112000011234567895100112345678020200601BBXYWIXHT2WDH66ZC5OFKK2TGTG4VPUNOI23EFT3Y7OIYTMNXBJ4LPT742G4YIZCXPLS5CVVE5ADTUFFSXZYKGMISKCVLSUXWO6VV37QFKW7VHHI2AFXHC2Z6P5VBPLHDE2NIGSOPDFAWTZPIKTWJKP4GVPCC6JIR6TJ4N33IFMO33APVP6KJUOVWXXYMDXFPSH6HMBPK7NTPDUE6KOJAC6WEDRGZZ7RMM2EQ27CAJCNQEHVCXWQ3GISP6UFTGBXBKXYE5BXUZIUGV5OD5NKYCSTRYE6LIV55B5OQ2IRC6NJSOJ6YLWVVRAVZLOBQQNGW2KXNXD7IJDZGFY36X5E64SMQK3PETGIU775CDRFMKH6M73HQQQVURX7RGYMKSYJHKOEVWSGRPNRZ2NEAIYJNBOHRU======";
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.QR, codetext);
        generator.getParameters().getBarcode().getQR().setQrEncodeMode(QREncodeMode.ECI_ENCODING);
        generator.getParameters().getBarcode().getQR().setQrEncodeType(QREncodeType.FORCE_QR);


        BufferedImage bitmap = generator.generateBarCodeImage();

        BarCodeReader reader = new BarCodeReader(bitmap);
        BarCodeResult[] recognized = reader.readBarCodes();

        Assert.assertEquals(1, recognized.length);
        Assert.assertEquals(codetext, recognized[0].getCodeText());
    }

    @Test
    public void test_QR_No_ECI_AutoCompaction()
    {
        String codetext = "HTTP://XXX.YY/A/BB0112000011234567895100112345678020200601BBXYWIXHT2WDH66ZC5OFKK2TGTG4VPUNOI23EFT3Y7OIYTMNXBJ4LPT742G4YIZCXPLS5CVVE5ADTUFFSXZYKGMISKCVLSUXWO6VV37QFKW7VHHI2AFXHC2Z6P5VBPLHDE2NIGSOPDFAWTZPIKTWJKP4GVPCC6JIR6TJ4N33IFMO33APVP6KJUOVWXXYMDXFPSH6HMBPK7NTPDUE6KOJAC6WEDRGZZ7RMM2EQ27CAJCNQEHVCXWQ3GISP6UFTGBXBKXYE5BXUZIUGV5OD5NKYCSTRYE6LIV55B5OQ2IRC6NJSOJ6YLWVVRAVZLOBQQNGW2KXNXD7IJDZGFY36X5E64SMQK3PETGIU775CDRFMKH6M73HQQQVURX7RGYMKSYJHKOEVWSGRPNRZ2NEAIYJNBOHRU======";
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.QR, codetext);
        generator.getParameters().getBarcode().getQR().setQrErrorLevel(QRErrorLevel.LEVEL_L);
        generator.getParameters().getBarcode().getQR().setQrEncodeType(QREncodeType.FORCE_QR);
        generator.getParameters().getBarcode().getQR().setQrVersion(QRVersion.VERSION_12);

        BufferedImage bitmap = generator.generateBarCodeImage();

        BarCodeReader reader = new BarCodeReader(bitmap);
        BarCodeResult[] recognized = reader.readBarCodes();

        Assert.assertEquals(1, recognized.length);
        Assert.assertEquals(codetext, recognized[0].getCodeText());
    }
}
