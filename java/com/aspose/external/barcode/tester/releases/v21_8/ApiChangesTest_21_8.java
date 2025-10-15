package com.aspose.external.barcode.tester.releases.v21_8;

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.complexbarcode.ComplexBarcodeGenerator;
import com.aspose.barcode.complexbarcode.ComplexCodetextReader;
import com.aspose.barcode.complexbarcode.Mailmark2DCodetext;
import com.aspose.barcode.complexbarcode.Mailmark2DType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.awt.image.BufferedImage;

public class ApiChangesTest_21_8
{
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }


    @Test
    public void testApi()
    {
        Mailmark2DCodetext mailmark2DCodetext = new Mailmark2DCodetext();
        mailmark2DCodetext.setUPUCountryID("JGB ");
        Assert.assertEquals(mailmark2DCodetext.getUPUCountryID(),"JGB ");
        mailmark2DCodetext.setInformationTypeID("0");
        Assert.assertEquals(mailmark2DCodetext.getInformationTypeID(),"0");
        mailmark2DCodetext.setVersionID("1");
        Assert.assertEquals(mailmark2DCodetext.getVersionID(),"1");
        mailmark2DCodetext.setclass("1");
        Assert.assertEquals(mailmark2DCodetext.getclass(),"1");
        mailmark2DCodetext.setSupplyChainID(123);
        Assert.assertEquals(mailmark2DCodetext.getSupplyChainID(),123);
        mailmark2DCodetext.setItemID(1234);
        Assert.assertEquals(mailmark2DCodetext.getItemID(),1234);
        mailmark2DCodetext.setDestinationPostCodeAndDPS("QWE1");
        Assert.assertEquals(mailmark2DCodetext.getDestinationPostCodeAndDPS(),"QWE1");
        mailmark2DCodetext.setRTSFlag("0");
        Assert.assertEquals(mailmark2DCodetext.getRTSFlag(),"0");
        mailmark2DCodetext.setReturnToSenderPostCode("QWE2");
        Assert.assertEquals(mailmark2DCodetext.getReturnToSenderPostCode(),"QWE2");

        mailmark2DCodetext.setDataMatrixType(Mailmark2DType.TYPE_7);
        Assert.assertEquals(mailmark2DCodetext.getDataMatrixType(),Mailmark2DType.TYPE_7);
        mailmark2DCodetext.setDataMatrixType(Mailmark2DType.TYPE_9);
        Assert.assertEquals(mailmark2DCodetext.getDataMatrixType(),Mailmark2DType.TYPE_9);
        mailmark2DCodetext.setDataMatrixType(Mailmark2DType.TYPE_29);
        Assert.assertEquals(mailmark2DCodetext.getDataMatrixType(),Mailmark2DType.TYPE_29);
        mailmark2DCodetext.setCustomerContent("CUSTOM_DATA");
        Assert.assertEquals(mailmark2DCodetext.getCustomerContent(),"CUSTOM_DATA");

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
}
