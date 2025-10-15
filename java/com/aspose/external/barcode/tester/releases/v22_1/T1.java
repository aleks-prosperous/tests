package com.aspose.external.barcode.tester.releases.v22_1;

import org.testng.annotations.Test;

public class T1
{
    String Etalon = "SPC\n0200\n1\nCH5204835012345671000\nS\nSample Foundation\nP.O. Box\n\n3001\nBern\nCH\n\n\n\n\n\n\n\n\nCHF\n\n\n\n\n\n\n\nNON\n\n\nEPD\n";


    @Test
    public void test_SwissQr_Users_Codetext()
    {
        String s = new StringBuilder(Etalon).insert(88, "K").toString();
        System.out.println(s);
    }
}
