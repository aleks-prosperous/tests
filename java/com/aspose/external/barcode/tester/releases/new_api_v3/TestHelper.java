package com.aspose.external.barcode.tester.releases.new_api_v3;

import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.GraphicsUnit;
import com.aspose.barcode.generation.Unit;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;

class TestHelper
{
    public static void updateUnit(Unit unit, float value, GraphicsUnit graphicsUnit)
    {
        switch (graphicsUnit)
        {
            case PIXEL:
                unit.setPixels(value);
                break;
            case POINT:
                unit.setPoint(value);
                break;
            case INCH:
                unit.setInches(value);
                break;
            case DOCUMENT:
                unit.setDocument(value);
                break;
            case MILLIMETER:
                unit.setMillimeters(value);
                break;
            default:
                break;
        }
    }


    public static BufferedImage generateBarCodeImage(BarcodeGenerator generator_new)
    {
        return generator_new.generateBarCodeImage();
    }

    public static void generatorSave(BarcodeGenerator generator_new, String fileName, BarCodeImageFormat imageFormat) throws IOException
    {
        generator_new.save(fileName, imageFormat);
    }

    static void generatorSave(BarcodeGenerator generator_new, String fileName) throws IOException
    {
    generator_new.save(fileName);
}

    static void generatorSave(BarcodeGenerator generator_new, OutputStream ms, BarCodeImageFormat imageFormat) throws IOException
    {
    generator_new.save(ms, imageFormat);
}
}
