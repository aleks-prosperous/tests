package com.aspose.external.barcode.tester.releases.v73;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.DataMatrixEncodeMode;
import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.logger.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;

public class BARCODJAVA33551
{
    private final String folder = Global.getGeneratedImagesFolder("barcodjava_issues" + File.separator + "BARCODJAVA33551");

    @AfterMethod
    public void afterFinish(Method testMethod)
    {
        Logger.methodFinished(getClass().getName() + "." + testMethod.getName());
    }

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }


    @Test
    public void testIssue() throws IOException
    {
        BarcodeGenerator b = new BarcodeGenerator(EncodeTypes.DATA_MATRIX);
        b.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(DataMatrixEncodeMode.BYTES);
        b.setCodeText("öäüéàè", StandardCharsets.UTF_8);
        b.save(folder + File.separator + "test_datamatrix_java.bmp", BarCodeImageFormat.BMP);
    }
}
