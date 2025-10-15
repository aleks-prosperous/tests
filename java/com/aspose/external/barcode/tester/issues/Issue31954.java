package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue-31954.")
public class Issue31954
{
    private final String folder = Global.getTestDataFolder("Issues/Issue31954");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void Recognize1()
    {
        String fileName = Global.pathCombine(folder, "test2.jpg");
        BarCodeReader reader = new BarCodeReader(fileName);
        {

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("The cache is located at north three six degrees zero six point zero two three west one one five degrees zero one point seven three three. Hint: guard rail.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void Recognize2()
    {
        String fileName = Global.pathCombine(folder, "site2.png");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Although loneliness has always been a friend of mine", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void Recognize3()
    {
        String fileName = Global.pathCombine(folder, "site3.png");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Living in a material world" + "\r\n" +
                            "and i am a material girl" + "\r\n" +
                            "you know that we are living in a material world" + "\r\n" +
                            "and i am a material girl",
                    reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}

