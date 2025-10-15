package com.aspose.external.barcode.tester.releases.v20_12;

import com.aspose.barcode.BarCodeException;
import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.BaseEncodeType;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.awt.image.BufferedImage;
import java.io.File;

public class Issue37644
{
    /// <summary>
    /// Path to folder with files for testing Issue37644.
    /// </summary>
    private final static String Folder = Global.getTestDataFolder("Issues\\Issue37644");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void SetUp()
    {
        LicenseAssistant.setupLicense();
    }

    //[Test]
    //used to generate images with changes in encoder
    public void test_DemoGenerate()
    {
        GenerateAndSave("databar14_01", "(01)13612345678901", EncodeTypes.DATABAR_OMNI_DIRECTIONAL, false);
        GenerateAndSave("databar14_02", "(01)13612345678901", EncodeTypes.DATABAR_OMNI_DIRECTIONAL, true);
        GenerateAndSave("databarlimited_01", "(01)13612345678901", EncodeTypes.DATABAR_LIMITED, false);
        GenerateAndSave("databarlimited_02", "(01)13612345678901", EncodeTypes.DATABAR_LIMITED, true);
        GenerateAndSave("databarexpanded_01", "(01)13612345678901", EncodeTypes.DATABAR_EXPANDED, false);
        GenerateAndSave("databarexpanded_02", "(01)13612345678901", EncodeTypes.DATABAR_EXPANDED, true);
    }

    @Test
    public void test_DataBar14()
    {
        RecognizeDataBar("GS1-DataBar-14-Omnidirectional-CCA.gif", "(01)03612345678904", true);
        RecognizeDataBar("GS1-DataBar-14-Omnidirectional-CCB.gif", "(01)03612345678904", true);
        RecognizeDataBar("databar14_01.png", "(01)13612345678901", false);
        RecognizeDataBar("databar14_02.png", "(01)13612345678901", true);
    }

    @Test
    public void test_DataBarLimited()
    {
        RecognizeDataBar("GS1-DataBar-Limited-CCA.gif", "(01)03612345678904", true);
        RecognizeDataBar("GS1-DataBar-Limited-CCB.gif", "(01)03612345678904", true);
        RecognizeDataBar("databarlimited_01.png", "(01)13612345678901", false);
        RecognizeDataBar("databarlimited_02.png", "(01)13612345678901", true);
    }

    @Test
    public void test_DataBarExpanded()
    {
        RecognizeDataBar("GS1-DataBar-Expanded-CCA.gif", "(01)93712345678904(3103)001234", true);
        RecognizeDataBar("GS1-DataBar-Expanded-CCB.gif", "(01)93712345678904(3103)001234", true);
        RecognizeDataBar("databarexpanded_01.png", "(01)13612345678901", false);
        RecognizeDataBar("databarexpanded_02.png", "(01)13612345678901", true);
    }

    @Test
    public void test_Generated_DataBar14()
    {
        GenerateAndRecognize(EncodeTypes.DATABAR_OMNI_DIRECTIONAL, "(01)03612345678904", "(01)03612345678904", false, false);
        GenerateAndRecognize(EncodeTypes.DATABAR_OMNI_DIRECTIONAL, "(01)03612345678904", "(01)03612345678904", true, false);
        GenerateAndRecognize(EncodeTypes.DATABAR_OMNI_DIRECTIONAL, "(01)0361234567890", "(01)03612345678904", false, false);
        GenerateAndRecognize(EncodeTypes.DATABAR_OMNI_DIRECTIONAL, "(01)0361234567890", "(01)03612345678904", true, false);
        GenerateAndRecognize(EncodeTypes.DATABAR_OMNI_DIRECTIONAL, "(01)03612345678904", "(01)03612345678904", false, true);
        GenerateAndRecognize(EncodeTypes.DATABAR_OMNI_DIRECTIONAL, "(01)03612345678904", "(01)03612345678904", true, true);
    }

    @Test
    public void test_Generated_DataBarLimited()
    {
        GenerateAndRecognize(EncodeTypes.DATABAR_LIMITED, "(01)03612345678904", "(01)03612345678904", false, false);
        GenerateAndRecognize(EncodeTypes.DATABAR_LIMITED, "(01)03612345678904", "(01)03612345678904", true, false);
        GenerateAndRecognize(EncodeTypes.DATABAR_LIMITED, "(01)0361234567890", "(01)03612345678904", false, false);
        GenerateAndRecognize(EncodeTypes.DATABAR_LIMITED, "(01)0361234567890", "(01)03612345678904", true, false);
        GenerateAndRecognize(EncodeTypes.DATABAR_LIMITED, "(01)03612345678904", "(01)03612345678904", false, true);
        GenerateAndRecognize(EncodeTypes.DATABAR_LIMITED, "(01)03612345678904", "(01)03612345678904", true, true);
    }

    @Test
    public void test_Generated_DataBarExpanded()
    {
        GenerateAndRecognize(EncodeTypes.DATABAR_EXPANDED, "(01)03612345678904", "(01)03612345678904", false, false);
        GenerateAndRecognize(EncodeTypes.DATABAR_EXPANDED, "(01)03612345678904", "(01)03612345678904", true, false);
        GenerateAndRecognize(EncodeTypes.DATABAR_EXPANDED, "(01)0361234567890", "(01)0361234567890", false, false);
        GenerateAndRecognize(EncodeTypes.DATABAR_EXPANDED, "(01)0361234567890", "(01)0361234567890", true, false);
        GenerateAndRecognize(EncodeTypes.DATABAR_EXPANDED, "(01)03612345678904", "(01)03612345678904", false, true);
        GenerateAndRecognize(EncodeTypes.DATABAR_EXPANDED, "(01)03612345678904", "(01)03612345678904", true, true);
        GenerateAndRecognize(EncodeTypes.DATABAR_EXPANDED_STACKED, "(01)03612345678904", "(01)03612345678904", false, false);
        GenerateAndRecognize(EncodeTypes.DATABAR_EXPANDED_STACKED, "(01)03612345678904", "(01)03612345678904", true, false);
        GenerateAndRecognize(EncodeTypes.DATABAR_EXPANDED_STACKED, "(01)0361234567890", "(01)0361234567890", false, false);
        GenerateAndRecognize(EncodeTypes.DATABAR_EXPANDED_STACKED, "(01)0361234567890", "(01)0361234567890", true, false);
        GenerateAndRecognize(EncodeTypes.DATABAR_EXPANDED_STACKED, "(01)03612345678904", "(01)03612345678904", false, true);
        GenerateAndRecognize(EncodeTypes.DATABAR_EXPANDED_STACKED, "(01)03612345678904", "(01)03612345678904", true, true);
    }

    @Test
    public void test_Exception_DataBar14()
    {
        GenerateGS1CompliantAndCheck(EncodeTypes.DATABAR_OMNI_DIRECTIONAL, "(01)03612345678904", false, true, false);
        GenerateGS1CompliantAndCheck(EncodeTypes.DATABAR_OMNI_DIRECTIONAL, "(01)03612345678904", true, true, false);
        GenerateGS1CompliantAndCheck(EncodeTypes.DATABAR_OMNI_DIRECTIONAL, "(01)0361234567890", false, true, true);
        GenerateGS1CompliantAndCheck(EncodeTypes.DATABAR_OMNI_DIRECTIONAL, "(01)0361234567890", true, true, true);
        GenerateGS1CompliantAndCheck(EncodeTypes.DATABAR_OMNI_DIRECTIONAL, "(01)0361234567890", false, false, false);
        GenerateGS1CompliantAndCheck(EncodeTypes.DATABAR_OMNI_DIRECTIONAL, "(01)0361234567890", true, false, false);
    }

    @Test
    public void test_Exception_Limited()
    {
        GenerateGS1CompliantAndCheck(EncodeTypes.DATABAR_LIMITED, "(01)03612345678904", false, true, false);
        GenerateGS1CompliantAndCheck(EncodeTypes.DATABAR_LIMITED, "(01)03612345678904", true, true, false);
        GenerateGS1CompliantAndCheck(EncodeTypes.DATABAR_LIMITED, "(01)0361234567890", false, true, true);
        GenerateGS1CompliantAndCheck(EncodeTypes.DATABAR_LIMITED, "(01)0361234567890", true, true, true);
        GenerateGS1CompliantAndCheck(EncodeTypes.DATABAR_LIMITED, "(01)0361234567890", false, false, false);
        GenerateGS1CompliantAndCheck(EncodeTypes.DATABAR_LIMITED, "(01)0361234567890", true, false, false);
    }

    @Test
    public void test_Exception_Expanded()
    {
        GenerateGS1CompliantAndCheck(EncodeTypes.DATABAR_EXPANDED, "(01)03612345678904", false, true, false);
        GenerateGS1CompliantAndCheck(EncodeTypes.DATABAR_EXPANDED, "(01)03612345678904", true, true, false);
        GenerateGS1CompliantAndCheck(EncodeTypes.DATABAR_EXPANDED, "(01)0361234567890", false, true, true);
        GenerateGS1CompliantAndCheck(EncodeTypes.DATABAR_EXPANDED, "(01)0361234567890", true, true, true);
        GenerateGS1CompliantAndCheck(EncodeTypes.DATABAR_EXPANDED, "(01)0361234567890", false, false, false);
        GenerateGS1CompliantAndCheck(EncodeTypes.DATABAR_EXPANDED, "(01)0361234567890", true, false, false);
        GenerateGS1CompliantAndCheck(EncodeTypes.DATABAR_EXPANDED_STACKED, "(01)03612345678904", false, true, false);
        GenerateGS1CompliantAndCheck(EncodeTypes.DATABAR_EXPANDED_STACKED, "(01)03612345678904", true, true, false);
        GenerateGS1CompliantAndCheck(EncodeTypes.DATABAR_EXPANDED_STACKED, "(01)0361234567890", false, true, true);
        GenerateGS1CompliantAndCheck(EncodeTypes.DATABAR_EXPANDED_STACKED, "(01)0361234567890", true, true, true);
        GenerateGS1CompliantAndCheck(EncodeTypes.DATABAR_EXPANDED_STACKED, "(01)0361234567890", false, false, false);
        GenerateGS1CompliantAndCheck(EncodeTypes.DATABAR_EXPANDED_STACKED, "(01)0361234567890", true, false, false);
    }

    private void RecognizeDataBar(String fileName, String codetext, boolean is2DCompositeComponent)
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, fileName),
                DecodeType.DATABAR_STACKED_OMNI_DIRECTIONAL, DecodeType.DATABAR_TRUNCATED, DecodeType.DATABAR_LIMITED,
                DecodeType.DATABAR_EXPANDED, DecodeType.DATABAR_STACKED_OMNI_DIRECTIONAL, DecodeType.DATABAR_STACKED, DecodeType.DATABAR_EXPANDED_STACKED);
        {
            reader.readBarCodes();
            Assert.assertEquals(reader.getFoundBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(is2DCompositeComponent, reader.getFoundBarCodes()[0].getExtended().getDataBar().is2DCompositeComponent());
        }
    }


    private void GenerateAndRecognize(BaseEncodeType encodeType, String codetext, String resultCodetext,
                                      boolean is2DCompositeComponent, boolean isAllowOnlyGS1Encoding)
    {
        BarcodeGenerator generator = new BarcodeGenerator(encodeType, codetext);
        {
            generator.getParameters().getBarcode().getDataBar().set2DCompositeComponent(is2DCompositeComponent);
            generator.getParameters().getBarcode().getDataBar().setAllowOnlyGS1Encoding(isAllowOnlyGS1Encoding);
            BufferedImage bmp = generator.generateBarCodeImage();
            {
                BarCodeReader reader = new BarCodeReader(bmp, DecodeType.DATABAR_OMNI_DIRECTIONAL, DecodeType.DATABAR_TRUNCATED, DecodeType.DATABAR_LIMITED,
                        DecodeType.DATABAR_EXPANDED, DecodeType.DATABAR_STACKED_OMNI_DIRECTIONAL, DecodeType.DATABAR_STACKED, DecodeType.DATABAR_EXPANDED_STACKED);
                {
                    Assert.assertEquals(reader.readBarCodes().length, 1);
                    Assert.assertEquals(resultCodetext, reader.getFoundBarCodes()[0].getCodeText());
                    Assert.assertEquals(is2DCompositeComponent, reader.getFoundBarCodes()[0].getExtended().getDataBar().is2DCompositeComponent());
                }
            }
        }
    }

    private void GenerateAndSave(String filename, String codetext, BaseEncodeType encodeType, boolean is2DCompositeComponent)
    {
        GenerateAndSave(Folder, filename, codetext, encodeType, is2DCompositeComponent);
    }

    private void GenerateAndSave(String folder, String filename, String codetext, BaseEncodeType encodeType, boolean is2DCompositeComponent)
    {
        try
        {
            String lFileName = Global.pathCombine(folder, filename + ".png");
            File file = new File(lFileName);
            if (file.exists())
            {
                file.delete();
            }

            BarcodeGenerator gen = new BarcodeGenerator(encodeType, codetext);
            {
                gen.getParameters().getBarcode().getDataBar().set2DCompositeComponent(is2DCompositeComponent);
                gen.save(lFileName, BarCodeImageFormat.PNG);
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    private void GenerateGS1CompliantAndCheck(BaseEncodeType encodeType, String codetext,
                                              boolean is2DCompositeComponent, boolean isAllowOnlyGS1Encoding, boolean isMustThrowException)
    {
        boolean isExceptionThrown = false;
        String lInfo = encodeType.toString() + " \"" + codetext + "\" 2DCompositeComponent:" + is2DCompositeComponent +
                " AllowOnlyGS1Encoding:" + isAllowOnlyGS1Encoding;
        try
        {
            BarcodeGenerator generator = new BarcodeGenerator(encodeType, codetext);
            {
                generator.getParameters().getBarcode().getDataBar().set2DCompositeComponent(is2DCompositeComponent);
                generator.getParameters().getBarcode().getDataBar().setAllowOnlyGS1Encoding(isAllowOnlyGS1Encoding);
                generator.generateBarCodeImage();
            }
        }
        catch (BarCodeException e)
        {
            isExceptionThrown = true;
            if (!isMustThrowException)
                Assert.fail(e.getMessage() + " " + lInfo);
        }

        if (isMustThrowException && !isExceptionThrown)
            Assert.fail("Exception must be thrown but not " + lInfo);
    }
}
