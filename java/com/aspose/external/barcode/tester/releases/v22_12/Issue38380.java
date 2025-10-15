package com.aspose.external.barcode.tester.releases.v22_12;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.external.barcode.tester.releases.v21_6.StringTestUtils;
import helpers.GenerationValidator;
import helpers.parsers.*;
import helpers.validators.BarcodeSizeValidator;
import helpers.validators.RecognitionValidator;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;
import java.io.IOException;

public class Issue38380
{
    /// <summary>
    /// Path to folder with files for testing Issue38380.
    /// </summary>
    private static final String Folder = Global.getTestDataFolder("Issues\\Issue38380");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_HIBCLIC_GenerationAndValidation()
    {
        GenerateAndValidate(EncodeTypes.HIBC_CODE_39_LIC, "+A99912345675/$$3221014LOT123/SSERIAL123/16D20221014/Q500C", true, 1918, 57);
        GenerateAndValidate(EncodeTypes.HIBC_CODE_128_LIC, "+A99912345675/$$3221014LOT123/SSERIAL123/16D20221014/Q500C", true, 1214, 57);
        GenerateAndValidate(EncodeTypes.HIBC_AZTEC_LIC, "+A99912345675/$$3221014LOT123/SSERIAL123/16D20221014/Q500C", false, 54, 0);
        GenerateAndValidate(EncodeTypes.HIBC_DATA_MATRIX_LIC, "+A99912345675/$$3221014LOT123/SSERIAL123/16D20221014/Q500C", false, 52, 0);
        GenerateAndValidate(EncodeTypes.HIBCQRLIC, "+A99912345675/$$3221014LOT123/SSERIAL123/16D20221014/Q500C", false, 58, 0);

        GenerateAndValidate(EncodeTypes.HIBC_CODE_39_PAS, "+/HAA123/BSERVICE123/M0222551200/Z123456789012345P", false, 1662, 57);
        GenerateAndValidate(EncodeTypes.HIBC_CODE_128_PAS, "+/HAA123/BSERVICE123/M0222551200/Z123456789012345P", false, 994, 57);
        GenerateAndValidate(EncodeTypes.HIBC_AZTEC_PAS, "+/HAA123/BSERVICE123/M0222551200/Z123456789012345P", false, 46, 0);
        GenerateAndValidate(EncodeTypes.HIBC_DATA_MATRIX_PAS, "+/HAA123/BSERVICE123/M0222551200/Z123456789012345P", false, 48, 0);
        GenerateAndValidate(EncodeTypes.HIBCQRPAS, "+/HAA123/BSERVICE123/M0222551200/Z123456789012345P", false, 58, 0);
    }

    @Test
    public void test_HIBCLIC_Recognition()
    {
        Recognize("HIBCCode39LIC.png", "+A99912345675/$$3221014LOT123/SSERIAL123/16D20221014/Q500C");
        Recognize("HIBCCode128LIC.png", "+A99912345675/$$3221014LOT123/SSERIAL123/16D20221014/Q500C");
        Recognize("HIBCAztecLIC.png", "+A99912345675/$$3221014LOT123/SSERIAL123/16D20221014/Q500C");
        Recognize("HIBCDataMatrixLIC.png", "+A99912345675/$$3221014LOT123/SSERIAL123/16D20221014/Q500C");
        Recognize("HIBCQRLIC.png", "+A99912345675/$$3221014LOT123/SSERIAL123/16D20221014/Q500C");

        Recognize("HIBCCode39PAS.png", "+/HAA123/BSERVICE123/M0222551200/Z123456789012345P");
        Recognize("HIBCCode128PAS.png", "+/HAA123/BSERVICE123/M0222551200/Z123456789012345P");
        Recognize("HIBCAztecPAS.png", "+/HAA123/BSERVICE123/M0222551200/Z123456789012345P");
        Recognize("HIBCDataMatrixPAS.png", "+/HAA123/BSERVICE123/M0222551200/Z123456789012345P");
        Recognize("HIBCQRPAS.png", "+/HAA123/BSERVICE123/M0222551200/Z123456789012345P");
    }

    private void Recognize(String fileName, String codetext)
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, fileName), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    private void ValidationRowToFile(String folder, String filename, BaseEncodeType encodeType, String codetext, boolean hideCodetext) throws IOException
    {
        String dataString = "";
        BarcodeGenerator gen = InitBarcodeGenerator(encodeType, codetext, hideCodetext);
        {
            IBarcodeSelector selector;
            if (hideCodetext)
                selector = new BarcodePictureSelectorWithoutText(gen.generateBarCodeImage());
            else
                selector = new BarcodePictureSelectorWithTextBelow(gen.generateBarCodeImage());
            BarcodePictureParserSimple parser = new BarcodePictureParserSimple(selector);
            parser.parse();

            dataString += "GenerateAndValidate(";
            dataString += "EncodeTypes." + encodeType.toString() + ", ";
            dataString += "\"" + codetext + "\", ";
            dataString += ((Boolean)hideCodetext).toString().toLowerCase() + ", ";
            dataString += parser.getBarcodeWidth() + ", ";
            dataString += parser.getBarcodeHeight() + ");\n";
        }
        StringTestUtils.writeStringToFile(Global.pathCombine(folder, filename), dataString, true);
    }

    private void RecognitionRowToFile(String folder, String filename, BaseEncodeType encodeType, String codetext) throws IOException {
        String dataString = "";
        dataString += "Recognize(";
        dataString += "\"" + encodeType.toString() + ".png\", ";
        dataString += "\"" + codetext + "\");\n";
        StringTestUtils.writeStringToFile(Global.pathCombine(folder, filename), dataString, true);
    }

    private void GenerateAndValidate(BaseEncodeType encodeType, String codetext, boolean hideCodetext, int width, int height)
    {
        BarcodeGenerator gen = InitBarcodeGenerator(encodeType, codetext, hideCodetext);
        {
            IBarcodeSelector selector;
            if (hideCodetext)
                selector = new BarcodePictureSelectorWithoutText(gen.generateBarCodeImage());
            else
                selector = new BarcodePictureSelectorWithTextBelow(gen.generateBarCodeImage());
            IBarcodeParser parser = new BarcodePictureParserSimple(selector);
            GenerationValidator validator = new GenerationValidator(parser);
            validator.addValidator(new BarcodeSizeValidator(width, height));
            validator.addValidator(new RecognitionValidator(codetext, null, DecodeType.ALL_SUPPORTED_TYPES));
            Assert.assertTrue(validator.validate());
        }
    }

    private void GenerateAndSave(String folder, String filename, BaseEncodeType encodeType, String codetext)
    {
        try
        {
            String lFileName = Global.pathCombine(folder, filename + ".png");
            File file = new File(lFileName);
            if (file.exists())
            {
//                File.SetAttributes(lFileName, FileAttributes.Normal);
                file.delete();
            }

            BarcodeGenerator gen = InitBarcodeGenerator(encodeType, codetext, false);
            gen.save(lFileName, BarCodeImageFormat.PNG);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    private BarcodeGenerator InitBarcodeGenerator(BaseEncodeType encodeType, String codetext, boolean hideCodetext)
    {
        BarcodeGenerator gen = new BarcodeGenerator(encodeType, codetext);
        if (hideCodetext)
            gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
        return gen;
    }
}
