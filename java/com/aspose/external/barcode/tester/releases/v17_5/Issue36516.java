package com.aspose.external.barcode.tester.releases.v17_5;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

@Test
public class Issue36516
{
    /**
     * <p>
     * Path to folder with files for testing Issue36516.
     * </p>
     */
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue36516");

    /**
     * <p>
     * Prepares to run these tests.
     * </p>
     */
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testReadCustomerImage()
    {
        String fileName = Global.pathCombine(folder, "datamatrix.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        final String expected = "DC02FR03EDF1186F186F000137B082E183DE4D92B17E364431394F75\u001d10M/LILIAN/NAYAGOM\u001d20\u001d21\u001d22 CHEMIN DE LA PERIERE\u001d23\u001d243829025FRONTONAS\u001d26FR\u001fRCMETVZ4IRW32QUOBY2ETIRF2I6GWBJQKG7EETEKAORQ7QPI5N5CJKL7VG6ICEG6RSSM6PYWD5FMTWYQVW2QHUTX7H53F53UMOMWVWI";
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(expected, reader.getFoundBarCodes()[0].getCodeText());
    }
}

