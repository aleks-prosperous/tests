//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33606.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="23.07.2013 14:40:57">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.logger.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.awt.*;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@Test(description = "Tests for Issue-33606.")
public class Issue33606
{
    final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33606");

    @BeforeMethod
    public void setUp(Method testMethod)
    {
        LicenseAssistant.setupLicense();
        Logger.methodStarted(getClass().getName() + "." + testMethod.getName());
    }


    @Test
    public void sortedRecognition()
    {
        String path = Global.pathCombine(folder, "MultipleBarcodes.tif");
        List<FoundBarCodes> found = new ArrayList<FoundBarCodes>();
        final BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        for(BarCodeResult result : reader.readBarCodes())
        found.add(new FoundBarCodes(result.getCodeText(), result.getRegion()));

        Arrays.sort(found.toArray(new FoundBarCodes[found.size()]), new FoundComparator());

        List<String> correctOrder = new ArrayList<String>();
        correctOrder.add("0987654321");
        correctOrder.add("124567890");
        correctOrder.add("5544221100");
        correctOrder.add("QWERTYUIOP");
        correctOrder.add("zxcvbnm");
        correctOrder.add("768976890");
        correctOrder.add("BBH124567890");
        correctOrder.add("BBH98765421");
        correctOrder.add("ABDEFGHIJ");
        correctOrder.add("LMNNOPRTUVYZ");

        Assert.assertEquals(correctOrder.size(), found.size());
        for (int i = 0; i < correctOrder.size(); ++i)
        {
            Assert.assertEquals(correctOrder.get(i), found.get(i).codetext);
        }
    }

    private class FoundBarCodes
    {
        public FoundBarCodes()
        {
            this.codetext = null;
            this.region = null;
        }

        public final String codetext;
        public final BarCodeRegionParameters region;

        public FoundBarCodes(String text, BarCodeRegionParameters reg)
        {
            codetext = text;
            region = reg;
        }

        //JAVA-added structs clone 

        public void CloneTo(FoundBarCodes that)
        {
        }

        public FoundBarCodes Clone()
        {
            FoundBarCodes struct = new FoundBarCodes();
            CloneTo(struct);
            return struct;
        }

        public Object clone()
        {
            return Clone();
        }


        //JAVA-added Equality members 

        private boolean EqualsByValue(FoundBarCodes that)
        {
            return that.codetext.equals(codetext) && that.region.equals(region);
        }

        public boolean equals(Object obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            if (!(obj instanceof FoundBarCodes))
            {
                return false;
            }
            return EqualsByValue((FoundBarCodes) obj);
        }

        public boolean equals(FoundBarCodes obj1, FoundBarCodes obj2)
        {
            return obj1.equals(obj2);
        }

    }

    //>>>>>>>> #region  FoundComparator

    private class FoundComparator implements Comparator<FoundBarCodes>
    {
        public int compare(FoundBarCodes found1, FoundBarCodes found2)
        {
            Point found1XYMin = new Point(Integer.MAX_VALUE, Integer.MAX_VALUE);
            Point found2XYMin = new Point(Integer.MAX_VALUE, Integer.MAX_VALUE);
            for (Point p : found1.region.getPoints())
            {
                if (p.getX() < found1XYMin.getX() && p.getY() < found1XYMin.getY())
                {
                    found1XYMin.setLocation(p.x, p.y);
                }
            }
            for (Point p : found2.region.getPoints())
            {
                if (p.getX() < found2XYMin.getX() && p.getY() < found2XYMin.getY())
                {
                    found2XYMin.setLocation(p.x, p.y);
                }
            }

            if (found1XYMin.getX() < found2XYMin.getX() && found1XYMin.getY() < found2XYMin.getY())
            {
                return -1;
            }
            if (found1XYMin.getX() > found2XYMin.getX() && found1XYMin.getY() > found2XYMin.getY())
            {
                return 1;
            }

            if (found1XYMin.getY() < found2XYMin.getY())
            {
                return -1;
            }
            if (found1XYMin.getY() > found2XYMin.getY())
            {
                return 1;
            }

            return 0;
        }
    }
}
