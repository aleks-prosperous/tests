package com.aspose.external.barcode.tester.releases.v19_05;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.util.ArrayList;
import java.util.List;

public class Issue36189
{
        /// <summary>
        /// Path to folder with files for testing Issue36189.
        /// </summary>
        private String folder = "";
        private String GoodImagesFolder = "";
        private String BadImagesFolder = "";

        /// <summary>
        /// Prepares to run these tests.
        /// </summary>
        @BeforeMethod
        public void setUp()
        {
            LicenseAssistant.setupLicense();
            folder = Global.getIssuesTestImagePath("Issue36189");
            GoodImagesFolder = Global.pathCombine(folder, "Detected on others");
            BadImagesFolder = Global.pathCombine(folder, "Failed on all");

        }

        private void testRecognizedImage(String aFolder, String aFilename, BaseDecodeType aDecodeType, String CodeText)
        {
            String fileName = Global.pathCombine(aFolder, aFilename);
            BarCodeReader reader = new BarCodeReader(fileName, aDecodeType);
            {
                List<String> lCodetexts = new ArrayList<>();
                for(BarCodeResult result : reader.readBarCodes())
                lCodetexts.add(result.getCodeText());

                Assert.assertEquals(1, lCodetexts.size(), "Recognition of " + aFilename + " failed");
                Assert.assertTrue(lCodetexts.contains(CodeText));
            }
        }

        private void testFailedImage(String aFolder, String aFilename, BaseDecodeType aDecodeType)
        {
            String fileName = Global.pathCombine(aFolder, aFilename);
            BarCodeReader reader = new BarCodeReader(fileName, aDecodeType);
            {
                List<String> lCodetexts = new ArrayList<String>();
                for(BarCodeResult result : reader.readBarCodes())
                lCodetexts.add(result.getCodeText());

                Assert.assertEquals(0, lCodetexts.size(), aFilename + " is ok, need to fix this test");
            }
        }

        @Test
        public void test_Folder_f4()
        {
            testRecognizedImage(folder, "f4.png", DecodeType.DATA_MATRIX, "424D4A414E3136425243293DEEBA43790EF0EAB2131BEF571685E9958E2E55EF0AF269A3B297C3179356");
        }

        @Test
        public void test_Good_DataMatrix01()
        {
            testRecognizedImage(GoodImagesFolder, "DataMatrix01.tiff", DecodeType.DATA_MATRIX, "424D4E4F5631354252430084D6481B209E7DFE24B633BDA1BCB8E499DAD988087585A91B1311DBD8CC82");
        }

        @Test
        public void test_Good_DataMatrix02()
        {
            testRecognizedImage(GoodImagesFolder, "DataMatrix02.tiff", DecodeType.DATA_MATRIX, "424D4645423136425243A467AA37662FDE0248083A2A68E5E82E33D69C1B611A3ECDD793FABF99FD10D7");
        }


        @Test
        public void test_Good_DataMatrix03()
        {
            testRecognizedImage(GoodImagesFolder, "DataMatrix03.tiff", DecodeType.DATA_MATRIX, "424D4F43543135425243E0C6BBD51511E29355D2F96CB56880F9C7C98AD0715A5DA07F99C43CB0AE0630");
        }


        @Test
        public void test_Good_DataMatrix04()
        {
            testRecognizedImage(GoodImagesFolder, "DataMatrix04.tiff", DecodeType.DATA_MATRIX, "424D4645423136425243993BF4E3EE8C1FEAB8B661A7422CC74303DA7FECEA9F7BF08EC77DF79F29CFB9");
        }


        @Test
        public void test_Good_DataMatrix05()
        {
            testRecognizedImage(GoodImagesFolder, "DataMatrix05.tiff", DecodeType.DATA_MATRIX, "424D4F43543135425243A3130AF6B37008DA215FAF25C675E94F7DC56FD82BC6EDA4D3DDBB1B0B99F49D");
        }


        @Test
        public void test_Good_DataMatrix06()
        {
            testRecognizedImage(GoodImagesFolder, "DataMatrix06.tiff", DecodeType.DATA_MATRIX, "424D4F4354313542524321C0EACBDC611800EABB3402E1BCB7187DC56FD82BC6EDA4D3DDBB1B0B99F49D");
        }


        @Test
        public void test_Good_DataMatrix07()
        {
            testRecognizedImage(GoodImagesFolder, "DataMatrix07.tiff", DecodeType.DATA_MATRIX, "424D4E4F563135425243C649C185226184379C1D3A642F85EC3FC9876C390B787ECF9D202CE72E5F41C0");
        }


        @Test
        public void test_Good_DataMatrix08()
        {
            testRecognizedImage(GoodImagesFolder, "DataMatrix08.tiff", DecodeType.DATA_MATRIX, "424D4F43543135425243136B492AA1C20BF4DFA964498C50214294EC4BB75E6769E75A6EB2313A83C075");
        }


        @Test
        public void test_Good_DataMatrix09()
        {
            testRecognizedImage(GoodImagesFolder, "DataMatrix09.tiff", DecodeType.DATA_MATRIX, "424D464542313642524359B83ABAD51F25E1D124D81C50B4DE514606F62A1B8392EC51FE91E4131373E5");
        }


        @Test
        public void test_Good_DataMatrix10()
        {
            testRecognizedImage(GoodImagesFolder, "DataMatrix10.tiff", DecodeType.DATA_MATRIX, "424D4A414E31364252435467303318443847AAC44B7A7D0138A6909EFCB580BEE0FDBF22D5A8F3007322");
        }

        @Test
        public void test_Bad_DataMatrix01()
        {
            testRecognizedImage(BadImagesFolder, "DataMatrix01.tiff", DecodeType.DATA_MATRIX, "424D4D415231364252433F379A45D7F4788F76C4C00BC4D31061E63F0B0136CB3C9C385BBC0E85C2B985");
        }

        @Test
        public void test_Bad_DataMatrix02()
        {
            testRecognizedImage(BadImagesFolder, "DataMatrix02.tiff", DecodeType.DATA_MATRIX, "424D464542313642524358DA52110F97003058F4A39ED3B04F96ABDF80A331C1F7A62AF7470AFB94DB67");
        }

        @Test
        public void test_Bad_DataMatrix04()
        {
            testRecognizedImage(BadImagesFolder, "DataMatrix04.tiff", DecodeType.DATA_MATRIX, "424D4A414E3136425243293DEEBA43790EF0EAB2131BEF571685E9958E2E55EF0AF269A3B297C3179356");
        }

        @Test
        public void test_Bad_DataMatrix05()
        {
            testRecognizedImage(BadImagesFolder, "DataMatrix05.tiff", DecodeType.DATA_MATRIX, "424D4E4F5631354252438E3FF568EE944B6B9D6D70A7F78DF716B3FEF16F2651391D430C9A0EE95DBCAE");
        }

        @Test
        public void test_Bad_DataMatrix03()
        {
            testFailedImage(BadImagesFolder, "DataMatrix03.tiff", DecodeType.DATA_MATRIX);
        }

        @Test
        public void test_Bad_DataMatrix06()
        {
            testRecognizedImage(BadImagesFolder, "DataMatrix06.tiff", DecodeType.DATA_MATRIX, "424D4F43543135425243EAD8A234B5BCA1E066CBA6FDAF106844DA8C9850D32DE7AADD3FCBCFD352329F");
        }

        //DataMatrix07.tiff cannot be recognized in any way

        @Test
        public void test_Bad_DataMatrix08()
        {
            testFailedImage(BadImagesFolder, "DataMatrix08.tiff", DecodeType.DATA_MATRIX);
        }

        @Test
        public void test_Bad_DataMatrix09()
        {
            String fileName = Global.pathCombine(BadImagesFolder, "DataMatrix09.tiff");
            BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
            {
                reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);

                List<String> lCodetexts = new ArrayList<>();
                for(BarCodeResult result : reader.readBarCodes())
                    lCodetexts.add(result.getCodeText());

                Assert.assertEquals(1, lCodetexts.size(), "Recognition of DataMatrix09.tiff failed");
                Assert.assertTrue(lCodetexts.contains("424D4F43543135425243EEBFA27CA221DBD21D72B55D61630682632BFC6598D3EA03D7E66F9C95A547DE"));
            }
        }
}
