package com.aspose.external.barcode.tester.releases.v22_8;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue38225
{
    /// <summary>
    /// Path to folder with files for testing Issue38225.
    /// </summary>
    private static final String Folder = Global.getTestDataFolder("Issues\\Issue38225");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    //Additional Service codes are:
    //Personal delivery(RMP) 0322
    //Return receipt (AR) 0327
    //Cash on delivery(currently obsolete) 0340
    //Electronic cash on delivery (BLN) 0341
    //Items for the blind (CEC) 0610
    //Military mail (MIL) 1007
    //Second attempted delivery on the  following Saturday 2512
    //Electronic return receipt(eAR) 0328
    //ID check(ID+RMP) 0470
    //Business reply label(GAS) 0203

    //NEW service codes
    //Electronic return receipt(eAR) 0328
    //ID check(ID+RMP) 0470
    //Business reply label(GAS) 0203

    //[Test]
    //used to generate images with changes in encoder
//    public void test_DemoGenerate()
//    {
//        GenerateAndSaveServiceCode("0328", "SwissPostParcel0328.png");
//        GenerateAndSaveServiceCode("0470", "SwissPostParcel0470.png");
//        GenerateAndSaveServiceCode("0203", "SwissPostParcel0203.png");
//    }

    @Test
    public void test_RecognizeSaved()
    {
        LoadAndRecognizeServiceCode("0328", "SwissPostParcel0328.png");
        LoadAndRecognizeServiceCode("0470", "SwissPostParcel0470.png");
        LoadAndRecognizeServiceCode("0203", "SwissPostParcel0203.png");
    }

    @Test
    public void test_GenerateAndRecognize()
    {
        GenerateAndRecognizeServiceCode("0322");
        GenerateAndRecognizeServiceCode("0327");
        GenerateAndRecognizeServiceCode("0340");
        GenerateAndRecognizeServiceCode("0341");
        GenerateAndRecognizeServiceCode("0610");
        GenerateAndRecognizeServiceCode("1007");
        GenerateAndRecognizeServiceCode("2512");
        GenerateAndRecognizeServiceCode("0328");
        GenerateAndRecognizeServiceCode("0470");
        GenerateAndRecognizeServiceCode("0203");
    }

    private void GenerateAndRecognizeServiceCode(String code)
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.SWISS_POST_PARCEL, code);
        {
            gen.getParameters().getBarcode().getXDimension().setPixels(2);
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.SWISS_POST_PARCEL);
            {
                Assert.assertEquals(1, reader.readBarCodes().length);
                Assert.assertEquals(DecodeType.SWISS_POST_PARCEL, reader.getFoundBarCodes()[0].getCodeType());
                Assert.assertEquals(code, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

    private void LoadAndRecognizeServiceCode(String code, String filename)
    {
        String lFileName = Global.pathCombine(Folder, filename);
        BarCodeReader reader = new BarCodeReader(lFileName, DecodeType.SWISS_POST_PARCEL);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals(DecodeType.SWISS_POST_PARCEL, reader.getFoundBarCodes()[0].getCodeType());
            Assert.assertEquals(code, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

//    private void GenerateAndSaveServiceCode(String code, String filename)
//    {
//        String lFileName = Global.pathCombine(Folder, filename);
//
//        if (File.Exists(lFileName))
//        {
//            File.SetAttributes(lFileName, FileAttributes.Normal);
//            File.Delete(lFileName);
//        }
//        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.SWISS_POST_PARCEL, code);
//        {
//            gen.Parameters.Barcode.XDimension.Pixels = 2;
//            gen.Save(lFileName, BarCodeImageFormat.Png);
//        }
//    }
}
