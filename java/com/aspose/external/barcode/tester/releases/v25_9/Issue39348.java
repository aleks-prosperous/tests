package com.aspose.external.barcode.tester.releases.v25_9;

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

public class Issue39348
{
    final String Folder = Global.getTestDataFolder("Issues/Issue39348");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense(LicenseType.Total);
    }


    @Test
    public void testHighQualityBarcodesPdf417()
    {
        for(TestCaseParams testParams : getTestCasesList())
        {
            BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, testParams.filename), DecodeType.PDF_417);
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

        {
            return Arrays.asList(
//                new TestCaseParams("0-True-752D54965DFDC9D372492B654BE836B6.png", "23421KZL930"),
//                new TestCaseParams("0-True-7BD3AB49D8CCA98A3EDBF844E7414DA6.png", "rty.xutn+Yiztn0+zjdww+0ky00yZx:0zyyxjy:ZrXqiqY0+0mvZdx+zi0x0u.+r+yYzyegVzyu++duv0j0c+y+bYsr+svw0Yu0yex+ezu+v0qZ xow0+z+sjV+xwqdr+bx+Yyw+Wq X+vr0+c+rw+ k0+z00s+02"),
//                new TestCaseParams("0-True-97429A40440BC62B6CE0E13886C3A6A6.png", "91\nB02\nE4767041137879\nPEt+bAp7OGyEJbPH2op/y5RrUSyzQIl3aBLcJYAc4LajeNwRDqVsGyZB+xSQsNPB+\nA1"),
//                new TestCaseParams("0-True-A24441767E1F657140C3F9DED9BBB07B.png", "M1CHEN/PIN YU         E6M6VK4 SYDTPECI 0052 131Y066K0088 348>5180 O5131BCI              2A29730983590680                           N"),
//                new TestCaseParams("0-True-F0AB352CF346FE1D3B6A2F7CBE367A78.png", "@\n\rANSI 636001100402DL00410323ZN03640120DLDCAD   \nDCBB         \nDCDNONE \nDBA11242027\nDCSLI                       \nDACMAOLONG                  \nDAD                         \nDBD11132023\nDBB11241964\nDBC1\nDAYBLK\nDAU507   \nDAG3370 PRINCE ST C7        \nDAIFLUSHING            \nDAJNY\nDAK113540000  \nDAQ245397611\nDCFG64HKBDP00\nDCGUSA\nDDEU\nDDFU\nDDGU\nDDAN\nDDB03072022\nDDD0\rZNZNALI@MAOLONG          \nZNB0Lc*e!.f3]>L$ek$]7Q5Xa31C,lQGqNjlRV\\TTcq0NBlPhuY&%_'iEt=;OHhbfs(!4DhQQ*\">6-D*1Gr:^-]k1C:l4\r"),
//                new TestCaseParams("1-True-016C77481906252B20CEB1B19715AB9F.png", "@\n\rANSI 636014090102DL00410272ZC03130024DLDAQE1449862\nDCSLEUNG\nDDEN\nDACALEX\nDDFN\nDAD\nDDGN\nDCAC\nDCBNONE\nDCDNONE\nDBD08312022\nDBB08241990\nDBA08242027\nDBC1\nDAU068 IN\nDAYBRN\nDAG9263 REGENTS RD B403\nDAILA JOLLA\nDAJCA\nDAK920370000  \nDCF08/27/2018663RB/DDFD/27\nDCGUSA\nDAW150\nDAZBLK\nDCK22243E14498620401\nDDAN\nDDB08292017\rZCZCABRN\nZCBBLK\nZCC\nZCD\r"),
//                new TestCaseParams("1-True-08BBC055E72292E0C510B859FADB48A7.png", "M1KUMAR/NEERAJ         B3WSRF BLRDELQP 1359 117Y015C0003 147>1181WO5117BQP 0000000000000295160000000000 0                          "),
//                new TestCaseParams("1-True-0BEB5C8E18FDF852B248A0BC88AC1C7F.png", "93250777496"),
//                new TestCaseParams("1-True-0EA142FD3F3BDB24A79EF4EBF203C2F3.png", "54165068363586035621894506017725055"),
//                new TestCaseParams("1-True-16814F13EA085E4D71E785A720B5AE84.png", "9881472410"),
//                new TestCaseParams("1-True-16AF8E60DF5A399E58C923782756385D.png", "@\n\rANSI 636015090002DL00410265ZT03060007DLDCAC\nDCBNONE\nDCDNONE\nDBA10112026\nDCSGREIF\nDDEN\nDACERIC\nDDFN\nDADEDWARD\nDDGN\nDBD06082020\nDBB10111968\nDBC1\nDAYHAZ\nDAU070 in\nDAG7905 WENDY LANE\nDAIPLANO\nDAJTX\nDAK750256205\nDAQ13533700\nDCF00619980025156805395\nDCGUSA\nDAZBLK\nDCK10000865146\nDCLW\nDDAF\nDDB02232020\nDAW169\n\rZTZTAN\r"),
//                new TestCaseParams("1-True-1DC3104BBBC647C1FFD06FB5DED84D00.png", "M1WUQIANYU            ELMBKGM PVGNRT9C 6217 078Y025F0079 100>1"),
//                new TestCaseParams("1-True-1ED690D10EC54FA574898CAB350685D0.png", "74FFEB77A2BFFC9640019B4DFCC1E7616C706C09^AFMDG3221-20170121045753-MOBS-0207-00290"),
//                new TestCaseParams("1-True-31B07504AFD36CD2B4626444603769D9.png", "XT-RPUMP-K1	T5-LI03-101.22891"),
//                new TestCaseParams("1-True-3A8716B343E3629FCEB7A93EC8B9176F.png", "M1YOUSUFI/SOONAM      E6JZ1LC DXBKBLFZ 0307 053Y019E0193 136>30B2OO5053B14125141             EK                   "),
//                new TestCaseParams("1-True-3F3B64DC815C34C4B8AB8AC1D30737F5.png", "M1M/RAJESH             GRDCNL CCUMAA6E 0723 317Y028B0056 350>1181WO4317B6E 03129480600012831200000000000                          747317425P"),
//                new TestCaseParams("1-True-40E5623D15D95F66CB258C3F0E783701.png", "74FFEB77A2BFFC9640019B4DFCC1E7616C706C09^AFMDG3221-20170121045753-MOBS-0207-00290"),
//                new TestCaseParams("1-True-41470EA047A90B004FDA7A7FE6BCC700.png", "M1SARA FIZELAHIGHOCHANTNF2M   THRMHDRI 7660 59 G27A 10   100^0/0    "),
//                new TestCaseParams("1-True-42B3C92C34E3AA2E979952BB4C4A892C.png", "51410KZLA01"),
                new TestCaseParams("1-True-4FA5C8F597823F49F517BBA84CBC23A2.png", ""),
                new TestCaseParams("1-True-5085A2D3C1ECC7308E5CFA0C2CB2830A.png", "23411KZL930"),
                new TestCaseParams("1-True-54211EC38F449379BADF44ABA8E581D8.png", "M1LI/BIN              EE42TLH TPEAKLNZ 0078 335Y038F0140 14E>50B0OO4335BNZ 2A086150049773200NZ                     1PCN*3000920       02  "),
                new TestCaseParams("1-True-5D508E4D92CAF2E65E42B0E1BB0AB8A1.png", "\u0002\u0000\u0006¼Ãûå\n\u0082\u009CèbqÔ\u000Eý\u0003\u009F@çÎý&×\u0085õÓAÃ\u0080\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0002\u0097~\u0000\u0000\u000B·Ì\u0003Ø\u008D}êê@Fú|Y\u0094å\u0092r\u0016ò\u009E².6\u0003%÷\u007F·Ò¢{\u0097Ë÷{\u008B\u000B²\u0082Nmá\u001E\u009F\u009DÓ\u009BæÛíLw\u0082F·g§J[ØqÐ\u001C\u001C"),
                new TestCaseParams("1-True-5F2976CF1FE13973111E5CA038D852D3.png", "13\t\t09\tHinrichsen\tMeinert\t19361218\t\t105830016\tH872310365\t5\t00\t01\t018045700\t733640301\t20230130\t1\tG20.2-\t\tZN\ta\t\tKG\t10\t\t\t\t\t\t\t1-2x wöch.\t1\t1\t0"),
                new TestCaseParams("1-True-6383C4BBF1AF500AC5824E1A6E9E3E76.png", "23053103612770059"),
                new TestCaseParams("1-True-6EF8F45B824BE784CE690828A4271DBB.png", "23421KZL930"),
                new TestCaseParams("1-True-6F28496FC1632DE8D3FE15751FFDE3BE.png", "12209GB4682"),
                new TestCaseParams("1-True-70763FEEFB2EE8152E9B4998CB9C4E91.png", "5240AKTM850ZB"),
                new TestCaseParams("1-True-70FBA2EAE1CA99DB472FF78D98472F06.png", "1.25123399,01,010325"),
                new TestCaseParams("1-True-764CF28F72BE01F3712B9D0FF63DE149.png", "@\n\rANSI 636010090002DL00410256ZF02970067DLDAQK346327670963\nDCSMOSQUERA\nDDEN\nDACDALID\nDDFN\nDADNONE\nDDGN\nDCAC\nDCBNONE\nDCDNONE\nDBD06102022\nDBB03301998\nDBA03302030\nDBC1\nDAU069 IN\nDAG420 JEFFERSON DR\nDAIDEERFIELD BEACH\nDAJFL\nDAK334429488  \nDCFH292206107816\nDCGUSA\nDCK0100842078207445\nDDAF\nDDB03012020\rZFZFA\nZFB\nZFCSAFE DRIVER\nZFD\nZFE\nZFF\nZFG\nZFH\nZFI\nZFJ0226057028\nZFK\r"),
                new TestCaseParams("1-True-76F83F3665CCF1EE347ECFFD2F6CA55A.png", "M1LI/JIE               LWR2PP MXPVIEFR 0215 064Y017E0075 149>5181W 5062BFR 00000000000002A0000000000000 0                          NN"),
                new TestCaseParams("1-True-777DD82A7C6B04E86839340E54EEE3B6.png", "UN07H36"),
                new TestCaseParams("1-True-77A31CFF99A97337B1401EBCC75F897C.png", "153680082092688133814068"),
                new TestCaseParams("1-True-7A5F3AFA95F39E3EE8ADD08C30B669D0.png", "M1Ongere/Mark Mokaya  EPBC4GN KULLGKAK 6306 108Y019B0026 11E>3180MM    B                00"),
                new TestCaseParams("1-True-7D3A74778D1F96B6598826E82EEF9213.png", "9588432778"),
                new TestCaseParams("1-True-8118074DAF1A99172F100CE9E0A9CD55.png", "2251725017NR00"),
                new TestCaseParams("1-True-86EA7B227FC233377CBAD2D6C63AB2FE.png", "23422KZL930"),
                new TestCaseParams("1-True-88A30C2F3F48F89D0916161D7AC46978.png", "M1MOHAMMAD KIANIPOUR  UXPM1   THRGSMI3 5693 89 G31C 115  100^0/0    "),
                new TestCaseParams("1-True-90820F0A00190179819EA5F61164B526.png", "M1KADYROVA/GULNUR     ERZ3PXW NBCSVOSU 1251 060Y026B0117 152>6180OO5060B                2A555           0                          N0658350169"),
                new TestCaseParams("1-True-9BFEAB5B02411F4389CAFFFC38DF9EEB.png", "12209GB4682"),
                new TestCaseParams("1-True-A106C5E1D6F3F041B06E6B4EE579929E.png", "M9513B              000200472000200472Z0088381840187IDB"),
                new TestCaseParams("1-True-A2B73854107374D45B46CA9B6CEDCDF9.png", "M1AMIR JAFARNEZHAD    UXDSN   TBZTHRI3 5605 90 Y13F 19   100^0/0    "),
                new TestCaseParams("1-True-A2D77A97A0AC312665C6923DB3E5EEDF.png", "M1MOJTABA ASKARIKACHOSV3F7Q   THRAWZI3 5625 145G21B 89   100^0/0    "),
                new TestCaseParams("1-True-AB0090CB71DE67D6C32E3996D9C228DF.png", "V3,SSCC001959492289091895,GTIN00195950086348,SCC30195950086349,MPNMD3Y4ZP/A,QTY5,SL1C7R0W13K,SFVFGXPQKPW,SM02XVKQW7Y,SG9V32JG49L,SG9WKWX7Q3P"),
                new TestCaseParams("1-True-B5D6C84AA19F4652A8EC5A08F198AD0F.png", "spacecraft's watching you"),
                new TestCaseParams("1-True-B64D83EADEE74A12073AD3A42C8D7ACE.png", "23053103612770059"),
                new TestCaseParams("1-True-B9ADA012B4D23CBBAC040EB45D8D8F6B.png", "001313026080128911223238740146310233     awtxvGipjT6Ts8XSOLIImLUNi++UOV3oFJ27FdPKb/ycqjCy5rwUKdjV4ZxNENtgze6zf6vOGqk="),
                new TestCaseParams("1-True-BC98FD07C24896A3A811526174132C12.png", "M1kumar/Amresh         G8NSSA STVDELIX 1123 067Y000000000000"),
                new TestCaseParams("1-True-C9D52F148EA4C9AE2C29DB8A706E80F4.png", "23430KZL930"),
                new TestCaseParams("1-True-CF83519FB80A4D953BF388CD2C63D36D.png", "M1kumar/Amresh P3S3SM DELSTVIX 1123 075Y000000000000"),
                new TestCaseParams("1-True-CFB04A21064997F4DFA17F5B4BDE4B5D.png", "M1LEE/JUHEE           ERQQQUY ICNSYDKE 0121 341Y053H0005 34D>5183 O9341BKE              2A18095966473630 KE KE 112721017626        NTB  G"),
                new TestCaseParams("1-True-D48E6483BD9E9266FE30B4BE20A0A6DB.png", "9588432778"),
                new TestCaseParams("1-True-D80BF47EE3E946A9257ED6FCB0D182CF.png", "M1MANPREETKAUR/FNU     6WNRK8 DELLHRSV 0761 063Y000000000000"),
                new TestCaseParams("1-True-E4C5B6A1DC72FE2BA9359D58FA5980A8.png", "HRVHUB30\nEUR\n000000000006000\nDavid Lopac\n\n\nOBORD d.o.o.\nTrumbiÄeva 6\n10000 Zagreb\nHR2323600001101508870\nHR00\n2453-9-36\nCMDT\nOÅ  VUKOMEREC, 7.c\n"),
                new TestCaseParams("1-True-E65DD0BBD4390E410633252A6B480E68.png", "M1REZA FOROUZANDEH    123     SYZPGUIV 6948 61 G12A 120  100"),
                new TestCaseParams("1-True-EC482B633CC6915A07F733FB73F567F9.png", "06455KWB601\r\n"),
                new TestCaseParams("0-True-28B328A20E69A8BC209A738EE9C6C964.png", "74FFEB77A2BFFC9640019B4DFCC1E7616C706C09^AFMDG3221-20170121045753-MOBS-0207-00290"),
                new TestCaseParams("0-True-F8E9C2DC24219BCC67165E3E5E905CA7.png", ":4050520470050720250222151951::E:")
            );
        }
    }
}
