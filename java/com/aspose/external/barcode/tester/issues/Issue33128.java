// Copyright (c) 2001-2011 Aspose Pty Ltd. All Rights Reserved.

package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.ChecksumValidation;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

@Test(description = "Tests for Issue-33128.")
public class Issue33128
{
    final String imagePath = Global.getTestDataFolder("Issues" + File.separatorChar + "Issue33128") + "Three_Barcodes.png";

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    private static void checkNoneBarCodes(BarCodeReader reader)
    {
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
    }

    private static void checkAllBarCodes(BarCodeReader reader)
    {
        Assert.assertEquals(reader.readBarCodes().length, 3);
        Assert.assertEquals("01234321", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("Pegasus Imaging - BarcodeXpress 5 - 1D and 2D barcode reader/writer", reader.getFoundBarCodes()[1].getCodeText());
        Assert.assertEquals("44123123456123456789", reader.getFoundBarCodes()[2].getCodeText());
    }

    private static void checkOnlyFirst(BarCodeReader reader)
    {
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("01234321", reader.getFoundBarCodes()[0].getCodeText());
    }

    private static void checkOnlySecond(BarCodeReader reader)
    {
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("Pegasus Imaging - BarcodeXpress 5 - 1D and 2D barcode reader/writer", reader.getFoundBarCodes()[0].getCodeText());
    }

    private static void checkOnlyLast(BarCodeReader reader)
    {
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("44123123456123456789", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void recognizeInNormalMode() throws IOException {
        BufferedImage bitmap = ImageIO.read(new File(imagePath));
        {
            BarCodeReader reader = new BarCodeReader(bitmap);
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.OFF);
            checkAllBarCodes(reader);
        }
    }

    @Test
    public void recognizeOnlyFirstBarCode()
    {
        BufferedImage bitmap = Global.getBufferedImageFromFile(imagePath);
        Rectangle rect = new Rectangle();
        rect.setBounds(0, 0, 300, 200);
        BarCodeReader reader = new BarCodeReader(bitmap, rect, DecodeType.ALL_SUPPORTED_TYPES);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.OFF);
        checkOnlyFirst(reader);
    }

    @Test
    public void recognizeOnlyFirstBarCodeSecond()
    {
        BufferedImage bitmap = Global.getBufferedImageFromFile(imagePath);
        Rectangle rect = new Rectangle();
        rect.setBounds(1, 1, 300, 200);
        BarCodeReader reader = new BarCodeReader(bitmap, rect, DecodeType.ALL_SUPPORTED_TYPES);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.OFF);
        checkOnlyFirst(reader);
    }

    @Test
    public void recognizeOnlyFirstBarCodeThird()
    {
        BufferedImage bitmap = Global.getBufferedImageFromFile(imagePath);
        Rectangle rect = new Rectangle();
        rect.setBounds(50, 50, 300, 200);
        BarCodeReader reader = new BarCodeReader(bitmap, rect, DecodeType.ALL_SUPPORTED_TYPES);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.OFF);
        checkOnlyFirst(reader);
    }

    @Test
    public void recognizeOnlyFirstBarCodeFourth()
    {
        BufferedImage bitmap = Global.getBufferedImageFromFile(imagePath);
        Rectangle rect = new Rectangle();
        rect.setBounds(50, 50, 300, 300);
        BarCodeReader reader = new BarCodeReader(bitmap, rect, DecodeType.ALL_SUPPORTED_TYPES);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.OFF);
        checkOnlyFirst(reader);
    }

    @Test
    public void recognizeOnlyFirstBarCodeFifth()
    {
        BufferedImage bitmap = Global.getBufferedImageFromFile(imagePath);
        Rectangle rect = new Rectangle();
        rect.setBounds(70, 76, 211, 102);
        BarCodeReader reader = new BarCodeReader(bitmap, rect, DecodeType.ALL_SUPPORTED_TYPES);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.OFF);
        checkOnlyFirst(reader);
    }

    @Test
    public void recognizeAllBarCodesWithRectangle()
    {
        BufferedImage bitmap = Global.getBufferedImageFromFile(imagePath);
        Rectangle rect = new Rectangle();
        rect.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
        BarCodeReader reader = new BarCodeReader(bitmap, rect, DecodeType.ALL_SUPPORTED_TYPES);
        reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.OFF);
        checkAllBarCodes(reader);
    }

    @Test
    public void recognizeAllBarCodesWithRectangleSecond()
    {
        BufferedImage bitmap = Global.getBufferedImageFromFile(imagePath);
        Rectangle rect = new Rectangle();
        rect.setBounds(1, 1, (int) (bitmap.getWidth() - rect.getX()), (int) (bitmap.getHeight() - rect.getY()));
        BarCodeReader reader = new BarCodeReader(bitmap, rect, DecodeType.ALL_SUPPORTED_TYPES);
        reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.OFF);
        checkAllBarCodes(reader);
    }

    @Test
    public void recognizeAllBarCodesWithRectangleThird()
    {
        BufferedImage bitmap = Global.getBufferedImageFromFile(imagePath);
        Rectangle rect = new Rectangle();
        rect.setBounds(0, 0, bitmap.getWidth() - 1, bitmap.getHeight() - 1);
        BarCodeReader reader = new BarCodeReader(bitmap, rect, DecodeType.ALL_SUPPORTED_TYPES);
        reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.OFF);
        checkAllBarCodes(reader);
    }

    @Test
    public void recognizeAllBarCodesWithRectangleFourth()
    {
        BufferedImage bitmap = Global.getBufferedImageFromFile(imagePath);
        Rectangle rect = new Rectangle();
        rect.setBounds(1, 1, bitmap.getWidth() - 1, bitmap.getHeight() - 1);
        BarCodeReader reader = new BarCodeReader(bitmap, rect, DecodeType.ALL_SUPPORTED_TYPES);
        reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.OFF);
        checkAllBarCodes(reader);
    }

    @Test
    public void incorrectRectangle()
    {
        BufferedImage bitmap = Global.getBufferedImageFromFile(imagePath);
        Rectangle rect = new Rectangle();
        rect.setBounds(-1, 0, 300, 200);
        BarCodeReader reader = new BarCodeReader(bitmap, rect, DecodeType.ALL_SUPPORTED_TYPES);
        checkOnlyFirst(reader);
    }

    @Test
    public void incorrectRectangleSecond()
    {
        BufferedImage bitmap = Global.getBufferedImageFromFile(imagePath);
        Rectangle rect = new Rectangle();
        rect.setBounds(0, -1, 300, 200);
        BarCodeReader reader = new BarCodeReader(bitmap, rect, DecodeType.ALL_SUPPORTED_TYPES);
        checkOnlyFirst(reader);
    }

    @Test
    public void incorrectRectangleThird()
    {
        BufferedImage bitmap = Global.getBufferedImageFromFile(imagePath);
        Rectangle rect = new Rectangle();
        rect.setBounds(0, 0, bitmap.getWidth() + 1, 200);
        BarCodeReader reader = new BarCodeReader(bitmap, rect, DecodeType.ALL_SUPPORTED_TYPES);
        checkOnlyFirst(reader);
    }

    @Test
    public void incorrectRectangleFourth()
    {
        BufferedImage bitmap = Global.getBufferedImageFromFile(imagePath);
        Rectangle rect = new Rectangle();
        rect.setBounds(0, -1, 300, bitmap.getHeight() + 1);
        BarCodeReader reader = new BarCodeReader(bitmap, rect, DecodeType.ALL_SUPPORTED_TYPES);
        checkOnlyFirst(reader);
    }

    @Test
    public void incorrectRectangleFifth()
    {
        BufferedImage bitmap = Global.getBufferedImageFromFile(imagePath);
        Rectangle rect = new Rectangle(bitmap.getWidth() - 200, bitmap.getHeight() - 200, 201, 200);
        BarCodeReader reader = new BarCodeReader(bitmap, rect, DecodeType.ALL_SUPPORTED_TYPES);
        checkNoneBarCodes(reader);
    }

    @Test
    public void incorrectRectangleSixth()
    {
        BufferedImage bitmap = Global.getBufferedImageFromFile(imagePath);
        Rectangle rect = new Rectangle();
        rect.setBounds(bitmap.getWidth() - 200, bitmap.getHeight() - 200, 200, 201);
        BarCodeReader reader = new BarCodeReader(bitmap, rect, DecodeType.ALL_SUPPORTED_TYPES);
        checkNoneBarCodes(reader);
    }

    @Test
    public void recognizeZeroBarcodes()
    {
        BufferedImage bitmap = Global.getBufferedImageFromFile(imagePath);
        Rectangle rect = new Rectangle();
        rect.setBounds(1, 1, 50, 50);
        BarCodeReader reader = new BarCodeReader(bitmap, rect, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
    }

    @Test
    public void recognizeSecondBarCode()
    {
        BufferedImage bitmap = Global.getBufferedImageFromFile(imagePath);
        Rectangle rect = new Rectangle();
        rect.setBounds(400, 50, 400, 400);
        BarCodeReader reader = new BarCodeReader(bitmap, rect, DecodeType.DATA_MATRIX);
        checkOnlySecond(reader);
    }

    @Test
    public void recognizeSecondBarCodeSecond()
    {
        BufferedImage bitmap = Global.getBufferedImageFromFile(imagePath);
        Rectangle rect = new Rectangle();
        rect.setBounds(436, 60, 301, 301);
        BarCodeReader reader = new BarCodeReader(bitmap, rect, DecodeType.DATA_MATRIX);
        checkOnlySecond(reader);
    }

    @Test
    public void recognizeLastBarCode()
    {
        BufferedImage bitmap = Global.getBufferedImageFromFile(imagePath);
        Rectangle rect = new Rectangle();
        rect.setBounds(50, 520, 700, 150);
        BarCodeReader reader = new BarCodeReader(bitmap, rect, DecodeType.ALL_SUPPORTED_TYPES);
        checkOnlyLast(reader);
    }

    @Test
    public void recognizeLastBarCodeSecond()
    {
        BufferedImage bitmap = Global.getBufferedImageFromFile(imagePath);
        Rectangle rect = new Rectangle();
        rect.setBounds(80, 536, 656, 99);
        BarCodeReader reader = new BarCodeReader(bitmap, rect, DecodeType.ALL_SUPPORTED_TYPES);
        checkOnlyLast(reader);
    }
}