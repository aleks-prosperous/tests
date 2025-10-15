package com.aspose.external.barcode.tester.releases.v20_10;

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class BARCODEJAVA918
{
    @BeforeMethod
    public void SetUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test()
    {
        String codeText = "HTTP://XXX.YY/A/BB0112000011234567895100112345678020200601BBXYWIXHT2WDH66ZC5OFKK2TGTG4VPUNOI23EFT3Y7OIYTMNXBJ4LPT742G4YIZCXPLS5CVVE5ADTUFFSXZYKGMISKCVLSUXWO6VV37QFKW7VHHI2AFXHC2Z6P5VBPLHDE2NIGSOPDFAWTZPIKTWJKP4GVPCC6JIR6TJ4N33IFMO33APVP6KJUOVWXXYMDXFPSH6HMBPK7NTPDUE6KOJAC6WEDRGZZ7RMM2EQ27CAJCNQEHVCXWQ3GISP6UFTGBXBKXYE5BXUZIUGV5OD5NKYCSTRYE6LIV55B5OQ2IRC6NJSOJ6YLWVVRAVZLOBQQNGW2KXNXD7IJDZGFY36X5E64SMQK3PETGIU775CDRFMKH6M73HQQQVURX7RGYMKSYJHKOEVWSGRPNRZ2NEAIYJNBOHRU======";
        // Instantiate BarCodeBuilder object
        BarcodeGenerator generator = new BarcodeGenerator(com.aspose.barcode.generation.EncodeTypes.QR,codeText);

        //Set dimension
        generator.getParameters().getBarcode().getXDimension().setMillimeters(0.2f);


        //Set Paddings
        generator.getParameters().getBarcode().getPadding().getBottom().setPixels(0f);
        generator.getParameters().getBarcode().getPadding().getLeft().setPixels(0f);
        generator.getParameters().getBarcode().getPadding().getRight().setPixels(0f);
        generator.getParameters().getBarcode().getPadding().getTop().setPixels(0f);

        // Set the error level
        generator.getParameters().getBarcode().getQR().setQrErrorLevel(QRErrorLevel.LEVEL_L);

        generator.getParameters().getBarcode().getQR().setQrEncodeMode(QREncodeMode.ECI_ENCODING);
        generator.getParameters().getBarcode().getQR().setQrECIEncoding(ECIEncodings.US_ASCII);

        generator.getParameters().getBarcode().getQR().setQrEncodeType(QREncodeType.FORCE_QR);

        // Set the QR barcode version number


        generator.getParameters().getBarcode().getQR().setQrVersion(QRVersion.VERSION_12);

        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        generator.getParameters().setResolution(600);


        try {
            generator.save(stream, BarCodeImageFormat.PNG);
            byte[] buffer = stream.toByteArray();
            InputStream is = new ByteArrayInputStream(buffer);
            BarCodeReader reader = new BarCodeReader(is);
            BarCodeResult[] results = reader.readBarCodes();
            Assert.assertEquals(results.length, 1);
            Assert.assertEquals(results[0].getCodeText(), codeText);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally {
            if (stream != null)
                try {
                    stream.close();
                } catch (IOException e) {}
        }
    }
}
