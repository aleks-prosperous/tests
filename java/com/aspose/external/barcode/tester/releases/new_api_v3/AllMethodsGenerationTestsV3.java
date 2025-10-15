package com.aspose.external.barcode.tester.releases.new_api_v3;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

public class AllMethodsGenerationTestsV3
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
    public void Sample_Save_Method_AllTypes() throws IOException
        {
        String outputFileName = Global.getTempFolder("temp.output");

        BarCodeImageFormat[] imageFormats = BarCodeImageFormat.values();
        for (BarCodeImageFormat imageFormat : imageFormats)
        {
            BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.CODE_128);
            {
                TestHelper.generatorSave(generator, outputFileName, imageFormat);

                File fileInto = new File(outputFileName);
                Assert.assertTrue(fileInto.exists(), "Failed saved to: " + imageFormat.toString());
                Assert.assertTrue(fileInto.length() > 0, "Failed saved to: " + imageFormat.toString());
                fileInto.delete();
            }
        }
    }

        @Test
    public void Sample_Save_Method() throws IOException
        {
        String outputFileName = Global.getTempFolder("temp.png");

        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.CODE_128);
        {
            TestHelper.generatorSave(generator, outputFileName);

            File fileInto = new File(outputFileName);
            Assert.assertTrue(fileInto.exists());
            Assert.assertTrue(fileInto.length() > 0);
            fileInto.delete();
        }
    }

        @Test
    public void Sample_Save_Stream_Method() throws IOException
        {
        BarCodeImageFormat[] imageFormats = BarCodeImageFormat.values();
        for(BarCodeImageFormat imageFormat : imageFormats)
        {
            ByteArrayOutputStream ms = new ByteArrayOutputStream();
            {
                BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.CODE_128);
                {
                    TestHelper.generatorSave(generator, ms, imageFormat);
                }

                Assert.assertTrue(ms.size() > 0, "Failed saved to: " + imageFormat.toString());
            }
        }
    }
}
