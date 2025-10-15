package com.aspose.external.barcode.tester.releases.v24_4;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarcodeQualityMode;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.InverseImageMode;
import com.aspose.barcode.licensing.LicenseType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class Issue38911
{
    private final String Folder = Global.getTestDataFolder("Issues/Issue38911");
    
    @BeforeMethod
    public void setUp(Method testMethod)
    {
        utils.LicenseAssistant.setupLicense(LicenseType.Total);
    }

    @Test
    public void test_DarkedLinkOppositeCorner()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "12.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("https://qr.vk.com/ca?q=n7Egy0", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_DarkedLinkOppositeCorner2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "44.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("https://www.threads.net/download/redirect", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_LightnedLinkOppositeCorner()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "186.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("https://shp.ee/kyxgiqe", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_RoundTarget1()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "45.png"), DecodeType.QR);
        {
            reader.getQualitySettings().setInverseImage(InverseImageMode.ENABLED);

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("https://mosalas-restaurant.com/", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_RoundTarget2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "50.png"), DecodeType.QR);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("https://menudigital.ir/shahr_bookcafe", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_RoundTarget3()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "55.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("https://signin.google/qs/yJCKC0Oq?key=AdK2oZR01ACjyVkBK7CS03pQpEUkr7t23rfIfX3UuSM%3D%0A", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_RoundTarget4()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "77.png"), DecodeType.QR);
        {
            reader.getQualitySettings().setInverseImage(InverseImageMode.ENABLED);

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("https://signin.google/qs/jGo7_1wm?key=l2t1pLoOxPRHKWcoGe0KkXHLiCKvUR5zBn7VVBqKi18%3D%0A&t=1&o=1&f=0", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_ArtTarget()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "84.png"), DecodeType.QR);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("https://dnvn.ir/kardasty", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_RoundTarget5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "92.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("https://apps.samsung.com/appquery/appDetail.as?appId=com.sec.android.easyMover", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_RoundTarget6()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "96.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("https://www.fokussindunata.net/l5qze", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
