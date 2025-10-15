package com.aspose.external.barcode.tester.releases.v21_5;

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue37708
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
        public void test_QR_TestKanji()
        {
            String codetext = "QRおねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。vvおねがいします。おねがいします。おねがいします。おねがいします。genrateおねがいします。おねがいします。おねがいします。おねがいします。qr code with given。おねがいします。@Y&#^##()おねがいします。textします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。heightします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。width。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがいします。おねがい";
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.QR, codetext);
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.QR);
            BarCodeResult[] res = reader.readBarCodes();
            Assert.assertEquals(1, res.length);
            Assert.assertEquals(codetext, res[0].getCodeText());
        }
}
