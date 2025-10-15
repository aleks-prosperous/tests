// Copyright (c) 2001-2011 Aspose Pty Ltd. All Rights Reserved.
package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


@Test(description = "Tests for Issue-18355.")
public class Issue18355
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue18355");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("Code39")]
    public void testTest9_tif_file()
    {
            final String filename = "test9.tif";
        String fullPath = Global.pathCombine(folder, filename);
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.CODE_39 , DecodeType.CODE_39_FULL_ASCII ,
                DecodeType.GS_1_CODE_128 , DecodeType.EAN_13 , DecodeType.EAN_14 , DecodeType.EAN_8, DecodeType.PATCH_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("<FNC1>BHS04660", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39")]
    public void testAsposeBarcode_Error_Index_was_outside_the_bounds_of_the_array_tif_file()
    {
            final String filename = "AsposeBarcode_Error_Index_was_outside_the_bounds_of_the_array.tif";
        String fullPath = Global.pathCombine(folder, filename);
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.CODE_39 , DecodeType.CODE_39_FULL_ASCII ,
                DecodeType.GS_1_CODE_128 , DecodeType.EAN_13 , DecodeType.EAN_14 , DecodeType.EAN_8 , DecodeType.PATCH_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Code39")]
    public void testAsposeBarcode_Error_Object_reference_not_set_to_an_instance_of_an_object_tif_file()
    {
            final String filename = "AsposeBarcode_Error_Object_reference_not_set_to_an_instance_of_an_object.tif";
        String fullPath = Global.pathCombine(folder, filename);
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.CODE_39 , DecodeType.CODE_39_FULL_ASCII ,
                DecodeType.GS_1_CODE_128 , DecodeType.EAN_13 , DecodeType.EAN_14 , DecodeType.EAN_8 , DecodeType.PATCH_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Code39")]
    public void testFindPATCHIII_in_image_tif_file()
    {
            final String filename = "FindPATCHIII_in_image.tif";
        String fullPath = Global.pathCombine(folder, filename);
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.CODE_39 , DecodeType.CODE_39_FULL_ASCII ,
                DecodeType.GS_1_CODE_128 , DecodeType.EAN_13 , DecodeType.EAN_14 , DecodeType.EAN_8 , DecodeType.PATCH_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
    public void testCorrectPatchT()
    {
            final String filename = "patch-t.gif";
        String fullPath = Global.pathCombine(folder, filename);
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 4);
            Assert.assertEquals("Patch T", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("PatchCode", reader.getFoundBarCodes()[0].getCodeTypeName());
            Assert.assertEquals("Patch T", reader.getFoundBarCodes()[1].getCodeText());
            Assert.assertEquals("PatchCode", reader.getFoundBarCodes()[1].getCodeTypeName());
            Assert.assertEquals("Patch T", reader.getFoundBarCodes()[2].getCodeText());
            Assert.assertEquals("PatchCode", reader.getFoundBarCodes()[2].getCodeTypeName());
            Assert.assertEquals("Patch T", reader.getFoundBarCodes()[3].getCodeText());
            Assert.assertEquals("PatchCode", reader.getFoundBarCodes()[3].getCodeTypeName());
        }
    }

        @Test
    public void testCorrectPatch2()
    {
            final String filename = "smallPatch2.png";
        String fullPath = Global.pathCombine(folder, filename);
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Patch II", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("PatchCode", reader.getFoundBarCodes()[0].getCodeTypeName());
        }
    }

        @Test
    public void testCorrectPatchI()
    {
            final String filename = "PatchI.png";
        String fullPath = Global.pathCombine(folder, filename);
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 4);
            Assert.assertEquals("Patch I", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("PatchCode", reader.getFoundBarCodes()[0].getCodeTypeName());
            Assert.assertEquals("Patch I", reader.getFoundBarCodes()[1].getCodeText());
            Assert.assertEquals("PatchCode", reader.getFoundBarCodes()[1].getCodeTypeName());
            Assert.assertEquals("Patch I", reader.getFoundBarCodes()[2].getCodeText());
            Assert.assertEquals("PatchCode", reader.getFoundBarCodes()[2].getCodeTypeName());
            Assert.assertEquals("Patch I", reader.getFoundBarCodes()[3].getCodeText());
            Assert.assertEquals("PatchCode", reader.getFoundBarCodes()[3].getCodeTypeName());
        }
    }

        @Test
    public void testCorrectPatchII()
    {
            final String filename = "PatchII.png";
        String fullPath = Global.pathCombine(folder, filename);
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 4);
            Assert.assertEquals("Patch II", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("PatchCode", reader.getFoundBarCodes()[0].getCodeTypeName());
            Assert.assertEquals("Patch II", reader.getFoundBarCodes()[1].getCodeText());
            Assert.assertEquals("PatchCode", reader.getFoundBarCodes()[1].getCodeTypeName());
            Assert.assertEquals("Patch II", reader.getFoundBarCodes()[2].getCodeText());
            Assert.assertEquals("PatchCode", reader.getFoundBarCodes()[2].getCodeTypeName());
            Assert.assertEquals("Patch II", reader.getFoundBarCodes()[3].getCodeText());
            Assert.assertEquals("PatchCode", reader.getFoundBarCodes()[3].getCodeTypeName());
        }
    }

        @Test
    public void testCorrectPatchIII()
    {
            final String filename = "PatchIII.png";
        String fullPath = Global.pathCombine(folder, filename);
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 4);
            Assert.assertEquals("Patch III", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("PatchCode", reader.getFoundBarCodes()[0].getCodeTypeName());
            Assert.assertEquals("Patch III", reader.getFoundBarCodes()[1].getCodeText());
            Assert.assertEquals("PatchCode", reader.getFoundBarCodes()[1].getCodeTypeName());
            Assert.assertEquals("Patch III", reader.getFoundBarCodes()[2].getCodeText());
            Assert.assertEquals("PatchCode", reader.getFoundBarCodes()[2].getCodeTypeName());
            Assert.assertEquals("Patch III", reader.getFoundBarCodes()[3].getCodeText());
            Assert.assertEquals("PatchCode", reader.getFoundBarCodes()[3].getCodeTypeName());
        }
    }

        @Test
    public void testCorrectPatchIV()
    {
            final String filename = "PatchIV.png";
        String fullPath = Global.pathCombine(folder, filename);
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 4);
            Assert.assertEquals("Patch IV", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("PatchCode", reader.getFoundBarCodes()[0].getCodeTypeName());
            Assert.assertEquals("Patch IV", reader.getFoundBarCodes()[1].getCodeText());
            Assert.assertEquals("PatchCode", reader.getFoundBarCodes()[1].getCodeTypeName());
            Assert.assertEquals("Patch IV", reader.getFoundBarCodes()[2].getCodeText());
            Assert.assertEquals("PatchCode", reader.getFoundBarCodes()[2].getCodeTypeName());
            Assert.assertEquals("Patch IV", reader.getFoundBarCodes()[3].getCodeText());
            Assert.assertEquals("PatchCode", reader.getFoundBarCodes()[3].getCodeTypeName());
        }
    }

        @Test
    public void testCorrectPatchVI()
    {
            final String filename = "PatchVI.png";
        String fullPath = Global.pathCombine(folder, filename);
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 4);
            Assert.assertEquals("Patch VI", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("PatchCode", reader.getFoundBarCodes()[0].getCodeTypeName());
            Assert.assertEquals("Patch VI", reader.getFoundBarCodes()[1].getCodeText());
            Assert.assertEquals("PatchCode", reader.getFoundBarCodes()[1].getCodeTypeName());
            Assert.assertEquals("Patch VI", reader.getFoundBarCodes()[2].getCodeText());
            Assert.assertEquals("PatchCode", reader.getFoundBarCodes()[2].getCodeTypeName());
            Assert.assertEquals("Patch VI", reader.getFoundBarCodes()[3].getCodeText());
            Assert.assertEquals("PatchCode", reader.getFoundBarCodes()[3].getCodeTypeName());
        }
    }
}

