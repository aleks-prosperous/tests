package com.aspose.external.barcode.tester.releases.v23_9;

import com.aspose.barcode.auxiliary.Global;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.util.ArrayList;
import java.util.List;

public class BARCODEJAVA1613
{
    private static final String Folder = Global.getTestDataFolder("Issues\\BARCODEJAVA1613");
    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_Full()
    {
        BaseDecodeType[] type_list = new BaseDecodeType[]
                {
                        DecodeType.EAN_8,
                        DecodeType.EAN_13,
                        DecodeType.UPCA,
                        DecodeType.UPCE,
                        DecodeType.ITF_14,
                        DecodeType.CODE_128,
                        DecodeType.DATABAR_EXPANDED,
                        DecodeType.DATABAR_EXPANDED_STACKED,
                        DecodeType.DATABAR_STACKED_OMNI_DIRECTIONAL,
                        DecodeType.DATABAR_TRUNCATED,
                        DecodeType.DATABAR_STACKED,
                        DecodeType.DATABAR_OMNI_DIRECTIONAL,
                        DecodeType.DATA_MATRIX,
                        DecodeType.GS_1_DATA_MATRIX,
                        DecodeType.QR,
                        DecodeType.GS_1_QR
                };

        String full_path = Global.pathCombine(BARCODEJAVA1613.Folder, "26.jpg");
        List<BarCodeResult[]> results = new ArrayList<>();
        for(BaseDecodeType type : type_list) {
            BarCodeReader reader = new BarCodeReader(full_path, type);
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            BarCodeResult[] results0 = reader.readBarCodes();
            results.add(results0);
        }
        for(int j = 0; j < results.size(); j++)
            for(int i = 0; i < results.get(j).length; i++)
            {
                System.out.print(i + ". ");
                System.out.print("code text: " + results.get(j)[i].getCodeText());
                System.out.print(", code type: " + results.get(j)[i].getCodeTypeName() + "\n\n");
            }
    }
}
