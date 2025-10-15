package com.aspose.external.barcode.tester.releases.v74;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Issue33996
{
    private final String folder = Global.getIssuesTestImagePath("Issue33996");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    /// <summary>
    /// Tests recognition "1.png"
    /// </summary>
        @Test
    public void testPicture1()
    {
        String fileName = Global.pathCombine(folder, "1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("{\"u\":\"K9317614\",\"e\":\"30032369\"}", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.DATA_MATRIX, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

    /// <summary>
    /// Tests recognition "2.png"
    /// </summary>
        @Test
    public void testPicture2()
    {
        String fileName = Global.pathCombine(folder, "2.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("{\"u\":\"K9317614\",\"e\":\"30032369\"}", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.DATA_MATRIX, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

    /// <summary>
    /// Tests recognition "3.png"
    /// </summary>
        @Test
    public void testPicture3()
    {
        String fileName = Global.pathCombine(folder, "3.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("{\"u\":\"H9329921\",\"e\":\"30033629\"}", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.DATA_MATRIX, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

    /// <summary>
    /// Tests recognition "4.png"
    /// </summary>
        @Test
    public void testPicture4()
    {
        String fileName = Global.pathCombine(folder, "4.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("{\"u\":\"K9317614\",\"e\":\"30032369\"}", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.DATA_MATRIX, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

    /// <summary>
    /// Tests recognition "5.png"
    /// </summary>
        @Test
    public void testPicture5()
    {
        String fileName = Global.pathCombine(folder, "5.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("{\"u\":\"H9329921\",\"e\":\"30033630\"}", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.DATA_MATRIX, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

    /// <summary>
    /// Tests recognition "6.png"
    /// </summary>
        @Test
    public void testPicture6()
    {
        String fileName = Global.pathCombine(folder, "6.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("{\"u\":\"K9317614\",\"e\":\"30032369\"}", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.DATA_MATRIX, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

    /// <summary>
    /// Tests recognition "7.png"
    /// </summary>
        @Test
    public void testPicture7()
    {
        String fileName = Global.pathCombine(folder, "7.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("{\"u\":\"H9329921\",\"e\":\"30033630\"}", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.DATA_MATRIX, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

    private static final int BarcodesCount = 7;

    private final String[] ExpectedTexts = new String[]{
    "{\"u\":\"K9317614\",\"e\":\"30032369\"}",
            "{\"u\":\"K9317614\",\"e\":\"30032369\"}",
            "{\"u\":\"H9329921\",\"e\":\"30033630\"}",
            "{\"u\":\"K9317614\",\"e\":\"30032369\"}",
            "{\"u\":\"K9317614\",\"e\":\"30032369\"}",
            "{\"u\":\"H9329921\",\"e\":\"30033629\"}",
            "{\"u\":\"H9329921\",\"e\":\"30033630\"}"
};

    /// <summary>
    /// Tests recognition "BarRecognized.png"
    /// </summary>
        @Test
    public void testPictureBarRecognized()
    {
        String fileName = Global.pathCombine(folder, "BarRecognized.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            List<String> recognizedTexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            recognizedTexts.add(result.getCodeText());

            Assert.assertEquals(7, recognizedTexts.size(), "Need fix this test.");
            //Assert.assertEquals(BarcodesCount, recognizedTexts.Count);

            for(String text : recognizedTexts)
            {
                Assert.assertTrue((Arrays.asList(ExpectedTexts)).contains(text));
                //Assert.assertTrue(recognizedTexts.contains(text));
            }

            //foreach (var text in ExpectedTexts)
            //{
            //    Assert.assertTrue(recognizedTexts.contains(text));
            //}
        }
    }

    /// <summary>
    /// Tests recognition "Generate Barcode by Specifying Custom Image Size-001.png"
    /// </summary>
        @Test
    public void testPictureCustomerGeneratedImage()
    {
        String fileName = Global.pathCombine(folder, "Generate Barcode by Specifying Custom Image Size-001.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            List<String> recognizedTexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            recognizedTexts.add(result.getCodeText());
            Assert.assertEquals(7, recognizedTexts.size(), "Need fix this test.");
            //Assert.assertEquals(BarcodesCount, recognizedTexts.Count);

            for(String text : recognizedTexts)
            {
                Assert.assertTrue(((Arrays.asList(ExpectedTexts))).contains(text));
            }

            //foreach (var text in ExpectedTexts)
            //{
            //    Assert.assertTrue(recognizedTexts.contains(text));
            //}
        }
    }
}
