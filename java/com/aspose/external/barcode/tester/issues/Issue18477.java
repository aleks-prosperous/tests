package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.DeconvolutionMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Issue18477
{
    final static String folder = Global.getTestDataFolder("Issues\\Issue18477");

        @BeforeMethod
    public void SetUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("DataMatrix")]
    public void testFirstPage()
    {
        String fileName = Global.pathCombine(folder, "first_page.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0123456789071C71D05-817A-4d9b-B80D-05EB86109C4C;0;20100711;;;Customer;none;1;20100711;20100711 ;;SD;no batch id;;;indexvalues;_Company=_Other;_DocDate=7/12/2010;DD9E491D-C47B-4b1d-9814-1401BF9F2F0D;Parent;5d518f28-d69b-41e8-abd4-629b6f3f352d;Section Information:;Section=Section A;", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void testDocument1() throws IOException
        {
        List<BufferedImage> bitmaps = getBitmap(Global.pathCombine(folder, "Section+Separator(A4%26200DPI)"));
        List<String> values = new ArrayList<String>();
        values.add("0123456789071C71D05-817A-4d9b-B80D-05EB86109C4C;0;20100711;;;Customer;none;1;20100711;20100711 ;;SD;no batch id;;;indexvalues;_Company=_Other;_DocDate=7/12/2010;DD9E491D-C47B-4b1d-9814-1401BF9F2F0D;Parent;5d518f28-d69b-41e8-abd4-629b6f3f352d;Section Information:;Section=Section A;");
                values.add("0123456789071C71D05-817A-4d9b-B80D-05EB86109C4C;0;20100711;;;Customer;none;1;20100711;20100711 ;;SD;no batch id;;;indexvalues;_Company=_Other;_DocDate=7/12/2010;DD9E491D-C47B-4b1d-9814-1401BF9F2F0D;Parent;5d518f28-d69b-41e8-abd4-629b6f3f352d;Section Information:;Section=Section B;");
                        values.add("0123456789071C71D05-817A-4d9b-B80D-05EB86109C4C;0;20100711;;;Customer;none;1;20100711;20100711 ;;SD;no batch id;;;indexvalues;_Company=_Other;_DocDate=7/12/2010;DD9E491D-C47B-4b1d-9814-1401BF9F2F0D;Parent;5d518f28-d69b-41e8-abd4-629b6f3f352d;Section Information:;Section=Section C;");
                                values.add("0123456789071C71D05-817A-4d9b-B80D-05EB86109C4C;0;20100711;;;Customer;none;1;20100711;20100711 ;;SD;no batch id;;;indexvalues;_Company=_Other;_DocDate=7/12/2010;DD9E491D-C47B-4b1d-9814-1401BF9F2F0D;Parent;5d518f28-d69b-41e8-abd4-629b6f3f352d;Section Information:;Section=Section D;");

        for(BufferedImage bmp : bitmaps)
        {
            BarCodeReader reader = new BarCodeReader(bmp, DecodeType.DATA_MATRIX);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertTrue(values.contains(reader.getFoundBarCodes()[0].getCodeText()), reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void testDocument2() throws IOException
        {
        List<BufferedImage> bitmaps = getBitmap(Global.pathCombine(folder, "Section+Separator(A4%26300DPI)"));
        List<String> values = new ArrayList<String>();
            values.add("0123456789071C71D05-817A-4d9b-B80D-05EB86109C4C;0;20100711;;;Customer;none;1;20100711;20100711 ;;SD;no batch id;;;indexvalues;_Company=_Other;_DocDate=7/12/2010;DD9E491D-C47B-4b1d-9814-1401BF9F2F0D;Parent;5d518f28-d69b-41e8-abd4-629b6f3f352d;Section Information:;Section=Section A;");
                    values.add("0123456789071C71D05-817A-4d9b-B80D-05EB86109C4C;0;20100711;;;Customer;none;1;20100711;20100711 ;;SD;no batch id;;;indexvalues;_Company=_Other;_DocDate=7/12/2010;DD9E491D-C47B-4b1d-9814-1401BF9F2F0D;Parent;5d518f28-d69b-41e8-abd4-629b6f3f352d;Section Information:;Section=Section B;");
                            values.add("0123456789071C71D05-817A-4d9b-B80D-05EB86109C4C;0;20100711;;;Customer;none;1;20100711;20100711 ;;SD;no batch id;;;indexvalues;_Company=_Other;_DocDate=7/12/2010;DD9E491D-C47B-4b1d-9814-1401BF9F2F0D;Parent;5d518f28-d69b-41e8-abd4-629b6f3f352d;Section Information:;Section=Section C;");
                                    values.add("0123456789071C71D05-817A-4d9b-B80D-05EB86109C4C;0;20100711;;;Customer;none;1;20100711;20100711 ;;SD;no batch id;;;indexvalues;_Company=_Other;_DocDate=7/12/2010;DD9E491D-C47B-4b1d-9814-1401BF9F2F0D;Parent;5d518f28-d69b-41e8-abd4-629b6f3f352d;Section Information:;Section=Section D;");

        for(BufferedImage bmp : bitmaps)
        {
            BarCodeReader reader = new BarCodeReader(bmp, DecodeType.DATA_MATRIX);
            {
                reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertTrue(values.contains(reader.getFoundBarCodes()[0].getCodeText()), reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void testDocument3() throws IOException
        {
        List<BufferedImage> bitmaps = getBitmap(Global.pathCombine(folder, "Section+Separator(A5%26200DPI)"));
        List<String> values = new ArrayList<String>();
            values.add("0123456789071C71D05-817A-4d9b-B80D-05EB86109C4C;0;20100711;;;Customer;none;1;20100711;20100711 ;;SD;no batch id;;;indexvalues;_Company=_Other;_DocDate=7/12/2010;DD9E491D-C47B-4b1d-9814-1401BF9F2F0D;Parent;5d518f28-d69b-41e8-abd4-629b6f3f352d;Section Information:;Section=Section A;");
                    values.add("0123456789071C71D05-817A-4d9b-B80D-05EB86109C4C;0;20100711;;;Customer;none;1;20100711;20100711 ;;SD;no batch id;;;indexvalues;_Company=_Other;_DocDate=7/12/2010;DD9E491D-C47B-4b1d-9814-1401BF9F2F0D;Parent;5d518f28-d69b-41e8-abd4-629b6f3f352d;Section Information:;Section=Section B;");
                            values.add("0123456789071C71D05-817A-4d9b-B80D-05EB86109C4C;0;20100711;;;Customer;none;1;20100711;20100711 ;;SD;no batch id;;;indexvalues;_Company=_Other;_DocDate=7/12/2010;DD9E491D-C47B-4b1d-9814-1401BF9F2F0D;Parent;5d518f28-d69b-41e8-abd4-629b6f3f352d;Section Information:;Section=Section C;");
                                    values.add("0123456789071C71D05-817A-4d9b-B80D-05EB86109C4C;0;20100711;;;Customer;none;1;20100711;20100711 ;;SD;no batch id;;;indexvalues;_Company=_Other;_DocDate=7/12/2010;DD9E491D-C47B-4b1d-9814-1401BF9F2F0D;Parent;5d518f28-d69b-41e8-abd4-629b6f3f352d;Section Information:;Section=Section D;");

        for(BufferedImage bmp : bitmaps)
        {
            BarCodeReader reader = new BarCodeReader(bmp, DecodeType.DATA_MATRIX);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertTrue(values.contains(reader.getFoundBarCodes()[0].getCodeText()), reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void testDocument4() throws IOException
        {
        List<BufferedImage> bitmaps = getBitmap(Global.pathCombine(folder, "Section+Separator(A5%26300DPI)"));
        List<String> values = new ArrayList<String>();
            values.add("0123456789071C71D05-817A-4d9b-B80D-05EB86109C4C;0;20100711;;;Customer;none;1;20100711;20100711 ;;SD;no batch id;;;indexvalues;_Company=_Other;_DocDate=7/12/2010;DD9E491D-C47B-4b1d-9814-1401BF9F2F0D;Parent;5d518f28-d69b-41e8-abd4-629b6f3f352d;Section Information:;Section=Section A;");
                    values.add("0123456789071C71D05-817A-4d9b-B80D-05EB86109C4C;0;20100711;;;Customer;none;1;20100711;20100711 ;;SD;no batch id;;;indexvalues;_Company=_Other;_DocDate=7/12/2010;DD9E491D-C47B-4b1d-9814-1401BF9F2F0D;Parent;5d518f28-d69b-41e8-abd4-629b6f3f352d;Section Information:;Section=Section B;");
                            values.add("0123456789071C71D05-817A-4d9b-B80D-05EB86109C4C;0;20100711;;;Customer;none;1;20100711;20100711 ;;SD;no batch id;;;indexvalues;_Company=_Other;_DocDate=7/12/2010;DD9E491D-C47B-4b1d-9814-1401BF9F2F0D;Parent;5d518f28-d69b-41e8-abd4-629b6f3f352d;Section Information:;Section=Section C;");
                                    values.add("0123456789071C71D05-817A-4d9b-B80D-05EB86109C4C;0;20100711;;;Customer;none;1;20100711;20100711 ;;SD;no batch id;;;indexvalues;_Company=_Other;_DocDate=7/12/2010;DD9E491D-C47B-4b1d-9814-1401BF9F2F0D;Parent;5d518f28-d69b-41e8-abd4-629b6f3f352d;Section Information:;Section=Section D;");
  
        for(BufferedImage bmp : bitmaps)
        {
            BarCodeReader reader = new BarCodeReader(bmp, DecodeType.DATA_MATRIX);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertTrue(values.contains(reader.getFoundBarCodes()[0].getCodeText()), reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void testDocumentIndex() throws IOException
        {
        List<BufferedImage> bitmaps = getBitmap(Global.pathCombine(folder, "DocumentWithIndex"));
        List<String> values = new ArrayList<String>();
            values.add("012345678971C71D05-817A-4d9b-B80D-05EB86109C4C;0;TestDirectory;;;IndexSection;none;0;TestDirectory;TestDirectory;Document With Index;SD;no batch id;;;indexvalues;_Company=_Other;_DocDate=7/13/2010;2C7AFFAC-8778-4b92-995A-D9ACC61E87C0;Parent;ca63f5bc-9e38-40d4-8a63-4fc00daa9ae2;Section Information:;Section=;");
                    values.add( "012345678971C71D05-817A-4d9b-B80D-05EB86109C4C;0;TestDirectory;;;IndexSection;none;1;TestDirectory;TestDirectory;Document With Index;SD;no batch id;;;indexvalues;_Company=_Other;_DocDate=7/13/2010;DD9E491D-C47B-4b1d-9814-1401BF9F2F0D;Parent;ca63f5bc-9e38-40d4-8a63-4fc00daa9ae2;Section Information:;Section=Section A;");
                    values.add( "012345678971C71D05-817A-4d9b-B80D-05EB86109C4C;0;TestDirectory;;;IndexSection;none;1;TestDirectory;TestDirectory;Document With Index;SD;no batch id;;;indexvalues;_Company=_Other;_DocDate=7/13/2010;DD9E491D-C47B-4b1d-9814-1401BF9F2F0D;Parent;ca63f5bc-9e38-40d4-8a63-4fc00daa9ae2;Section Information:;Section=Section B;");
                    values.add("012345678971C71D05-817A-4d9b-B80D-05EB86109C4C;0;TestDirectory;;;IndexSection;none;1;TestDirectory;TestDirectory;Document With Index;SD;no batch id;;;indexvalues;_Company=_Other;_DocDate=7/13/2010;DD9E491D-C47B-4b1d-9814-1401BF9F2F0D;Parent;ca63f5bc-9e38-40d4-8a63-4fc00daa9ae2;Section Information:;Section=Section C;");

        for(BufferedImage bmp : bitmaps)
        {
            BarCodeReader reader = new BarCodeReader(bmp, DecodeType.DATA_MATRIX);
            {
                //reader.ManualHints = ManualHint.MedianSmoothing;
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertTrue(values.contains(reader.getFoundBarCodes()[0].getCodeText()), reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test2() throws IOException
        {
        List<BufferedImage> bitmaps = getBitmap(Global.pathCombine(folder, "Test2"));
        List<String> values = new ArrayList<String>();
        values.add("012345678971C71D05-817A-4d9b-B80D-05EB86109C4C;0;20100713;;;IndexSection;none;0;20100713;20100713;adfasdf2;SD;no batch id;;;indexvalues;_Company=_Other;_DocDate=7/14/2010;2C7AFFAC-8778-4b92-995A-D9ACC61E87C0;Parent;11c87bb5-4248-410c-94a0-5ad51cd39895;Section Information:;Section=;");
                values.add(  "012345678971C71D05-817A-4d9b-B80D-05EB86109C4C;0;20100713;;;IndexSection;none;1;20100713;20100713;adfasdf2;SD;no batch id;;;indexvalues;_Company=_Other;_DocDate=7/14/2010;DD9E491D-C47B-4b1d-9814-1401BF9F2F0D;Parent;11c87bb5-4248-410c-94a0-5ad51cd39895;Section Information:;Section=a;");
                        values.add(  "012345678971C71D05-817A-4d9b-B80D-05EB86109C4C;0;20100713;;;IndexSection;none;1;20100713;20100713;adfasdf2;SD;no batch id;;;indexvalues;_Company=_Other;_DocDate=7/14/2010;DD9E491D-C47B-4b1d-9814-1401BF9F2F0D;Parent;11c87bb5-4248-410c-94a0-5ad51cd39895;Section Information:;Section=b;");
                                values.add("012345678971C71D05-817A-4d9b-B80D-05EB86109C4C;0;20100713;;;IndexSection;none;1;20100713;20100713;adfasdf2;SD;no batch id;;;indexvalues;_Company=_Other;_DocDate=7/14/2010;DD9E491D-C47B-4b1d-9814-1401BF9F2F0D;Parent;11c87bb5-4248-410c-94a0-5ad51cd39895;Section Information:;Section=c;");
                                        values.add("012345678971C71D05-817A-4d9b-B80D-05EB86109C4C;0;20100713;;;IndexSection;none;1;20100713;20100713;adfasdf2;SD;no batch id;;;indexvalues;_Company=_Other;_DocDate=7/14/2010;DD9E491D-C47B-4b1d-9814-1401BF9F2F0D;Parent;11c87bb5-4248-410c-94a0-5ad51cd39895;Section Information:;Section=d;");


        for(BufferedImage bmp : bitmaps)
        {
            BarCodeReader reader = new BarCodeReader(bmp, DecodeType.DATA_MATRIX);
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertTrue(values.contains(reader.getFoundBarCodes()[0].getCodeText()), reader.getFoundBarCodes()[0].getCodeText());

        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test3() throws IOException
        {
        List<BufferedImage> bitmaps = getBitmap(Global.pathCombine(folder, "TEST3"));
        List<String> values = new ArrayList<String>();
        values.add("012345678971C71D05-817A-4d9b-B80D-05EB86109C4C;0;Test_Index;;;IndexSection;none;0;Test_Index;Test_Index;ttttt;SD;no batch id;;;indexvalues;_Company=_Other;_DocDate=7/14/2010;_SecurityNumber=222222222;PhoneNumber=22222222222;Phone=33333333333333;Salary=33333333333;SSN=333333333333;Age=0;Phone2=0.0000;Zip=333333333;Remark=sdadf;2C7AFFAC-8778-4b92-995A-D9ACC61E87C0;Parent;e5b13a22-fc99-4641-ae4d-9e5ec42ce952;Section Information:;Section=;");
                values.add(   "012345678971C71D05-817A-4d9b-B80D-05EB86109C4C;0;Test_Index;;;IndexSection;none;1;Test_Index;Test_Index;ttttt;SD;no batch id;;;indexvalues;_Company=_Other;_DocDate=7/14/2010;_SecurityNumber=222222222;PhoneNumber=22222222222;Phone=33333333333333;Salary=33333333333;SSN=333333333333;Age=0;Phone2=0.0000;Zip=333333333;Remark=sdadf;DD9E491D-C47B-4b1d-9814-1401BF9F2F0D;Parent;e5b13a22-fc99-4641-ae4d-9e5ec42ce952;Section Information:;Section=a;");
                        values.add("012345678971C71D05-817A-4d9b-B80D-05EB86109C4C;0;Test_Index;;;IndexSection;none;1;Test_Index;Test_Index;ttttt;SD;no batch id;;;indexvalues;_Company=_Other;_DocDate=7/14/2010;_SecurityNumber=222222222;PhoneNumber=22222222222;Phone=33333333333333;Salary=33333333333;SSN=333333333333;Age=0;Phone2=0.0000;Zip=333333333;Remark=sdadf;DD9E491D-C47B-4b1d-9814-1401BF9F2F0D;Parent;e5b13a22-fc99-4641-ae4d-9e5ec42ce952;Section Information:;Section=b;");
                                values.add(  "012345678971C71D05-817A-4d9b-B80D-05EB86109C4C;0;Test_Index;;;IndexSection;none;1;Test_Index;Test_Index;ttttt;SD;no batch id;;;indexvalues;_Company=_Other;_DocDate=7/14/2010;_SecurityNumber=222222222;PhoneNumber=22222222222;Phone=33333333333333;Salary=33333333333;SSN=333333333333;Age=0;Phone2=0.0000;Zip=333333333;Remark=sdadf;DD9E491D-C47B-4b1d-9814-1401BF9F2F0D;Parent;e5b13a22-fc99-4641-ae4d-9e5ec42ce952;Section Information:;Section=c;");
                                        values.add("012345678971C71D05-817A-4d9b-B80D-05EB86109C4C;0;Test_Index;;;IndexSection;none;1;Test_Index;Test_Index;ttttt;SD;no batch id;;;indexvalues;_Company=_Other;_DocDate=7/14/2010;_SecurityNumber=222222222;PhoneNumber=22222222222;Phone=33333333333333;Salary=33333333333;SSN=333333333333;Age=0;Phone2=0.0000;Zip=333333333;Remark=sdadf;DD9E491D-C47B-4b1d-9814-1401BF9F2F0D;Parent;e5b13a22-fc99-4641-ae4d-9e5ec42ce952;Section Information:;Section=e;");

        for(BufferedImage bmp : bitmaps)
        {
            BarCodeReader reader = new BarCodeReader(bmp, DecodeType.DATA_MATRIX);
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertTrue(values.contains(reader.getFoundBarCodes()[0].getCodeText()), reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test5() throws IOException
        {
        List<BufferedImage> bitmaps = getBitmap(Global.pathCombine(folder, "Test5"));
        List<String> values = new ArrayList<String>();
        values.add("012345678971C71D05-817A-4d9b-B80D-05EB86109C4C;2;Festimo\test2;;;Customer;none;1;Festimo;Festimo__Festimo _description;asdf234234;SD;no batch id;;;indexvalues;_Company=_Other;_DocDate=7/16/2010;DD9E491D-C47B-4b1d-9814-1401BF9F2F0D;Parent;ed057eb0-4a75-41a5-8f5a-56cb77a39e2d;Section Information:;Section=232342;");
                values.add( "012345678971C71D05-817A-4d9b-B80D-05EB86109C4C;2;Festimo\test2;;;Customer;none;1;Festimo;Festimo__Festimo _description;asdf234234;SD;no batch id;;;indexvalues;_Company=_Other;_DocDate=7/16/2010;DD9E491D-C47B-4b1d-9814-1401BF9F2F0D;Parent;ed057eb0-4a75-41a5-8f5a-56cb77a39e2d;Section Information:;Section=xcvxzcv;");
            values.add( "012345678971C71D05-817A-4d9b-B80D-05EB86109C4C;2;Festimo\test2;;;Customer;none;1;Festimo;Festimo__Festimo _description;asdf234234;SD;no batch id;;;indexvalues;_Company=_Other;_DocDate=7/16/2010;DD9E491D-C47B-4b1d-9814-1401BF9F2F0D;Parent;ed057eb0-4a75-41a5-8f5a-56cb77a39e2d;Section Information:;Section=xcvzzxv;");

        for (BufferedImage bmp : bitmaps)
        {
            BarCodeReader reader = new BarCodeReader(bmp, DecodeType.DATA_MATRIX);
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertTrue(values.contains(reader.getFoundBarCodes()[0].getCodeText()), reader.getFoundBarCodes()[0].getCodeText());

        }
    }

    private static List<BufferedImage> getBitmap(String dir) throws IOException
    {
        List<BufferedImage> output = new ArrayList<BufferedImage>();

        List<String> result = new ArrayList<>();

        for (File file : new File(folder).listFiles())
        {
            if (file.isFile())
            {
                System.out.println("File " + file.getName());
            }
        }

            for(String page : result)
            {
                output.add(ImageIO.read(new File(page)));
            }
        return output;
    }
}
