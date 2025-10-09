package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.LicenseAssistant;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Locale;

public class BARCODEJAVA353
{
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test() throws IOException
    {
        Locale.setDefault(Locale.JAPAN);
        Assert.assertEquals(Locale.getDefault().getDisplayName(Locale.ENGLISH), "Japanese (Japan)");
        BarcodeGenerator builder = new BarcodeGenerator(EncodeTypes.CODE_39);
        Assert.assertEquals(builder.getCodeText(), "0123456789");
    }
}
