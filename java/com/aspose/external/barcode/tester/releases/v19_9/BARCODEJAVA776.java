package com.aspose.external.barcode.tester.releases.v19_9;

import com.aspose.barcode.generation.BaseEncodeType;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class BARCODEJAVA776
{
    @Test
    public void test() throws IOException
    {
        String encodeTypeString = "CODE_39";
        BaseEncodeType[] encodeType = new BaseEncodeType[1];
        Assert.assertTrue(EncodeTypes.parse(encodeTypeString, encodeType));
        Assert.assertTrue(encodeType[0].equals(EncodeTypes.CODE_39));
    }
}
