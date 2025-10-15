package com.aspose.external.barcode.tester.releases.v20_10;

import org.testng.annotations.Test;

/**
 * TODO Duplicate
 */
@Test
public class Issue37595_Duplicate
{
//    /// <summary>
//    /// Path to folder with files for testing Issue37595.
//    /// </summary>
//    private static final String Folder = Global.getTestDataFolder("Issues/Issue37595");
//
//    /// <summary>
//    /// Prepares to run these tests.
//    /// </summary>
//    @BeforeMethod
//    public void SetUp()
//    {
//        LicenseAssistant.setupLicense();
//    }
//
//
//    @Test(enabled = false) //TODO BARCODEJAVA-1947
//    public void test_BarWidthReduction_1D_barcode() throws IOException {
//        FrameworkTestUtils.generateAndCompare(Generator_Of_Test_BarWidthReduction_1D_barcode(), Folder, "BarWidthReduction_1D_barcode.png");
//    }
//
//    private BarcodeGenerator Generator_Of_Test_BarWidthReduction_1D_barcode()
//    {
//        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.UPCA);
//        gen.getParameters().getBarcode().getXDimension().setPixels(8);
//        gen.getParameters().getBarcode().getBarWidthReduction().setPixels(2);
//        return gen;
//    }
//
//    @Test(enabled = false) //TODO BARCODEJAVA-1947
//    public void test_BarWidthReduction_Databar_barcode() throws IOException {
//        FrameworkTestUtils.generateAndCompare(Generator_Of_Test_BarWidthReduction_Databar_barcode(), Folder, "BarWidthReduction_Databar_barcode.png");
//    }
//
//    private BarcodeGenerator Generator_Of_Test_BarWidthReduction_Databar_barcode()
//    {
//        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATABAR_EXPANDED_STACKED, "(01)01234567891234");
//        gen.getParameters().getBarcode().getXDimension().setPixels(8);
//        gen.getParameters().getBarcode().getBarWidthReduction().setPixels(2);
//        return gen;
//    }
//
//    @Test(enabled = false) //TODO BARCODEJAVA-1947
//    public void test_BarWidthReduction_Code16K_barcode() throws IOException {
//        FrameworkTestUtils.generateAndCompare(Generator_Of_Test_BarWidthReduction_Code16K_barcode(), Folder, "BarWidthReduction_Code16K_barcode.png");
//    }
//
//    private BarcodeGenerator Generator_Of_Test_BarWidthReduction_Code16K_barcode()
//    {
//        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.CODE_16_K);
//        gen.getParameters().getBarcode().getXDimension().setPixels(8);
//        gen.getParameters().getBarcode().getBarWidthReduction().setPixels(2);
//        return gen;
//    }
//
//    @Test(enabled = false) //TODO BARCODEJAVA-1947
//    public void test_BarWidthReduction_Aztec_barcode() throws IOException {
//        FrameworkTestUtils.generateAndCompare(Generator_Of_Test_BarWidthReduction_Aztec_barcode(), Folder, "BarWidthReduction_Aztec_barcode.png");
//    }
//
//    private BarcodeGenerator Generator_Of_Test_BarWidthReduction_Aztec_barcode()
//    {
//        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.AZTEC);
//        gen.getParameters().getBarcode().getXDimension().setPixels(8);
//        gen.getParameters().getBarcode().getBarWidthReduction().setPixels(2);
//        gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.BELOW);
//        return gen;
//    }
//
//    @Test(enabled = false) //TODO BARCODEJAVA-1947
//    public void test_BarWidthReduction_CodablockF_barcode() throws IOException {
//        FrameworkTestUtils.generateAndCompare(Generator_Of_Test_BarWidthReduction_CodablockF_barcode(), Folder, "BarWidthReduction_CodablockF_barcode.png");
//    }
//
//    private BarcodeGenerator Generator_Of_Test_BarWidthReduction_CodablockF_barcode()
//    {
//        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.CODABLOCK_F);
//        gen.getParameters().getBarcode().getXDimension().setPixels(8);
//        gen.getParameters().getBarcode().getBarWidthReduction().setPixels(2);
//        return gen;
//    }
//
//    @Test(enabled = false) //TODO BARCODEJAVA-1947
//    public void test_BarWidthReduction_Coupon_barcode() throws IOException {
//        FrameworkTestUtils.generateAndCompare(Generator_Of_Test_BarWidthReduction_Coupon_barcode(), Folder, "BarWidthReduction_Coupon_barcode.png");
//    }
//
//    private BarcodeGenerator Generator_Of_Test_BarWidthReduction_Coupon_barcode()
//    {
//        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.UPCA_GS_1_DATABAR_COUPON);
//        gen.getParameters().getBarcode().getXDimension().setPixels(8);
//        gen.getParameters().getBarcode().getBarWidthReduction().setPixels(2);
//        return gen;
//    }
//
//    @Test(enabled = false) //TODO BARCODEJAVA-1947
//    public void test_BarWidthReduction_Pdf417_barcode() throws IOException {
//        FrameworkTestUtils.generateAndCompare(Generator_Of_Test_BarWidthReduction_Pdf417_barcode(), Folder, "BarWidthReduction_Pdf417_barcode.png");
//    }
//
//    private BarcodeGenerator Generator_Of_Test_BarWidthReduction_Pdf417_barcode()
//    {
//        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.PDF_417);
//        gen.getParameters().getBarcode().getXDimension().setPixels(8);
//        gen.getParameters().getBarcode().getBarWidthReduction().setPixels(2);
//        return gen;
//    }
//
//    @Test(enabled = false) //TODO BARCODEJAVA-1947
//    public void test_BarWidthReduction_QR_barcode() throws IOException {
//        FrameworkTestUtils.generateAndCompare(Generator_Of_Test_BarWidthReduction_QR_barcode(), Folder, "BarWidthReduction_QR_barcode.png");
//    }
//
//    private BarcodeGenerator Generator_Of_Test_BarWidthReduction_QR_barcode()
//    {
//        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.QR);
//        gen.getParameters().getBarcode().getXDimension().setPixels(8);
//        gen.getParameters().getBarcode().getBarWidthReduction().setPixels(2);
//        gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.BELOW);
//        return gen;
//    }
//
//    @Test(enabled = false) //TODO BARCODEJAVA-1947
//    public void test_BarWidthReduction_DataMatrix_barcode() throws IOException {
//        FrameworkTestUtils.generateAndCompare(Generator_Of_Test_BarWidthReduction_DataMatrix_barcode(), Folder, "BarWidthReduction_DataMatrix_barcode.png");
//    }
//
//    private BarcodeGenerator Generator_Of_Test_BarWidthReduction_DataMatrix_barcode()
//    {
//        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX);
//        gen.getParameters().getBarcode().getXDimension().setPixels(8);
//        gen.getParameters().getBarcode().getBarWidthReduction().setPixels(2);
//        gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.BELOW);
//        return gen;
//    }
//
//    @Test(enabled = false) //TODO BARCODEJAVA-1947
//    public void test_BarWidthReduction_DotCode_barcode() throws IOException {
//        FrameworkTestUtils.generateAndCompare(Generator_Of_Test_BarWidthReduction_DotCode_barcode(), Folder, "BarWidthReduction_DotCode_barcode.png");
//    }
//
//    private BarcodeGenerator Generator_Of_Test_BarWidthReduction_DotCode_barcode()
//    {
//        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DOT_CODE);
//        gen.getParameters().getBarcode().getXDimension().setPixels(8);
//        gen.getParameters().getBarcode().getBarWidthReduction().setPixels(2);
//        gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.BELOW);
//        return gen;
//    }
//
//    @Test(enabled = false) //TODO BARCODEJAVA-1947
//    public void test_BarWidthReduction_MaxiCode_barcode() throws IOException {
//        FrameworkTestUtils.generateAndCompare(Generator_Of_Test_BarWidthReduction_MaxiCode_barcode(), Folder, "BarWidthReduction_MaxiCode_barcode.png");
//    }
//
//    private BarcodeGenerator Generator_Of_Test_BarWidthReduction_MaxiCode_barcode()
//    {
//        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.MAXI_CODE);
//        gen.getParameters().getBarcode().getXDimension().setPixels(14);
//        gen.getParameters().getBarcode().getBarWidthReduction().setPixels(2);
//        gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.BELOW);
//        return gen;
//    }
}
