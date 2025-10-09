package com.aspose.external.barcode.tester.complexbarcode;

import com.aspose.barcode.generation.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aspose.barcode.LicenseAssistant;

public class HanXinGettersSettersTests
{
    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void HanXin_EncodeMode_GetSet_Test()
    {
        BarcodeGenerator bg = new BarcodeGenerator(EncodeTypes.HAN_XIN, "123");
        bg.getParameters().getBarcode().getHanXin().setHanXinEncodeMode(HanXinEncodeMode.BINARY);
        Assert.assertEquals(HanXinEncodeMode.BINARY, bg.getParameters().getBarcode().getHanXin().getHanXinEncodeMode());
    }

    @Test
    public void HanXin_ErrorLevel_GetSet_Test()
    {
        BarcodeGenerator bg = new BarcodeGenerator(EncodeTypes.HAN_XIN, "123");
        bg.getParameters().getBarcode().getHanXin().setHanXinErrorLevel(HanXinErrorLevel.L2);
        Assert.assertEquals(HanXinErrorLevel.L2, bg.getParameters().getBarcode().getHanXin().getHanXinErrorLevel());
    }

    @Test
    public void HanXin_ECIEncoding_GetSet_Test()
    {
        BarcodeGenerator bg = new BarcodeGenerator(EncodeTypes.HAN_XIN, "123");
        bg.getParameters().getBarcode().getHanXin().setHanXinECIEncoding(ECIEncodings.ISO_8859_3);
        Assert.assertEquals(ECIEncodings.ISO_8859_3, bg.getParameters().getBarcode().getHanXin().getHanXinECIEncoding());
    }

    @Test
    public void HanXin_Version_GetSet_Test()
    {
        BarcodeGenerator bg = new BarcodeGenerator(EncodeTypes.HAN_XIN, "123");
        bg.getParameters().getBarcode().getHanXin().setHanXinVersion(HanXinVersion.VERSION_04);
        Assert.assertEquals(HanXinVersion.VERSION_04, bg.getParameters().getBarcode().getHanXin().getHanXinVersion());
    }
}
