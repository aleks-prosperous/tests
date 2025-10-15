package com.aspose.external.barcode.tester.releases.v80;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CollectionAssert;

import java.util.ArrayList;
import java.util.List;

public class Issue36212
{
    final String folder = Global.getTestDataFolder("Issues");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void testBarcodeBuilderRecognizer()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36212\\Many_Barcodes_example.png"), DecodeType.CODE_128);
        {
            List<String> actualTexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            actualTexts.add(result.getCodeText());

            String[] expectedTexts = new String[118];
            expectedTexts[0] = "JM100041";
            expectedTexts[1] = "JM100047";
            expectedTexts[2] = "JM100011";
            expectedTexts[3] = "JM100016";
            expectedTexts[4] = "JM100045";
            expectedTexts[5] = "JM100042";
            expectedTexts[6] = "JM100048";
            expectedTexts[7] = "JM100012";
            expectedTexts[8] = "JM100017";
            expectedTexts[9] = "JM100009";
            expectedTexts[10] = "JM100043";
            expectedTexts[11] = "JM100049";
            expectedTexts[12] = "JM100013";
            expectedTexts[13] = "JM100018";
            expectedTexts[14] = "JM100015";
            expectedTexts[15] = "JM100044";
            expectedTexts[16] = "JM100008";
            expectedTexts[17] = "JM100014";
            expectedTexts[18] = "JM100019";
            expectedTexts[19] = "JM100020";
            expectedTexts[20] = "JM100021";
            expectedTexts[21] = "JM100022";
            expectedTexts[22] = "JM100023";
            expectedTexts[23] = "JM234196";
            expectedTexts[24] = "JP100093";
            expectedTexts[25] = "RT100099";
            expectedTexts[26] = "AE100090";
            expectedTexts[27] = "BS100096";
            expectedTexts[28] = "GO100092";
            expectedTexts[29] = "LG100091";
            expectedTexts[30] = "JS100050";
            expectedTexts[31] = "JS100051";
            expectedTexts[32] = "JS100052";
            expectedTexts[33] = "JS100053";
            expectedTexts[34] = "JS100054";
            expectedTexts[35] = "JS100055";
            expectedTexts[36] = "JS100056";
            expectedTexts[37] = "JS100057";
            expectedTexts[38] = "JS100058";
            expectedTexts[39] = "JS100059";
            expectedTexts[40] = "JB100147";
            expectedTexts[41] = "JB100148";
            expectedTexts[42] = "JB100149";
            expectedTexts[43] = "JB100150";
            expectedTexts[44] = "JB100151";
            expectedTexts[45] = "JB100152";
            expectedTexts[46] = "JB100153";
            expectedTexts[47] = "JB234199";
            expectedTexts[48] = "JB234200";
            expectedTexts[49] = "DD100060";
            expectedTexts[50] = "DD100066";
            expectedTexts[51] = "DD100067";
            expectedTexts[52] = "JS100036";
            expectedTexts[53] = "JS100037";
            expectedTexts[54] = "JS100038";
            expectedTexts[55] = "JS100039";
            expectedTexts[56] = "JS100029";
            expectedTexts[57] = "JS100030";
            expectedTexts[58] = "JS100031";
            expectedTexts[59] = "RD100089";
            expectedTexts[60] = "MC100116";
            expectedTexts[61] = "MC100117";
            expectedTexts[62] = "MC100118";
            expectedTexts[63] = "MC100119";
            expectedTexts[64] = "MC100120";
            expectedTexts[65] = "MC100121";
            expectedTexts[66] = "MC100122";
            expectedTexts[67] = "MC100123";
            expectedTexts[68] = "MC100124";
            expectedTexts[69] = "MC100125";
            expectedTexts[70] = "MC100126";
            expectedTexts[71] = "MC100127";
            expectedTexts[72] = "MC100128";
            expectedTexts[73] = "MC100129";
            expectedTexts[74] = "MC100130";
            expectedTexts[75] = "MC100131";
            expectedTexts[76] = "MC100132";
            expectedTexts[77] = "MC100133";
            expectedTexts[78] = "MC100134";
            expectedTexts[79] = "MC100135";
            expectedTexts[80] = "MC100136";
            expectedTexts[81] = "MC100137";
            expectedTexts[82] = "JS100032";
            expectedTexts[83] = "JS100033";
            expectedTexts[84] = "JS100034";
            expectedTexts[85] = "JS100035";
            expectedTexts[86] = "JS100026";
            expectedTexts[87] = "JS100027";
            expectedTexts[88] = "JS100028";
            expectedTexts[89] = "DD100068";
            expectedTexts[90] = "DD100069";
            expectedTexts[91] = "DD100070";
            expectedTexts[92] = "DD100071";
            expectedTexts[93] = "DD100072";
            expectedTexts[94] = "DD100073";
            expectedTexts[95] = "DD100074";
            expectedTexts[96] = "DD100075";
            expectedTexts[97] = "DD100076";
            expectedTexts[98] = "DD100077";
            expectedTexts[99] = "DD100078";
            expectedTexts[100] = "DD100079";
            expectedTexts[101] = "DD100080";
            expectedTexts[102] = "DD100081";
            expectedTexts[103] = "DD100082";
            expectedTexts[104] = "DD100083";
            expectedTexts[105] = "DD100084";
            expectedTexts[106] = "DD100085";
            expectedTexts[107] = "KS100098";
            expectedTexts[108] = "JW100100";
            expectedTexts[109] = "BS100095";
            expectedTexts[110] = "JR100094";
            expectedTexts[111] = "MC100088";
            expectedTexts[112] = "MC100113";
            expectedTexts[113] = "MC100114";
            expectedTexts[114] = "MC100115";
            expectedTexts[115] = "PS100097";
            expectedTexts[116] = "JS100024";
            expectedTexts[117] = "JS100025";

            CollectionAssert.areEquivalent(expectedTexts, actualTexts, " File 'Issue36212\\Many_Barcodes_example.png': Expected and actual collections of code texts do not meet requirements.");
        }
        System.out.println("Test for \"Issue36212\\Many_Barcodes_example.png\" has completed successfully.");
    }
}
