package com.aspose.external.barcode.tester.releases.v21_4;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import com.aspose.barcode.logger.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static com.aspose.barcode.licensing.LicenseType.Total;

public class BARCODEJAVA1068
{
    private final static String Folder = Global.getBarcodeJavaIssuesTestImagePath("com.aspose.external.barcode.tester.releases.v21_4.BARCODEJAVA1068");

    @BeforeMethod
    public void setUp(Method testMethod)
    {
        utils.LicenseAssistant.setupLicense(Total);
        Logger.methodStarted(getClass().getName() + "." + testMethod.getName());
    }

    @Test(enabled = false)
    public void test() throws Exception {
        BarCodeReader reader = new BarCodeReader();
        reader.setBarCodeImage(Folder + "/6output.jpg");
        reader.setQualitySettings(QualitySettings.getNormalQuality());
        reader.setBarCodeReadType(DecodeType.QR);

        BarCodeResult[] barCodeResult=null;

        try
        {
            barCodeResult=reader.readBarCodes();
        }
        catch (Exception exception)
        {
            barCodeResult=null;
            throw new Exception ("Barcodeservices->BarcodeService->getBarcodes: Exception: "+exception.getMessage()) ;
        }
        finally {
            reader=null;
        }
    }
}
