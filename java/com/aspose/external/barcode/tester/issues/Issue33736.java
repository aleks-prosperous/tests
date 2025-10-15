// -----------------------------------------------------------------------
// <copyright file="Issue33736.cs" company="">
// TODO: Update copyright text.
// </copyright>
// -----------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue33736.")
public class Issue33736
{
    private final String folder = Global.getTestDataFolder("Issues/Issue33736");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void testPDF417_FedEx_jpg()
    {
        String fileName = Global.pathCombine(folder, "PDF417-FedEx.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("[)>\u001e01\u001d0210011\u001d840\u001d26\u001d7910002710790201\u001dFDE\u001d131189974\u001d151\u001d \u001d1/1\u001d1LB\u001dN\u001d133 West 19th Street\u001dNew York\u001dNY\u001dPaul Sutton\u001e06\u001d10ZED003\u001d11ZDuomo Photography\u001d12Z2122431150\u001d13Z0000\u001c\u001d15Z3058641\u001d18Z197806818\u001cE3\u001d20Z0.00\u001c1\u001d28Z\u001dK \u001d26Z09c6\u001c\u001d\u001e\u0004",
                    reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}

