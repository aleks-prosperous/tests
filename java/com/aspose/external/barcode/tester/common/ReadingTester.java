package com.aspose.external.barcode.tester.common;

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.BaseDecodeType;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class ReadingTester
{
    private String filePath;
    private BaseDecodeType barCodeReadType;
    private List<ActualBarcode> actualBarcodeList = new ArrayList<ActualBarcode>();
    private Charset charset;

    public ReadingTester(String filePath, BaseDecodeType barCodeReadType, Charset charset)
    {
        this.filePath = filePath;
        this.barCodeReadType = barCodeReadType;
        this.charset = charset;
    }

    public ReadingTester(String filePath, BaseDecodeType barCodeReadType)
    {
        this.filePath = filePath;
        this.barCodeReadType = barCodeReadType;
        this.charset = StandardCharsets.UTF_8;
    }

    public ReadingTester readImage() throws IOException
    {
        File file = new File(filePath);
        if (!file.exists())
        {
            throw new IllegalArgumentException("wrong path " + filePath);
        }
        /*BufferedImage bufferedImage = ImageIO.read(file);
        BarCodeReader reader = new BarCodeReader(bufferedImage, barCodeReadType);*/
        BarCodeReader reader = new BarCodeReader();
        reader.setBarCodeReadType(barCodeReadType);
        reader.setBarCodeImage(filePath);
        for (BarCodeResult result : reader.readBarCodes())
        {
            ActualBarcode actualBarcode = new ActualBarcode(result.getCodeText(charset), result.getCodeType());
            actualBarcodeList.add(actualBarcode);
        }

        return this;
    }

    public List<ActualBarcode> getActualBarcodeList()
    {
        return actualBarcodeList;
    }

    public boolean isSingleResult()
    {
        return actualBarcodeList.size() == 1;
    }

    public boolean isNotEmptyResult()
    {
        return !actualBarcodeList.isEmpty();
    }


}
