package com.aspose.external.barcode.tester.generation;

import com.aspose.barcode.generation.*;
import com.aspose.barcode.auxiliary.Global;
import helpers.FrameworkTestUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aspose.barcode.LicenseAssistant;
import utils.TestExternalHelper;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class TextRenderingTests
{
    private String folder = Global.getTestDataFolder("Generation\\TextRenderingTests");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void SetUp()
    {
        LicenseAssistant.setupLicense(com.aspose.barcode.licensing.LicenseType.Total);
    }


    @Test
    public void Test_FontMode_Auto_Wide_Barcode_Interpolation() throws IOException
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.CODE_128, "1234567891234");
        {
            generator.getParameters().setAutoSizeMode(AutoSizeMode.INTERPOLATION);
            generator.getParameters().getBarcode().getCodeTextParameters().setFontMode(FontMode.AUTO);
            generator.getParameters().getImageHeight().setPixels(60);
            generator.getParameters().getImageWidth().setPixels(400);
            String fileName = Global.pathCombine(folder, "Code128_wide_auto.png");
            FrameworkTestUtils.compareBitmaps(fileName, generator.generateBarCodeImage());
        }
    }


    @Test
    public void Test_FontMode_Auto_Wide_Barcode() throws IOException
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.CODE_128, "1234567891234");
        {
            generator.getParameters().getBarcode().getCodeTextParameters().setFontMode(FontMode.AUTO);
            generator.getParameters().getBarcode().getBarHeight().setPixels(60);
            generator.getParameters().getBarcode().getXDimension().setPixels(8);
            String fileName = Global.pathCombine(folder, "Code128_wide.png");
            FrameworkTestUtils.compareBitmaps(fileName, generator.generateBarCodeImage());
        }
    }


    @Test
    public void Test_Caption_NoWrap() throws IOException
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.UPCA);
        {
            generator.getParameters().getBarcode().getCodeTextParameters().setNoWrap(false);
            generator.getParameters().getBarcode().getCodeTextParameters().setFontMode(FontMode.MANUAL);
            generator.getParameters().getBarcode().getCodeTextParameters().getFont().getSize().setPixels(50);
            generator.getParameters().getCaptionAbove().setNoWrap(true);
            generator.getParameters().getCaptionAbove().setVisible(true);
            generator.getParameters().getCaptionAbove().getPadding().getLeft().setPixels(20);
            generator.getParameters().getCaptionAbove().setText("LOOOOOOOOOOOOOOONG TESTS TWRE SWDTGFSETSEFISDFV sgfdalmkdfhsdfglkjh OOOOOOOOOOOOOOONG TESTS TWRE SWDTGFSETSEFISDFV sgfdalmkdfhsdfglkjh");
            generator.getParameters().getCaptionBelow().setVisible(true);
            generator.getParameters().getCaptionBelow().setText("LOOOOOOOOOOOOOOONG TESTS TWRE SWDTGFSETSEFISDFV sgfdalmkdfhsdfglkjh OOOOOOOOOOOOOOONG TESTS TWRE SWDTGFSETSEFISDFV sgfdalmkdfhsdfglkjh");
            String fileName = Global.pathCombine(folder, "UPCA_NoWrap_Caption.png");
            FrameworkTestUtils.compareBitmaps(fileName, generator.generateBarCodeImage());
        }
    }

    @Test
    public void Test_Codetext_NoWrap() throws IOException
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.UPCA);
        {
            generator.getParameters().getBarcode().getCodeTextParameters().setFontMode(FontMode.MANUAL);
            generator.getParameters().getBarcode().getCodeTextParameters().getFont().getSize().setPixels(50);
            generator.getParameters().getCaptionAbove().setNoWrap(true);
            generator.getParameters().getCaptionAbove().setVisible(true);
            generator.getParameters().getCaptionAbove().getPadding().getLeft().setPixels(20);
            generator.getParameters().getCaptionAbove().setText("LOOOOOOOOOOOOOOONG TESTS TWRE SWDTGFSETSEFISDFV sgfdalmkdfhsdfglkjh OOOOOOOOOOOOOOONG TESTS TWRE SWDTGFSETSEFISDFV sgfdalmkdfhsdfglkjh");
            generator.getParameters().getCaptionBelow().setVisible(true);
            generator.getParameters().getCaptionBelow().setText("LOOOOOOOOOOOOOOONG TESTS TWRE SWDTGFSETSEFISDFV sgfdalmkdfhsdfglkjh OOOOOOOOOOOOOOONG TESTS TWRE SWDTGFSETSEFISDFV sgfdalmkdfhsdfglkjh");
            String fileName = Global.pathCombine(folder, "UPCA_NoWrap.png");
            FrameworkTestUtils.compareBitmaps(fileName, generator.generateBarCodeImage());
        }
    }

    @Test
    public void Test_Codetext_NoWrap_AutoFont() throws IOException
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.UPCA);
        {
            generator.getParameters().getBarcode().getCodeTextParameters().getFont().getSize().setPixels(50);
            generator.getParameters().getCaptionAbove().setNoWrap(true);
            generator.getParameters().getCaptionAbove().setVisible(true);
            generator.getParameters().getCaptionAbove().getPadding().getLeft().setPixels(20);
            generator.getParameters().getCaptionAbove().setText("LOOOOOOOOOOOOOOONG TESTS TWRE SWDTGFSETSEFISDFV sgfdalmkdfhsdfglkjh OOOOOOOOOOOOOOONG TESTS TWRE SWDTGFSETSEFISDFV sgfdalmkdfhsdfglkjh");
            generator.getParameters().getCaptionBelow().setVisible(true);
            generator.getParameters().getCaptionBelow().setText("LOOOOOOOOOOOOOOONG TESTS TWRE SWDTGFSETSEFISDFV sgfdalmkdfhsdfglkjh OOOOOOOOOOOOOOONG TESTS TWRE SWDTGFSETSEFISDFV sgfdalmkdfhsdfglkjh");
            String fileName = Global.pathCombine(folder, "UPCA_NoWrap_AutoFont.png");
            FrameworkTestUtils.compareBitmaps(fileName, generator.generateBarCodeImage());
        }
    }

    @Test
    public void Test_TwoDDisplayText_NoWrap_AutoFont() throws IOException
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.QR);
        {
            generator.getParameters().getBarcode().getCodeTextParameters().setTwoDDisplayText("LOOOOOOOOOOOOOOONG TESTS TWRE SWDTGFSETSEFISDFV sgfdalmkdfhsdfglkjh OOOOOOOOOOOOOOONG TESTS TWRE SWDTGFSETSEFISDFV sgfdalmkdfhsdfglkjh");
            generator.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.BELOW);
            String fileName = Global.pathCombine(folder, "QR_TwoDDisplayText_NoWrap_AutoFont.png");
            FrameworkTestUtils.compareBitmaps(fileName, generator.generateBarCodeImage());
        }
    }

    @Test
    public void Test_TwoDDisplayText_NoWrap_Disabled_AutoFont() throws IOException
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.QR);
        {
            generator.getParameters().getBarcode().getCodeTextParameters().setNoWrap(false);
            generator.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.BELOW);
            generator.getParameters().getBarcode().getCodeTextParameters().setTwoDDisplayText("LOOOOOOOOOOOOOOONG TESTS TWRE SWDTGFSETSEFISDFV sgfdalmkdfhsdfglkjh OOOOOOOOOOOOOOONG TESTS TWRE SWDTGFSETSEFISDFV sgfdalmkdfhsdfglkjh");
            String fileName = Global.pathCombine(folder, "QR_TwoDDisplayText_AutoFont.png");
            FrameworkTestUtils.compareBitmaps(fileName, generator.generateBarCodeImage());            
        }
    }

    @Test
    public void Test_TwoDDisplayText_NoWrap_Disabled() throws IOException
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.QR);
        {
            generator.getParameters().getBarcode().getCodeTextParameters().setFontMode(FontMode.MANUAL);
            generator.getParameters().getBarcode().getCodeTextParameters().getFont().getSize().setPixels(14);
            generator.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.BELOW);
            generator.getParameters().getBarcode().getCodeTextParameters().setNoWrap(false);
            generator.getParameters().getBarcode().getCodeTextParameters().setTwoDDisplayText("LOOOOOOOOOOOOOOONG TESTS TWRE SWDTGFSETSEFISDFV sgfdalmkdfhsdfglkjh OOOOOOOOOOOOOOONG TESTS TWRE SWDTGFSETSEFISDFV sgfdalmkdfhsdfglkjh");
            String fileName = Global.pathCombine(folder, "QR_TwoDDisplayText.png");
            FrameworkTestUtils.compareBitmaps(fileName, generator.generateBarCodeImage());
        }
    }
}
