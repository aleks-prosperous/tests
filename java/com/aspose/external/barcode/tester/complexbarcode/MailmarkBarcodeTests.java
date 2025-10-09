package com.aspose.external.barcode.tester.complexbarcode;

import com.aspose.barcode.BarCodeException;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.complexbarcode.ComplexBarcodeGenerator;
import com.aspose.barcode.complexbarcode.ComplexCodetextReader;
import com.aspose.barcode.complexbarcode.MailmarkCodetext;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aspose.barcode.LicenseAssistant;

import java.awt.image.BufferedImage;

public class MailmarkBarcodeTests
{
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void mailmark_Empty_Test()
    {
        MailmarkCodetext mailmarkCAndLCodetext = new MailmarkCodetext();

        boolean exceptionCatched = false;
        try
        {
            new ComplexBarcodeGenerator(mailmarkCAndLCodetext);
        }
        catch (BarCodeException e)
        {
            exceptionCatched = true;
        }
        Assert.assertTrue(exceptionCatched);
    }

    @Test
    public void Mailmark_Fully_Initialized_Test()
    {
        MailmarkCodetext mailmarkCAndLCodetext = new MailmarkCodetext();

        mailmarkCAndLCodetext.setFormat(4);
        mailmarkCAndLCodetext.setVersionID(1);
        mailmarkCAndLCodetext.setClass("0");
        mailmarkCAndLCodetext.setSupplychainID(384224);
        mailmarkCAndLCodetext.setItemID(16563762);
        mailmarkCAndLCodetext.setDestinationPostCodePlusDPS("EF61AH8T ");

        ComplexBarcodeGenerator cg = new ComplexBarcodeGenerator(mailmarkCAndLCodetext);
        {
            cg.getParameters().getBarcode().getPadding().getTop().setPixels(cg.getParameters().getBarcode().getPadding().getTop().getPixels()- 1);
            BufferedImage res = cg.generateBarCodeImage();

            BarCodeReader cr = new BarCodeReader(res, DecodeType.MAILMARK);
            {
                Assert.assertEquals(cr.readBarCodes().length, 1);
                MailmarkCodetext test = ComplexCodetextReader.tryDecodeMailmark(cr.getFoundBarCodes()[0].getCodeText());

                Assert.assertEquals(mailmarkCAndLCodetext.getConstructedCodetext(), test.getConstructedCodetext());
            }
        }
    }

    @Test
    public void Mailmark_Minimal_Codetext_Test()
    {
        MailmarkCodetext mailmarkCAndLCodetext = new MailmarkCodetext();

        mailmarkCAndLCodetext.setFormat(1);
        mailmarkCAndLCodetext.setVersionID(1);
        mailmarkCAndLCodetext.setClass("0");
        mailmarkCAndLCodetext.setSupplychainID(0);
        mailmarkCAndLCodetext.setItemID(0);
        mailmarkCAndLCodetext.setDestinationPostCodePlusDPS("XY11     ");

        ComplexBarcodeGenerator cg = new ComplexBarcodeGenerator(mailmarkCAndLCodetext);
        {
            cg.getParameters().getBarcode().getPadding().getTop().setPixels(cg.getParameters().getBarcode().getPadding().getTop().getPixels() - 1);
            BufferedImage res = cg.generateBarCodeImage();

            BarCodeReader cr = new BarCodeReader(res, DecodeType.MAILMARK);
            {
                Assert.assertEquals(cr.readBarCodes().length, 1);
                MailmarkCodetext test = ComplexCodetextReader.tryDecodeMailmark(cr.getFoundBarCodes()[0].getCodeText());

                Assert.assertEquals(mailmarkCAndLCodetext.getConstructedCodetext(), test.getConstructedCodetext());
            }
        }
    }

    @Test
    public void Mailmark_Format_Test()
    {
        MailmarkCodetext c = new MailmarkCodetext();
        c.setFormat(4);
        Assert.assertEquals(4, c.getFormat());
    }

    @Test
    public void Mailmark_VersionID_Test()
    {
        MailmarkCodetext c = new MailmarkCodetext();
        c.setVersionID(4);
        Assert.assertEquals(4, c.getVersionID());
    }

    @Test
    public void Mailmark_Class_Test()
    {
        MailmarkCodetext c = new MailmarkCodetext();
        c.setClass("test");
        Assert.assertEquals("test", c.getClass_());
    }

    @Test
    public void Mailmark_SupplychainID_Test()
    {
        MailmarkCodetext c = new MailmarkCodetext();
        c.setSupplychainID(5);
        Assert.assertEquals(5, c.getSupplychainID());
    }

    @Test
    public void Mailmark_ItemID_Test()
    {
        MailmarkCodetext c = new MailmarkCodetext();
        c.setItemID(6);
        Assert.assertEquals(6, c.getItemID());
    }

    @Test
    public void Mailmark_DestinationPostCodePlusDPS_Test()
    {
        MailmarkCodetext c = new MailmarkCodetext();
        c.setDestinationPostCodePlusDPS("test");
        Assert.assertEquals("test", c.getDestinationPostCodePlusDPS());
    }
}
