//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33718.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="10.09.2013 11:08:48">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BaseDecodeType;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.BaseEncodeType;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;


@Test(description = "Tests for Issue33718.")
public class Issue33718
{
    final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33718");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void predefinedImages()
    {
        //foreach to while statements conversion
        Iterator tmp0 = (getPredefinedTests()).iterator();
        while (tmp0.hasNext())
        {
            PredefinedImagesStruct predefined = (PredefinedImagesStruct) tmp0.next();
            String fileName = Global.pathCombine(folder, predefined.fileName);
            final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_16_K);
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(predefined.codeText, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    public List<PredefinedImagesStruct> getPredefinedTests()
    {
        List<PredefinedImagesStruct> data = new ArrayList<PredefinedImagesStruct>();
        data.add(new PredefinedImagesStruct("code16K_1.png", "1"));
        data.add(new PredefinedImagesStruct("CodeLocationAbove.png", "abc"));
        data.add(new PredefinedImagesStruct("CodeLocationBelow.png", "abc"));
        data.add(new PredefinedImagesStruct("CodeLocationNone.png", "abc"));
        data.add(new PredefinedImagesStruct("CodeText-1234.gif", "1234"));
        data.add(new PredefinedImagesStruct("CodeText-1234.png", "1234"));
        data.add(new PredefinedImagesStruct("CodeText-ABC.gif", "abc"));
        data.add(new PredefinedImagesStruct("CodeText-abc.png", "abc"));
        data.add(new PredefinedImagesStruct("CodeText-abcdefgh.gif", "abcdefgh"));
        data.add(new PredefinedImagesStruct("CodeText-abcdefgh.png", "abcdefgh"));
        data.add(new PredefinedImagesStruct("CodeText-here_i_go_1a2b3C4D5e.gif", "here i go 1a2b3C4D5e"));
        data.add(new PredefinedImagesStruct("CodeText-here_i_go_1a2b3C4D5e.png", "here i go 1a2b3C4D5e"));
        data.add(new PredefinedImagesStruct("CodeText-here_i go_1a2b3C4D5e.gif", "here i go 1a2b3C4D5e"));

        return data;
    }

    public static class PredefinedImagesStruct
    {
        public PredefinedImagesStruct()
        {
        }

        public String fileName;
        public String codeText;

        public PredefinedImagesStruct(String fileName, String codetext)
        {
            this.fileName = fileName;
            codeText = codetext;
        }

        public String toString()
        {
            return String.format("File: %s - codeText: %s", fileName, codeText);
        }

        public void CloneTo(PredefinedImagesStruct that)
        {
            that.fileName = fileName;
            that.codeText = codeText;
        }

        public PredefinedImagesStruct Clone()
        {
            PredefinedImagesStruct struct = new PredefinedImagesStruct();
            CloneTo(struct);
            return struct;
        }

        public Object clone()
        {
            return Clone();
        }

        private boolean equalsByValue(PredefinedImagesStruct that)
        {
            return that.fileName.equals(fileName) && that.codeText.equals(codeText);
        }

        public boolean equals(Object obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (obj.equals(this))
            {
                return true;
            }
            if (!(obj instanceof PredefinedImagesStruct))
            {
                return false;
            }
            return equalsByValue((PredefinedImagesStruct) obj);
        }

        public static boolean equals(PredefinedImagesStruct obj1, PredefinedImagesStruct obj2)
        {
            return obj1.equals(obj2);
        }

    }

    private static final Random random = new Random((int) System.currentTimeMillis());

    @Test
    public void testCode16RandomChars()
    {
        final int COUNTBARCODES = 50;
        final int COUNTLENGTH = 15;
        List<BarCodeInfo> data = new ArrayList<BarCodeInfo>();
        for (int i = 0; i < COUNTBARCODES; ++i)
        {
            String s = "";
            for (int j = 0; j < COUNTLENGTH; ++j)
            {
                char c = (char) random.nextInt(127);
                if (c == 95 || c == 96)
                {
                    --j;
                    continue;
                }

                s = s + c;
            }
            data.add(new BarCodeInfo(s));
        }

        for(BarCodeInfo item : data)
        {
            BarcodeGenerator gen = new BarcodeGenerator(item.symbology, item.codetext);
            {
                BufferedImage bmp = gen.generateBarCodeImage();
                {
                    BarCodeReader reader = new BarCodeReader(bmp, item.readType);
                    reader.setQualitySettings(QualitySettings.getHighPerformance());
                    {
                        Assert.assertEquals(reader.readBarCodes().length, 1);
                        Assert.assertEquals(item.codetext, reader.getFoundBarCodes()[0].getCodeText());
                    }
                }
            }
        }
    }

    private static class BarCodeInfo
    {
        public BarCodeInfo()
        {
        }

        public BaseEncodeType symbology;
        public BaseDecodeType readType;
        public String codetext;

        public BarCodeInfo(String c)
        {
            this(EncodeTypes.CODE_16_K, DecodeType.CODE_16_K, c);
        }

        public BarCodeInfo(BaseEncodeType s, BaseDecodeType t, String c)
        {
            symbology = s;
            readType = t;
            codetext = c;
        }

        public String toString()
        {
            return String.format("EncodeType: %s - codeText: %s", symbology, codetext);
        }

        public void CloneTo(BarCodeInfo that)
        {
            that.symbology = symbology;
            that.readType = readType;
            that.codetext = codetext;
        }

        public BarCodeInfo Clone()
        {
            BarCodeInfo struct = new BarCodeInfo();
            CloneTo(struct);
            return struct;
        }

        public Object clone()
        {
            return Clone();
        }

        private boolean equalsByValue(BarCodeInfo that)
        {
            return that.symbology == symbology && that.readType == readType && that.codetext.equals(codetext);
        }

        public boolean equals(Object obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (obj.equals(this))
            {
                return true;
            }
            if (!(obj instanceof BarCodeInfo))
            {
                return false;
            }
            return equalsByValue((BarCodeInfo) obj);
        }

        public static boolean equals(BarCodeInfo obj1, BarCodeInfo obj2)
        {
            return obj1.equals(obj2);
        }

    }
}

