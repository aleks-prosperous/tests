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

public class Release_24_07
{
    String folder = Global.getTestDataFolder("Examples/release_24_7");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense(LicenseType.Total);
    }

    @Test
    public void example1() throws IOException
    {
        String codeText = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        BarcodeGenerator generator = new com.aspose.barcode.generation.BarcodeGenerator(EncodeTypes.CODE_128, codeText);
        Color color = new Color(0xBBFF5511);
        generator.getParameters().getBarcode().setBarColor(color);
        generator.getParameters().getImage().getSvg().setSvgColorMode(SvgColorMode.HSLA);
        generator.save(folder + "Hsla.svg");
    }

    @Test
    public void example2() throws IOException
    {
        String codeText = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        BarcodeGenerator generator = new com.aspose.barcode.generation.BarcodeGenerator(EncodeTypes.CODE_128, codeText);
        HslaColor hslaColor = new HslaColor(30, 50, 70, 0.8f);
        Color color = HslaColor.convertHslaToRgba(hslaColor);
        generator.getParameters().getBarcode().setBarColor(color);
        generator.getParameters().getImage().getSvg().setSvgColorMode(SvgColorMode.HSLA);
        generator.save(folder + "Hsla_from_hsla.svg");
    }
}
