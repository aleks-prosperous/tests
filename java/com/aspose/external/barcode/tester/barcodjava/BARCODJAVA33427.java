package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BARCODJAVA33427
{
    String Folder = Global.getBarcodeJavaIssuesTestImagePath(this.getClass().getSimpleName());
    String IMAGE_OK = Global.pathCombine(Folder, "BarcodeOk.jpg");
    String IMAGE_FAIL =
            Global.pathCombine(Folder, "BarcodeFail.jpg");

    @BeforeClass
    public void setLicense() throws Exception
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

    @Test
    public void testDetectBarCode_FAIL() throws Exception
    {
        //System.out.println(IMAGE_FAIL);

        BarCodeReader reader = new BarCodeReader(IMAGE_FAIL, DecodeType.ALL_SUPPORTED_TYPES);

        if (reader != null)
        {
            for (BarCodeResult result : reader.readBarCodes())
            {

                Assert.assertNotNull(result.getCodeText());
                Assert.assertNotNull(result.getCodeType());
            }

        }
    }

//  @Test
//  public void testDetectBarCode_OK() throws Exception
//  {
//	  //System.out.println(IMAGE_OK);
//
//      BarCodeReader reader = new BarCodeReader(IMAGE_OK, DecodeType.ALL_SUPPORTED_TYPES);
//
//      if (reader != null)
//      {
//          for (BarCodeResult result : reader.readBarCodes())
//          {
//
//              Assert.assertNotNull(result.getCodeText());
//              Assert.assertNotNull(result.getCodeType());
//          }
//
//      }
//  }
}

