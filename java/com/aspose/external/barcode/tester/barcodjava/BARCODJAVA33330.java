package com.aspose.external.barcode.tester.barcodjava;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//import com.aspose.barcode.barcoderecognition.imaging.BinarizedBitmap;

@Test
public class BARCODJAVA33330
{
    @BeforeClass
    public void setLicense() throws Exception
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

//    @Test
//    public void testConstructors()
//    {
//    	try {
//    		String fileName = "src/test/resources/testdata/BarCodeRelease/BARCODJAVA33337/00000001.TIF";
//
//    		BufferedImage bufferedImage = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
//    		Rectangle section = new Rectangle(100, 100);
//    		BinarizedBitmap binarizedBitmap = new BinarizedBitmap(bufferedImage, section);
//
//    		new BarCodeReader(bufferedImage);
//    		new BarCodeReader(bufferedImage, DecodeType.DATA_MATRIX);
//    		new BarCodeReader(binarizedBitmap);
//    		new BarCodeReader(binarizedBitmap, DecodeType.DATA_MATRIX);
//    		new BarCodeReader(bufferedImage, section, DecodeType.DATA_MATRIX);
//    	}
//    	catch (Exception e) {
//    		Assert.fail("Exception", e);
//    	}
//    }
}
