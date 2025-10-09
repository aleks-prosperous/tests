package com.aspose.barcode.generation;

import com.aspose.barcode.LicenseAssistant;
import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;

public class UnitTests
{
    String folder = Global.getGeneratedImagesFolder("BaseGenerationParametersTests");


    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
        BarcodeGenerator barcodeGenerator = new BarcodeGenerator(EncodeTypes.EAN_14, "332211");
        BaseGenerationParameters baseGenerationParameters = barcodeGenerator.getParameters();
        Unit imageWidth = baseGenerationParameters.getImageWidth();
        imageWidth.setMillimeters(100.0f);
    }


}


