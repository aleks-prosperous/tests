package com.aspose.external.barcode.tester.releases.v20_12;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BaseDecodeType;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.MultyDecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.awt.image.BufferedImage;
import java.io.File;

public class Issue37686
{
    /// <summary>
    /// Path to folder witIssue37615h files for testing Issue37686.
    /// </summary>
    private final static String Folder = Global.getTestDataFolder("Issues\\Issue37686");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }


    //[Test]
    //used to generate images with changes in encoder
    public void test_DemoGenerate()
    {
        GenerateAndSave("auto_ecc200_macro5.png", "123456897AbC:!", EncodeTypes.DATA_MATRIX, DataMatrixEccType.ECC_200, DataMatrixEncodeMode.AUTO, MacroCharacter.MACRO_05);
        GenerateAndSave("auto_ecc200_macro6.png", "123456897AbC:!", EncodeTypes.DATA_MATRIX, DataMatrixEccType.ECC_200, DataMatrixEncodeMode.AUTO, MacroCharacter.MACRO_06);

        GenerateAndSave("ansix12_ecc200_macro5.png", "123456897ABC", EncodeTypes.DATA_MATRIX, DataMatrixEccType.ECC_200, DataMatrixEncodeMode.ANSIX12, MacroCharacter.MACRO_05);
        GenerateAndSave("ansix12_ecc200_macro6.png", "123456897ABC", EncodeTypes.DATA_MATRIX, DataMatrixEccType.ECC_200, DataMatrixEncodeMode.ANSIX12, MacroCharacter.MACRO_06);

        //GS1 in ISO 15434 auto identification mode
        GenerateAndSave("gs1autoidentification_macro5.png", "10123ABC\u001D10123ABC", EncodeTypes.DATA_MATRIX, DataMatrixEccType.ECC_200, DataMatrixEncodeMode.AUTO, MacroCharacter.MACRO_05);
    }

    @Test
    public void test_ReadDataMatrix()
    {
        RecognizeDataMatrix("auto_ecc200_macro5.png", "[)>\u001E05\u001D123456897AbC:!\u001E\u0004");
        RecognizeDataMatrix("auto_ecc200_macro6.png", "[)>\u001E06\u001D123456897AbC:!\u001E\u0004");

        RecognizeDataMatrix("ansix12_ecc200_macro5.png", "[)>\u001E05\u001D123456897ABC\u001E\u0004");
        RecognizeDataMatrix("ansix12_ecc200_macro6.png", "[)>\u001E06\u001D123456897ABC\u001E\u0004");

        RecognizeDataMatrix("gs1autoidentification_macro5.png", "(10)123ABC(10)123ABC", DecodeType.GS_1_DATA_MATRIX);
        RecognizeDataMatrix("gs1autoidentification_macro5.png", "[)>\u001e05\u001d10123ABC\u001d10123ABC\u001e\u0004", DecodeType.DATA_MATRIX);

        RecognizeDataMatrix("datamatrix-dod-std-130-iuid-1.gif", "(8004)06141419999960MH80312(21)MH80312(95)0614141(240)99999", DecodeType.GS_1_DATA_MATRIX);
        RecognizeDataMatrix("datamatrix-dod-std-130-iuid-1.gif", "[)>\u001e05\u001d800406141419999960MH80312\u001d21MH80312\u001d950614141\u001d24099999\u001e\u0004", DecodeType.DATA_MATRIX);
    }

    @Test
    public void test_GeneratedDataMatrix()
    {
        //auto mode Ecc200
        GenerateAndRecognize("123456897AbC:!", "123456897AbC:!", EncodeTypes.DATA_MATRIX, DataMatrixEccType.ECC_200, DataMatrixEncodeMode.AUTO, MacroCharacter.NONE);
        GenerateAndRecognize("123456897AbC:!", "[)>\u001E05\u001D123456897AbC:!\u001E\u0004", EncodeTypes.DATA_MATRIX, DataMatrixEccType.ECC_200, DataMatrixEncodeMode.AUTO, MacroCharacter.MACRO_05);
        GenerateAndRecognize("123456897AbC:!", "[)>\u001E06\u001D123456897AbC:!\u001E\u0004", EncodeTypes.DATA_MATRIX, DataMatrixEccType.ECC_200, DataMatrixEncodeMode.AUTO, MacroCharacter.MACRO_06);

        //other modes Ecc200
        GenerateAndRecognize("123456897AbC:!", "123456897AbC:!", EncodeTypes.DATA_MATRIX, DataMatrixEccType.ECC_200, DataMatrixEncodeMode.ASCII, MacroCharacter.NONE);
        GenerateAndRecognize("123456897AbC:!", "[)>\u001E05\u001D123456897AbC:!\u001E\u0004", EncodeTypes.DATA_MATRIX, DataMatrixEccType.ECC_200, DataMatrixEncodeMode.ASCII, MacroCharacter.MACRO_05);
        GenerateAndRecognize("123456897AbC:!", "[)>\u001E06\u001D123456897AbC:!\u001E\u0004", EncodeTypes.DATA_MATRIX, DataMatrixEccType.ECC_200, DataMatrixEncodeMode.ASCII, MacroCharacter.MACRO_06);
        GenerateAndRecognize("123456897ABC", "123456897ABC", EncodeTypes.DATA_MATRIX, DataMatrixEccType.ECC_200, DataMatrixEncodeMode.ANSIX12, MacroCharacter.NONE);
        GenerateAndRecognize("123456897ABC", "[)>\u001E05\u001D123456897ABC\u001E\u0004", EncodeTypes.DATA_MATRIX, DataMatrixEccType.ECC_200, DataMatrixEncodeMode.ANSIX12, MacroCharacter.MACRO_05);
        GenerateAndRecognize("123456897ABC", "[)>\u001E06\u001D123456897ABC\u001E\u0004", EncodeTypes.DATA_MATRIX, DataMatrixEccType.ECC_200, DataMatrixEncodeMode.ANSIX12, MacroCharacter.MACRO_06);

        //can be used only in ECC200
        //11.3 Protocol for Macro characters in the first position (ECC 200 only)
        GenerateAndRecognize("123456897AbC:!", "123456897AbC:!", EncodeTypes.DATA_MATRIX, DataMatrixEccType.ECC_140, DataMatrixEncodeMode.AUTO, MacroCharacter.NONE);
        GenerateAndRecognize("123456897AbC:!", "123456897AbC:!", EncodeTypes.DATA_MATRIX, DataMatrixEccType.ECC_140, DataMatrixEncodeMode.AUTO, MacroCharacter.MACRO_05);
        GenerateAndRecognize("123456897AbC:!", "123456897AbC:!", EncodeTypes.DATA_MATRIX, DataMatrixEccType.ECC_140, DataMatrixEncodeMode.AUTO, MacroCharacter.MACRO_06);
    }

    @Test
    public void test_GeneratedGS1DataMatrix()
    {
        //in GS1DataMatrix we use FNC1 encoding
        GenerateAndRecognize("(10)123ABC(10)123ABC", "(10)123ABC(10)123ABC", EncodeTypes.GS_1_DATA_MATRIX, DataMatrixEccType.ECC_200, DataMatrixEncodeMode.AUTO, MacroCharacter.NONE);
        GenerateAndRecognize("(10)123ABC(10)123ABC", "(10)123ABC(10)123ABC", EncodeTypes.GS_1_DATA_MATRIX, DataMatrixEccType.ECC_200, DataMatrixEncodeMode.AUTO, MacroCharacter.MACRO_05);
        GenerateAndRecognize("(10)123ABC(10)123ABC", "(10)123ABC(10)123ABC", EncodeTypes.GS_1_DATA_MATRIX, DataMatrixEccType.ECC_200, DataMatrixEncodeMode.AUTO, MacroCharacter.MACRO_06);

        //ISO 15434 automatic identification mode
        //macro 05 is GS1 identificator
        GenerateAndRecognize("10123ABC\u001D10123ABC", "(10)123ABC(10)123ABC", EncodeTypes.DATA_MATRIX, DataMatrixEccType.ECC_200, DataMatrixEncodeMode.AUTO, MacroCharacter.MACRO_05);
        //macro 06 is ASC МН 10 identificator
        GenerateAndRecognize("10123ABC\u001D10123ABC", "[)>\u001e06\u001d10123ABC\u001d10123ABC\u001e\u0004", EncodeTypes.DATA_MATRIX, DataMatrixEccType.ECC_200, DataMatrixEncodeMode.AUTO, MacroCharacter.MACRO_06);
    }

    private void GenerateAndRecognize(String codetext, String resultCodetext, SymbologyEncodeType encodeType,
                                      DataMatrixEccType ecc, DataMatrixEncodeMode encodeMode, MacroCharacter macro)
    {
        BarcodeGenerator generator = new BarcodeGenerator(encodeType, codetext);
        {
            generator.getParameters().getBarcode().getDataMatrix().setMacroCharacters(macro);
            generator.getParameters().getBarcode().getDataMatrix().setDataMatrixEcc(ecc);
            generator.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(encodeMode);
            BufferedImage bmp = generator.generateBarCodeImage();
            BarCodeReader reader = new BarCodeReader(bmp, DecodeType.DATA_MATRIX, DecodeType.GS_1_DATA_MATRIX);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(resultCodetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    private void RecognizeDataMatrix(String fileName, String codetext)
    {
        RecognizeDataMatrix(fileName, codetext, new MultyDecodeType(DecodeType.DATA_MATRIX, DecodeType.GS_1_DATA_MATRIX));
    }

    private void RecognizeDataMatrix(String fileName, String codetext, BaseDecodeType readType)
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, fileName), readType);
        {
            reader.readBarCodes();
            Assert.assertEquals(reader.getFoundBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    private void GenerateAndSave(String filename, String codetext, SymbologyEncodeType encodeType,
                                 DataMatrixEccType ecc, DataMatrixEncodeMode encodeMode, MacroCharacter macro)
    {
        GenerateAndSave(Folder, filename, codetext, encodeType, ecc, encodeMode,  macro);
    }

    private void GenerateAndSave(String folder, String filename, String codetext, SymbologyEncodeType encodeType,
                                 DataMatrixEccType ecc, DataMatrixEncodeMode encodeMode, MacroCharacter macro)
    {
        try
        {
            String lFileName = Global.pathCombine(folder, filename);
            File file = new File(lFileName);
            if (file.exists())
            {
                file.delete();
            }

            BarcodeGenerator generator = new BarcodeGenerator(encodeType, codetext);
            {
                generator.getParameters().getBarcode().getDataMatrix().setDataMatrixEcc(ecc);
                generator.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(encodeMode);
                generator.getParameters().getBarcode().getDataMatrix().setMacroCharacters(macro);
                generator.save(lFileName, BarCodeImageFormat.PNG);
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
