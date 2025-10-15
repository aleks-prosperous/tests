package com.aspose.external.barcode.tester.releases.v17_3;

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.BaseDecodeType;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestExternalHelper;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class BARCODEJSP88
{
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void generateBarcodeUpcaGs1Code128Coupon() throws IOException
    {
        BufferedImage bitmap = TestExternalHelper.generateInMemory("514141100906(8102)03", EncodeTypes.UPCA_GS_1_CODE_128_COUPON);

        BaseDecodeType[] barcodeTypes = new BaseDecodeType[]{DecodeType.UPCA, DecodeType.GS_1_CODE_128};
        BarCodeReader reader = new BarCodeReader(bitmap, barcodeTypes);


            BarCodeResult[]  results = reader.readBarCodes();
            Assert.assertEquals(results.length, 2);
            System.out.println(results[0].getCodeType() + ": " + results[0].getCodeText(StandardCharsets.UTF_8));
            System.out.println(results[1].getCodeType() + ": " + results[1].getCodeText(StandardCharsets.UTF_8));
            Assert.assertEquals(results[0].getCodeType(), DecodeType.UPCA);
            Assert.assertEquals(results[1].getCodeType(), DecodeType.GS_1_CODE_128);
            Assert.assertEquals(results[0].getCodeText(StandardCharsets.UTF_8), "514141100906");
            Assert.assertEquals(results[1].getCodeText(StandardCharsets.UTF_8), "(8102)03");
    }
}
