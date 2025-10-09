package com.aspose.external.barcode.tester.helpers.data;

import com.aspose.barcode.barcoderecognition.BaseDecodeType;

public class CodetextWithType
{
    public BaseDecodeType Readtype = null;
    public String Codetext = "";
    public CodetextWithType(BaseDecodeType aReadtype, String aCodetext)
    {
        Readtype = aReadtype;
        Codetext = aCodetext;
    }
}
