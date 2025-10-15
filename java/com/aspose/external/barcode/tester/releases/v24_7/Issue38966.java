package com.aspose.external.barcode.tester.releases.v24_7;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.generation.HslaColor;
import com.aspose.barcode.generation.SvgColorMode;
import com.aspose.barcode.licensing.LicenseType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class Issue38966
{
    public static final String folder = Global.getTestDataFolder("Issues\\Issue38966");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense(LicenseType.Total);
    }


    @Test
    public void Save_Svg_RGB() throws IOException {
        String codeText = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.CODE_128, codeText);
        {
            int argb = 0xBBFF5511;
            generator.getParameters().getBarcode().setBarColor(new Color((argb >> 16) & 0xFF, (argb >> 8) & 0xFF, argb & 0xFF, (argb >> 24) & 0xFF));
            generator.getParameters().getImage().getSvg().setSvgColorMode(SvgColorMode.RGB);
            generator.save(folder + "Rgb1.svg");
        }
    }

    @Test
    public void Save_Svg_RGBA() throws IOException {
        String codeText = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.CODE_128, codeText);
        {
            int argb = 0xBBFF5511;
            generator.getParameters().getBarcode().setBarColor(new Color((argb >> 16) & 0xFF, (argb >> 8) & 0xFF, argb & 0xFF, (argb >> 24) & 0xFF));
            generator.getParameters().getImage().getSvg().setSvgColorMode(SvgColorMode.RGBA);
            generator.save(folder + "Rgba1.svg");
        }
    }

    @Test
    public void Save_Svg_HSL() throws IOException {
        String codeText = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.CODE_128, codeText);
        {
            int argb = 0xBBFF5511;
            generator.getParameters().getBarcode().setBarColor(new Color((argb >> 16) & 0xFF, (argb >> 8) & 0xFF, argb & 0xFF, (argb >> 24) & 0xFF));
            generator.getParameters().getImage().getSvg().setSvgColorMode(SvgColorMode.HSL);
            generator.save(folder + "Hsl.svg");
        }
    }

    @Test
    public void Save_Svg_HSLA() throws IOException {
        String codeText = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.CODE_128, codeText);
        {
            int argb = 0xBBFF5511;
            generator.getParameters().getBarcode().setBarColor(new Color((argb >> 16) & 0xFF, (argb >> 8) & 0xFF, argb & 0xFF, (argb >> 24) & 0xFF));
            generator.getParameters().getImage().getSvg().setSvgColorMode(SvgColorMode.HSLA);
            generator.save(folder + "Hsla.svg");
        }
    }

    @Test
    public void Save_Svg_HSLA_From_HSLA_Color() throws IOException {
        String codeText = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.CODE_128, codeText);
        {
            HslaColor hslaColor = new HslaColor(30, 50, 70, 0.8f);
            Color color = HslaColor.convertHslaToRgba(hslaColor);

            generator.getParameters().getBarcode().setBarColor(color);
            generator.getParameters().getImage().getSvg().setSvgColorMode(SvgColorMode.HSLA);
            generator.save(folder + "Hsla_from_hsla.svg");
        }
    }

    @Test
    public void Save_Svg_RGB_From_HSLA_Color() throws IOException {
        String codeText = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.CODE_128, codeText);
        {
            HslaColor hslaColor = new HslaColor(30, 50, 70, 0.8f);
            Color color = HslaColor.convertHslaToRgba(hslaColor);

            generator.getParameters().getBarcode().setBarColor(color);
            generator.save(folder + "RGB_from_hsla.svg");
        }
    }
}
