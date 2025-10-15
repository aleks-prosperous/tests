package com.aspose.external.barcode.tester.releases.v20_3;

import com.aspose.external.barcode.tester.releases.v17_9.Issue36668;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.IOException;

public class ReaderImportExportXMLTests
{
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    /**
     *     added method com.aspose.barcode.barcoderecognition.BarCodeReader.exportToXml(OutputStream)
     *     added method com.aspose.barcode.barcoderecognition.BarCodeReader.importFromXml(InputStream)
     * @throws IOException
     */
    @Test
    public void testBarCodeReaderExportImportStream() throws IOException
    {
        Issue36668 issue = new Issue36668();
        issue.testBarCodeReaderExportImportStream();
    }
}
