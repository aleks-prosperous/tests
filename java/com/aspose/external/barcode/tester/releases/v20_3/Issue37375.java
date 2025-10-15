package com.aspose.external.barcode.tester.releases.v20_3;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.SingleDecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue37375
{
    /// <summary>
    /// Path to folder with files for testing Issue37375.
    /// </summary>
    private String Folder =  Global.getIssuesTestImagePath("Issue37375");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void SetUp()
    {
        LicenseAssistant.setupLicense();
    }

    private class QRStructuredAppendData
    {
        public SingleDecodeType CodeType;
        public String CodeText;
        public int QRStructuredAppendModeBarCodesQuantity;
        public int QRStructuredAppendModeBarCodeIndex;
        public int QRStructuredAppendModeParityData;

            public QRStructuredAppendData(SingleDecodeType aCodeType, String aCodeText,
        int aQRStructuredAppendModeBarCodesQuantity, int aQRStructuredAppendModeBarCodeIndex, int aQRStructuredAppendModeParityData)
        {
            CodeType = aCodeType;
            CodeText = aCodeText;
            QRStructuredAppendModeBarCodesQuantity = aQRStructuredAppendModeBarCodesQuantity;
            QRStructuredAppendModeBarCodeIndex = aQRStructuredAppendModeBarCodeIndex;
            QRStructuredAppendModeParityData = aQRStructuredAppendModeParityData;
        }
    }

    private static void CheckBarCodeResultsInQRStructuredAppendData(BarCodeResult[] aResultList, QRStructuredAppendData aDataItem)
    {
        for(int i = 0; i < aResultList.length; ++i)
        {
            BarCodeResult lResultItem = aResultList[i];
            if ((aDataItem.CodeText.equals(lResultItem.getCodeText())) && (aDataItem.CodeType == lResultItem.getCodeType()) &&
                    (aDataItem.QRStructuredAppendModeBarCodesQuantity == lResultItem.getExtended().getQR().getQRStructuredAppendModeBarCodesQuantity()) &&
                    (aDataItem.QRStructuredAppendModeParityData == lResultItem.getExtended().getQR().getQRStructuredAppendModeParityData()) &&
                    (aDataItem.QRStructuredAppendModeBarCodeIndex == lResultItem.getExtended().getQR().getQRStructuredAppendModeBarCodeIndex()))
                return;
        }
        //
        Assert.fail("QR Structured Append Item Failed: CodeText=" + aDataItem.CodeText + " CodeType =" + aDataItem.CodeType.toString() +
                " QRStructuredAppendModeBarCodesQuantity=" + aDataItem.QRStructuredAppendModeBarCodesQuantity +
                " QRStructuredAppendModeBarCodeIndex=" + aDataItem.QRStructuredAppendModeBarCodeIndex +
                " QRStructuredAppendModeParityData=" + aDataItem.QRStructuredAppendModeParityData);
    }

    private static void RecognizeQRStructuredAppend(String aFolder, String aFilename, QRStructuredAppendData[] aList)
    {
        String fileName = Global.pathCombine(aFolder, aFilename);
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            BarCodeResult[] lResultsList = reader.readBarCodes();
            for (int i = 0; i < aList.length; ++i)
                CheckBarCodeResultsInQRStructuredAppendData(lResultsList, aList[i]);
        }
    }

    @Test
    public void test_sapp1_png()
    {
        RecognizeQRStructuredAppend(Folder, "sapp1.png", new QRStructuredAppendData[] {
                new QRStructuredAppendData(DecodeType.QR, "I read the new", 2, 0, 57),
                new QRStructuredAppendData(DecodeType.QR, "s today oh boy", 2, 1, 57)
        });
    }

    @Test
    public void test_sapp2_png()
    {
        RecognizeQRStructuredAppend(Folder, "sapp2.png", new QRStructuredAppendData[] {
                new QRStructuredAppendData(DecodeType.QR, "ABCDEFGHIJKLMN", 4, 0, 1),
                new QRStructuredAppendData(DecodeType.QR, "OPQRSTUVWXYZ0123", 4, 1, 1),
                new QRStructuredAppendData(DecodeType.QR, "456789ABCDEFGHIJ", 4, 2, 1),
                new QRStructuredAppendData(DecodeType.QR, "KLMNOPQRSTUVWXYZ", 4, 3, 1)
        });
    }

    @Test
    public void test_sapp3_png()
    {
        RecognizeQRStructuredAppend(Folder, "sapp3.png", new QRStructuredAppendData[] {
                new QRStructuredAppendData(DecodeType.QR, "Yesterday\nAll my troubles see", 4, 0, 56),
                new QRStructuredAppendData(DecodeType.QR, "med so far away\nNow it looks ", 4, 1, 56),
                new QRStructuredAppendData(DecodeType.QR, "as though they're here to sta", 4, 2, 56),
                new QRStructuredAppendData(DecodeType.QR, "y\nOh, I believe in yesterday", 4, 3, 56)
        });
    }
}
