package com.aspose.external.barcode.tester.releases.v19_6;

import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class ParametersValidationTests
{
    @BeforeMethod
    public void setUp() throws Exception
    {
        LicenseAssistant.setupLicense(com.aspose.barcode.licensing.LicenseType.Barcode);  //TODO BARCODEJAVA-947
    }

    @Test
    public void Negative_XDimension_ArgumentException_Expected()
    {
        final String codetext = "0123456789ABCDEFabcdef";
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.PDF_417, codetext);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().getBarcode().getXDimension().setPixels(-1);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }

    @Test
    public void Zero_XDimension_ArgumentException_Expected()
    {
        final String codetext = "0123456789ABCDEFabcdef";
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.PDF_417, codetext);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().getBarcode().getXDimension().setPixels(0);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }

    @Test
    public void Negative_Resolution_ArgumentException_Expected()
    {
        final String codetext = "0123456789ABCDEFabcdef";
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.PDF_417, codetext);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().setResolution(-1);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }

    @Test
    public void Zero_Resolution_ArgumentException_Expected()
    {
        final String codetext = "0123456789ABCDEFabcdef";
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.PDF_417, codetext);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().setResolution(0);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }

    @Test
    public void Negative_BorderWidth_ArgumentException_Expected()
    {
        final String codetext = "0123456789ABCDEFabcdef";
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.PDF_417, codetext);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().getBorder().getWidth().setPixels(-1);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }

    @Test
    public void Negative_CaptionPadding_ArgumentException_Expected()
    {
        final String codetext = "0123456789ABCDEFabcdef";
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.PDF_417, codetext);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().getCaptionAbove().getPadding().getTop().setPixels(-1);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }

    @Test
    public void Negative_BarHeight_ArgumentException_Expected()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.ITF_14);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().getBarcode().getBarHeight().setPixels(-1);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }

    @Test
    public void Zero_BarHeight_ArgumentException_Expected()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.ITF_14);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().getBarcode().getBarHeight().setPixels(0);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }

    @Test
    public void Negative_BarCodeHeight_ArgumentException_Expected()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.ITF_14);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().getImageHeight().setPixels(-1);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }

    @Test
    public void Zero_BarCodeHeight_ArgumentException_Expected()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.ITF_14);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().getImageHeight().setPixels(0);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }

    @Test
    public void Negative_BarCodeWidth_ArgumentException_Expected()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.ITF_14);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().getImageHeight().setPixels(-1);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }

    @Test
    public void Zero_BarCodeWidth_ArgumentException_Expected()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.ITF_14);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().getImageHeight().setPixels(0);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }

    @Test
    public void Negative_AustralianPostShortBarHeight_ArgumentException_Expected()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.AUSTRALIA_POST);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().getBarcode().getAustralianPost().getAustralianPostShortBarHeight().setPixels(-1);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }

    @Test
    public void Negative_PostalShortBarHeight_ArgumentException_Expected()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.POSTNET);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().getBarcode().getPostal().getPostalShortBarHeight().setPixels(-1);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }

    @Test
    public void Negative_WideNarrowRatio_ArgumentException_Expected()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.ITF_14);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().getBarcode().setWideNarrowRatio(-1);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }

    @Test
    public void Zero_WideNarrowRatio_ArgumentException_Expected()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.ITF_14);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().getBarcode().setWideNarrowRatio(0);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }

    @Test
    public void Negative_CaptionFontSize_ArgumentException_Expected()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.ITF_14);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().getCaptionAbove().getFont().getSize().setPixels(-1);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }

    @Test
    public void Zero_CaptionFontSize_ArgumentException_Expected()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.ITF_14);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().getCaptionBelow().getFont().getSize().setPixels(0);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }

    @Test
    public void Negative_ItfQuietZoneCoef_ArgumentException_Expected()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.ITF_14);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().getBarcode().getITF().setQuietZoneCoef(-1);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }

    @Test
    public void Zero_ItfQuietZoneCoef_ArgumentException_Expected()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.ITF_14);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().getBarcode().getITF().setQuietZoneCoef(0);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }

    @Test
    public void LessThanTen_ItfQuietZoneCoef_ArgumentException_Expected()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.ITF_14);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().getBarcode().getITF().setQuietZoneCoef(9);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }

    @Test
    public void Negative_ItfBorderThickness_ArgumentException_Expected()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.ITF_14);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().getBarcode().getITF().getItfBorderThickness().setPixels(-1);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }

    @Test
    public void Zero_ItfBorderThickness_ArgumentException_Expected()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.ITF_14);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().getBarcode().getITF().getItfBorderThickness().setPixels(0);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }

    @Test
    public void Negative_QrAspectRatio_ArgumentException_Expected()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.QR);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().getBarcode().getQR().setAspectRatio(-1);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }

    @Test
    public void Zero_QrAspectRatio_ArgumentException_Expected()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.QR);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().getBarcode().getQR().setAspectRatio(0);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }

    @Test
    public void Negative_Code16KAspectRatio_ArgumentException_Expected()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.CODE_16_K);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().getBarcode().getCode16K().setAspectRatio(-1);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }

    @Test
    public void Zero_Code16KAspectRatio_ArgumentException_Expected()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.CODE_16_K);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().getBarcode().getCode16K().setAspectRatio(0);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }

    @Test
    public void Negative_Code16KQuietZoneLeftCoef_ArgumentException_Expected()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.CODE_16_K);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().getBarcode().getCode16K().setQuietZoneLeftCoef(-1);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }

    @Test
    public void LessThanTen_Code16KQuietZoneLeftCoef_ArgumentException_Expected()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.CODE_16_K);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().getBarcode().getCode16K().setQuietZoneLeftCoef(9);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }

    @Test
    public void Negative_Code16KQuietZoneRightCoef_ArgumentException_Expected()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.CODE_16_K);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().getBarcode().getCode16K().setQuietZoneRightCoef(-1);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }

    @Test
    public void LessThanOne_Code16KQuietZoneRightCoef_ArgumentException_Expected()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.CODE_16_K);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().getBarcode().getCode16K().setQuietZoneRightCoef(0);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }

    @Test
    public void Negative_DataMatrixAspectRatio_ArgumentException_Expected()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.DATA_MATRIX);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().getBarcode().getDataMatrix().setAspectRatio(-1);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }

    @Test
    public void Zero_DataMatrixAspectRatio_ArgumentException_Expected()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.DATA_MATRIX);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().getBarcode().getDataMatrix().setAspectRatio(0);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }

    @Test
    public void Negative_AztecAspectRatio_ArgumentException_Expected()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.AZTEC);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().getBarcode().getAztec().setAspectRatio(-1);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }

    @Test
    public void Zero_AztecAspectRatio_ArgumentException_Expected()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.AZTEC);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().getBarcode().getAztec().setAspectRatio(0);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }

    @Test
    public void Negative_MaxiCodeAspectRatio_ArgumentException_Expected()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.MAXI_CODE);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().getBarcode().getMaxiCode().setAspectRatio(-1);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }

    @Test
    public void Zero_MaxiCodeAspectRatio_ArgumentException_Expected()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.MAXI_CODE);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().getBarcode().getMaxiCode().setAspectRatio(0);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }

    @Test
    public void Negative_CodablockAspectRatio_ArgumentException_Expected()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.CODABLOCK_F);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().getBarcode().getCodablock().setAspectRatio(-1);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }

    @Test
    public void Zero_CodablockAspectRatio_ArgumentException_Expected()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.CODABLOCK_F);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().getBarcode().getCodablock().setAspectRatio(0);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }

    @Test
    public void Negative_DataBarAspectRatio_ArgumentException_Expected()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.DATABAR_EXPANDED);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().getBarcode().getDataBar().setAspectRatio(-1);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }

    @Test
    public void Zero_DataBarAspectRatio_ArgumentException_Expected()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.DATABAR_EXPANDED);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().getBarcode().getDataBar().setAspectRatio(0);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }

    @Test
    public void Negative_SupplementSpace_ArgumentException_Expected()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.UPCA);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().getBarcode().getSupplement().getSupplementSpace().setPixels(-1);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }

    @Test
    public void Negative_CouponSupplementSpace_ArgumentException_Expected()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.UPCA_GS_1_CODE_128_COUPON);
        {
            boolean exceptionCatched = false;
            try
            {
                generator.getParameters().getBarcode().getCoupon().getSupplementSpace().setPixels(-1);
                generator.generateBarCodeImage();
            }
            catch (IllegalArgumentException e)
            {
                exceptionCatched = true;
            }
            Assert.assertTrue(exceptionCatched);
        }
    }
}
