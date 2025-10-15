package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;


/**
 * <p>
 * Tests Issue34115 tests. Can't recognize QR codes using error correction level
 * </p>
 */
@Test(description = "Tests for Issue34115.")
public class Issue34115
{

    /**
     * <p>
     * Path to generatedFolder with files for testing.
     * </p>
     */
    private static final String folder = Global.getTestDataFolder("Issues/Issue34115");

    /**
     * <p>
     * Prepares to run these tests.
     * </p>
     */
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    /// <summary>
/// Recognize bad QR code (extracted from the pfd file)
/// </summary>
    @Test
    public void testQr01()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "qr01.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("e2837e7a-ce1c-4703-927e-5d88fe8323b6", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    /// <summary>
    /// Recognize bad QR code (extracted from the pfd file)
    /// </summary>
    @Test
    public void testQr02()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "qr02.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("78c1c4b7-1123-411e-9931-513c8d715402", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    /// <summary>
    /// Recognize bad QR code (extracted from the pfd file)
    /// </summary>
    @Test
    public void testQr03()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "qr03.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1af52c03-45fa-47cd-8887-298003df4b08", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    /// <summary>
    /// Recognize bad QR code (extracted from the pfd file)
    /// </summary>
    @Test
    public void testQr04()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "qr04.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("b4f68f1c-c102-4dc8-8e7c-c4c65ae00c8f", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    /// <summary>
    /// Recognize bad QR code (extracted from the pfd file)
    /// </summary>
    @Test
    public void testQr05()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "qr05.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("cf25c8a5-1ee3-4c7a-8443-829e8a485f06", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    /// <summary>
    /// Recognize bad QR code (extracted from the pfd file)
    /// </summary>
    @Test
    public void testQr06()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "qr06.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("10b32427-f9f0-4212-bd71-eb9859db47e1", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    /// <summary>
    /// Recognize bad QR code (extracted from the pfd file)
    /// </summary>
    @Test
    public void testQr07()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "qr07.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("6cbcb083-f8eb-447b-9edc-85a8a1a0ae94", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    /// <summary>
    /// Generate as the custumer and recognize bad QR codes
    /// </summary>
    @Test
    public void testgenerateAndRecognizeQRs() throws IOException
    {
        // with levelQ
        generateAndRecognizeQR(true, "78c1c4b7-1123-411e-9931-513c8d715402");
        generateAndRecognizeQR(true, "e2837e7a-ce1c-4703-927e-5d88fe8323b6");
        generateAndRecognizeQR(true, "6cbcb083-f8eb-447b-9edc-85a8a1a0ae94");
        generateAndRecognizeQR(true, "b4f68f1c-c102-4dc8-8e7c-c4c65ae00c8f");

        //without levelQ
        generateAndRecognizeQR(false, "10b32427-f9f0-4212-bd71-eb9859db47e1");
        generateAndRecognizeQR(false, "cf25c8a5-1ee3-4c7a-8443-829e8a485f06");
        generateAndRecognizeQR(false, "1af52c03-45fa-47cd-8887-298003df4b08");
    }

    /// <summary>
/// Check if we can't recognize picture
/// </summary>
/// <param name="isLevelQ">true if QR error level Q</param>
/// <param name="codetext">a codetext</param>
    private void generateAndRecognizeQR(boolean isLevelQ, String codetext) throws IOException
    {
        float xDimension = 2F;
        int barHeight = 20;

        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.QR);
        gen.getParameters().getBarcode().getBarHeight().setPixels(barHeight);
        gen.getParameters().setAutoSizeMode(AutoSizeMode.INTERPOLATION);
        gen.getParameters().getImageHeight().setPixels(400);
        gen.getParameters().getImageWidth().setPixels(390);

        gen.getParameters().setResolution(150);

        if (isLevelQ)
        {
            gen.getParameters().getBarcode().getQR().setQrErrorLevel(QRErrorLevel.LEVEL_Q);
        }

        gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.ABOVE);
        gen.setCodeText(codetext);
        gen.getParameters().getCaptionAbove().setVisible(false);
        gen.getParameters().getCaptionBelow().setVisible(false);
        gen.getParameters().getBarcode().getXDimension().setPixels(xDimension);

        BufferedImage bmp = gen.generateBarCodeImage();

        ByteArrayOutputStream os = new ByteArrayOutputStream();
        ImageIO.write(bmp, "PNG", os);
        ByteArrayInputStream stream = new ByteArrayInputStream(os.toByteArray());


        BarCodeReader reader = new BarCodeReader(stream, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
    }
}

