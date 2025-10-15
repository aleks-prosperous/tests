//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33715.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="10.09.2013 11:08:48">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.BaseEncodeType;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.util.Hashtable;
import java.util.Map;


@Test(description = "Tests for Issue33715.")
public class Issue33715
{
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

        @Test
    public void GenerationNoException()
    {
        for(BaseEncodeType baseEncodeType : getGenerationSymbologies().keySet())
        {
            BarcodeGenerator gen = new BarcodeGenerator(baseEncodeType, getGenerationSymbologies().get(baseEncodeType));
            try
            {
                gen.generateBarCodeImage();
            }
            catch (Exception ex)
            {
                Assert.fail("No exception must be thrown, " + ex.getMessage());
            }
        }
    }

        @Test
    public void GenerationException()
    {
        for(BaseEncodeType baseEncodeType : getGenerationSymbologies().keySet())
        {
            BarcodeGenerator gen = new BarcodeGenerator(baseEncodeType, getGenerationSymbologies().get(baseEncodeType));
            gen.getParameters().getBarcode().setThrowExceptionWhenCodeTextIncorrect(true);
            try
            {
                gen.generateBarCodeImage();
            }
            catch (Exception ex)
            {
                Assert.assertTrue(ex.getMessage().indexOf(baseEncodeType.toString()) > -1);
                Assert.assertTrue(ex.getMessage().indexOf("codetext is invalid") > -1);
            }
        }
    }

    public Map<BaseEncodeType, String> getGenerationSymbologies()
    {
        Hashtable<BaseEncodeType, String> symbologies = new Hashtable<BaseEncodeType, String>();
        symbologies.put(EncodeTypes.CODABAR, "ZCXFE12");
        symbologies.put(EncodeTypes.CODE_11, "CSS33");
        symbologies.put(EncodeTypes.CODE_39, "a55");
        symbologies.put(EncodeTypes.DEUTSCHE_POST_IDENTCODE, "AZ545");
        symbologies.put(EncodeTypes.DEUTSCHE_POST_LEITCODE, "C3434");
        symbologies.put(EncodeTypes.EAN_13, "348503498549085409");
        symbologies.put(EncodeTypes.EAN_8, "XZ3498394");
        symbologies.put(EncodeTypes.EAN_14, "CE");
        symbologies.put(EncodeTypes.SCC_14, "343CE");
        symbologies.put(EncodeTypes.SSCC_18, "657XA2");
        symbologies.put(EncodeTypes.INTERLEAVED_2_OF_5, "XZX23");
        symbologies.put(EncodeTypes.MATRIX_2_OF_5, "4534S");
        symbologies.put(EncodeTypes.MSI, "XZ435");
        symbologies.put(EncodeTypes.OPC, "ZS345");
        symbologies.put(EncodeTypes.PHARMACODE, "99999X9");
        symbologies.put(EncodeTypes.PZN, "Z45");
        symbologies.put(EncodeTypes.STANDARD_2_OF_5, "R674");
        symbologies.put(EncodeTypes.UPCA, "458349085438594035840");
        symbologies.put(EncodeTypes.UPCE, "CXKU544");

        return symbologies;
    }
}

