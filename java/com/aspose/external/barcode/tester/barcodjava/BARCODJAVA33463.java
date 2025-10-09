package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.CodeLocation;
import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.auxiliary.Global;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class BARCODJAVA33463
{
    String folder = Global.getGeneratedImagesFolder("barcodjava_issues" + File.separator + this.getClass().getSimpleName());

    @BeforeMethod
    public void setUp()
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

    @Test
    public void test1() throws IOException
    {
        String companyPrefix = "0614141";
        String offerCode = "654321";
        String checkValue = "1";
        String otherData = "3500110000310123196000";

        String codetext = "8110" + checkValue + companyPrefix + offerCode + otherData;

        BarcodeGenerator builder = new BarcodeGenerator(EncodeTypes.DATABAR_EXPANDED_STACKED, codetext);
        builder.getParameters().getBarcode().getDataBar().setRows(2);

        builder.getParameters().getCaptionAbove().setText(companyPrefix + "-" + offerCode);
        builder.getParameters().getCaptionAbove().setVisible(true);
        builder.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);

        builder.save(folder + "GS1_DataBar_Coupon.jpg");
    }
}
