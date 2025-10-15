package com.aspose.external.barcode.tester.releases.v23_6;

import com.aspose.barcode.generation.BaseEncodeType;
import com.aspose.pdf.*;
import org.testng.annotations.BeforeMethod;
import utils.LicenseAssistant;

import java.util.HashMap;
import java.util.Map;


public class BARCODEJAVA1640
{
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }
    Map<String, BaseEncodeType> encodeTypeMap = new HashMap<String, BaseEncodeType>();

//    String pathToLicense =
//    void loadEncodeTypes()
//    {
//        //encodeTypeMap.put("", EncodeTypes.AUSTRALIA_POST);
//        encodeTypeMap.put("AztecCode", EncodeTypes.AZTEC);
//        encodeTypeMap.put("CodablockF", EncodeTypes.CODABLOCK_F);
//        encodeTypeMap.put("Code16K", EncodeTypes.CODE_16_K);
//        encodeTypeMap.put("DataMatrix", EncodeTypes.DATA_MATRIX);
//        encodeTypeMap.put("DotCode", EncodeTypes.DOT_CODE);
//        encodeTypeMap.put("GS1DataMatrix", EncodeTypes.GS_1_DATA_MATRIX);
//        encodeTypeMap.put("GS1QRCode", EncodeTypes.GS_1_QR);
//        encodeTypeMap.put("MaxiCode", EncodeTypes.MAXI_CODE);
//        encodeTypeMap.put("MicroPDF417", EncodeTypes.MICRO_PDF_417);
//        encodeTypeMap.put("PDF417", EncodeTypes.PDF_417);
//        encodeTypeMap.put("QRCode", EncodeTypes.QR);
//        encodeTypeMap.put("Codabar", EncodeTypes.CODABAR);
//        encodeTypeMap.put("Code128", EncodeTypes.CODE_128);
//        encodeTypeMap.put("Code39Extended", EncodeTypes.CODE_39_FULL_ASCII);
//        encodeTypeMap.put("Code39", EncodeTypes.CODE_39);
//        encodeTypeMap.put("Code93Extended", EncodeTypes.CODE_93);
//        encodeTypeMap.put("Code93", EncodeTypes.CODE_93);
//        encodeTypeMap.put("GS1128", EncodeTypes.GS_1_CODE_128);
//        //encodeTypeMap.put( "ItalianPharmacode",EncodeTypes.ItalianPost25 );//in the list, but not supported in Aspose
//        encodeTypeMap.put("PZN", EncodeTypes.PZN);
//        encodeTypeMap.put("Planet", EncodeTypes.PLANET);
//        //encodeTypeMap.put( "RoyalMail4StateCustomerCode",EncodeTypes.r );//in the list, but not supported in Aspose
//        encodeTypeMap.put("VIN", EncodeTypes.VIN);
//        encodeTypeMap.put("Code11", EncodeTypes.CODE_11);
//        encodeTypeMap.put("Datalogic2of5", EncodeTypes.DATA_LOGIC_2_OF_5);
//        encodeTypeMap.put("DeutschePostIdentcode", EncodeTypes.DEUTSCHE_POST_IDENTCODE);
//        encodeTypeMap.put("DeutschePostLeitcode", EncodeTypes.DEUTSCHE_POST_LEITCODE);
//        encodeTypeMap.put("EAN13", EncodeTypes.EAN_13);
//        encodeTypeMap.put("EAN14", EncodeTypes.EAN_14);
//        encodeTypeMap.put("EAN8", EncodeTypes.EAN_8);
//    /*encodeTypeMap.put( "GS1DataBarExpandedStacked",EncodeTypes.G );
//    encodeTypeMap.put( "GS1DataBarExpanded",EncodeTypes.DatabarExpanded );
//    encodeTypeMap.put( "GS1DataBarOmnidirectional",EncodeTypes.DatabarOmniDirectional );
//    encodeTypeMap.put( "GS1DataBarStackedOmnidirectional",EncodeTypes.DatabarStackedOmniDirectional );
//    encodeTypeMap.put( "GS1DataBarStacked",EncodeTypes.DatabarStacked );
//    encodeTypeMap.put( "GS1DataBarTruncated",EncodeTypes.DatabarTruncated );*/
//        encodeTypeMap.put("IATA2of5", EncodeTypes.IATA_2_OF_5);
//        encodeTypeMap.put("ISBN", EncodeTypes.ISBN);
//        encodeTypeMap.put("ISMN", EncodeTypes.ISMN);
//        encodeTypeMap.put("ISSN", EncodeTypes.ISSN);
//        encodeTypeMap.put("ITF14", EncodeTypes.ITF_14);
//        encodeTypeMap.put("ITF6", EncodeTypes.ITF_6);
//        encodeTypeMap.put("Interleaved2of5", EncodeTypes.INTERLEAVED_2_OF_5);
//        encodeTypeMap.put("Matrix2of5", EncodeTypes.MATRIX_2_OF_5);
//        encodeTypeMap.put("MsiPlessey", EncodeTypes.MSI);
//        encodeTypeMap.put("OPC", EncodeTypes.OPC);
//        encodeTypeMap.put("Pharmacode", EncodeTypes.PHARMACODE);
//        encodeTypeMap.put("SSCC18", EncodeTypes.SSCC_18);
//        encodeTypeMap.put("UPCA", EncodeTypes.UPCA);
//        encodeTypeMap.put("UPCE", EncodeTypes.UPCE);
//        encodeTypeMap.put("UpcaGs1Code128Coupon", EncodeTypes.UPCA_GS_1_CODE_128_COUPON);
//        encodeTypeMap.put("UpcaGs1DatabarCoupon", EncodeTypes.UPCA_GS_1_DATABAR_COUPON);
//        encodeTypeMap.put("UspsPlanet", EncodeTypes.PLANET);
//        //encodeTypeMap.put( "UspsPostnet",EncodeTypes.U );Not supported in Jave
//        encodeTypeMap.put("AurstraliaPosteParcel", EncodeTypes.AUSTRALIAN_POSTE_PARCEL);
//        //encodeTypeMap.put( "BarCodeSupplement",EncodeTypes. );//not in Prasanna's list
//        //encodeTypeMap.put( "BooklandEAN",EncodeTypes. );//not in Prasanna's list
//        encodeTypeMap.put("GS1CodablockF", EncodeTypes.GS_1_CODABLOCK_F);
//        encodeTypeMap.put("ItalianPost25", EncodeTypes.ITALIAN_POST_25);
//        //encodeTypeMap.put( "KIXcode",EncodeTypes.K );//not in Prasanna's list
//        encodeTypeMap.put("PatchCode", EncodeTypes.PATCH_CODE);
//        encodeTypeMap.put("Postnet", EncodeTypes.POSTNET);
//        encodeTypeMap.put("SSCC18", EncodeTypes.SSCC_18);
//        encodeTypeMap.put("SingaporePost", EncodeTypes.SINGAPORE_POST);
//        encodeTypeMap.put("Standard2of5", EncodeTypes.STANDARD_2_OF_5);
//        encodeTypeMap.put("SwissPostParcel", EncodeTypes.SWISS_POST_PARCEL);
//        //encodeTypeMap.put( "UspsOneCode",EncodeTypes.u );Not supported in Java
//
//    }
//
//    @Test(enabled = false)
//    public void test() throws Exception
//    {
//        generateBarcode(null, null, null, null);
//    }
//
//    public void generateBarcode(String encodeFormat, String code, String pdfFile, String svgFile) throws Exception
//    {
//        try
//        {
//            loadEncodeTypes();
//            BaseEncodeType type = null;
//            type = encodeTypeMap.get(encodeFormat);
//            if (type == null)
//            {
//                type = EncodeTypes.EAN_13;
//            }
//
//            BarcodeGenerator generator = new BarcodeGenerator(type, code);
//            generator.save(svgFile, BarCodeImageFormat.SVG);
//
//            SvgLoadOptions options = new SvgLoadOptions();
//            SvgSaveOptions options1 = new SvgSaveOptions();
//            Document pdf = new Document(svgFile, options);
//            //(svgFile,options);
//            pdf.save(pdfFile);
//        }
//        catch (IOException e)
//        {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//
//        // ExEnd: GenerateBarcodeWithoutRestrictedBarcodeSize
//    }
}
