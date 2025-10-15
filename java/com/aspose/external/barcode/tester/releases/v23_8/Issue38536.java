package com.aspose.external.barcode.tester.releases.v23_8;

import com.aspose.barcode.BarCodeException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue38536
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
    public void ComplexCodetextReader_EmptyCodetext() {
        HIBCLICComplexCodetext result = ComplexCodetextReader.tryDecodeHIBCLIC("");
        Assert.assertNull(result);
    }

    @Test
    public void ComplexCodetextReader_NullCodetext()
    {
        HIBCLICComplexCodetext result = ComplexCodetextReader.tryDecodeHIBCLIC(null);
        Assert.assertNull(result);
    }

    @Test
    public void ComplexCodetextReader_CodetextTooShort()
    {
        String constructedCodetext = "+";
        HIBCLICComplexCodetext result = ComplexCodetextReader.tryDecodeHIBCLIC(constructedCodetext);
        Assert.assertNull(result);
    }

    @Test
    public void ComplexCodetextReader_SecondCharacterIsNeitherDigitNorUppercaseLetter()
    {
        String encodedCodetext = "+-12345678901234/";
        HIBCLICComplexCodetext result = ComplexCodetextReader.tryDecodeHIBCLIC(encodedCodetext);
        Assert.assertNull(result);
    }

    @Test
    public void HIBCLICCombinedCodetext_CodetextIsNull()
    {
        String constructedCodetext = null;
        HIBCLICCombinedCodetext codetext = new HIBCLICCombinedCodetext();
        Assert.assertThrows(BarCodeException.class, () -> codetext.initFromString (constructedCodetext));
    }

    @Test
    public void HIBCLICCombinedCodetext_CodetextIsEmpty()
    {
        String constructedCodetext = "";
        HIBCLICCombinedCodetext codetext = new HIBCLICCombinedCodetext();
        Assert.assertThrows(BarCodeException.class, () -> codetext.initFromString (constructedCodetext));
    }

    @Test
    public void HIBCLICCombinedCodetext_CodetextIsTooShort()
    {
        String constructedCodetext = "+";
        HIBCLICCombinedCodetext codetext = new HIBCLICCombinedCodetext();
        Assert.assertThrows(BarCodeException.class, () -> codetext.initFromString (constructedCodetext));
    }

    @Test
    public void HIBCLICCombinedCodetext_ConstructedCodetextDoesNotStartWithPlusSymbol()
    {
        String constructedCodetext = "1234";
        HIBCLICCombinedCodetext codetext = new HIBCLICCombinedCodetext();
        Assert.assertThrows(BarCodeException.class, () -> codetext.initFromString (constructedCodetext));
    }

    @Test
    public void HIBCLICCombinedCodetext_ChecksumIsIncorrect()
    {
        String constructedCodetext = "+12345678901234X";
        HIBCLICCombinedCodetext codetext = new HIBCLICCombinedCodetext();
        Assert.assertThrows(BarCodeException.class, () -> codetext.initFromString (constructedCodetext));
    }

    @Test
    public void HIBCLICPrimaryDataCodetext_CodetextIsNull()
    {
        String constructedCodetext = null;
        HIBCLICPrimaryDataCodetext codetext = new HIBCLICPrimaryDataCodetext();
        Assert.assertThrows(BarCodeException.class, () -> codetext.initFromString (constructedCodetext));
    }

    @Test
    public void HIBCLICPrimaryDataCodetext_CodetextIsEmpty()
    {
        String constructedCodetext = "";
        HIBCLICPrimaryDataCodetext codetext = new HIBCLICPrimaryDataCodetext();
        Assert.assertThrows(BarCodeException.class, () -> codetext.initFromString (constructedCodetext));
    }

    @Test
    public void HIBCLICPrimaryDataCodetext_CodetextIsTooShort()
    {
        String constructedCodetext = "+";
        HIBCLICPrimaryDataCodetext codetext = new HIBCLICPrimaryDataCodetext();
        Assert.assertThrows(BarCodeException.class, () -> codetext.initFromString (constructedCodetext));
    }

    @Test
    public void HIBCLICPrimaryDataCodetext_ChecksumIsIncorrect()
    {
        String constructedCodetext = "+12345678901234X";
        HIBCLICPrimaryDataCodetext codetext = new HIBCLICPrimaryDataCodetext();
        Assert.assertThrows(BarCodeException.class, () -> codetext.initFromString (constructedCodetext));
    }

    @Test
    public void HIBCLICPrimaryDataCodetext_CodetextDoesNotStartWithPlusSymbol()
    {
        String constructedCodetext = "1234";
        HIBCLICPrimaryDataCodetext codetext = new HIBCLICPrimaryDataCodetext();
        Assert.assertThrows(BarCodeException.class, () -> codetext.initFromString (constructedCodetext));
    }

    @Test
    public void HIBCLICSecondaryAndAdditionalDataCodetext_CodetextIsNull()
    {
        String constructedCodetext = null;
        HIBCLICSecondaryAndAdditionalDataCodetext codetext = new HIBCLICSecondaryAndAdditionalDataCodetext();
        Assert.assertThrows(BarCodeException.class, () -> codetext.initFromString (constructedCodetext));
    }

    @Test
    public void HIBCLICSecondaryAndAdditionalDataCodetext_ConstructedCodetextIsEmpty()
    {
        String constructedCodetext = "";
        HIBCLICSecondaryAndAdditionalDataCodetext codetext = new HIBCLICSecondaryAndAdditionalDataCodetext();
        Assert.assertThrows(BarCodeException.class, () -> codetext.initFromString (constructedCodetext));
    }

    @Test
    public void HIBCLICSecondaryAndAdditionalDataCodetext_CodetextIsTooShort()
    {
        String constructedCodetext = "+/";
        HIBCLICSecondaryAndAdditionalDataCodetext codetext = new HIBCLICSecondaryAndAdditionalDataCodetext();
        Assert.assertThrows(BarCodeException.class, () -> codetext.initFromString (constructedCodetext));
    }

    @Test
    public void HIBCLICSecondaryAndAdditionalDataCodetext_CodetextDoesNotStartWithPlusSymbol()
    {
        String constructedCodetext = "1234";
        HIBCLICSecondaryAndAdditionalDataCodetext codetext = new HIBCLICSecondaryAndAdditionalDataCodetext();
        Assert.assertThrows(BarCodeException.class, () -> codetext.initFromString (constructedCodetext));
    }

    @Test
    public void HIBCLICSecondaryAndAdditionalDataCodetext_ChecksumIsIncorrect()
    {
        String constructedCodetext = "+12345678901234X";
        HIBCLICSecondaryAndAdditionalDataCodetext codetext = new HIBCLICSecondaryAndAdditionalDataCodetext();
        Assert.assertThrows(BarCodeException.class, () -> codetext.initFromString (constructedCodetext));
    }

    @Test
    public void HIBCPASCodetext_CodetextIsNull()
    {
        // Arrange
        HIBCPASCodetext hibcPASCodetext = new HIBCPASCodetext();
        String constructedCodetext = null;

        // Act & Assert
        Assert.assertThrows(BarCodeException.class, () -> hibcPASCodetext.initFromString (constructedCodetext));
    }

    @Test
    public void HIBCPASCodetext_CodetextIsEmpty()
    {
        // Arrange
        HIBCPASCodetext hibcPASCodetext = new HIBCPASCodetext();
        String constructedCodetext = "";

        // Act & Assert
        Assert.assertThrows(BarCodeException.class, () -> hibcPASCodetext.initFromString (constructedCodetext));
    }

    @Test
    public void HIBCPASCodetext_CodetextDoesNotStartWithPlusSlash()
    {
        // Arrange
        HIBCPASCodetext hibcPASCodetext = new HIBCPASCodetext();
        String constructedCodetext = "1234";

        // Act & Assert
        Assert.assertThrows(BarCodeException.class, () -> hibcPASCodetext.initFromString (constructedCodetext));
    }

    @Test
    public void HIBCPASCodetext_ChecksumIsIncorrect()
    {
        // Arrange
        HIBCPASCodetext hibcPASCodetext = new HIBCPASCodetext();
        String constructedCodetext = "+/A1232";

        // Act & Assert
        Assert.assertThrows(BarCodeException.class, () -> hibcPASCodetext.initFromString (constructedCodetext));
    }

    @Test
    public void HIBCPASCodetext_DataLocationIsInvalid()
    {
        // Arrange
        HIBCPASCodetext hibcPASCodetext = new HIBCPASCodetext();
        String constructedCodetext = "+/Y123451";

        // Act & Assert
        Assert.assertThrows(BarCodeException.class, () -> hibcPASCodetext.initFromString (constructedCodetext));
    }

    @Test
    public void HIBCPASCodetext_DataTypeIsInvalid()
    {
        // Arrange
        HIBCPASCodetext hibcPASCodetext = new HIBCPASCodetext();
        String constructedCodetext = "+/A123/BX9";

        // Act & Assert
        Assert.assertThrows(BarCodeException.class, () -> hibcPASCodetext.initFromString (constructedCodetext));
    }

    @Test
    public void HIBCPASCodetext_CodetextIsValid()
    {
        // Arrange
        HIBCPASCodetext hibcPASCodetext = new HIBCPASCodetext();
        String constructedCodetext = "+/ABX/CY6";

        // Act
        hibcPASCodetext.initFromString (constructedCodetext);

        // Assert
        Assert.assertEquals(HIBCPASDataLocation.PATIENT, hibcPASCodetext.getDataLocation());
        Assert.assertEquals(HIBCPASDataType.SERVICE_IDENTIFICATION, hibcPASCodetext.getRecords().get(0).getDataType());
        Assert.assertEquals(HIBCPASDataType.PATIENT_IDENTIFICATION, hibcPASCodetext.getRecords().get(1).getDataType());
        Assert.assertEquals("X", hibcPASCodetext.getRecords().get(0).getData());
        Assert.assertEquals("Y", hibcPASCodetext.getRecords().get(1).getData());
    }
}
