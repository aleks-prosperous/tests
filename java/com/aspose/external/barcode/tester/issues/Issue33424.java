//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33424.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="28.01.2013 12:00:08">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BaseDecodeType;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Test(description = "Tests for Issue33424.")
public class Issue33424
{
    private final String PostalFolder = Global.getTestDataFolder("Issues/Issue33424/Postal");
    private final String TwoDFolder = Global.getTestDataFolder("Issues/Issue33424/2D");

    private List<RecognitionItem> PostalItems;
    private List<RecognitionItem> TwoDItems;

        @BeforeMethod
    public void SetUp()
    {
        utils.LicenseAssistant.setupLicense();

        //>>>>>>>> #region  Postal

        PostalItems = new ArrayList<RecognitionItem>();

        List<Point> points = new ArrayList<Point>();
        points.add(new Point(16, 4));
        points.add(new Point(162, 4));
        points.add(new Point(162, 22));
        points.add(new Point(16, 22));
        PostalItems.add(new RecognitionItem(DecodeType.AUSTRALIA_POST, points));

        points = new ArrayList<Point>();
        points.add(new Point(16, 4));
        points.add(new Point(274, 4));
        points.add(new Point(274, 16));
        points.add(new Point(16, 16));
        PostalItems.add(new RecognitionItem(DecodeType.ONE_CODE, points));

        points = new ArrayList<Point>();
        points.add(new Point(16, 4));
        points.add(new Point(162, 4));
        points.add(new Point(162, 15));
        points.add(new Point(16, 15));
        PostalItems.add(new RecognitionItem(DecodeType.PLANET, points));

        points = new ArrayList<Point>();
        points.add(new Point(16, 4));
        points.add(new Point(162, 4));
        points.add(new Point(162, 15));
        points.add(new Point(16, 15));
        PostalItems.add(new RecognitionItem(DecodeType.POSTNET, points));

        points = new ArrayList<Point>();
        points.add(new Point(16, 4));
        points.add(new Point(134, 4));
        points.add(new Point(134, 22));
        points.add(new Point(16, 22));
        PostalItems.add(new RecognitionItem(DecodeType.RM_4_SCC, points));

        TwoDItems = new ArrayList<RecognitionItem>();

        points = new ArrayList<Point>();
        points.add(new Point(16, 4));
        points.add(new Point(35, 4));
        points.add(new Point(35, 23));
        points.add(new Point(16, 23));
        TwoDItems.add(new RecognitionItem(DecodeType.DATA_MATRIX, points));

        points = new ArrayList<Point>();
        points.add(new Point(16, 4));
        points.add(new Point(58, 4));
        points.add(new Point(58, 46));
        points.add(new Point(16, 46));
        TwoDItems.add(new RecognitionItem(DecodeType.QR, points));

        points = new ArrayList<Point>();
        points.add(new Point(16, 4));
        points.add(new Point(45, 4));
        points.add(new Point(45, 33));
        points.add(new Point(16, 33));
        TwoDItems.add(new RecognitionItem(DecodeType.AZTEC, points));

        points = new ArrayList<Point>();
        points.add(new Point(16, 4));
        points.add(new Point(185, 4));
        points.add(new Point(185, 66));
        points.add(new Point(16, 66));
        TwoDItems.add(new RecognitionItem(DecodeType.PDF_417, points));

        points = new ArrayList<Point>();
        points.add(new Point(16, 4));
        points.add(new Point(423, 4));
        points.add(new Point(423, 633));
        points.add(new Point(16, 633));
        TwoDItems.add(new RecognitionItem(DecodeType.MACRO_PDF_417, points));

        points = new ArrayList<Point>();
        points.add(new Point(118, 45));
        points.add(new Point(388, 45));
        points.add(new Point(388, 155));
        points.add(new Point(118, 155));
        TwoDItems.add(new RecognitionItem(DecodeType.MICRO_PDF_417, points));
    }

        @Test
    public void test_Postal()
    {
        for(BaseDecodeType symbology : getPostalSymbologies())
        {
            RecognitionItem item = FindItem(symbology, PostalItems);
            Assert.assertNotNull(item);

            String fileName = Global.pathCombine(PostalFolder, symbology + ".Png");
            BarCodeReader reader = new BarCodeReader(fileName, symbology);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                for (Point p : reader.getFoundBarCodes()[0].getRegion().getPoints())
                    Assert.assertTrue(isPointInRegion(p, item.Region, 3), "Invalid point: "+ p.getX() + "." + p.getY());
            }
        }
    }

    public static List<BaseDecodeType> getPostalSymbologies()
    {
        
        {
            List<BaseDecodeType> symbs = new ArrayList<BaseDecodeType>();
            symbs.addAll(Arrays.asList(DecodeType.AUSTRALIA_POST, DecodeType.ONE_CODE, DecodeType.PLANET, DecodeType.POSTNET, DecodeType.RM_4_SCC));
            return symbs;
        }
    }

        @Test
    public void test_2D()
    {
        for(BaseDecodeType symbology : getTwoDSymbologies())
        {
            RecognitionItem item = FindItem(symbology, TwoDItems);
            Assert.assertNotNull(item);

            String fileName = Global.pathCombine(TwoDFolder, symbology + ".Png");
            BarCodeReader reader = new BarCodeReader(fileName, symbology);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                for (Point p : reader.getFoundBarCodes()[0].getRegion().getPoints())
                    Assert.assertTrue(isPointInRegion(p, item.Region, 3), "Invalid point: "+ p.getX() + "." + p.getY());
            }
        }
    }

    public static List<BaseDecodeType> getTwoDSymbologies()
    {
            List<BaseDecodeType> symbs = new ArrayList<BaseDecodeType>();
            symbs.addAll(Arrays.asList(DecodeType.DATA_MATRIX, DecodeType.QR, DecodeType.AZTEC,
                    DecodeType.PDF_417, DecodeType.MACRO_PDF_417, DecodeType.MICRO_PDF_417));
            return symbs;
    }

    private static RecognitionItem FindItem(BaseDecodeType symbology, List<RecognitionItem> items)
    {
        for (RecognitionItem item : items)
        if (item.Symbology == symbology)
            return item;

        return null;
    }

    protected static boolean isPointInRegion(Point pt, List<Point> region, double maxDist)
    {
        for (Point p : region)
        {
            int lXDiff = (int) (pt.getX() - p.getX());
            int lYDiff = (int) (pt.getY() - p.getY());
            double lDiff = Math.sqrt(lXDiff * lXDiff + lYDiff * lYDiff);
            if (lDiff <= maxDist)
                return true;
        }
        return false;
    }
}

class RecognitionItem
{
    public BaseDecodeType Symbology;
    public List<Point> Region;

    public RecognitionItem(BaseDecodeType symbology, List<Point> region)
    {
        Symbology = symbology;
        Region = new ArrayList<Point>();
        for(Point p : region)
            Region.add(p);
    }
}

