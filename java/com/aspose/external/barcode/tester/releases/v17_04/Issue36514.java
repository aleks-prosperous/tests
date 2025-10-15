package com.aspose.external.barcode.tester.releases.v17_04;

import com.aspose.barcode.BarCodeException;
import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Test
public class Issue36514
{
    final String folder = Global.getGeneratedImagesFolder("Issues" + File.separator + "Issue36514");

    @Test
    public void testGenerationWithIncorrectCodetext()
    {
        try
        {
            String codetext = "(703)123";
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.GS_1_CODE_128, codetext);
            {
                gen.generateBarCodeImage();
                Assert.fail("Codetext " + codetext + " is incorrect.");
            }
        }
        catch (BarCodeException e)
        {
            //this codetext is incorrect
            //and throw exception
        }
    }

    @Test
    public void testCorrectGs1Format() throws IOException
    {
        List<String> codetexts = new ArrayList<String>();
        codetexts.add("(7030)123456");
        codetexts.add("(7031)123456");
        codetexts.add("(7032)123456");
        codetexts.add("(7033)123456");
        codetexts.add("(7034)123456");
        codetexts.add("(7035)123456");
        codetexts.add("(7036)123456");
        codetexts.add("(7037)123456");
        codetexts.add("(7038)123456");
        codetexts.add("(7039)123456");

        codetexts.add("(3240)123456");
        codetexts.add("(3241)123456");
        codetexts.add("(3245)123456");
        codetexts.add("(3249)123456");
        codetexts.add("(3900)123456");

        for(String codetext : codetexts)
        {
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.GS_1_CODE_128, codetext);
            {
                gen.save(Global.getTempFolder("Issue36514_TestCorrectGs1Format.png"));
            }
        }
    }

    @Test
    public void testIncorrectGs1Format()
    {
        List<String> codetexts = new ArrayList<String>();
        codetexts.add("(703)123");
        codetexts.add("(703a)123");
        codetexts.add("(31)123456");
        codetexts.add("(32)123456");
        codetexts.add("(320)123456");
        codetexts.add("(324a)123456");
        codetexts.add("(32456)123456");
        codetexts.add("(32412323)123456");

        for(String codetext : codetexts)
        {
            try
            {
                BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.GS_1_CODE_128, codetext);
                {
                    gen.generateBarCodeImage();
                    Assert.fail("Codetext " + codetext + " is incorrect.");
                }
            }
            catch (BarCodeException e)
            {
                //this codetext is incorrect
                //and throw exception
            }
        }
    }
}

