package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.ChecksumValidation;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EnableChecksum;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.image.BufferedImage;

public class Issue36995
{
        @Test
    public void test_Code39Extended_Checksum_Calculation_Integration_Test()
    {
        String codeText = "XFVOM";

        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.CODE_39_FULL_ASCII);
        {
            gen.setCodeText(codeText);
            gen.getParameters().getBarcode().setChecksumEnabled(EnableChecksum.YES);
            gen.getParameters().getBarcode().setChecksumAlwaysShow(true);
            BufferedImage bitmap = gen.generateBarCodeImage();

            BarCodeReader reader = new BarCodeReader(bitmap, DecodeType.CODE_39_FULL_ASCII);
            {
                reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codeText + "$", reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals("$", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
            }
        }
    }
}
