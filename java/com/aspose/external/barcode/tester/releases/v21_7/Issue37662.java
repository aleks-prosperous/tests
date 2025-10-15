package com.aspose.external.barcode.tester.releases.v21_7;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue37662
{
    /// <summary>
    /// Path to folder with files for testing Issue37662.
    /// </summary>
    private final static String Folder = Global.getTestDataFolder("Issues/Issue37662");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void CapsSmall_Test()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "Read_properly/CapsSmall.jpg"));
        {
            Assert.assertEquals(4, reader.readBarCodes().length);

            Assert.assertEquals(DecodeType.PATCH_CODE, reader.getFoundBarCodes()[0].getCodeType());
            Assert.assertEquals("Patch IV", reader.getFoundBarCodes()[0].getCodeText());

            Assert.assertEquals(DecodeType.PATCH_CODE, reader.getFoundBarCodes()[1].getCodeType());
            Assert.assertEquals("Patch IV", reader.getFoundBarCodes()[1].getCodeText());

            Assert.assertEquals(DecodeType.CODE_39_FULL_ASCII, reader.getFoundBarCodes()[2].getCodeType());
            Assert.assertEquals("Kuldeepk", reader.getFoundBarCodes()[2].getCodeText());

            Assert.assertEquals(DecodeType.PATCH_CODE, reader.getFoundBarCodes()[3].getCodeType());
            Assert.assertEquals("Patch IV", reader.getFoundBarCodes()[3].getCodeText());
        }
    }

    @Test
    public void Small_Test()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "Read_properly/Small.jpg"));
        {
            Assert.assertEquals(4, reader.readBarCodes().length);

            Assert.assertEquals(DecodeType.PATCH_CODE, reader.getFoundBarCodes()[0].getCodeType());
            Assert.assertEquals("Patch IV", reader.getFoundBarCodes()[0].getCodeText());

            Assert.assertEquals(DecodeType.PATCH_CODE, reader.getFoundBarCodes()[1].getCodeType());
            Assert.assertEquals("Patch IV", reader.getFoundBarCodes()[1].getCodeText());

            Assert.assertEquals(DecodeType.CODE_39_FULL_ASCII, reader.getFoundBarCodes()[2].getCodeType());
            Assert.assertEquals("kuldeep", reader.getFoundBarCodes()[2].getCodeText());

            Assert.assertEquals(DecodeType.PATCH_CODE, reader.getFoundBarCodes()[3].getCodeType());
            Assert.assertEquals("Patch IV", reader.getFoundBarCodes()[3].getCodeText());
        }
    }

    @Test
    public void CapsSmallCapsSmallNum_Test()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "NotRead_properly/CapsSmallCapsSmallNum.jpg"));
        {
            Assert.assertEquals(4, reader.readBarCodes().length);

            Assert.assertEquals(DecodeType.PATCH_CODE, reader.getFoundBarCodes()[0].getCodeType());
            Assert.assertEquals("Patch IV", reader.getFoundBarCodes()[0].getCodeText());

            Assert.assertEquals(DecodeType.PATCH_CODE, reader.getFoundBarCodes()[1].getCodeType());
            Assert.assertEquals("Patch IV", reader.getFoundBarCodes()[1].getCodeText());

            Assert.assertEquals(DecodeType.CODE_39_FULL_ASCII, reader.getFoundBarCodes()[2].getCodeType());
            Assert.assertEquals("KuldeeKu21", reader.getFoundBarCodes()[2].getCodeText());

            Assert.assertEquals(DecodeType.PATCH_CODE, reader.getFoundBarCodes()[3].getCodeType());
            Assert.assertEquals("Patch IV", reader.getFoundBarCodes()[3].getCodeText());
        }
    }

    @Test
    public void CapsSmallNum_Test()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "NotRead_properly/CapsSmallNum.jpg"));
        {
            Assert.assertEquals(4, reader.readBarCodes().length);

            Assert.assertEquals(DecodeType.PATCH_CODE, reader.getFoundBarCodes()[0].getCodeType());
            Assert.assertEquals("Patch IV", reader.getFoundBarCodes()[0].getCodeText());

            Assert.assertEquals(DecodeType.PATCH_CODE, reader.getFoundBarCodes()[1].getCodeType());
            Assert.assertEquals("Patch IV", reader.getFoundBarCodes()[1].getCodeText());

            Assert.assertEquals(DecodeType.CODE_39_FULL_ASCII, reader.getFoundBarCodes()[2].getCodeType());
            Assert.assertEquals("Kuldeep1", reader.getFoundBarCodes()[2].getCodeText());

            Assert.assertEquals(DecodeType.PATCH_CODE, reader.getFoundBarCodes()[3].getCodeType());
            Assert.assertEquals("Patch IV", reader.getFoundBarCodes()[3].getCodeText());
        }
    }

    @Test
    public void SmallNum_Test()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "NotRead_properly/SmallNum.jpg"));
        {
            Assert.assertEquals(4, reader.readBarCodes().length);

            Assert.assertEquals(DecodeType.PATCH_CODE, reader.getFoundBarCodes()[0].getCodeType());
            Assert.assertEquals("Patch IV", reader.getFoundBarCodes()[0].getCodeText());

            Assert.assertEquals(DecodeType.PATCH_CODE, reader.getFoundBarCodes()[1].getCodeType());
            Assert.assertEquals("Patch IV", reader.getFoundBarCodes()[1].getCodeText());

            Assert.assertEquals(DecodeType.CODE_39_FULL_ASCII, reader.getFoundBarCodes()[2].getCodeType());
            Assert.assertEquals("kuldeep1", reader.getFoundBarCodes()[2].getCodeText());

            Assert.assertEquals(DecodeType.PATCH_CODE, reader.getFoundBarCodes()[3].getCodeType());
            Assert.assertEquals("Patch IV", reader.getFoundBarCodes()[3].getCodeText());
        }
    }
}
