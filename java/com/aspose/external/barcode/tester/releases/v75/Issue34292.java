package com.aspose.external.barcode.tester.releases.v75;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue34292
{
    final String Folder = Global.getTestDataFolder("Issues/Issue34292");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test_Issue34292_TestY_jpg_DecodeType_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.Folder, "TestY.jpg"), DecodeType.PDF_417);
        {
            String lMatchedText = "0325721581\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000PubDSK_1\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000143835411013588986LOMBANA\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000MARTINEZ\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000MARIA\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000YINETT\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00000F19870527150010O+\u00002\u0002C\u0000¶Tÿ\u0080\u0080\u0083\u0085M«tÍB¡;\u0081©\u0083·u¼o§uµf¶G\u009Cx¦O°]0e¨\\:a\u0091A\u0094TK\\Vb[q\u0093tlO\u0089S\u0090b\u0091p~rX?rZ\u0083¿\u0083·W¬r\u0096\u008C\u009F\u0091²\u008D\u0097\u009B®,§\u0096\u008D\u009A¼\u009C£ \u0095¥Àª§I\u008F\u0098Ï\u00AD\u0096¯¬(\u0087\u009F\u0088\u00AD¿´\u0090µ¬Éz0\u0081µ~¹c?\u00816^[uo\u0088I[Xp[XfT}{ïº\u001B£$\u0085PþWH,¢\u0090Ô%æÿ\u00007\u0002C\u0000ÑTÿ\u0080\u0080c¥F\u0097F\u009F\u0086\u0083P\u00928\u00960\u0081\u0094§£®ÓN¬\u007FÊ]\u009Dp¤jÊBÚo¢Zá\u0084Pp\u0096b¢O\u0096Y\u009DA\u0089K\u0089j\u008DbO_}>\u0082E\u008CZsCTajb{Wo©x¸\u0082\u0095\u008C\u0083P\u009DQÃ`\u009A\u0083\u008C\u008A¸\u008E\u008E\u008E 2\u009E\u0089\u00AD\u009C¨\u009F\u0094\u009D \u009B¶©³³§\u0097Å\u009B\u0081¥¾¥x§\u0086·\u0092ÉvÜ~Ót>v\u0097MhJQazuoTjbIUBñ¿\u0012\u0010\u0015)Ôöuÿ\u0000\u0001ñò\u0011\u0096½ âa\u0089\u0095¸í~yª\u0019È&\u0017y6ååæo\u0089iõ\u009F±¡wìçÅ)F\n3";
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(lMatchedText, reader.getFoundBarCodes()[0].getCodeText().replace("\r", "\n"));
        }
    }
}