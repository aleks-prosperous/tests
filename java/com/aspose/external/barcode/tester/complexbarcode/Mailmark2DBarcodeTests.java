package com.aspose.external.barcode.tester.complexbarcode;

import com.aspose.barcode.BarCodeException;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.complexbarcode.ComplexBarcodeGenerator;
import com.aspose.barcode.complexbarcode.ComplexCodetextReader;
import com.aspose.barcode.complexbarcode.Mailmark2DCodetext;
import com.aspose.barcode.complexbarcode.Mailmark2DType;
import com.aspose.barcode.generation.DataMatrixEncodeMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aspose.barcode.LicenseAssistant;

import java.awt.image.BufferedImage;

public class Mailmark2DBarcodeTests
{
    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void Mailmark2D_Empty_Test()
    {
        Mailmark2DCodetext mailmark2DCodetext = new Mailmark2DCodetext();

        ComplexBarcodeGenerator cg = new ComplexBarcodeGenerator(mailmark2DCodetext);
        {
            BufferedImage res = cg.generateBarCodeImage();

            BarCodeReader cr = new BarCodeReader(res, DecodeType.DATA_MATRIX);
            {
                Assert.assertEquals(cr.readBarCodes().length, 1);
                Mailmark2DCodetext test = ComplexCodetextReader.tryDecodeMailmark2D(cr.getFoundBarCodes()[0].getCodeText());

                Assert.assertEquals(mailmark2DCodetext.getConstructedCodetext(), test.getConstructedCodetext());
            }
        }
    }

    @Test
    public void Mailmark2D_Invalid_Item_ID_Test()
    {
        Mailmark2DCodetext mailmark2DCodetext = new Mailmark2DCodetext();
        mailmark2DCodetext.setUPUCountryID("JGB ");
        mailmark2DCodetext.setInformationTypeID("0");
        mailmark2DCodetext.setVersionID("1");
        mailmark2DCodetext.setclass("1");
        mailmark2DCodetext.setSupplyChainID(123);
        mailmark2DCodetext.setItemID(123467890);
        mailmark2DCodetext.setDestinationPostCodeAndDPS("QWE1");
        mailmark2DCodetext.setRTSFlag("0");
        mailmark2DCodetext.setReturnToSenderPostCode("QWE2");

        mailmark2DCodetext.setDataMatrixType(Mailmark2DType.TYPE_29);
        mailmark2DCodetext.setCustomerContent("CUSTOM_DATA");

        boolean exceptionCatched = false;
        try
        {
            new ComplexBarcodeGenerator(mailmark2DCodetext);
        }
        catch (BarCodeException ex)
        {
            exceptionCatched = true;
        }
        Assert.assertTrue(exceptionCatched);
    }

    @Test
    public void Mailmark2D_Invalid_UPU_Country_Id_Test()
    {
        Mailmark2DCodetext mailmark2DCodetext = new Mailmark2DCodetext();
        mailmark2DCodetext.setUPUCountryID("JGB11");
        mailmark2DCodetext.setInformationTypeID("0");
        mailmark2DCodetext.setVersionID("1");
        mailmark2DCodetext.setclass("1");
        mailmark2DCodetext.setSupplyChainID(123);
        mailmark2DCodetext.setItemID(1234);
        mailmark2DCodetext.setDestinationPostCodeAndDPS("QWE1");
        mailmark2DCodetext.setRTSFlag("0");
        mailmark2DCodetext.setReturnToSenderPostCode("QWE2");

        mailmark2DCodetext.setDataMatrixType(Mailmark2DType.TYPE_29);
        mailmark2DCodetext.setCustomerContent("CUSTOM_DATA");

        boolean exceptionCatched = false;
        try
        {
            new ComplexBarcodeGenerator(mailmark2DCodetext);
        }
        catch (BarCodeException ex)
        {
            exceptionCatched = true;
        }
        Assert.assertTrue(exceptionCatched);
    }

    @Test
    public void Mailmark2D_Invalid_Customer_Data_Test()
    {
        Mailmark2DCodetext mailmark2DCodetext = new Mailmark2DCodetext();
        mailmark2DCodetext.setUPUCountryID("JGB ");
        mailmark2DCodetext.setInformationTypeID("0");
        mailmark2DCodetext.setVersionID("1");
        mailmark2DCodetext.setclass("1");
        mailmark2DCodetext.setSupplyChainID(123);
        mailmark2DCodetext.setItemID(1234);
        mailmark2DCodetext.setDestinationPostCodeAndDPS("QWE1");
        mailmark2DCodetext.setRTSFlag("0");
        mailmark2DCodetext.setReturnToSenderPostCode("QWE2");

        mailmark2DCodetext.setDataMatrixType(Mailmark2DType.TYPE_29);
        mailmark2DCodetext.setCustomerContent("CUSTOM_DATAqeweqwqewqeqweeqwqewqew");

        boolean exceptionCatched = false;
        try
        {
            new ComplexBarcodeGenerator(mailmark2DCodetext);
        }
        catch (BarCodeException ex)
        {
            exceptionCatched = true;
        }
        Assert.assertTrue(exceptionCatched);
    }

    @Test
    public void Mailmark2D_FullyInitialized_Type_29_Test()
    {
        Mailmark2DCodetext mailmark2DCodetext = new Mailmark2DCodetext();
        mailmark2DCodetext.setUPUCountryID("JGB ");
        mailmark2DCodetext.setInformationTypeID("0");
        mailmark2DCodetext.setVersionID("1");
        mailmark2DCodetext.setclass("1");
        mailmark2DCodetext.setSupplyChainID(123);
        mailmark2DCodetext.setItemID(1234);
        mailmark2DCodetext.setDestinationPostCodeAndDPS("QWE1");
        mailmark2DCodetext.setRTSFlag("0");
        mailmark2DCodetext.setReturnToSenderPostCode("QWE2");

        mailmark2DCodetext.setDataMatrixType(Mailmark2DType.TYPE_29);
        mailmark2DCodetext.setCustomerContent("CUSTOM_DATA");
        ComplexBarcodeGenerator cg = new ComplexBarcodeGenerator(mailmark2DCodetext);
        {
            BufferedImage res = cg.generateBarCodeImage();

            BarCodeReader cr = new BarCodeReader(res, DecodeType.DATA_MATRIX);
            {
                Assert.assertEquals(cr.readBarCodes().length, 1);
                Mailmark2DCodetext test = ComplexCodetextReader.tryDecodeMailmark2D(cr.getFoundBarCodes()[0].getCodeText());

                Assert.assertEquals(mailmark2DCodetext.getConstructedCodetext(), test.getConstructedCodetext());
            }
        }
    }
    @Test
    public void Mailmark2D_FullyInitialized_Type_7_Test()
    {
        Mailmark2DCodetext mailmark2DCodetext = new Mailmark2DCodetext();
        mailmark2DCodetext.setUPUCountryID("JGB ");
        mailmark2DCodetext.setInformationTypeID("0");
        mailmark2DCodetext.setVersionID("1");
        mailmark2DCodetext.setclass("1");
        mailmark2DCodetext.setSupplyChainID(123);
        mailmark2DCodetext.setItemID(1234);
        mailmark2DCodetext.setDestinationPostCodeAndDPS("QWE1");
        mailmark2DCodetext.setRTSFlag("0");
        mailmark2DCodetext.setReturnToSenderPostCode("QWE2");

        mailmark2DCodetext.setDataMatrixType(Mailmark2DType.TYPE_7);
        mailmark2DCodetext.setCustomerContent("CUSTOM");
        ComplexBarcodeGenerator cg = new ComplexBarcodeGenerator(mailmark2DCodetext);
        {
            BufferedImage res = cg.generateBarCodeImage();

            BarCodeReader cr = new BarCodeReader(res, DecodeType.DATA_MATRIX);
            {
                Assert.assertEquals(cr.readBarCodes().length, 1);
                Mailmark2DCodetext test = ComplexCodetextReader.tryDecodeMailmark2D(cr.getFoundBarCodes()[0].getCodeText());

                Assert.assertEquals(mailmark2DCodetext.getConstructedCodetext(), test.getConstructedCodetext());
            }
        }
    }
    @Test
    public void Mailmark2D_FullyInitialized_Type_9_Test()
    {
        Mailmark2DCodetext mailmark2DCodetext = new Mailmark2DCodetext();
        mailmark2DCodetext.setUPUCountryID("JGB ");
        mailmark2DCodetext.setInformationTypeID("0");
        mailmark2DCodetext.setVersionID("1");
        mailmark2DCodetext.setclass("1");
        mailmark2DCodetext.setSupplyChainID(123);
        mailmark2DCodetext.setItemID(1234);
        mailmark2DCodetext.setDestinationPostCodeAndDPS("QWE1");
        mailmark2DCodetext.setRTSFlag("0");
        mailmark2DCodetext.setReturnToSenderPostCode("QWE2");

        mailmark2DCodetext.setDataMatrixType(Mailmark2DType.TYPE_9);
        mailmark2DCodetext.setCustomerContent("CUSTOM_DATA");
        ComplexBarcodeGenerator cg = new ComplexBarcodeGenerator(mailmark2DCodetext);
        {
            BufferedImage res = cg.generateBarCodeImage();

            BarCodeReader cr = new BarCodeReader(res, DecodeType.DATA_MATRIX);
            {
                Assert.assertEquals(cr.readBarCodes().length, 1);
                Mailmark2DCodetext test = ComplexCodetextReader.tryDecodeMailmark2D(cr.getFoundBarCodes()[0].getCodeText());

                Assert.assertEquals(mailmark2DCodetext.getConstructedCodetext(), test.getConstructedCodetext());
            }
        }
    }


    @Test
    public void Mailmark2DCodetext_UPUCountryID_Test()
    {
        Mailmark2DCodetext c = new Mailmark2DCodetext();
        c.setUPUCountryID("test");
        Assert.assertEquals("test", c.getUPUCountryID());
    }

    @Test
    public void Mailmark2DCodetext_InformationTypeID_Test()
    {
        Mailmark2DCodetext c = new Mailmark2DCodetext();
        c.setInformationTypeID("test");
        Assert.assertEquals("test", c.getInformationTypeID());
    }

    @Test
    public void Mailmark2DCodetext_VersionID_Test()
    {
        Mailmark2DCodetext c = new Mailmark2DCodetext();
        c.setVersionID("test");
        Assert.assertEquals("test", c.getVersionID());
    }

    @Test
    public void Mailmark2DCodetext_Class_Test()
    {
        Mailmark2DCodetext c = new Mailmark2DCodetext();
        c.setclass("test");
        Assert.assertEquals("test", c.getclass());
    }

    @Test
    public void Mailmark2DCodetext_SupplyChainID_Test()
    {
        Mailmark2DCodetext c = new Mailmark2DCodetext();
        c.setSupplyChainID(5);
        Assert.assertEquals(5, c.getSupplyChainID());
    }

    @Test
    public void Mailmark2DCodetext_ItemID_Test()
    {
        Mailmark2DCodetext c = new Mailmark2DCodetext();
        c.setItemID(6);
        Assert.assertEquals(6, c.getItemID());
    }

    @Test
    public void Mailmark2DCodetext_DestinationPostCodeAndDPS_Test()
    {
        Mailmark2DCodetext c = new Mailmark2DCodetext();
        c.setDestinationPostCodeAndDPS("test");
        Assert.assertEquals("test", c.getDestinationPostCodeAndDPS());
    }

    @Test
    public void Mailmark2DCodetext_RTSFlag_Test()
    {
        Mailmark2DCodetext c = new Mailmark2DCodetext();
        c.setRTSFlag("test");
        Assert.assertEquals("test", c.getRTSFlag());
    }

    @Test
    public void Mailmark2DCodetext_ReturnToSenderPostCode_Test()
    {
        Mailmark2DCodetext c = new Mailmark2DCodetext();
        c.setReturnToSenderPostCode("test");
        Assert.assertEquals("test", c.getReturnToSenderPostCode());
    }

    @Test
    public void Mailmark2DCodetext_CustomerContent_Test()
    {
        Mailmark2DCodetext c = new Mailmark2DCodetext();
        c.setCustomerContent("test");
        Assert.assertEquals("test", c.getCustomerContent());
    }

    @Test
    public void Mailmark2DCodetext_CustomerContentEncodeMode_Test()
    {
        Mailmark2DCodetext c = new Mailmark2DCodetext();
        c.setCustomerContentEncodeMode(DataMatrixEncodeMode.C40);
        Assert.assertEquals(DataMatrixEncodeMode.C40, c.getCustomerContentEncodeMode());
    }

    @Test
    public void Mailmark2DCodetext_DataMatrixType_Test()
    {
        Mailmark2DCodetext c = new Mailmark2DCodetext();
        c.setDataMatrixType(Mailmark2DType.TYPE_29);
        Assert.assertEquals(Mailmark2DType.TYPE_29, c.getDataMatrixType());
    }

    @Test
    public void Mailmark2DType_Test()
    {
        Mailmark2DType test = Mailmark2DType.AUTO;
        Assert.assertEquals(Mailmark2DType.AUTO, test);

        test = Mailmark2DType.TYPE_7;
        Assert.assertEquals(Mailmark2DType.TYPE_7, test);

        test = Mailmark2DType.TYPE_9;
        Assert.assertEquals(Mailmark2DType.TYPE_9, test);

        test = Mailmark2DType.TYPE_29;
        Assert.assertEquals(Mailmark2DType.TYPE_29, test);
    }
}
