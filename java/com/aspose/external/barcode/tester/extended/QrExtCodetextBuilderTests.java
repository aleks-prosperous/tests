package com.aspose.external.barcode.tester.extended;

import com.aspose.barcode.generation.ECIEncodings;
import com.aspose.barcode.generation.QrExtCodetextBuilder;
import org.testng.Assert;
import org.testng.annotations.Test;

public class QrExtCodetextBuilderTests
{
    @Test
    public void test1()
    {
        QrExtCodetextBuilder lTextBuilder = new QrExtCodetextBuilder();
        lTextBuilder.addFNC1FirstPosition();
        lTextBuilder.addPlainCodetext("000%89%%0");
        lTextBuilder.addFNC1GroupSeparator();
        lTextBuilder.addPlainCodetext("12345&lt;FNC1&gt;");
        //generate codetext
        String lCodetext = lTextBuilder.getExtendedCodetext();
        System.out.println(lCodetext);
        Assert.assertEquals(lCodetext, "<FNC1>000%89%%0\u001D12345&lt;FNC1&gt;");
    }

    @Test
    public void test2()
    {
        //create codetext
        QrExtCodetextBuilder lTextBuilder = new QrExtCodetextBuilder();
        lTextBuilder.addFNC1SecondPosition("12");
        lTextBuilder.addPlainCodetext("TRUE3456");
        //generate codetext
        String lCodetext = lTextBuilder.getExtendedCodetext();
        System.out.println(lCodetext);
        Assert.assertEquals(lCodetext, "<FNC1>(12)TRUE3456");
    }

    @Test
    public void test3()
    {
        //create codetext
        QrExtCodetextBuilder lTextBuilder = new QrExtCodetextBuilder();
        lTextBuilder.addECICodetext(ECIEncodings.Win1251, "Will");
        lTextBuilder.addECICodetext(ECIEncodings.UTF8, "Right");
        lTextBuilder.addECICodetext(ECIEncodings.UTF16BE, "Power");
        lTextBuilder.addPlainCodetext("t\\e\\st");
        //generate codetext
        String lCodetext = lTextBuilder.getExtendedCodetext();
        System.out.println(lCodetext);
        Assert.assertEquals(lCodetext, "\\000022Will\\000026Right\\000025Power/000000t\\e\\st");
    }

}
