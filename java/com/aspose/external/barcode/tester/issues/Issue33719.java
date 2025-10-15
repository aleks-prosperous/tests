//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33719.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="10.09.2013 11:08:48">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

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
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@Test(description = "Tests for Issue33719.")
public class Issue33719
{
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    private static final Random random = new Random((int) System.currentTimeMillis());

        @Test
    public void testCode128RandomChars()
    {
        for(BarCodeInfo item : getCode128RandomChars())
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

    public List<BarCodeInfo> getCode128RandomChars()
    {
        final int COUNTBARCODES = 50;
        final int COUNTLENGTH = 15;
        List<BarCodeInfo> data = new ArrayList<BarCodeInfo>();
        for (int i = 0; i < COUNTBARCODES; ++i)
        {
            String s = "";
            for (int j = 0; j < COUNTLENGTH; ++j)
            {
                char c = (char) random.nextInt(20);
                if (c == 'f')
                {
                    j--;
                    continue;
                }

                s = s + c;
            }
            data.add(new BarCodeInfo(s));
        }

        return data;
    }
        @Test
    public void testCode128Shift()
    {
        for(BarCodeInfo item : getCode128Shift())
        {
            BarcodeGenerator gen = new BarcodeGenerator(item.symbology, item.codetext);
            {
                BufferedImage bmp = gen.generateBarCodeImage();
                {
                    BarCodeReader reader = new BarCodeReader(bmp, item.readType);
                    Assert.assertEquals(reader.readBarCodes().length, 1);
                    Assert.assertEquals(item.codetext, reader.getFoundBarCodes()[0].getCodeText());
                }
            }
        }
    }

    public List<BarCodeInfo> getCode128Shift()
    {
        List<BarCodeInfo> data = new ArrayList<BarCodeInfo>();
        data.add(new BarCodeInfo("0011AZxZxZ"));
        data.add(new BarCodeInfo("0176ArTRrTrT"));
        data.add(new BarCodeInfo("azxsCDC$#$#$"));
        data.add(new BarCodeInfo("CXCX345678ZZAaaa"));
        data.add(new BarCodeInfo("XZX12345aq"));
        data.add(new BarCodeInfo("4545" + 4 + 22 + 23 + "54"));
        data.add(new BarCodeInfo("530" + "T" + 2 + "a" + 4 + "z11111"));
        data.add(new BarCodeInfo("53kopfEWUY" + 2 + "a" + 4 + "z11111"));

        return data;
    }

        @Test
    public void testCode128CodesetC()
    {
        for(BarCodeInfo item : getCode128CodesetC())
        {
            BarcodeGenerator gen = new BarcodeGenerator(item.symbology, item.codetext);
            {
                BufferedImage bmp = gen.generateBarCodeImage();
                {
                    BarCodeReader reader = new BarCodeReader(bmp, item.readType);
                    Assert.assertEquals(reader.readBarCodes().length, 1);
                    Assert.assertEquals(item.codetext, reader.getFoundBarCodes()[0].getCodeText());
                }
            }
        }
    }


    public List<BarCodeInfo> getCode128CodesetC()
    {
        List<BarCodeInfo> data = new ArrayList<BarCodeInfo>();
        data.add(new BarCodeInfo("00"));
        data.add(new BarCodeInfo("012"));
        data.add(new BarCodeInfo("0202"));
        data.add(new BarCodeInfo("02025"));
        data.add(new BarCodeInfo("530503"));
        data.add(new BarCodeInfo("5305032"));
        data.add(new BarCodeInfo("53026503"));
        data.add(new BarCodeInfo("530503355"));
        data.add(new BarCodeInfo("5305034564"));
        data.add(new BarCodeInfo("53050376478"));
        data.add(new BarCodeInfo("530503543345"));
        data.add(new BarCodeInfo("5305035433435"));
        data.add(new BarCodeInfo("53042322469503"));

        return data;
    }

        @Test
    public void testCode128CodesetB()
    {
        for(BarCodeInfo item : getCode128CodesetB())
        {
            BarcodeGenerator gen = new BarcodeGenerator(item.symbology, item.codetext);
            {
                BufferedImage bmp = gen.generateBarCodeImage();
                {
                    BarCodeReader reader = new BarCodeReader(bmp, item.readType);
                    Assert.assertEquals(reader.readBarCodes().length, 1);
                    Assert.assertEquals(item.codetext, reader.getFoundBarCodes()[0].getCodeText());
                }
            }
        }
    }

    public List<BarCodeInfo> getCode128CodesetB()
    {
        List<BarCodeInfo> data = new ArrayList<BarCodeInfo>();
        data.add(new BarCodeInfo("3"));
        data.add(new BarCodeInfo("9"));
        data.add(new BarCodeInfo("A4"));
        data.add(new BarCodeInfo("aZ"));
        data.add(new BarCodeInfo("asd4CXS"));
        data.add(new BarCodeInfo("3Xde"));
        data.add(new BarCodeInfo("7rtj7j"));
        data.add(new BarCodeInfo("utfn"));

        return data;
    }

        @Test
    public void testCode128CodesetA()
    {
        for(BarCodeInfo item : getCode128CodesetA())
        {
            BarcodeGenerator gen = new BarcodeGenerator(item.symbology, item.codetext);
            {
                BufferedImage bmp = gen.generateBarCodeImage();
                {
                    BarCodeReader reader = new BarCodeReader(bmp, item.readType);
                    Assert.assertEquals(reader.readBarCodes().length, 1);
                    Assert.assertEquals(item.codetext, reader.getFoundBarCodes()[0].getCodeText());
                }
            }
        }
    }

    public List<BarCodeInfo> getCode128CodesetA()
    {
        List<BarCodeInfo> data = new ArrayList<BarCodeInfo>();
        data.add(new BarCodeInfo("AZ" + 21 + 22 + 23 + 21 + 54));
        data.add(new BarCodeInfo("AZ" + 4 + 22 + 23 + "54"));
        data.add(new BarCodeInfo("@#" + 15));
        data.add(new BarCodeInfo("ZZ" + 19));
        data.add(new BarCodeInfo("1ZZ" + 19 + 19 + 19 + 19));
        data.add(new BarCodeInfo("1ZZ" + 19 + "A4" + 19 + 19 + 19));
        data.add(new BarCodeInfo("1ZZ" + 19 + "A4" + 22 + "A" + 19 + "T" + 19));
        data.add(new BarCodeInfo("1ZZ" + 19 + "A4" + 19 + 19 + "345" + 19));

        return data;
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

