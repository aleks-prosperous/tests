package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Issue33461
{
    final String folder = Global.getIssuesTestImagePath("Issue33461");

        @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void test_NothingBroken_QR() throws IOException
        {
        ByteArrayOutputStream ms = new ByteArrayOutputStream();
        {
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.QR);
            {
                gen.setCodeText("12345 QWERTY uiop");
                gen.save(ms, BarCodeImageFormat.PNG);
            }

            BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(ms.toByteArray()), DecodeType.QR);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345 QWERTY uiop", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_NothingBroken_Datamatrix() throws IOException
        {
        ByteArrayOutputStream ms = new ByteArrayOutputStream();
        {
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX);
            {
                gen.setCodeText("12345 QWERTY uiop");
                gen.save(ms, BarCodeImageFormat.PNG);
            }

            BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(ms.toByteArray()), DecodeType.DATA_MATRIX);
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals("12345 QWERTY uiop", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_NothingBroken_Aztec() throws IOException
        {
        ByteArrayOutputStream ms = new ByteArrayOutputStream();
        {
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.AZTEC);
            {
                gen.setCodeText("12345 QWERTY uiop");
                gen.save(ms, BarCodeImageFormat.PNG);
            }

            BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(ms.toByteArray()), DecodeType.AZTEC);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345 QWERTY uiop", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        ////[Category("Pdf417")]
    public void test_NothingBroken_PDF417() throws IOException
        {
        ByteArrayOutputStream ms = new ByteArrayOutputStream();
        {
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.PDF_417);
            {
                gen.setCodeText("12345 QWERTY uiop");
                gen.save(ms, BarCodeImageFormat.PNG);
            }

            BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(ms.toByteArray()), DecodeType.PDF_417);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345 QWERTY uiop", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_NothingBroken_MacroPDF417() throws IOException
        {
        ByteArrayOutputStream ms = new ByteArrayOutputStream();
        {
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.MACRO_PDF_417);
            {
                gen.setCodeText("12345 QWERTY uiop");
                gen.save(ms, BarCodeImageFormat.PNG);
            }

            BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(ms.toByteArray()), DecodeType.MACRO_PDF_417);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345 QWERTY uiop", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_Japan_QR() throws IOException
    {
        ByteArrayOutputStream ms = new ByteArrayOutputStream();
        {
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.QR);
            {
                gen.setCodeText("名古屋 年式");
                gen.save(ms, BarCodeImageFormat.PNG);
            }

            BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(ms.toByteArray()), DecodeType.QR);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("名古屋 年式", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_Japan_Datamatrix() throws IOException
        {
        ByteArrayOutputStream ms = new ByteArrayOutputStream();
        {
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX);
            {
                gen.setCodeText("車種名", Charset.forName("ms932"));
                gen.save(ms, BarCodeImageFormat.PNG);
            }

            BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(ms.toByteArray()), DecodeType.DATA_MATRIX);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("車種名", reader.getFoundBarCodes()[0].getCodeText(Charset.forName("ms932")));
        }
    }

        @Test
    public void test_Japan_Aztec() throws IOException
        {
        ByteArrayOutputStream ms = new ByteArrayOutputStream();
        {
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.AZTEC);
            {
                gen.setCodeText("都道府県", Charset.forName("ms932"));
                gen.save(ms, BarCodeImageFormat.PNG);
            }

            BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(ms.toByteArray()), DecodeType.AZTEC);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("都道府県", reader.getFoundBarCodes()[0].getCodeText(Charset.forName("ms932")));
        }
    }

        @Test
        ////[Category("Pdf417")]
    public void test_Japan_PDF417() throws IOException
        {
        ByteArrayOutputStream ms = new ByteArrayOutputStream();
        {
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.PDF_417);
            {
                gen.setCodeText("古車買取台数", Charset.forName("ms932"));
                gen.save(ms, BarCodeImageFormat.PNG);
            }

            BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(ms.toByteArray()), DecodeType.PDF_417);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("古車買取台数", reader.getFoundBarCodes()[0].getCodeText(Charset.forName("ms932")));
        }
    }

        @Test
    public void test_Japan_MacroPDF417() throws IOException
        {
        ByteArrayOutputStream ms = new ByteArrayOutputStream();
        {
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.MACRO_PDF_417);
            {
                gen.setCodeText("電話番号 123", Charset.forName("ms932"));
                gen.save(ms, BarCodeImageFormat.PNG);
            }

            BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(ms.toByteArray()), DecodeType.MACRO_PDF_417);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("電話番号 123", reader.getFoundBarCodes()[0].getCodeText(Charset.forName("ms932")));
        }
    }

        @Test
        ////[Category("QR")]
    public void test_Russian_QR() throws IOException
        {
        ByteArrayOutputStream ms = new ByteArrayOutputStream();
        {
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.QR);
            {
                gen.setCodeText("Слово", StandardCharsets.UTF_8);
                gen.save(ms, BarCodeImageFormat.PNG);
            }

            BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(ms.toByteArray()), DecodeType.QR);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Слово", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_Russian_Datamatrix() throws IOException
        {
        ByteArrayOutputStream ms = new ByteArrayOutputStream();
        {
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX);
            {
                gen.setCodeText("Город Донецк 12", StandardCharsets.UTF_8);
                gen.save(ms, BarCodeImageFormat.PNG);
            }

            BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(ms.toByteArray()), DecodeType.DATA_MATRIX);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Город Донецк 12", reader.getFoundBarCodes()[0].getCodeText(StandardCharsets.UTF_8));
        }
    }

        @Test
    public void test_Russian_Aztec() throws IOException
        {
        ByteArrayOutputStream ms = new ByteArrayOutputStream();
        {
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.AZTEC);
            {
                gen.setCodeText("Столица", StandardCharsets.UTF_8);
                gen.save(ms, BarCodeImageFormat.PNG);
            }

            BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(ms.toByteArray()), DecodeType.AZTEC);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Столица", reader.getFoundBarCodes()[0].getCodeText(StandardCharsets.UTF_8));
        }
    }

        @Test
        ////[Category("Pdf417")]
    public void test_Russian_PDF417() throws IOException
        {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        {
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.PDF_417);
            {
                gen.setCodeText("Воробей", StandardCharsets.UTF_8);
                gen.save(outputStream, BarCodeImageFormat.PNG);
            }

            BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(outputStream.toByteArray()), DecodeType.PDF_417);
            BarCodeResult[] results = reader.readBarCodes();
            System.out.println("Code Type : " + results[0].getCodeTypeName());
            System.out.println("Code Text : " + results[0].getCodeText(StandardCharsets.UTF_8));
            Assert.assertEquals(results.length, 1);
            Assert.assertEquals("Воробей", reader.getFoundBarCodes()[0].getCodeText(StandardCharsets.UTF_8));
        }
    }

        @Test
    public void test_Russian_MacroPDF417() throws IOException
        {
        ByteArrayOutputStream ms = new ByteArrayOutputStream();
        {
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.MACRO_PDF_417);
            {
                gen.setCodeText("Макро ПДФ 417", StandardCharsets.UTF_8);
                gen.save(ms, BarCodeImageFormat.PNG);
            }

            BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(ms.toByteArray()), DecodeType.MACRO_PDF_417);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Макро ПДФ 417", reader.getFoundBarCodes()[0].getCodeText(StandardCharsets.UTF_8));
        }
    }

        @Test
    public void test_Japan_SSRS2008_QR_1()
    {
        String path = Global.pathCombine(folder, "2008_JP_IDE.png");
        BarCodeReader reader = new BarCodeReader(path, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("名古屋", reader.getFoundBarCodes()[0].getCodeText(Charset.forName("ms932")));
    }

        @Test
    public void test_Japan_SSRS2008_QR_2()
    {
        String path = Global.pathCombine(folder, "2008_JP_IDE_RUN.png");
        BarCodeReader reader = new BarCodeReader(path, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 2);
        Assert.assertEquals("名古屋", reader.getFoundBarCodes()[0].getCodeText(Charset.forName("ms932")));
        Assert.assertEquals("名古屋", reader.getFoundBarCodes()[1].getCodeText(Charset.forName("ms932")));
    }

        @Test
    public void test_Japan_SSRS2008_QR_3()
    {
        String path = Global.pathCombine(folder, "2008_JP_DEPLOY.png");
        BarCodeReader reader = new BarCodeReader(path, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 2);
        Assert.assertEquals("名古屋", reader.getFoundBarCodes()[0].getCodeText(Charset.forName("ms932")));
        Assert.assertEquals("名古屋", reader.getFoundBarCodes()[1].getCodeText(Charset.forName("ms932")));
    }

        @Test
    public void test_Japan_SSRS2008_With_English()
    {
        String path = Global.pathCombine(folder, "Japan with English.png");
        BarCodeReader reader = new BarCodeReader(path, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("名古屋 490 WS", reader.getFoundBarCodes()[0].getCodeText(Charset.forName("ms932")));
    }

        @Test
    public void test_Russian_SSRS2008_Datamatrix_1()
    {
        String path = Global.pathCombine(folder, "2008_RUS_IDE.png");
        BarCodeReader reader = new BarCodeReader(path, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("Город na severe 2013", reader.getFoundBarCodes()[0].getCodeText(Charset.forName("windows-1251")));
    }

        @Test
    public void test_Russian_SSRS2008_Datamatrix_2()
    {
        String path = Global.pathCombine(folder, "2008_RUS_IDE_RUN.png");
        BarCodeReader reader = new BarCodeReader(path, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 2);
        Assert.assertEquals("Город na severe 2013", reader.getFoundBarCodes()[0].getCodeText(Charset.forName("windows-1251")));
        Assert.assertEquals("Город na severe 2013", reader.getFoundBarCodes()[1].getCodeText(Charset.forName("windows-1251")));
    }

        @Test
    public void test_Russian_SSRS2008_Datamatrix_3()
    {
        String path = Global.pathCombine(folder, "2008_RUS_DEPLOY.png");
        BarCodeReader reader = new BarCodeReader(path, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 2);
        Assert.assertEquals("Город na severe 2013", reader.getFoundBarCodes()[0].getCodeText(Charset.forName("windows-1251")));
        Assert.assertEquals("Город na severe 2013", reader.getFoundBarCodes()[1].getCodeText(Charset.forName("windows-1251")));
    }

        @Test
        ////[Category("Pdf417")]
    public void test_BarCodeControl_Japan()
    {
        String path = Global.pathCombine(folder, "BarCodeControl.png");
        BarCodeReader reader = new BarCodeReader(path, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 2);
        Assert.assertEquals("名古屋 年式", reader.getFoundBarCodes()[0].getCodeText(Charset.forName("ms932")));
        Assert.assertEquals("名古屋 年式", reader.getFoundBarCodes()[1].getCodeText(Charset.forName("ms932")));
    }
}
