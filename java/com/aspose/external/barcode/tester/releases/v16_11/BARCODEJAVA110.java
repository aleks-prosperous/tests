package com.aspose.external.barcode.tester.releases.v16_11;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.SingleDecodeType;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.BaseEncodeType;
import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.logger.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

@Test
public class BARCODEJAVA110
{
    private final String genertedFolder = Global.getGeneratedImagesFolder("barcodjava_issues" + File.separator + "BARCODEJAVA110");

    @AfterMethod
    public void afterFinish(Method testMethod)
    {
        Logger.methodFinished(getClass().getName() + "." + testMethod.getName());
    }

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void generateRecognizeTest1() throws IOException
    {
        String actualFilePath = Global.pathCombine(genertedFolder, "ActualCode39Standard.tiff");

        String expectedText = "0123456789";
        SingleDecodeType expectedDecodeType = DecodeType.CODE_39;
        generateBarcode(expectedText, EncodeTypes.CODE_39, actualFilePath);
        recognizeBarcode(actualFilePath, expectedDecodeType, expectedText);
    }

    private void generateBarcode(String text, BaseEncodeType symbology, String filePath) throws IOException
    {
        BarcodeGenerator barCodeBuilder = new BarcodeGenerator(symbology, text);
        barCodeBuilder.save(filePath, BarCodeImageFormat.TIFF_IN_CMYK);
    }

    private void recognizeBarcode(String filePath, SingleDecodeType decodeType, String expectedText)
    {
        BarCodeReader barCodeReader = new BarCodeReader(filePath, decodeType);
        Assert.assertEquals(barCodeReader.readBarCodes().length, 1);
        Assert.assertEquals(barCodeReader.readBarCodes()[0].getCodeText(), expectedText);
    }
}
