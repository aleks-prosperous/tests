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

public class Issue39347
{
    final String Folder = Global.getTestDataFolder("Issues/Issue39347");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense(LicenseType.Total);
    }

    @Test
    public void testHighQualityBarcodesInterleaved2of5()
    {
        for(TestCaseParams testParams : getTestCasesList())
        {
            BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, testParams.filename), DecodeType.INTERLEAVED_2_OF_5);
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals(testParams.expectedCodetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    public static class TestCaseParams
    {
        public String filename;
        public String expectedCodetext;

        public TestCaseParams(String filename, String expectedCodetext) 
        {
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
                new TestCaseParams("0-False-016AF512DA3259AFCA3EF2925F111217.png", "0325805336"),
                new TestCaseParams("0-False-7312B42A9405AFBDE8672BF246C1BE1E.png", "005853"),
                new TestCaseParams("0-False-8EEC0503AEDDCD18CC489E0A51D95F56.png", "000857"),
                new TestCaseParams("0-False-9BECA55F57664623E43F4BE97BF5DBCC.png", "2476641542"),
                new TestCaseParams("0-False-B49F57580FEA09DBF1152A993E32AE0D.png", "0021253894"),
                new TestCaseParams("0-False-C0C5DBB3DEC1CF867F21829E757EAB22.png", "07197700630019"),
                new TestCaseParams("0-False-E898FD4428FFE58C4D84998EEDD5B3C3.png", "0000000000022116"),
                new TestCaseParams("0-False-E8E58BC3284FCA89FFB34F154DFB7B4E.png", "0000000000811331"),
                new TestCaseParams("0-True-0CAE5DABB0848FF09BCBFEC6B08DC44C.png", "08001841742304"),
                new TestCaseParams("0-True-0CB172F348B9C5F647FD3F40DFBB75CA.png", "567091"),
                new TestCaseParams("0-True-129F19F1BA9E5D3BC73FA2E1662652DD.png", "107130110962038495"),
                new TestCaseParams("0-True-23EF6E43170C9436FBDD15DEAEE0F202.png", "44000135130669"),
                new TestCaseParams("0-True-246CC64E2745DCD6C4C7E7030AA72809.png", "16045810040038"),
                new TestCaseParams("0-True-3102F2BD72E77FAE640139794B753B31.png", "000130"),
                new TestCaseParams("0-True-3160EA1CF8D3393F20804896DBD82134.png", "0950049263"),
                new TestCaseParams("0-True-344392504BDDFBCF7FEDC54488123212.png", "000956"),
                new TestCaseParams("0-True-3B208191542EC2903B2C1A0AA076DC78.png", "5070330421"),
                new TestCaseParams("0-True-5BCBC65821F0C1FFCAC14D288A3BAD96.png", "882927091370"),
                new TestCaseParams("0-True-6CF59BB8E2DEC0591EA6D832872A6AAE.png", "44000135130669"),
                new TestCaseParams("0-True-6F69747B755495A64613D11D8DB95536.png", "20120804999998"),
                new TestCaseParams("0-True-7833D0F8AF20FE99A854C1A7BE60742A.png", "10639192661026"),
                new TestCaseParams("0-True-7E479ADEF5AB0074F3048EF4AACC0B2E.png", "000154"),
                new TestCaseParams("0-True-8054B1E5C5DEDA10CD61A33DEB90EBAB.png", "05378915"),
                new TestCaseParams("0-True-96E9617AA35EFB53AF5411D6B7E88DCB.png", "20512105999996"),
                new TestCaseParams("0-True-9A147F2351AD6294615CF1367E554FFC.png", "0509092000100161"),
                new TestCaseParams("0-True-9A6757F54E3321D2A0B97380B12F2FDD.png", "20120877999994"),
                new TestCaseParams("0-True-A8B935669E48D34FCBE9EE47705B8B06.png", "1115136500264410"),
                new TestCaseParams("0-True-C4C9E4B2064A9F8C3098D1A4286573E7.png", "15136500238156"),
                new TestCaseParams("0-True-CAE7D90B48F01842494298DD1D69AC56.png", "882927091370"),
                new TestCaseParams("0-True-D061AB52CB43E0B87827D507370205DC.png", "001823"),
                new TestCaseParams("0-True-D9216DB7E2D53F23DC15EB12AFFFED25.png", "000703"),
                new TestCaseParams("0-True-DD49578B6CD0EBCA6B26356874CE97D1.png", "00295478199111000898"),
                new TestCaseParams("0-True-DE2932055BE53958AB958D9C536C1D35.png", "200508736341"),
                new TestCaseParams("0-True-EC78FCC62B35610DFCC78A577767C7C3.png", "05090732800042"),
                new TestCaseParams("0-True-EF1986F0FBC0AEF8A154D1F3A021475F.png", "000888"),
                new TestCaseParams("0-True-F93AE3965D98AB2BAE51EB3BFAAEE840.png", "2162410760440448"),
                new TestCaseParams("0-True-FF4FDABECBF7EF5FDEC3CC5F105DB6FF.png", "140520427518301008"),
                new TestCaseParams("1-False-0A4735E50CEAFED5C1A63BC04CE0C29C.png", "05052519800034"),
                new TestCaseParams("1-False-1D1B4A2551A820A1426E2F210CCAE879.png", "03641312104023"),
                new TestCaseParams("1-False-2E7F9DA4C0E0689577B6BF537BDB6A8F.png", "2416385184"),
                new TestCaseParams("1-False-43E754FB5D72074493038A05338D9596.png", "05522484696340"),
                new TestCaseParams("1-False-4AABD43A75946207C3DEED3C90DCDEC2.png", "0000000000603411"),
                new TestCaseParams("1-False-74CF1074FBA96A3332A75356B2BEA494.png", "3833096727"),
                new TestCaseParams("1-False-8BC0704155EA30CF9EEC3E44180BDA78.png", "1972"),
                new TestCaseParams("1-False-93859EC899624E5553098E4E89FD0F17.png", "00050134015272"),
                new TestCaseParams("1-False-9992BAEFFE60DBEA5F6CE32F17CD3258.png", "10819124020378"),
                new TestCaseParams("1-False-A8AEDC598B5E6382C7491368DFA0FCD4.png", "8541923127"),
                new TestCaseParams("1-False-C034C4D620B8A21DE0DA31498690988C.png", "08906076274357"),
                new TestCaseParams("1-False-D263AC901FFB0333034E9C564B8734A4.png", "882927090500"),
                new TestCaseParams("1-False-DCE7E2E2716A231BADD31729E215520F.png", "5370087202"),
                new TestCaseParams("1-False-FCFDB6D187280F5173996D635A47C2F0.png", "20210739999993")
            );
    }
}
