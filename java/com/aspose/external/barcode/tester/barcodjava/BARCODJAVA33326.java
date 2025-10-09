package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

@Test
public class BARCODJAVA33326
{
    String Folder = Global.getBarcodeJavaIssuesTestImagePath(this.getClass().getSimpleName());

    @BeforeClass
    public void setLicense() throws Exception
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

    @Test
    public void testOne()
    {
        try
        {
            String fileName = Global.pathCombine(Folder, "Image-001.png");

            InputStream stream = new FileInputStream(fileName);
            BarCodeReader reader = new BarCodeReader(stream, DecodeType.PDF_417);
            int counter = 0;
            for (BarCodeResult result : reader.readBarCodes())
            {
                counter++;
                Assert.assertNotNull(result.getCodeText());
                Assert.assertNotNull(result.getCodeType());
            }
            
            Assert.assertTrue(counter > 0);

        } catch (Exception e)
        {
            Assert.fail("Exception", e);
        }
    }

    @Test
    public void testTwo()
    {
        try
        {
            String fileName = Global.pathCombine(Folder, "Image-001.png");

            InputStream stream = new FileInputStream(fileName);
            BarCodeReader reader = new BarCodeReader(stream);
            int counter = 0;
            for (BarCodeResult result : reader.readBarCodes())
            {
                counter++;
                Assert.assertNotNull(result.getCodeText());
                Assert.assertNotNull(result.getCodeType());
            }
            
            Assert.assertTrue(counter > 0);

        } catch (Exception e)
        {
            Assert.fail("Exception", e);
        }
    }

    @Test
    public void testThree()
    {
        try
        {
            String fileName = Global.pathCombine(Folder, "Image-001.png");

            BufferedImage image = ImageIO.read(new File(fileName));
            BarCodeReader reader = new BarCodeReader(image, new Rectangle(0, 0, 100, 50), DecodeType.PDF_417);
            int counter = 0;
            for (BarCodeResult result : reader.readBarCodes())
            {
                counter++;
                Assert.assertNotNull(result.getCodeText());
                Assert.assertNotNull(result.getCodeType());
            }
            
            Assert.assertTrue(counter > 0);

        } catch (Exception e)
        {
            Assert.fail("Exception", e);
        }
    }

//    @Test
//    public void testFour()
//    {
//    	try {
//    		String fileName = "src/test/resources/testdata/BarCodeRelease/BARCODJAVA33326/Image-001.png";
//
//    		InputStream stream = new FileInputStream(fileName);
//    		BinarizedBitmap image = new BinarizedBitmap(ImageIO.read(stream), new Rectangle(0, 0, 100, 50));
//    		BarCodeReader reader = new BarCodeReader(image, DecodeType.PDF_417);
//    		int counter = 0;
//    		for (BarCodeResult result : reader.readBarCodes())
//            {
//    			counter ++;
//    			Assert.assertNotNull(result.getCodeText());
//    			Assert.assertNotNull(result.getCodeType());
//            }
//            
//            Assert.assertTrue(counter > 0);
//
//    	}
//    	catch (Exception e) {
//    		Assert.fail("Exception", e);
//    	}
//    }
}
