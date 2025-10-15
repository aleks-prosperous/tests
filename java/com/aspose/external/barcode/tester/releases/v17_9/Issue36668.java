package com.aspose.external.barcode.tester.releases.v17_9;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

public class Issue36668
{
    private final String Folder = Global.getTestDataFolder("Issues" + File.separatorChar + "Issue36668");
    private final String generatedFolder = Global.getGeneratedImagesFolder("Issues" + File.separatorChar + "Issue36668");

    /**
     * <p>
     * Prepares to run these tests.
     * </p>
     */
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testBarCodeReaderExportImportFile()
    {
        String fileName = Global.pathCombine(Folder, "sample.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX, DecodeType.AZTEC);
        {
            reader.getQualitySettings().setXDimension(XDimensionMode.USE_MINIMAL_X_DIMENSION);
            reader.getQualitySettings().setMinimalXDimension(4);
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
            reader.getQualitySettings().setInverseImage(InverseImageMode.ENABLED);
            reader.getQualitySettings().setComplexBackground(ComplexBackgroundMode.ENABLED);
            reader.getQualitySettings().setAllowIncorrectBarcodes(true);

            reader.exportToXml(Global.getTempFolder("Issue36668_reader.xml"));
        }

        reader = BarCodeReader.importFromXml(Global.getTempFolder("Issue36668_reader.xml"));
        {
            Assert.assertEquals(reader.getQualitySettings().getXDimension(), XDimensionMode.USE_MINIMAL_X_DIMENSION);
            Assert.assertEquals(reader.getQualitySettings().getMinimalXDimension(), 4f);
            Assert.assertEquals(reader.getQualitySettings().getBarcodeQuality(), BarcodeQualityMode.LOW);
            Assert.assertEquals(reader.getQualitySettings().getDeconvolution(), DeconvolutionMode.SLOW);
            Assert.assertEquals(reader.getQualitySettings().getInverseImage(), InverseImageMode.ENABLED);
            Assert.assertEquals(reader.getQualitySettings().getComplexBackground(), ComplexBackgroundMode.ENABLED);
            Assert.assertEquals(reader.getQualitySettings().getAllowIncorrectBarcodes(), true);
        }
    }

    @Test
    public void testBarCodeReaderExportImportStream() throws IOException {
        String fileName = Global.pathCombine(Folder, "sample.png");
        ByteArrayOutputStream mstr = new ByteArrayOutputStream();
        {
            BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX, DecodeType.AZTEC);
            {
                reader.getQualitySettings().setXDimension(XDimensionMode.USE_MINIMAL_X_DIMENSION);
                reader.getQualitySettings().setMinimalXDimension(4);
                reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
                reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
                reader.getQualitySettings().setInverseImage(InverseImageMode.ENABLED);
                reader.getQualitySettings().setComplexBackground(ComplexBackgroundMode.ENABLED);
                reader.getQualitySettings().setAllowIncorrectBarcodes(true);
                reader.exportToXml(mstr);
            }

            reader = BarCodeReader.importFromXml(new ByteArrayInputStream(mstr.toByteArray()));
            {
                Assert.assertEquals(reader.getQualitySettings().getXDimension(), XDimensionMode.USE_MINIMAL_X_DIMENSION);
                Assert.assertEquals(reader.getQualitySettings().getMinimalXDimension(), 4f);
                Assert.assertEquals(reader.getQualitySettings().getBarcodeQuality(), BarcodeQualityMode.LOW);
                Assert.assertEquals(reader.getQualitySettings().getDeconvolution(), DeconvolutionMode.SLOW);
                Assert.assertEquals(reader.getQualitySettings().getInverseImage(), InverseImageMode.ENABLED);
                Assert.assertEquals(reader.getQualitySettings().getComplexBackground(), ComplexBackgroundMode.ENABLED);
                Assert.assertEquals(reader.getQualitySettings().getAllowIncorrectBarcodes(), true);
            }
        }
    }
}
