package com.aspose.external.barcode.tester.releases.v25_2;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.licensing.LicenseType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ApiChanges_25_2
{
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense(LicenseType.Total);
    }
    private static final String folderPath = Global.getTestDataFolder("Generated/ApiChanges_25_2");

    @Test
    public void test() throws IOException
    {
        Path fullPath = Paths.get(folderPath, "barcode_CODE_128_1.png");
        //Encode codetext of 1D barcodes with 7-bit ASCII encoding, byte order mark (BOM) is absent
        BarcodeGenerator generator1 = new BarcodeGenerator(EncodeTypes.CODE_128);
        generator1.setCodeText("123ABCD", StandardCharsets.US_ASCII,true);
        generator1.save(fullPath.toString(), BarCodeImageFormat.PNG);

        //Encode codetext of 1D barcodes with 8-bit ISO/IEC 8859-1 encoding, byte order mark (BOM) is absent
        BarcodeGenerator generator2 = new BarcodeGenerator(EncodeTypes.CODE_128);
        generator2.setCodeText("123ABCD", StandardCharsets.ISO_8859_1);
        generator2.save(Paths.get(folderPath, "barcode_CODE_128_2.png").toString(), BarCodeImageFormat.PNG);

        //Encode codetext of 2D barcodes with UTF8 encoding with byte order mark (BOM)
        BarcodeGenerator generator3 = new BarcodeGenerator(EncodeTypes.CODE_128);
        generator3.setCodeText("123ABCD", StandardCharsets.UTF_8, true);
        generator3.save(Paths.get(folderPath, "barcode3.png").toString(), BarCodeImageFormat.PNG);

        //Encode codetext of 2D barcodes with UTF8 encoding without byte order mark (BOM)
        BarcodeGenerator generator4 = new BarcodeGenerator(EncodeTypes.CODE_128);
        generator4.setCodeText("123ABCD", StandardCharsets.UTF_8, false);
        generator4.save(Paths.get(folderPath, "barcode4.png").toString(), BarCodeImageFormat.PNG);
    }
 @Test
    public void test2() throws IOException
    {
        Path fullPath = Paths.get(folderPath, "barcode_CODE_39_1.png");
        BarcodeGenerator generator1 = new BarcodeGenerator(EncodeTypes.CODE_39);
        generator1.setCodeText("123ABCD", StandardCharsets.UTF_8,true);
        generator1.save(fullPath.toString(), BarCodeImageFormat.PNG);

        BarcodeGenerator generator2 = new BarcodeGenerator(EncodeTypes.CODE_39);
        generator2.setCodeText("123ABCD", StandardCharsets.UTF_8, false);
        generator2.save(Paths.get(folderPath, "barcode_CODE_39_2.png").toString(), BarCodeImageFormat.PNG);
    }
}
