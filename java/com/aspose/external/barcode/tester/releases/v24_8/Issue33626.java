package com.aspose.external.barcode.tester.releases.v24_8;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import helpers.FrameworkTestUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class Issue33626
{
    /// <summary>
    /// Path to folder with files for testing Issue33626.
    /// </summary>
    private final static String Folder = Global.getTestDataFolder("Issues\\Issue33626");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    /// <summary>
    /// Tests of generation Databar Stacked.
    /// </summary>
    @Test(enabled = true) //TODO BARCODEJAVA-1949
    public void testGenerationDatabarStacked() throws IOException
    {
        FrameworkTestUtils.generateAndCompare(Generator_Of_TestGenerationDatabarStacked(), Folder, "stacked01_scaled2x.png");
    }
    private BarcodeGenerator Generator_Of_TestGenerationDatabarStacked()
    {
        return new BarcodeGenerator(EncodeTypes.DATABAR_STACKED, "(01)00012345678905");
    }

    /// <summary>
    /// Tests of generation Databar Stacked OmniDirectional.
    /// </summary>
    @Test(enabled = true) //TODO BARCODEJAVA-1949
    public void testGenerationDatabarStackedOmniDirectional() throws IOException
    {
        FrameworkTestUtils.generateAndCompare(Generator_Of_TestGenerationDatabarStackedOmniDirectional(), Folder, "stackedomnidirectional01_scaled2x.png");
    }

    private BarcodeGenerator Generator_Of_TestGenerationDatabarStackedOmniDirectional()
    {
        return new BarcodeGenerator(EncodeTypes.DATABAR_STACKED_OMNI_DIRECTIONAL, "(01)00034567890125");
    }
}
