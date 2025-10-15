package com.aspose.external.barcode.tester.releases.v23_5;

import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.generation.SymbologyEncodeType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Issue38574
{

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_Code39() throws IOException {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.CODE_39, " ");
        {
            ByteArrayOutputStream ms = new ByteArrayOutputStream();
            gen.save(ms, BarCodeImageFormat.SVG);
        }
    }

    @Test
    public void test_MultipleBarcodes() throws IOException {
        SymbologyEncodeType[] encodingtypes = new SymbologyEncodeType[] { EncodeTypes.CODABAR, EncodeTypes.CODABLOCK_F, EncodeTypes.CODE_11, EncodeTypes.CODE_128, EncodeTypes.CODE_16_K,
                EncodeTypes.CODE_39_FULL_ASCII, EncodeTypes.CODE_39, EncodeTypes.DATABAR_EXPANDED, EncodeTypes.DATABAR_EXPANDED_STACKED, EncodeTypes.DATA_LOGIC_2_OF_5, EncodeTypes.IATA_2_OF_5,
                EncodeTypes.INTERLEAVED_2_OF_5, EncodeTypes.MATRIX_2_OF_5, EncodeTypes.MSI, EncodeTypes.PLANET, EncodeTypes.POSTNET, EncodeTypes.RM_4_SCC, EncodeTypes.STANDARD_2_OF_5};

        for (SymbologyEncodeType encodingtype : encodingtypes)
        {
            BarcodeGenerator gen = new BarcodeGenerator(encodingtype, " ");
            ByteArrayOutputStream ms = new ByteArrayOutputStream();
            gen.save(ms, BarCodeImageFormat.SVG);
        }
    }
}
