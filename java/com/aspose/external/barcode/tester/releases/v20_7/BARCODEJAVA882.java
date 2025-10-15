package com.aspose.external.barcode.tester.releases.v20_7;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BARCODEJAVA882
{
    static String sPath = Global.getBarcodeJavaIssuesTestImagePath("BARCODEJAVA882");

    String state = "";

    String aFile;

    BarcodeReader asposeReader = new AsposeReader();

    @Test

    public void Alabama_DL_Test() {

        state = "AL";

        File DL_File = new File(sPath + state + "_DL.jpg");

        String result = asposeReader.decodePDF417(sPath + state + "_DL.jpg", "");

//                        System.out.println(state + ": " + result);

        Assert.assertTrue(result.contains("MONTGOMERY"));

        Assert.assertTrue(result.length() > 10);

        Assert.assertNotNull(DL_File);

    }

    @Test
    public void Arizona_DL_Test() {

        state = "AZ";

        File DL_File = new File(sPath + state + "_DL.jpg");

        String result = asposeReader.decodePDF417(sPath + state + "_DL.jpg", "");

        System.out.println(state + ": " + result);

//                        Assert.assertTrue(result.length() > 10);

        Assert.assertNotNull(DL_File);

    }

    @Test
    public void California_DL_Test() {

        state = "CA";

        File DL_File = new File(sPath + state + "_DL.jpg");

        String result = asposeReader.decodePDF417(sPath + state + "_DL.jpg", "");

        Assert.assertTrue(result.contains("1234 ANY STREET"));

        Assert.assertNotNull(DL_File);

    }

    @Test(enabled = false) //expects to be resolved in .NET
    public void Colorado_DL_Test() {

        state = "CO";

        File DL_File = new File(sPath + state + "_DL.jpg");

        String result = asposeReader.decodePDF417(sPath + state + "_DL.jpg", "");

        System.out.println(state + ": " + result);

        Assert.assertTrue(result.contains("1234 ANY STREET"));

        Assert.assertNotNull(DL_File);

    }

    @Test(enabled = false) //expects to be resolved in .NET
    public void testCO_DL()
    {
        String filePath = sPath + "CO_DL.jpg";

        BarCodeReader reader = new BarCodeReader(filePath, DecodeType.PDF_417);
        for(BarCodeResult res : reader.readBarCodes())
            System.out.println(res.getCodeText());
    }

    @Test(enabled = false) //expects to be resolved in .NET
    public void testMO_DL()
    {
        String filePath = sPath + "MO_DL.jpg";

        BarCodeReader reader = new BarCodeReader(filePath, DecodeType.PDF_417);
        for(BarCodeResult res : reader.readBarCodes())
            System.out.println(res.getCodeText());
    }

    @Test

    public void Florida_New_DL_Test() {

        //new card issue as of 05/19

        state = "FL";

        File DL_File = new File(sPath + state + "_new_DL.jpg");

        String result = asposeReader.decodePDF417(DL_File.getAbsolutePath());

        System.out.println(state + ": " + result);

//                        Assert.assertNotNull(DL_File);

//                        Assert.assertThat(result, CoreMatchers.containsString("TALLAHASSEE"));

    }

    @Test

    public void Florida_Personal_DL_Test() {

        state = "FL";

        File DL_File = new File(sPath + state + "_old_personal_DL.jpg");

        String result = asposeReader.decodePDF417(DL_File.getAbsolutePath());

        System.out.println(state + ": " + result);

        Assert.assertNotNull(DL_File);

//                        Assert.assertThat(result, CoreMatchers.containsString("TALLAHASSEE"));

    }

    @Test

    public void Georgia_DL_Test() {

        state = "GA";

        File DL_File = new File(sPath + state + "_DL.jpg");

        String result = asposeReader.decodePDF417(sPath + state + "_DL.jpg", "");

        System.out.println(state + ": " + result);

        Assert.assertNotNull(DL_File);

        Assert.assertTrue(result.contains("EAST POINT"));

    }

    @Test

    public void Iowa_DL_Test() {

        state = "IA";

        File DL_File = new File(sPath + state + "_DL.jpg");

        String result = asposeReader.decodePDF417(sPath + state + "_DL.jpg", "");

        System.out.println(state + ": " + result);

        Assert.assertNotNull(DL_File);

//                        Assert.assertThat(result, CoreMatchers.containsString("EAST POINT"));

    }

    @Test

    public void Minnesota_DL_Test() {

        state = "MN";

        File DL_File = new File(sPath + state + "_DL.jpg");

        String result = asposeReader.decodePDF417(sPath + state + "_DL.jpg", "");

        System.out.println(state + ": " + result);

        Assert.assertNotNull(DL_File);

//                        Assert.assertThat(result, CoreMatchers.containsString("TRENTON"));

    }

    @Test(enabled = false)
    public void Missouri_DL_Test() {

        state = "MO";

        File DL_File = new File(sPath + state + "_DL.jpg");

        String result = asposeReader.decodePDF417(sPath + state + "_DL.jpg", "");

        System.out.println(state + ": " + result);

        Assert.assertNotNull(DL_File);

        Assert.assertTrue(result.contains("TRENTON"));

    }

    @Test

    public void NewJersey_DL_Test() {

        state = "NJ";

        File DL_File = new File(sPath + state + "_DL.jpg");

        String result = asposeReader.decodePDF417(sPath + state + "_DL.jpg", "");

        Assert.assertNotNull(DL_File);

        Assert.assertTrue(result.contains("TRENTON"));

    }

    @Test

    public void Washington_DL_Test() {

        state = "WA";

        File DL_File = new File(sPath + state + "_DL.jpg");

        String result = asposeReader.decodePDF417(sPath + state + "_DL.jpg", "");

        Assert.assertTrue(result.contains("SEATTLE"));

        Assert.assertNotNull(DL_File);

    }

    /* not properly executing */



    @Test

    public void NewYork_DL_Test() {

        state = "NY";

        File DL_File = new File(sPath + state + "_DL.jpg");

        String result = asposeReader.decodePDF417(sPath + state + "_DL.jpg", "");

//                Assert.assertThat(result, CoreMatchers.containsString("1234 ANY STREET"));

        Assert.assertNotNull(DL_File);

    }

    @Test(enabled = false)
    public void Wisconsin_DL_Test() {

        state = "WI";

        File DL_File = new File(sPath + state + "_DL.jpg");

        String result = asposeReader.decodePDF417(sPath + state + "_DL.jpg", "");

        Assert.assertTrue(result.length() > 10);

        Assert.assertNotNull(DL_File);

    }

    @Test(enabled = false)
    public void testWI_DL()
    {
        String filePath = sPath + "WI_DL.jpg";

        BarCodeReader reader = new BarCodeReader(filePath, DecodeType.PDF_417);
        for(BarCodeResult res : reader.readBarCodes())
            System.out.println(res.getCodeText());
    }
}

class AsposeReader extends BarcodeReader
{

    BarCodeReader reader;

    @Override

    public String decodePDF417(String srcImgFilePath, String tmpFileFolder) {

        File srcFile = new File(srcImgFilePath);

        String returnValue = "";

        String sReaderValue = "";



        try {

            BufferedImage image = ImageIO.read(srcFile);

            reader = new BarCodeReader(image, DecodeType.PDF_417);
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);



            for(BarCodeResult result : reader.readBarCodes()) {

                sReaderValue = result.getCodeText();

                returnValue += sReaderValue;

            }

        } catch (IOException e) {

            e.printStackTrace();

        }

        return returnValue;

    }

}

abstract class BarcodeReader {

    final static int maxWidth = 3000;

    final static int maxHeight = 3000;

    private static boolean isLoaded = false;



    public String decodePDF417(String srcImgFilePath) {

        return decodePDF417(srcImgFilePath, "");

    }



    public abstract String decodePDF417(String srcImgFilePath, String tmpFileFolder);



    BarcodeReader (){

        if(BarcodeReader.isLoaded == false) {

            BarcodeReader.isLoaded = BarcodeReader.applyLicense();

        }

    }



    private static boolean applyLicense() {

        boolean loaded = false;

        String licensePath = "";

        LicenseAssistant.setupLicense();

        return loaded;

    }



}


