package com.aspose.external.barcode.tester.releases.v17_04;

import com.aspose.barcode.BarCodeException;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

@Test
public class Issue36510
{
    @Test
    public void testCorrectGs1Format()
    {
        List<String> codetexts = new ArrayList<String>();
        codetexts.add("(01)03453120000011(8200)http://www.abc.net(10)ABCD1234(410)9501101020917");
        codetexts.add("(01)03453120000011(17)120508(10)ABCD1234(410)9501101020917");
        codetexts.add("(01)95012345678903(3103)000123");
        codetexts.add("(01)03512345678907(21)abcdefghijklmnopqrst");
        codetexts.add("(00)030123456789012340(02)13012345678909(37)24(10)1234567ABCDEFG");
        codetexts.add("(253)1234567890123");
        codetexts.add("(253)1234567890123ABCDABCDABCDABCDA");
        codetexts.add("(421)123");
        codetexts.add("(421)123ABCDEFGHI");
        codetexts.add("(7039)123ABCDEFGHI");
        codetexts.add("(8003)12345678901234");
        codetexts.add("(8003)12345678901234A");
        codetexts.add("(8003)12345678901234ABC");
        codetexts.add("(8003)12345678901234ABCDEFGHIABCDEFG");
        codetexts.add("(01)09501101530003(17)150119(10)AB-123");

        for (String codetext : codetexts)
        {
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.GS_1_CODE_128, codetext);
            {
                gen.generateBarCodeImage();
            }
        }
    }

    @Test
    public void testIncorrectGs1Format()
    {
        List<String> codetexts = new ArrayList<String>();
        codetexts.add("(01)1234567890123");
        codetexts.add("(01)123456789012345");
        codetexts.add("(01)A2345678901234");
        codetexts.add("(13)ABCDEF");
        codetexts.add("(253)123456789012");
        codetexts.add("(253)123456789012AXYZ");
        codetexts.add("(421)12ABCDEFGHI");
        codetexts.add("(703)123ABCDEFGHI");
        codetexts.add("(7032)1X3BCDEFGHI");
        codetexts.add("(8003)A2345678901234ABC");
        codetexts.add("(8003)1234567890123");
        codetexts.add("(8003)12345678901231ABCDEFGHIABCDEFGX");
        codetexts.add("(8003)12345678901234ABCDEFGHIABCDEFGHIABCDEFGHIABCDEFGHIABCDEFGHIABCDEFGHIABCDEFGHIABCDEFGHIABCDEFGHIABCDEFGHIABCDEFGHIABCDEFGHIABCDEFGHI");
        codetexts.add("(01)03512345678907(21)abcdefghijklmnopqrstuv");
        codetexts.add("(01)03512345678907(21)abcdefghijklmnopqrstu");

        for (String codetext : codetexts)
        {
            try
            {
                BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.GS_1_CODE_128, codetext);
                {
                    gen.generateBarCodeImage();
                    Assert.fail("Codetext " + codetext + " must be incorrect.");
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

