//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33702.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="10.09.2013 11:08:48">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.BaseEncodeType;
import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.logger.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.lang.reflect.Method;
import java.util.*;
import java.util.List;

@Test(description = "Tests for Issue33273.")
public class Issue33273
{
    @BeforeMethod
    public void setUp(Method testMethod)
    {
        LicenseAssistant.setupLicense();
        Logger.methodStarted(getClass().getName() + "." + testMethod.getName());
    }


    @Test
    public void multi()
    {
        List<BaseDecodeType> readTypes = new ArrayList<BaseDecodeType>();
        List<String> codetexts = new ArrayList<String>();

        final BarCodeReader reader = new BarCodeReader(processCollection(), DecodeType.ALL_SUPPORTED_TYPES);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getQualitySettings().setXDimension( XDimensionMode.SMALL);
        for(BarCodeResult result : reader.readBarCodes())
        {
            readTypes.add(result.getCodeType());
            codetexts.add(result.getCodeText());
        }

        Assert.assertTrue(readTypes.contains(DecodeType.CODE_39));
        Assert.assertTrue(readTypes.contains(DecodeType.DATA_MATRIX));
        Assert.assertTrue(readTypes.contains(DecodeType.QR));
        Assert.assertTrue(readTypes.contains(DecodeType.CODE_128));
        Assert.assertTrue(readTypes.contains(DecodeType.ISMN));
        Assert.assertTrue(readTypes.contains(DecodeType.AZTEC));

        Assert.assertTrue(codetexts.contains("ONE123"));
        Assert.assertTrue(codetexts.contains("Process Collection"));
        Assert.assertTrue(codetexts.contains("Dictionary Collection"));
        Assert.assertTrue(codetexts.contains("X06712AT"));
        Assert.assertTrue(codetexts.contains("9790260000438"));
        Assert.assertTrue(codetexts.contains("Aztec BarCode"));
    }

    private BufferedImage processCollection()
    {
        Map<String, BaseEncodeType> collection = new HashMap<String, BaseEncodeType>();

        collection.put("ONE123", EncodeTypes.CODE_39);
        collection.put("Process Collection", EncodeTypes.DATA_MATRIX);
        collection.put("Dictionary Collection", EncodeTypes.QR);
        collection.put("X06712AT", EncodeTypes.CODE_128);
        collection.put("979026000043", EncodeTypes.EAN_13);
        collection.put("Aztec BarCode", EncodeTypes.AZTEC);

        List<BufferedImage> images = new ArrayList();

        for (String key : collection.keySet())
        {
            BarcodeGenerator gen = new BarcodeGenerator(collection.get(key));
            {
                gen.setCodeText(key);
                images.add(gen.generateBarCodeImage());
            }
        }

        int maxWidth = Integer.MIN_VALUE;
        int sumHeight = 0;
        //foreach to while statements conversion
        Iterator tmp1 = (images).iterator();
        while (tmp1.hasNext())
        {
            BufferedImage bmp = (BufferedImage) tmp1.next();
            sumHeight += bmp.getHeight();
            if (maxWidth < bmp.getWidth())
            {
                maxWidth = bmp.getWidth();
            }
        }

        int offset = 10;
        BufferedImage resultBitmap = new BufferedImage(maxWidth + offset * 2, sumHeight + offset * images.size(), BufferedImage.TYPE_INT_ARGB);
        //screen zoom fix
//        resultBitmap.setResolution(images.get(0).HorizontalResolution, images.get(0).VerticalResolution);
        Graphics g = resultBitmap.getGraphics();
        g.setColor(Color.WHITE);

        int yPosition = offset;
        for (int i = 0; i < images.size(); ++i)
        {
            BufferedImage currentBitmap = images.get(i);
            g.drawImage(currentBitmap, offset, yPosition, null);
            yPosition += currentBitmap.getHeight() + offset;
        }

        return resultBitmap;
    }
}

