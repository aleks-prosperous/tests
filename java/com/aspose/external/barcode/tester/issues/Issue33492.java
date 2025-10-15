//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33492.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="04.04.2013 17:57:12">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


@Test(description = "Tests for Issue33492.")
public class Issue33492
{
    private final String folder = Global.getTestDataFolder("Issues/Issue33492");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    //>>>>>>>> #region  Document 1

    @Test
    public void testDoc1_Full()
    {
        List<String> values = new ArrayList<String>();

        String fileName = Global.pathCombine(folder, "qr-structured.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        for(BarCodeResult result : reader.readBarCodes())
        values.add(result.getCodeText());
        Assert.assertEquals(5, values.size());
        Assert.assertTrue(
                values.contains(
                        "12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123451234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345"));
        Assert.assertTrue(values.contains("123456789012345678901234567890123456789012345678901234567890123456789012"));
        Assert.assertTrue(values.contains("3456789012345678901234567890123456789012345678901234567890123456789012345"));
        Assert.assertTrue(values.contains("123456789012345678901234567890123456789012345678901234567890123456789012"));
        Assert.assertTrue(values.contains("3456789012345678901234567890123456789012345678901234567890123456789012345"));
    }

    @Test
    public void testDoc1_QR1()
    {
        String fileName = Global.pathCombine(folder, "qr-structured-1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("123456789012345678901234567890123456789012345678901234567890123456789012", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testDoc1_QR2()
    {
        String fileName = Global.pathCombine(folder, "qr-structured-2.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("3456789012345678901234567890123456789012345678901234567890123456789012345", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testDoc1_QR3()
    {
        String fileName = Global.pathCombine(folder, "qr-structured-3.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("123456789012345678901234567890123456789012345678901234567890123456789012", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testDoc1_QR4()
    {
        String fileName = Global.pathCombine(folder, "qr-structured-4.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("3456789012345678901234567890123456789012345678901234567890123456789012345", reader.getFoundBarCodes()[0].getCodeText());
    }

        @Test
    public void testDoc1_StructuredMode()
    {
            final String RESULT =
            "12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123451234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345";

        List<QRSAItem> items = new ArrayList<QRSAItem>();

        String fileName = Global.pathCombine(folder, "qr-structured.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            for(BarCodeResult result : reader.readBarCodes())
            {
                if (result.getCodeText().equals(RESULT))
                    continue;

                items.add(new QRSAItem(result.getCodeText(),
                        result.getExtended().getQR().getQRStructuredAppendModeBarCodesQuantity(),
                        result.getExtended().getQR().getQRStructuredAppendModeBarCodeIndex(),
                        result.getExtended().getQR().getQRStructuredAppendModeParityData()));
            }
        }

        Assert.assertEquals(4, items.size());
        Assert.assertTrue(items.get(0).Quantity == items.get(1).Quantity && items.get(1).Quantity == items.get(2).Quantity &&
                items.get(2).Quantity == items.get(3).Quantity && items.get(3).Quantity == items.size());
        Assert.assertTrue(items.get(0).ParityData == items.get(1).ParityData && items.get(1).ParityData == items.get(2).ParityData &&
                items.get(2).ParityData == items.get(3).ParityData);

        Collections.sort(items, new Comparator<QRSAItem>(){
                    @Override
                    public int compare(QRSAItem o1, QRSAItem o2)
                    {
                        return (o1.Index - (o2.Index));
                    }
        }
                    );

        for(QRSAItem item : items)
        Assert.assertEquals(items.indexOf(item), item.Index);

        Assert.assertEquals("123456789012345678901234567890123456789012345678901234567890123456789012", items.get(0).Codetext);
        Assert.assertEquals("3456789012345678901234567890123456789012345678901234567890123456789012345", items.get(1).Codetext);
        Assert.assertEquals("123456789012345678901234567890123456789012345678901234567890123456789012", items.get(2).Codetext);
        Assert.assertEquals("3456789012345678901234567890123456789012345678901234567890123456789012345", items.get(3).Codetext);

        String codetext = "";
        for (QRSAItem item : items)
        codetext += item.Codetext;

        Assert.assertEquals(RESULT, codetext);
    }
    //<<<<<<<< #endregion 

    //>>>>>>>> #region  Document 2

    @Test
    public void testDoc2_Full()
    {
        List<String> values = new ArrayList<String>();

        String fileName = Global.pathCombine(folder, "append.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        for(BarCodeResult result : reader.readBarCodes())
        values.add(result.getCodeText());
        Assert.assertEquals(5, values.size());
        Assert.assertTrue(values.contains("ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
        Assert.assertTrue(values.contains("ABCDEFGHIJKLMN"));
        Assert.assertTrue(values.contains("OPQRSTUVWXYZ0123"));
        Assert.assertTrue(values.contains("456789ABCDEFGHIJ"));
        Assert.assertTrue(values.contains("KLMNOPQRSTUVWXYZ"));
    }

    @Test
    public void testDoc2_QR1()
    {
        String fileName = Global.pathCombine(folder, "append-1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("ABCDEFGHIJKLMN", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testDoc2_QR2()
    {
        String fileName = Global.pathCombine(folder, "append-2.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("OPQRSTUVWXYZ0123", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testDoc2_QR3()
    {
        String fileName = Global.pathCombine(folder, "append-3.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("456789ABCDEFGHIJ", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testDoc2_QR4()
    {
        String fileName = Global.pathCombine(folder, "append-4.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("KLMNOPQRSTUVWXYZ", reader.getFoundBarCodes()[0].getCodeText());
    }

        @Test
    public void testDoc2_StructuredMode()
    {
            String RESULT = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        List<QRSAItem> items = new ArrayList<QRSAItem>();

        String fileName = Global.pathCombine(folder, "append.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            for(BarCodeResult result : reader.readBarCodes())
            {
                if (result.getCodeText().equals(RESULT))
                    continue;

                items.add(new QRSAItem(result.getCodeText(),
                        result.getExtended().getQR().getQRStructuredAppendModeBarCodesQuantity(),
                        result.getExtended().getQR().getQRStructuredAppendModeBarCodeIndex(),
                        result.getExtended().getQR().getQRStructuredAppendModeParityData()));
            }
        }

        Assert.assertEquals(4, items.size());
        Assert.assertTrue(items.get(0).Quantity == items.get(1).Quantity && items.get(1).Quantity == items.get(2).Quantity &&
                items.get(2).Quantity == items.get(3).Quantity && items.get(3).Quantity == items.size());
        Assert.assertTrue(items.get(0).ParityData == items.get(1).ParityData && items.get(1).ParityData == items.get(2).ParityData &&
                items.get(2).ParityData == items.get(3).ParityData);

        Collections.sort(items, (new Comparator<QRSAItem>()
                   {
                       @Override
                       public int compare(QRSAItem o1, QRSAItem o2)
                       {
                           return (o1.Index - (o2.Index));
                       }
                   }));

        for(QRSAItem item : items)
            Assert.assertEquals(items.indexOf(item), item.Index);

        Assert.assertEquals("ABCDEFGHIJKLMN", items.get(0).Codetext);
        Assert.assertEquals("OPQRSTUVWXYZ0123", items.get(1).Codetext);
        Assert.assertEquals("456789ABCDEFGHIJ", items.get(2).Codetext);
        Assert.assertEquals("KLMNOPQRSTUVWXYZ", items.get(3).Codetext);

        String codetext = "";
        for(QRSAItem item : items)
            codetext += item.Codetext;

        Assert.assertEquals(RESULT, codetext);
    }

    //<<<<<<<< #endregion 

    private static class QRSAItem
    {
        public final String Codetext;
        public final int Quantity;
        public final int Index;
        public final int ParityData;

        public QRSAItem(String codetext, int quantity, int index, int parityData)
        {
            Codetext = codetext;
            Quantity = quantity;
            Index = index;
            ParityData = parityData;
        }
    }
}

