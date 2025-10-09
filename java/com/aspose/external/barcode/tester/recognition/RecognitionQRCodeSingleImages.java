package com.aspose.external.barcode.tester.recognition;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RecognitionQRCodeSingleImages
{

    private String _folder;

        @BeforeMethod
    public void SetupTestFixture()
    {
        this._folder = Global.getTestDataFolder("Recognition\\QRCode");
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("QR")]
    public void test_qr_a_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_a.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("A", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_b_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_b.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("B", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_ab_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_ab.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("AB", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_abcd_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_abcd.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ABCD", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_abcdefg_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_abcdefg.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ABCDEFG", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_abcdefghij_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_abcdefghij.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ABCDEFGHIJ", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_abcdefghijklmnop_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_abcdefghijklmnop.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ABCDEFGHIJKLMNOP", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_abcdefghijklmnopqrstuvwxyz_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_abcdefghijklmnopqrstuvwxyz.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_error1_a_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_error1_a.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("A", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_error2_a_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_error2_a.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("A", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_error3_a_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_error3_a.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("A", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_error4_a_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_error4_a.png"), DecodeType.QR);
        {
            reader.getQualitySettings().setAllowIncorrectBarcodes(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("A", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_error5_a_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_error5_a.png"), DecodeType.QR);
        {
            reader.getQualitySettings().setAllowIncorrectBarcodes(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("A", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_error4_a_png_QR2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_error4_a.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_error5_a_png_QR2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_error5_a.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_error6_a_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_error6_a.png"), DecodeType.QR);
        {
            reader.getQualitySettings().setAllowIncorrectBarcodes(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("A", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_error7_a_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_error7_a.png"), DecodeType.QR);
        {
            reader.getQualitySettings().setAllowIncorrectBarcodes(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("A", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_error6_a_png_QR2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_error6_a.png"), DecodeType.QR);
        {
            reader.getQualitySettings().setAllowIncorrectBarcodes(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("A", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_error7_a_png_QR2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_error7_a.png"), DecodeType.QR);
        {
            reader.getQualitySettings().setAllowIncorrectBarcodes(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("A", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_error8_a_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_error8_a.png"), DecodeType.QR);
        {
            reader.getQualitySettings().setAllowIncorrectBarcodes(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("A", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_error9_a_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_error9_a.png"), DecodeType.QR);
        {
            reader.getQualitySettings().setAllowIncorrectBarcodes(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("A", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_error10_a_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_error10_a.png"), DecodeType.QR);
        {
            reader.getQualitySettings().setAllowIncorrectBarcodes(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("A", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_error8_a_png_QR2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_error8_a.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_error9_a_png_QR2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_error9_a.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_error10_a_png_QR2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_error10_a.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_error3_ab_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_error3_ab.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("AB", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_error2_b_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_error2_b.png"), DecodeType.QR);
        {
            reader.getQualitySettings().setAllowIncorrectBarcodes(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("B", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_error2_b_png_QR2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_error2_b.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_error_abcd_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_error_abcd.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ABCD", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_error_abcdefghij_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_error_abcdefghij.png"), DecodeType.QR);
        {
            reader.getQualitySettings().setAllowIncorrectBarcodes(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ABCDEFGHIJ", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_error_abcdefghij_png_QR2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_error_abcdefghij.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_error_abcdefghijklmnop_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_error_abcdefghijklmnop.png"), DecodeType.QR);
        {
            //reader.RecognitionMode = RecognitionMode.MaxBarCodes;
            reader.getQualitySettings().setAllowIncorrectBarcodes(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ABCDEFGHIJKLMNOP", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_error_abcdefghijklmnop_png_QR2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_error_abcdefghijklmnop.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_error2_abcdefghijklmnopqrstuvwxyz_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_error2_abcdefghijklmnopqrstuvwxyz.png"), DecodeType.QR);
        {
            reader.getQualitySettings().setAllowIncorrectBarcodes(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_error2_abcdefghijklmnopqrstuvwxyz_png_QR2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_error2_abcdefghijklmnopqrstuvwxyz.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("QR")]
    public void test_Extreme_QR_code_to_Wikipedia_mobile_page_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Extreme_QR_code_to_Wikipedia_mobile_page.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("http://en.WIKIPEDIA.ORG", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_error_correction_levels1_first_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "error_correction_levels1_first.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("http://www.qrstuff.com", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_error_correction_levels1_levelL_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "error_correction_levels1_levelL.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("http://www.qrstuff.com", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_error_correction_levels1_levelM_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "error_correction_levels1_levelM.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("http://www.qrstuff.com", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_error_correction_levels1_levelQ_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "error_correction_levels1_levelQ.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("http://www.qrstuff.com", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_error_correction_levels1_levelH_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "error_correction_levels1_levelH.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("http://www.qrstuff.com", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_qrbarcode_empty_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qrbarcode_empty.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_qrbarcode_empty_byte_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qrbarcode_empty_byte.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_DemoA_Png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "DemoA.Png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("a", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_DemoB_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "DemoB.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("b", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_Digits_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Digits.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0123456789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_Combined_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Combined.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_Bytes_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Bytes.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("\0\t\n\r !\"#$%&\'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOP" +
                    "QRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_Numeric_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Numeric.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("818389613881102510740788481786261306918734469674783223713089793652970659101632971" +
                    "79929385839299317066931240211800170934681123672074512113868916492911947248581867" +
                    "72462970560666757217510373745320011917721153306709096916119912423964583948545796" +
                    "69462330947088197393411161483703122187906550020676628525820194624495591949786113" +
                    "07170855073577118366351757788386160139159357552676934405532306768730697911799329" +
                    "51124526655968526898219789237052038955234631483264214463133438959383057165357830" +
                    "69738476647118957810991060580152937316755276750857897207876799548517064115572521" +
                    "07232657305499656272337937816343457262219449101199097976930584005294149405398783" +
                    "66272455702326344449060406915781569213706460161328443829576543902175712163259923" +
                    "56973376496462635680865153806796420832693117484479031258081956979093279398674766" +
                    "84376642717507471474911907326743240022036660032248509277246831697435634834824196" +
                    "41771330738861940635065147654420594238731283462153187367562467520736770289478278" +
                    "44903331367753637536264829079893840275964121936530029058017335256480245166213289" +
                    "34487637911675299745452858628447370803700111393032168258263901956329548603534155" +
                    "45962891226398092549734934646230174422284073856136187580092824498512457926466018" +
                    "84001535933204595852347791511140839844721620248804075853631992478336465103171654" +
                    "37061740862137291529013399627729866218608378448201564632367202213226108391073494" +
                    "03151652249413050641111032625688721606977047132514669739212992665079235377407380" +
                    "01119199814849844720623792923229228815641700969789690847831626658461103908982283" +
                    "31346384819830140424076857828555483022855139055065770326558946636334712856983670" +
                    "18637751564749194036103439134428777593588280744659333190519861613696159154892278" +
                    "45840946870736265761474092783982413131141384427821345636085715288732213452909057" +
                    "59616368770463251956955088836279272291141445087194904989352843250128106981541000" +
                    "17413753928383982959680880133483526780126899120417124132753251954585619272279075" +
                    "97162583840279748455457979528636873703287471165848945114928206421449504416897681" +
                    "47707806598750709406252444293163368384533745169187935199425361333448141596340627" +
                    "40052372788681623027109454388487988518107202556701004554059798330160310582099699" +
                    "75873824234584088724964805125643609496928289657411114501107760869098458289577425" +
                    "87045291983991673205589638349337719904061786283637353699741694164617267814480334" +
                    "57019731292634765116653705492193060130762043415677282679330434910856452544360029" +
                    "97249014907093381335582146472183114514297173726015477630509254172487986613841932" +
                    "04576154739049339903481387548995771184008405852195518982328961684337824480407542" +
                    "53433777998551477114253600285847854272466579499767264000972349214079719565767421" +
                    "15175837532991173543299476992425512974557943805530219891579993511747929809624657" +
                    "14511056203946534321675104101679227583002759894333803413840695562371805032882521" +
                    "07687667136323072865125278715212296186867004318011638697230984192402688500711095" +
                    "07945835089458728129153320389761449157330427940134208044361555632790957178863638" +
                    "01444534047958848941492771291717234311873504875994831230967224322072353607799790" +
                    "63068850033435492717025312244412676836444729282527615293765651552176866636330512" +
                    "97267964730707931670066610898621437799825385585579148122155717500837924285577013" +
                    "42295833146331087756586459625450412856515065508647995486673521769692813123142085" +
                    "09885549362739843959168248713335875328131982957246124944154683592695451482817539" +
                    "04661009302734574992528957420275155468826013330470786038571468812768811507640462" +
                    "60595980278873571015725691794881188629638561227718303053490329639779595237726336" +
                    "49755770341383198225582230653370639210719650723067331715752412707065487840682140" +
                    "75859398234673069537586804801226017531031820400109877758905558691755543850666549" +
                    "46914593695364721286546560160923660884568295901033436749945332277260383662725066" +
                    "80364868119492259286316408649139794396295882997402222927386512807070796399152441" +
                    "02478167660097739849177169328748455981163030853218540593431973882164184877613620" +
                    "50191089514491991587990337728808104728623790408686978415076435061539616286410083" +
                    "80429206887422977298699606920959925218785707420676471979172237693759666850388118" +
                    "62534789551364570147609005206819636023458541532055867415243958263172745778906846" +
                    "31510412218795003774503000984093065320680596678288781002841052712473967218301742" +
                    "17063029535896378741952214726010988720811775082446232336474820352490754792018722" +
                    "12797786513559814135917924403187526923746356291938763639587237332593298138856162" +
                    "34643238964454190136986406258734159908001145445879547025724798013929528112483095" +
                    "03781961241842130225163504255316287511932170007911808434918761582455552928299249" +
                    "73345088525922706886513698791356780381315602926011314845964639617924242446180176" +
                    "27709429443166860940028789686558974516136397017875816760801073289419224370372167" +
                    "17016322136040521086986404354887349030251978639740613072151206825870059082401786" +
                    "55032643679889551437686915205703656454983343601879964096812734886513309644334320" +
                    "34367495595412494560985702197625823912126583444294886205865429896069858244439225" +
                    "89927486181466967963843465427755306306122980436858606863656196942515966073186293" +
                    "96780595326409360389108825226873522380365526910805724019785427855397797001357181" +
                    "54210494126048487716230177236515949856413464365175800282313326851019853039387570" +
                    "20517147674331976033552127719058321106895331197105161456748933852600076914722103" +
                    "05038869743679615785861292576246459824749135401175642443384529240621089004573678" +
                    "04916939154301209857891965488697055891802304350825851000294155045735640804449661" +
                    "55638460445966573586242840565516336996611212811397137090388899582852058697593093" +
                    "81784783456087217390582495404972950726459285878143201979939828848412759084030752" +
                    "73517610807975213364553941168392770927712146792329960161966554141510428655131614" +
                    "88493216089602680941828913059302426792094505226383311066057015678717698795721269" +
                    "77669804596440789275087945262447883399796626242988384089072364215855639958936070" +
                    "23830537043173324013872493361439010268195752071157959315134626560315205681701941" +
                    "22145706951244791916568513786031924041033557831447927755363201081021064088300167" +
                    "12381032686878315657194728493552960781706951063942535961865364913480763395114275" +
                    "54419270098153420485822881308465897298117707717509104172262886252236522237801407" +
                    "38983617259352205554819868673617554073151630287047569682802503363189822139327867" +
                    "16350589621716572770071143292649443307583836150745901664421729697136327418723599" +
                    "24576487788768532389244185838408224849323594398323006968038164827954379206564988" +
                    "64054022557001696663439437004930504133877298991896083443451691851750745288614144" +
                    "52079560517811764362310517948283071701650445771710704204155162222374095270296584" +
                    "62385888666554972233067144249186715393745883306304641449513054858074958859818384" +
                    "89354342658706809353214558925211392613045583718818158426489642734731319620773173" +
                    "90171538661343038499874985277523056319283447962903992852519536114828662810542702" +
                    "33646212047907573221332410812198162997516082828458104880122540984983558671424959" +
                    "14649932728649760989359995233552634045945652711738151656464460817590572503379628" +
                    "35944910875714757351101666472878451103774928243657050062338743700635265358628332" +
                    "281571838886502112760839269144490546222880638875", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_Alphanumeric_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Alphanumeric.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Y3XNSAE9NPY417IMWPJDP459:AE019S:U9A:3XTHWUQF2935MVFOGF16CMSETYTIDBRN817S6T:K238NJ" +
                    "AD4AHQUHMVJWM2BT5HZ9J:4VQ9IUFC46F7KNBKSLQPTVFVA4CB7UT9PCLPUNPEFUH:HPJFAXJF8YWPM9" +
                    "BNFB8PJ10CRTF27W4GSPH47AEJQNF3I82YB2MJNVA6ANRHMR5XY0CYL5HRMKB5KQ6RZGDKMXVKNLWRRS" +
                    "UGJE4S6OLTW3VKNV22GUBX:SVG:OY2U3O6C7QZHGMDK36VCS6E0DQFHL8K:V79OH8287A10UVGZR03OZ" +
                    "EDDDKGQW8ZXYD::CJ46IXBKAULY9IQ997BLJQI4NE5QAQSB81QI2:OEMP:80UI7X4IWIG065OY2MKDPB" +
                    "Y67G6UM4LFNS7B4NOENVQBFQZVV1N1D1Y57KX7RC4PX7L83XN9D25J54J3CBS:D6RM1ZPTWP500PMX:S" +
                    "Z6ZCN0DZ6T1FOCA0RBHKYXQGUZMZL7F1031O8IBO3S0OHDOBMS9MOWNEMABG49P1SXBQ2IPDP3V5V5CD" +
                    "L77873R4VEJ5MXORTUA0JRNSK6S6A2XYN5BYRZZ3XGC7S15X4GR227FYVOXS:WXWZWC9K1P8YJBX4THI" +
                    "CXZOIHPGTGV78J21YSMGS3YYRDCM6JNNLAZ0LPAQJXQGENLRZYSLNN56BV:LEEPXNI105W05ZMZUHCM4" +
                    ":G1U6IHOH4NCCAB:2LJF66NIGTLQMMRFZ983R2J738RJIMDRSG0VUJPOIISFA:NTNKT37CZ3H9PX0RJB" +
                    "J1ZRRU3U62GUY1S:MOH3Q5IYA6XCOPHQ:Z5IEWYFYQQ3:GQB4QVJTHBKDU2JAMW9J3RQZJV0JSX36XN9" +
                    "J9K8U1DJHTGF77JCIJV:VW7G6RRDBJ74W:R:CT7LMYNOCHL6EHGW94QFDT7LR9XHRQGUM17XU8S9JWPA" +
                    "PU095BX3XK3FN5S0MVXXL3DZGR:K28KKQ2XHZBE070AEW64XVP1QEIA25XQXK6LDXWSYIPL9LMOFYWNE" +
                    "I70515L8806XMUMH721ON:RFE9FKVJO2QAHKQL4MNQQTJBCW6N77UQKESS47Q7YKTBQ0IO8YXX:5THF:" +
                    "GJCR2T3KUX76O0PJ7JF3QE241IWJRFTD59SYSFRP0JIP4KUS798Y3:Y40N:T:N30GQXQF3IPO0J6:NJ6" +
                    "DK7DW3BCHDLKCJGFJTVHU8CRX6DXBS57OONUAYEAAR556U5567OYQ223G1OGX4:I9ONM2F27M60L6FQP" +
                    "XIIXHYHVBGF2WLLPOLN9TR1USR3WVEVUA4KJ7LYUT4F:HCLWJ:JNZ8FGG4K9V4CZ1I3NH2JT3I25NVOE" +
                    "3HHEWI7N:GE0ZWFD0RF6B:8GID873735F7TULVHNOR9N5G70JFT3CDZGU5VONUAZ:J9CQH48UONCIX28" +
                    "17:QI3QFLDQG:WYAGRAPD30Q4428UFFNS3XGFJZRO4NFQ5YUOXZ0:J70W980D3GNQXIHY2:X6D278R11" +
                    "JG846LFPGO818YXJEKB5Q65VJ2A8JUW1L:OY77R5SCPOTHU:LI9YZ4PRBC947WY0DDT9GI3WOVMHPYCZ" +
                    "M2HNVCTCS1L7UHHUDA9ALR05CTI5R542TYD9JG7BPGPY6BQIW0DKR81:1KXY1O1RNM5000MR49QQEIWP" +
                    "3KMXKGDPNONWC::BOSXBO2LIY5FMO6CIDY:UX:J7P868LA00PSDJVWTGTGJF2:U7O1H4FGUPCAQSVWFQ" +
                    "V7UFVPHS9LOPZKPW7IKQSHG7E:F1EI1JA:CKKLERA6CDL4OXVSVGNXOU3L6GCT6BJL0GB3WOKU:HPGZB" +
                    "U84NENH2DAOCM9ZIZCRJ5QMG892RR3HVDI5FRUWZEN79BW9H2AN5H1XDC8RDY586W:VIZEJYWY2ONRKP" +
                    "6:5Z41UJFML23B569PWUFL:9E45GZ44NW7E9FL1:8010G1XYLSJTDRR5ZLY2:R:PMKT68Z8HUO9PM6NG" +
                    "DNN0YO5HWEU07D2:ZUTXGP75:EYPND6ED965T1:HV0H2SMWE6S7QKZBY0SWO54FQP7D6G2EBY1YLD0E7" +
                    "QIG229UAHIL0DK220H2TGYWJG:FST2KKP4AFDF08E413R5DWJGJBHOAJO1:SVYPZ6SXHZ7Q877VKX:C1" +
                    "HBTPIZ6LFBPI92:H2HCYQ1P01S7:7SKDJ78YM8B3MOX6RFIG56JWJPKFS0444RV08KKV0XI9RPB3YVP5" +
                    "DR05JQZYDUQRN9334LWDIRXS4WMR9AFHZ31189NJ6TB4LNDOVQYR8KA5OYKY1BGZOVC3Q:X3O6G8TXA2" +
                    "LNO3XKGH:6RCGVVNB0YOS1O7BTSI1Y9Z:XZIUODSFJEXV6TX8D18BIKEZEP5V97GUUD3OXF8LL:MSA67" +
                    "YB0W9IS50M18B3L5Y:VG:KG7UGRQZ89UMI44HAIO8STATPEMEZUMGS3X:9BSY39HYYEY2XD:UJ1CG3BF" +
                    "Q5S7XL3NFMEALW9EOGGHHCRKR8X3XF5MWKM1LPE48NUBS279SQBAAP4ZLY:TA4:SK2US4NVWR0BQG3RW" +
                    "M4MDWC2825G3AVRNSGP92EZHFQ8080TXK7R3HHM5OQCMG028QK77XXB3VSFLPQN6WODVT5C9NVYOGZ47" +
                    "QY12TKGBLJSU4WA7OIUB9M:FQXKQZFUXKNDBKTHBYMWLELGKKZQHQ2H290MK5M2K:AEB74EQ1IDB8CKJ" +
                    "EWXCYSLQVDKT6FY:B0OBH2YTKXQ:NEO2WDI38APGS7U5D1Z2NCROGKC335J6IECBH615170F6UJXWCVJ" +
                    "X7BJF84Q:ZSF4UIITYJ:AQPZ9ZKQSMECJIMUXB6UH39VDVFSGKP953FI594GK3IH912EQ8NC:25GV711" +
                    "AHO38WKVW7:TJ76ORJ9F2PCZEJKA4640H:R7YL87506P4D3W65K5B2SM57NP22WQC8KO6:BY4OWY3B14" +
                    "CIJ52GOL6SZXZMVDFAP0QUNDC0JINRYSK6R6V1CRS6RCKAUPUUNK2GFLILBCF6OZPGCS8M4U4AOCAMB7" +
                    "4MJ59GV:RKJN3OLVSM3RIAHA7J77KOL572W6BESVXH4DQO773X7V9E1:6QRC92NNQ3WLJKACGZ1YHAEQ" +
                    "K4Z6G2L:71FDCTTJBB886KIZ3ON:3BDBH:QGRSXTZNUWMZAUQIT:8AIXBADTTDDJRUSE6UWME49MN:NU" +
                    "8K86IGHNW25ZZG7V31ZJ6S5KEMRB6DEWG6XCP4TPLDXGH35V4B2Y2M:J:REPYRM20AAQQJGA9F3U5SAC" +
                    "HKQXQBG0OTVMC5Y:N7:IQNR10T4:MYA0:6N65I4U07DZ9TPD6OF4H5Z1IJEQIFUZXVBGW4OHOCCT0J2Q" +
                    "IBCIZHZRKQ5QRGYHJL7LH:WCMNRSUH05DR4IYLX0PP3I3MS0QEW8EF5BZ6:Z0HOWADFIIMY:7SXIFTXL" +
                    "7GCCVOK8PMC95G84MUQUS2M0IJ3GOFSIV2UGFYTIY:CO93AIPHU8KMI2W:ST1RN5NI:49SLM7KUA6KJN" +
                    "CYBN9M4L5YB:IU9L5MLM5HQMFQ85BQHF1UNY403ECQFQMJ4B4YWL3556G3J1G0E6Q3N41WDMF30Y385E" +
                    "1IH:O6W2HQ0K1NNAEQDDL10ST28HF91RULCKPQI8SPC2HCCKDU4VU30XBSQQM6KMUNA3FGJJODS9D46R" +
                    "MNDARNI7TE9FWLXGUXU341RU286T1JV6II266V7E5K6F:JXMLQPP0M8:0XFNPJNEC01JMS83OVRN7247" +
                    "9VEAUGYJ8GRWB4:QJMWZ62NF0XWVKQSQ8:XXFVFHYEQ9J4KP571LO:5QT098O2G7QV4TVAETDKB9UNJ8" +
                    "BY2AJQRYSOG357L87Y830USSXOWNGW:0243T96USJ:VS8S2ZWRGJMSV4HLN4XLO1WTK2P787WVC4JRVY" +
                    "YCHYZFZZGFGERAFT8XXQ2ZFQ627:AAO11541FAELRHGK:KQC3ZFRHD8OQ2XXRFDOBUEKCJUIW1I1FPHI" +
                    ":VQJTST7VZKM6TVTZYICKP:M06U:4CEHXU6VTE9LMDPMRPAT0YK3D:OIKPS3DNRBI:5C:V8NTB50BU8B" +
                    "43ZUP13B0LQ5MVE0MCXA3QZHC3BD9IPP1N8GGK5Z2RQ5UY3C9NCAEI2FC9XV26YVA1WGXUHUEAIH79EL" +
                    "GI553H0PPVJRKC602RG:GQCQABM8RP2:MW8EC90YROXG:I3881LGZ97SN4ID7GKZAVU71I4B18K:R8Q0" +
                    ":BPLX78QWR1LO33FYSH:AR4FSBJW:CF1IEGMLQKVVH5OOC99TN8S6WL", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
