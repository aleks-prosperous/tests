package com.aspose.barcode.barcodecontrol;

import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.BaseGenerationParameters;
import com.aspose.barcode.generation.EncodeTypes;

import javax.swing.*;
import java.awt.*;

public class SpecificParametersUIWrapper
{
    SpecificParametersUI specificParametersUI;

    public SpecificParametersUIWrapper(BaseGenerationParameters baseGenerationParameters,Component component)
    {
        specificParametersUI = new SpecificParametersUI(baseGenerationParameters, component);
    }

    public SpecificParametersUI getSpecificParametersUI()
    {
        return specificParametersUI;
    }
}
