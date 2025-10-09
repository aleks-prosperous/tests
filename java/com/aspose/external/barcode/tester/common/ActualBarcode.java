package com.aspose.external.barcode.tester.common;

import com.aspose.barcode.barcoderecognition.BaseDecodeType;

public class ActualBarcode
{
    private String actualText;
    private BaseDecodeType actualBarCodeReadType;

    public ActualBarcode(String actualText, BaseDecodeType actualBarCodeReadType)
    {
        this.actualText = actualText;
        this.actualBarCodeReadType = actualBarCodeReadType;
    }

    public String getActualText()
    {
        return actualText;
    }

    public BaseDecodeType getActualBarCodeReadType()
    {
        return actualBarCodeReadType;
    }
}