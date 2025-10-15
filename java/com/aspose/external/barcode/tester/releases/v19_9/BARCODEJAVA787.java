package com.aspose.external.barcode.tester.releases.v19_9;

import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.SingleDecodeType;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BARCODEJAVA787
{
    @Test
    public void test()
    {
        SingleDecodeType singleDecodeType = DecodeType.parse("DOT_CODE");
        Assert.assertEquals(DecodeType.DOT_CODE, singleDecodeType);
    }
}
