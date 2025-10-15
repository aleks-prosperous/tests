package com.aspose.external.barcode.tester.releases.v82;

import com.aspose.barcode.auxiliary.StringExtensions;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.AztecSymbolMode;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class Issue36272
{
    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
        @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void testAztecGenerateAndRecognizeMaximumText()
    {
        List<String> codeTexts = new ArrayList<String>();
        codeTexts.add(StringExtensions.newString('7', 3832));
        codeTexts.add(StringExtensions.newString('X', 3067));
        codeTexts.add(StringExtensions.newString((char)230, 1914));
        for (int i = 0; i < codeTexts.size(); i++)
        {
            GenerateAndREcognizeAztec(codeTexts.get(i), AztecSymbolMode.AUTO);
        }

        codeTexts = new ArrayList<String>();
        codeTexts.add(StringExtensions.newString('7', 3832 + 1));
        codeTexts.add(StringExtensions.newString('A', 3067 + 1));
        codeTexts.add(StringExtensions.newString((char)230, 1914 + 1));
        for (int i = 0; i < codeTexts.size(); i++)
        {
            try
            {
                GenerateAndREcognizeAztec(codeTexts.get(i), AztecSymbolMode.AUTO);
            }
            catch (InvalidCodeException e)
            {
                continue;
            }
            Assert.fail("Codetext is incorrect. Must be exception on generation.");
        }

        codeTexts = new ArrayList<String>();
        codeTexts.add(StringExtensions.newString('7', 110));
        codeTexts.add(StringExtensions.newString('A', 89));
        codeTexts.add(StringExtensions.newString((char)230, 53));
        for (int i = 0; i < codeTexts.size(); i++)
        {
            GenerateAndREcognizeAztec(codeTexts.get(i), AztecSymbolMode.COMPACT);
        }

        codeTexts = new ArrayList<String>();
        codeTexts.add(StringExtensions.newString('7', 110 + 1));
        codeTexts.add(StringExtensions.newString('A', 89 + 1));
        codeTexts.add(StringExtensions.newString((char)230, 53 + 1));
        for (int i = 0; i < codeTexts.size(); i++)
        {
            try
            {
                GenerateAndREcognizeAztec(codeTexts.get(i), AztecSymbolMode.COMPACT);
            }
            catch (InvalidCodeException e)
            {
                continue;
            }
            Assert.fail("Codetext is incorrect. Must be exception on generation.");
        }

        codeTexts = new ArrayList<String>();
        codeTexts.add("256");
        codeTexts.add("a");
        codeTexts.add("a20");
        codeTexts.add("20a");
        codeTexts.add("1234");
        codeTexts.add("aaaaaaaaa");
        codeTexts.add(StringExtensions.newString('9', 10000));
        for (int i = 0; i < codeTexts.size(); i++)
        {
            try
            {
                GenerateAndREcognizeAztec(codeTexts.get(i), AztecSymbolMode.RUNE);
            }
            catch (InvalidCodeException e)
            {
                continue;
            }
            Assert.fail("Codetext is incorrect. Must be exception on generation.");
        }

        AztecSymbolMode[] symbolModes = new AztecSymbolMode[] { AztecSymbolMode.AUTO, AztecSymbolMode.COMPACT, AztecSymbolMode.FULL_RANGE, AztecSymbolMode.RUNE };
        for (int i = 0; i < symbolModes.length; i++)
        {
            try
            {
                GenerateAndREcognizeAztec("", symbolModes[i]);
            }
            catch (BarCodeException e)
            {
                continue;
            }
            Assert.fail("Codetext is empty. Must be exception on generation.");
        }
    }

    private void GenerateAndREcognizeAztec(String codeText, AztecSymbolMode aztecSymbolMode)
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.AZTEC, codeText);
        {
            gen.getParameters().getBarcode().getAztec().setAztecSymbolMode(aztecSymbolMode);
            gen.getParameters().getBarcode().getXDimension().setMillimeters(3);
            BufferedImage barcode = gen.generateBarCodeImage();
            BarCodeReader read = new BarCodeReader(barcode, DecodeType.AZTEC);
            Assert.assertEquals(read.readBarCodes().length, 1);
            Assert.assertEquals(codeText, read.getFoundBarCodes()[0].getCodeText());
        }
    }
}
