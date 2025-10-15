package com.aspose.external.barcode.tester.releases.v25_8;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import com.aspose.barcode.licensing.LicenseType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Issue39321
{
    final String Folder = Global.getTestDataFolder("Issues/Issue39321");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense(LicenseType.Total);
    }
    
    @Test
    public void testHighQualityBarcodesEAN13()
    {
        for(TestCaseParams testParams : getTestCasesList())
        {
            BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, testParams.filename), DecodeType.EAN_13);
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(testParams.expectedCodetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    public static class TestCaseParams
    {
        public String filename;
        public String expectedCodetext;

        public TestCaseParams(String filename, String expectedCodetext) {
            this.filename = filename;
            this.expectedCodetext = expectedCodetext;
        }

        public String toString()
        {
            return filename;
        }
    }

    public static List<TestCaseParams> getTestCasesList()
    {
            return Arrays.asList(
                new TestCaseParams("1-False-0FA0A58609DB657428D742853045F480.png", "6269572201237"),
                new TestCaseParams("1-False-10B22537FDE094C1A2394E92DB3DB982.png", "6583257965314"),
                new TestCaseParams("1-False-12DEAE056E18B93D5A32634370B3D289.png", "3337875684118"),
                new TestCaseParams("1-False-14EB6BF81F453316988E9DB52BF5C174.png", "6928001837347"),
                new TestCaseParams("1-False-154165551F0EBC461D18D5274791695F.png", "5902232617610"),
                new TestCaseParams("1-False-1C6E57BA1D4B6EAB6C518B4BB62DE190.png", "8590344718256"),
                new TestCaseParams("0-False-08B15722D020A69BEAA4E241997277A5.png", "6268167900050"),
                new TestCaseParams("0-False-A157A9B9324DB67CEFED858462E3AA57.png", "6954132666785"),
                new TestCaseParams("0-False-B45743B82706FC6C61C40AA7F7746E15.png", "8809099262489"),
                new TestCaseParams("1-False-21954EAB0C28555912139B696B23991D.png", "6923021858822"),
                new TestCaseParams("1-False-0180FA0D5AD7883A4DD8526D58682EAD.png", "6987945990013"),
                new TestCaseParams("1-False-01BD6D5D6D9A0917837F1F5157B3522A.png", "3600531465230"),
                new TestCaseParams("1-False-04ABAA2DD7BD8E79C26D133D2A1E039D.png", "0618059018411"),
                new TestCaseParams("1-False-099689029D52A59A1056F10E2C81E0B6.png", "0637665735383"),
                new TestCaseParams("1-False-0CB9D867D385D42E70C880FF188C2816.png", "6924452311504"),
                new TestCaseParams("1-False-1DCA0866A0A328E80C1434108FA2BC1C.png", "3348901636247"),
                new TestCaseParams("1-False-1FC7959EF2436615DF2C7D25D4A848F8.png", "0012868878271"),
                new TestCaseParams("1-False-20440644643FFDF065E91DD42862EDC0.png", "8991002103085")
            );
    }
}
