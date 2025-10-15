package com.aspose.external.barcode.tester.releases.v23_4;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.CodeLocation;
import com.aspose.barcode.generation.EncodeTypes;
import helpers.FrameworkTestUtils;
import helpers.IOTestUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;
import utils.TestExternalHelper;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Issue38360 {
    private static final String Folder = Global.getTestDataFolder("Issues\\Issue38360");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_code128NoAntiAlias0Angle_PNG() throws IOException {
        compareBarcodePNG(new Code128GenBarcode(false, 0), "code128NoAntiAlias0Angle.png");
    }

    @Test
    public void test_code128NoAntiAlias30Angle_PNG() throws IOException {
        compareBarcodePNG(new Code128GenBarcode(false, 30), "code128NoAntiAlias30Angle.png");
    }

    @Test
    public void test_code128AntiAlias0Angle_PNG() throws IOException {
        compareBarcodePNG(new Code128GenBarcode(true, 0), "code128AntiAlias0Angle.png");
    }

    @Test
    public void test_code128AntiAlias30Angle_PNG() throws IOException {
        compareBarcodePNG(new Code128GenBarcode(true, 30), "code128AntiAlias30Angle.png");
    }

    @Test
    public void test_datamatrixNoAntiAlias0Angle_PNG() throws IOException {
        compareBarcodePNG(new DataMatrixGenBarcode(false, 0), "datamatrixNoAntiAlias0Angle.png");
    }

    @Test
    public void test_datamatrixNoAntiAlias30Angle_PNG() throws IOException {
        compareBarcodePNG(new DataMatrixGenBarcode(false, 30), "datamatrixNoAntiAlias30Angle.png");
    }

    @Test
    public void test_datamatrixAntiAlias0Angle_PNG() throws IOException {
        compareBarcodePNG(new DataMatrixGenBarcode(true, 0), "datamatrixAntiAlias0Angle.png");
    }

    @Test
    public void test_datamatrixAntiAlias30Angle_PNG() throws IOException {
        compareBarcodePNG(new DataMatrixGenBarcode(true, 30), "datamatrixAntiAlias30Angle.png");
    }

    private interface IGenBarcode {
        ByteArrayOutputStream generateBarcodeImage(BarCodeImageFormat format) throws IOException;
    }

    private class Code128GenBarcode implements IGenBarcode {
        private boolean _useAntiAlias;
        private float _rotationAngle;

        public Code128GenBarcode(boolean useAntiAlias, float rotationAngle) {
            _useAntiAlias = useAntiAlias;
            _rotationAngle = rotationAngle;
        }

        public ByteArrayOutputStream generateBarcodeImage(BarCodeImageFormat format) throws IOException {
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.CODE_128, "Aspose.Barcode");
            {
                gen.getParameters().getBarcode().getXDimension().setPixels(2);
                gen.getParameters().setUseAntiAlias(_useAntiAlias);
                if (0 != _rotationAngle)
                    gen.getParameters().setRotationAngle(_rotationAngle);

                ByteArrayOutputStream ms = new ByteArrayOutputStream();
                gen.save(ms, format);
//                ms.Position = 0;
                return ms;
            }
        }
    }

    private class DataMatrixGenBarcode implements IGenBarcode {
        private boolean _useAntiAlias;
        private float _rotationAngle;

        public DataMatrixGenBarcode(boolean useAntiAlias, float rotationAngle) {
            _useAntiAlias = useAntiAlias;
            _rotationAngle = rotationAngle;
        }

        public ByteArrayOutputStream generateBarcodeImage(BarCodeImageFormat format) throws IOException {
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, "Aspose.Barcode");
            {
                gen.getParameters().getBarcode().getXDimension().setPixels(4);
                gen.getParameters().setUseAntiAlias(_useAntiAlias);
                if (0 != _rotationAngle)
                    gen.getParameters().setRotationAngle(_rotationAngle);
                gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.BELOW);

                ByteArrayOutputStream ms = new ByteArrayOutputStream();
                gen.save(ms, format);
//                ms.Position = 0;
                return ms;
            }
        }
    }

    private void compareBarcodePNG(IGenBarcode barcode, String filename) throws IOException
    {
        String lpath = FrameworkTestUtils.addFrameworkPostFixToFileName(Global.pathCombine(Folder, filename));
        InputStream ms = IOTestUtils.loadToMemoryStreamExternal(lpath);

        BufferedImage expected = ImageIO.read(ms);
        BufferedImage real =  ImageIO.read(new ByteArrayInputStream(barcode.generateBarcodeImage(BarCodeImageFormat.PNG).toByteArray()));
        TestExternalHelper.compareBitmaps(expected, real);
    }

    private void storeBarcodePNG(IGenBarcode barcode, String filename) throws IOException {
        storeBarcode(barcode, filename, BarCodeImageFormat.PNG);
    }

    private void storeBarcodeEMF(IGenBarcode barcode, String filename) throws IOException {
        storeBarcode(barcode, filename, BarCodeImageFormat.EMF);
    }

    private void storeBarcode(IGenBarcode barcode, String filename, BarCodeImageFormat format) throws IOException
    {
        File lpath = new File(FrameworkTestUtils.addFrameworkPostFixToFileName(Global.pathCombine(Folder, filename)));
        if (!Files.exists(lpath.getParentFile().toPath()))
        {
            Files.createDirectories(Paths.get(lpath.getParent()));
        }
        IOTestUtils.saveMemoryStreamToFile(lpath.getAbsolutePath(), new ByteArrayInputStream(barcode.generateBarcodeImage(format).toByteArray()));
    }
}
