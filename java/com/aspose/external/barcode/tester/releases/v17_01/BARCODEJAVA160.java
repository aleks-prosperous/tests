package com.aspose.external.barcode.tester.releases.v17_01;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.CodeLocation;
import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.logger.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

public class BARCODEJAVA160
{
    private final String genertedFolder = Global.getGeneratedImagesFolder("barcodjava_issues" + File.separator + "BARCODEJAVA160");

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
    public void test1() throws IOException
    {
        BarcodeGenerator objBuilder = new BarcodeGenerator(EncodeTypes.GS_1_DATA_MATRIX);
        objBuilder.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
        objBuilder.setCodeText("(01)99312650999998(91)T77000126101000600209(420)3000(92)47609364(8008)140123142938");

        objBuilder.save(genertedFolder + "createBarcode_818454.png", BarCodeImageFormat.PNG);

        String expectedResult = "<FNC1>019931265099999891T77000126101000600209<FNC1>4203000<FNC1>9247609364<FNC1>8008140123142938";
        BarCodeReader reader = new BarCodeReader(genertedFolder + "createBarcode_818454.png", DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(reader.readBarCodes()[0].getCodeText(), expectedResult);

    }
}
