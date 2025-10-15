package com.aspose.external.barcode.tester.releases.v18_12;

public class BARCODEJAVA623
{
//    static final String Folder = Global.getTestDataFolder("barcodjava_issues/BARCODEJAVA623"); TODO VC import from xml
//
//    @Test
//    public void barCodeBuilderTest()
//    {
//        String xmlFileName = "C_BarcodeBuilder.xml";
//        BarCodeBuilder builder = BarCodeBuilder.importFromXml(Global.pathCombine(Folder, xmlFileName));
//
//        Assert.assertEquals(builder.getEncodeType(), (EncodeTypes.DATABAR_EXPANDED));
//        Assert.assertEquals(builder.getResolution(), (new Resolution(300, 300, ResolutionMode.CUSTOMIZED)));
//
//        Assert.assertEquals(builder.getGraphicsUnit(), GraphicsUnit.MILLIMETER);
//        Assert.assertTrue(builder.getAutoSize());
//
//        Assert.assertEquals(builder.getBarHeight(),6.8f);
//        Assert.assertTrue(builder.getEnableEscape());
//    }
//
//    @Test
//    public void barCodeReaderTest()
//    {
//        String xmlFileName = "C_BarcodeReader.xml";
//        BarCodeReader reader = BarCodeReader.importFromXml(Global.pathCombine(Folder, xmlFileName));
//        QualitySettings qualitySettings = reader.getQualitySettings();
//        Assert.assertFalse(qualitySettings.getAllowComplexBackground());
//        Assert.assertFalse(qualitySettings.getAllowDatamatrixIndustrialBarcodes());
//        Assert.assertFalse(qualitySettings.getAllowDecreasedImage());
//        Assert.assertTrue(qualitySettings.getAllowDetectScanGap());
//        Assert.assertFalse(qualitySettings.getAllowIncorrectBarcodes());
//        Assert.assertFalse(qualitySettings.getAllowInvertImage());
//        Assert.assertFalse(qualitySettings.getAllowMedianSmoothing());
//        Assert.assertFalse(qualitySettings.getAllowMicroWhiteSpotsRemoving());
//        Assert.assertFalse(qualitySettings.getAllowOneDAdditionalScan());
//        Assert.assertTrue(qualitySettings.getAllowOneDFastBarcodesDetector());
//        Assert.assertFalse(qualitySettings.getAllowQRMicroQrRestoration());
//        Assert.assertTrue(qualitySettings.getAllowRegularImage());
//        Assert.assertFalse(qualitySettings.getAllowSaltAndPaperFiltering());
//        Assert.assertFalse(qualitySettings.getAllowWhiteSpotsRemoving());
//        Assert.assertEquals(qualitySettings.getMedianSmoothingWindowSize(), 3);
//        Assert.assertEquals(reader.getChecksumValidation(), ChecksumValidation.ON);
//        Assert.assertTrue(reader.getStripFNC());
//    }
//
//    @Test
//    public void customersSample()
//    {
//        BarcodeGenerator barCodeBuilder = new BarcodeGenerator();
//        barCodeBuilder.setXDimension(1.8f);
//        barCodeBuilder.setyDimension(1.8f);
//        exportImportCheckXml(barCodeBuilder, "CustomersSample.xml");
//    }
//
//    @Test
//    public void codeFromIssue()
//    {
//        BarcodeGenerator b = new BarcodeGenerator(EncodeTypes.UPCA, "01234567890");
//        b.getParameters().getBarcode().setAutoSizeMode(AutoSizeMode.NEAREST);;
//
//        b.setEnableChecksum(EnableChecksum.YES);
//
//        //b.CodeTextFont = new System.Drawing.Font("OCR B Std", 16.0f);
//        b.setCodeTextFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 18));
//
//        b.setCodeTextSpace(0.5f); // This appears to have no effect
//        b.setGraphicsUnit(GraphicsUnit.MILLIMETER);
//        b.setXDimension(0.66f);
//        b.setBarHeight(45.70f);
//        b.setResolution(new Resolution(1200.0f, 1200.0f, ResolutionMode.CUSTOMIZED));
//
//        exportImportCheckXml(b, "CodeFromIssue.xml");
//    }
//
//    @Test
//    public void LegacyFormatCodeFromIssue()
//    {
//        BarcodeGenerator bb = new BarcodeGenerator(EncodeTypes.UPCA, "01234567890");
//        b.getParameters().getBarcode().setAutoSizeMode(AutoSizeMode.NEAREST);
//
//        b.setEnableChecksum(EnableChecksum.YES);
//
//        b.setCodeTextFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 18));
//        b.setCodeTextEncoding(Charset.forName("CP1251"));
//
//        b.setCodeTextSpace(0.5f); // This appears to have no effect
//        b.setGraphicsUnit(GraphicsUnit.MILLIMETER);
//        b.setXDimension(0.66f);
//        b.setBarHeight(45.70f);
//        b.setResolution(new Resolution(1200.0f, 1200.0f, ResolutionMode.CUSTOMIZED));
//
//        checkXml(b, Global.getTestDataFolder("Issues" + File.separator + "Issue36668" + File.separator + "barcodebuilder_legacy.xml"));
//    }
//
//    @Test
//    public void initializeEmptyBuilderAndCheckXmlFile()
//    {
//        BarcodeGenerator emptyBuilder = new BarcodeGenerator();
//        exportImportCheckXml(emptyBuilder, "InitializeEmptyBuilderAndCheckXmlFile.xml");
//    }
//
//    public void legacyFormatAllFields()
//    {
//        BarcodeGenerator builder = createSampleBuilder();
//        String path = Global.getTestDataFolder("Issues" + File.separator + "Issue36668");
//        checkXml(builder, path + "barcodebuilder_legacy_full.xml");
//    }
//
//    @Test
//    public void createBuilderWithRandomFields()
//    {
//        BarcodeGenerator builder = new BarcodeGenerator();
//        builder.getParameters().getBarcode().setAutoSizeMode(AutoSizeMode.NONE);;
//        builder.setAztecSymbolMode(AztecSymbolMode.FULL_RANGE);
//        builder.setAztectErrorLevel(22);
//        builder.setBarHeight(14f);
//        builder.setBarWidthReduction(0.001f);
//        builder.setBorderColor(new java.awt.Color(102, 51, 0));
//        builder.setBorderDashStyle(BorderDashStyle.DASH_DOT_DOT);
//        builder.setBorderVisible(true);
//        builder.getCaptionAbove().setVisible(true);
//        builder.getCaptionBelow().setVisible(true);
//        builder.setCodabarStartSymbol(CodabarSymbol.B);
//        builder.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.RIGHT);
//        builder.setCodeText("9876543210");
//        builder.setCodeTextColor(java.awt.Color.BLUE);
//        builder.setCodeTextFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 10));
//        builder.setCodeTextSpace(1.1f);
//        builder.setColumns(4);
//        builder.setDotCodeMask(1);
//        builder.setECIEncoding(ECIEncodings.Win1251);
//        builder.setEnableChecksum(EnableChecksum.YES);
//        builder.setEnableEscape(true);
//        builder.setGraphicsUnit(GraphicsUnit.PIXEL);
//        builder.setImageQuality(ImageQualityMode.ANTI_ALIAS);
//        builder.setMacroPdf417SegmentID(2);
//        builder.setMacroPdf417SegmentsCount(3);
//        builder.setMaxiCodeEncodeMode(5);
//        builder.setPdf417CompactionMode(Pdf417CompactionMode.BINARY);
//        builder.setPdf417Truncate(true);
//        builder.setPlanetShortBarHeight(6f);
//        builder.setQREncodeType(QREncodeType.AUTO);
//        builder.setResolution(new Resolution(100f, 100f, ResolutionMode.GRAPHICS));
//        builder.setRows(4);
//        builder.setSupplementSpace(5f);
//        builder.setTextRenderingHint(TextRenderingHint.ANTI_ALIAS);
//        builder.setyDimension(2.1f);
//
//        exportImportCheckXml(builder, "createBuilderWithRandomFields.xml");
//    }
//
//    @Test
//    public void testBarCodeReaderExportImport()
//    {
//        BarCodeReader reader = BarCodeReader.importFromXml(Global.pathCombine(Folder, "Issue36668_reader.xml"));
//        {
//            Assert.assertTrue(reader.getQualitySettings().getAllowComplexBackground());
//            Assert.assertTrue(reader.getQualitySettings().getAllowMedianSmoothing());
//            Assert.assertEquals(5, reader.getQualitySettings().getMedianSmoothingWindowSize());
//            Assert.assertNotEquals(reader.getRecognitionMode(), RecognitionMode.MaxQuality);
//            Assert.assertNotEquals(reader.getManualHints(), (ManualHint.INCORRECT_BARCODES | ManualHint.INVERT_IMAGE));
//        }
//    }
//
//    private static void exportImportCheckXml(BarcodeGenerator builder, String xmlFileName)
//    {
//        String path = Global.pathCombine(Folder, xmlFileName);
//        checkXml(builder, path);
//    }
//
//    private static void checkXml(BarcodeGenerator builder, String xmlFilePath)
//    {
//        BarcodeGenerator builderFromXml = BarcodeGenerator(xmlFilePath);
//
//        Assert.assertEquals(builder.getAlwaysShowChecksum(), builderFromXml.getAlwaysShowChecksum());
//        Assert.assertEquals(builder.getAspectRatio(), builderFromXml.getAspectRatio());
//        Assert.assertEquals(builder.getAutoSize(), builderFromXml.getAutoSize());
//        Assert.assertEquals(builder.getAztecSymbolMode(), builderFromXml.getAztecSymbolMode());
//        Assert.assertEquals(builder.getAztectErrorLevel(), builderFromXml.getAztectErrorLevel());
//        Assert.assertEquals(builder.getBackColor(), builderFromXml.getBackColor());
//        Assert.assertEquals(builder.getBarHeight(), builderFromXml.getBarHeight());
//        Assert.assertEquals(builder.getBarWidthReduction(), builderFromXml.getBarWidthReduction());
//        Assert.assertEquals(builder.getBackColor(), builderFromXml.getBackColor());
//        Assert.assertEquals(builder.getBorderDashStyle(), builderFromXml.getBorderDashStyle());
//        Assert.assertEquals(builder.getBorderVisible(), builderFromXml.getBorderVisible());
//        Assert.assertEquals(builder.getBorderWidth(), builderFromXml.getBorderWidth());
//        Assert.assertEquals(builder.getCaptionAbove().getVisible(), builderFromXml.getCaptionAbove().getVisible());
//        Assert.assertEquals(builder.getCaptionBelow().getVisible(), builderFromXml.getCaptionBelow().getVisible());
//        Assert.assertEquals(builder.getCodabarStartSymbol(), builderFromXml.getCodabarStartSymbol());
//        Assert.assertEquals(builder.getCodabarStopSymbol(), builderFromXml.getCodabarStopSymbol());
//        Assert.assertEquals(builder.getCodabarChecksumMode(), builderFromXml.getCodabarChecksumMode());
//        Assert.assertEquals(builder.getCodeLocation(), builderFromXml.getCodeLocation());
//        Assert.assertEquals(builder.getCodeText(), builderFromXml.getCodeText());
//        Assert.assertEquals(builder.getCodeTextAlignment(), builderFromXml.getCodeTextAlignment());
//        Assert.assertEquals(builder.getCodeTextColor(), builderFromXml.getCodeTextColor());
//        Assert.assertEquals(builder.getCodeTextEncoding(), builderFromXml.getCodeTextEncoding());
//        Assert.assertEquals(builder.getCodeTextSpace(), builderFromXml.getCodeTextSpace());
//        Assert.assertEquals(builder.getColumns(), builderFromXml.getColumns());
//        Assert.assertEquals(builder.getCustomerInformationInterpretingType(), builderFromXml.getCustomerInformationInterpretingType());
//        Assert.assertEquals(builder.getDatamatrixEcc(), builderFromXml.getDatamatrixEcc());
//        Assert.assertEquals(builder.getDataMatrixEncodeMode(), builderFromXml.getDataMatrixEncodeMode());
//        Assert.assertEquals(builder.getDisplay2DText(), builderFromXml.getDisplay2DText());
//        Assert.assertEquals(builder.getDotCodeMask(), builderFromXml.getDotCodeMask());
//        Assert.assertEquals(builder.getECIEncoding(), builderFromXml.getECIEncoding());
//        Assert.assertEquals(builder.getEnableChecksum(), builderFromXml.getEnableChecksum());
//        Assert.assertEquals(builder.getEnableEscape(), builderFromXml.getEnableEscape());
//        Assert.assertEquals(builder.getEncodeType(), builderFromXml.getEncodeType());
//        Assert.assertEquals(builder.getFilledBars(), builderFromXml.getFilledBars());
//        Assert.assertEquals(builder.getForeColor(), builderFromXml.getForeColor());
//        Assert.assertEquals(builder.getGraphicsUnit(), builderFromXml.getGraphicsUnit());
//        Assert.assertEquals(builder.getImageHeight(), builderFromXml.getImageHeight());
//        Assert.assertEquals(builder.getImageQuality(), builderFromXml.getImageQuality());
//        Assert.assertEquals(builder.getITF14BorderThickness(), builderFromXml.getITF14BorderThickness());
//        Assert.assertEquals(builder.getITF14BorderType(), builderFromXml.getITF14BorderType());
//        Assert.assertEquals(builder.getMacroPdf417FileID(), builderFromXml.getMacroPdf417FileID());
//        Assert.assertEquals(builder.getMacroPdf417SegmentID(), builderFromXml.getMacroPdf417SegmentID());
//        Assert.assertEquals(builder.getMacroPdf417SegmentsCount(), builderFromXml.getMacroPdf417SegmentsCount());
//        Assert.assertEquals(builder.getMargins(), builderFromXml.getMargins());
//        Assert.assertEquals(builder.getMaxiCodeEncodeMode(), builderFromXml.getMaxiCodeEncodeMode());
//        Assert.assertEquals(builder.getPdf417CompactionMode(), builderFromXml.getPdf417CompactionMode());
//        Assert.assertEquals(builder.getPdf417ErrorLevel(), builderFromXml.getPdf417ErrorLevel());
//        Assert.assertEquals(builder.getPdf417Truncate(), builderFromXml.getPdf417Truncate());
//        Assert.assertEquals(builder.getPlanetShortBarHeight(), builderFromXml.getPlanetShortBarHeight());
//        Assert.assertEquals(builder.getPostnetShortBarHeight(), builderFromXml.getPostnetShortBarHeight());
//        Assert.assertEquals(builder.getQREncodeMode(), builderFromXml.getQREncodeMode());
//        Assert.assertEquals(builder.getQREncodeType(), builderFromXml.getQREncodeType());
//        Assert.assertEquals(builder.getQRErrorLevel(), builderFromXml.getQRErrorLevel());
//        Assert.assertEquals(builder.getResolution(), builderFromXml.getResolution());
//        Assert.assertEquals(builder.getRotationAngleF(), builderFromXml.getRotationAngleF());
//        Assert.assertEquals(builder.getRows(), builderFromXml.getRows());
//        Assert.assertEquals(builder.getSupplementData(), builderFromXml.getSupplementData());
//        Assert.assertEquals(builder.getSupplementSpace(), builderFromXml.getSupplementSpace());
//        Assert.assertEquals(builder.getTextRenderingHint(), builderFromXml.getTextRenderingHint());
//        Assert.assertEquals(builder.getWideNarrowRatio(), builderFromXml.getWideNarrowRatio());
//        Assert.assertEquals(builder.getxDimension(), builderFromXml.getxDimension());
//        Assert.assertEquals(builder.getyDimension(), builderFromXml.getyDimension());
//    }
//
//    private static BarcodeGenerator createSampleBuilder()
//    {
//        BarcodeGenerator builder = new BarcodeGenerator(EncodeTypes.DATA_MATRIX);
//        builder.setAlwaysShowChecksum(true);
//        builder.setAspectRatio(0.1f);
//        builder.getParameters().getBarcode().setAutoSizeMode(AutoSizeMode.NONE);;
//        builder.setAztecSymbolMode(AztecSymbolMode.FULL_RANGE);
//        builder.setAztectErrorLevel(22);
//        builder.setBackColor(java.awt.Color.YELLOW);
//        builder.setBarHeight(14f);
//        builder.setBarWidthReduction(0.001f);
//        builder.setBorderColor(new java.awt.Color(102, 51, 0));
//        builder.setBorderDashStyle(BorderDashStyle.DASH_DOT_DOT);
//        builder.setBorderVisible(true);
//        builder.setBorderWidth(0.7f);
//        builder.getCaptionAbove().setVisible(true);
//        builder.getCaptionBelow().setVisible(true);
//        builder.setCodabarStartSymbol(CodabarSymbol.B);
//        builder.setCodabarStopSymbol(CodabarSymbol.B);
//        builder.setCodabarChecksumMode(CodabarChecksumMode.MOD_10);
//        builder.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.RIGHT);
//        builder.setCodeText("9876543210");
//        builder.setCodeTextAlignment(StringAlignment.FAR);
//        builder.setCodeTextColor(java.awt.Color.BLUE);
//        builder.setCodeTextEncoding(Charset.forName("US-ASCII"));
//        builder.setCodeTextFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 10));
//        builder.setCodeTextSpace(1.1f);
//        builder.setColumns(4);
//        builder.setCustomerInformationInterpretingType(CustomerInformationInterpretingType.N_TABLE);
//        builder.setDatamatrixEcc(DataMatrixEccType.ECC_200);
//        builder.setDataMatrixEncodeMode(DataMatrixEncodeMode.FULL);
//        builder.setDisplay2DText("2D" + builder.getCodeText());
//        builder.setDotCodeMask(1);
//        builder.setECIEncoding(ECIEncodings.Win1251);
//        builder.setEnableChecksum(EnableChecksum.YES);
//        builder.setEnableEscape(true);
//        builder.setFilledBars(false);
//        builder.setForeColor(new java.awt.Color(148, 0, 211));
//        builder.setGraphicsUnit(GraphicsUnit.PIXEL);
//        builder.setImageHeight(61);
//        builder.setImageQuality(ImageQualityMode.ANTI_ALIAS);
//        builder.setImageWidth(101);
//        builder.setITF14BorderThickness(-1.1f);
//        builder.setITF14BorderType(ITF14BorderType.BAR_OUT);
//        builder.setMacroPdf417FileID(1);
//        builder.setMacroPdf417SegmentID(2);
//        builder.setMacroPdf417SegmentsCount(3);
//        builder.setMargins(new MarginsF(2, 3, 4, 5));
//        builder.setMaxiCodeEncodeMode(5);
//        builder.setPdf417CompactionMode(Pdf417CompactionMode.BINARY);
//        builder.setPdf417ErrorLevel(Pdf417ErrorLevel.LEVEL_1);
//        builder.setPdf417Truncate(true);
//        builder.setPlanetShortBarHeight(6f);
//        builder.setPostnetShortBarHeight(6f);
//        builder.setQREncodeMode(QREncodeMode.BYTES);
//        builder.setQREncodeType(QREncodeType.AUTO);
//        builder.setQRErrorLevel(QRErrorLevel.LEVEL_M);
//        builder.setResolution(new Resolution(100f, 100f, ResolutionMode.GRAPHICS));
//        builder.setRotationAngleF(1);
//        builder.setRows(4);
//        builder.setSupplementData("01234");
//        builder.setSupplementSpace(5f);
//        builder.setTextRenderingHint(TextRenderingHint.ANTI_ALIAS);
//        builder.setWideNarrowRatio(3.5f);
//        builder.setXDimension(0.7f);
//        builder.setyDimension(2.1f);
//
//        return builder;
//    }
}
