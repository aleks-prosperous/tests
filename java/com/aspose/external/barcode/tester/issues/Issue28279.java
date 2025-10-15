//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue28279.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="10.09.2013 11:08:48">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue28279.")
public class Issue28279
{
    private final String Folder = Global.getTestDataFolder("Issues/Issue28279");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void SD1Macro1()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "SD1Macro1.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
    public void SD1Macro2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "SD1Macro2.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
    public void SD2Macro1()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "SD2Macro1.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(
                    "3082039806092A864886F70D010702A082038930820385020101310B300906052B0E03021A05003081DE06092A864886F70D010701A081D00481CD4E724F703D313B5469706F436572743D5469706F3B436F64436F6D756E653D31353030373B446174614F72613D30392F30362F323031312031352E30342E33353B4E6F6D653D4C6F72656E7A6F3B436F676E6F6D653D526F6C66693B43697474614E6173636974613D47616C6C69617465284E4F293B446174614E6173636974613D31332F30362F313938363B43697474615265736964656E7A613D4172636F6E617465284D49293B496E646972697A7A6F5265736964656E7A613D56696120646569205469676C692031313BA08201BE308201BA30820168A0030201020210E88D67F4A7370890466E384629253DC5300906052B0E03021D05003016311430120603550403130B526F6F74204167656E6379301E170D3130313233313232303030305A170D3136313233303232303030305A301D311B3019060355040313124E656D6F20732E722E6C2E202D203130323430819F300D06092A864886F70D010101050003818D0030818902818100989C3E62947EDF08DD9F60A70B0D1C012E91978F17708219DB2C7F86DFAA404AF77953EB",
                    reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void SD2Macro2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "SD2Macro2.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(
                    "5345CC526FE3162310294EE64A4AB5F40EDF5873D3E5E82B265C0DE13DB4BD1DD9D73FE6F6484A5641FA790365E061135678ADDFC182F8DB5DF5D5908AD8348C8626F2EC64621DA346AF43680DC39A87170E682C63873558C550CDC70203010001A34B304930470603551D010440303E801012E4092D061D1D4F008D6121DC166463A1183016311430120603550403130B526F6F74204167656E6379821006376C00AA00648A11CFB8D4AA5C35F4300906052B0E03021D050003410058D54D890F3D4A78999A824591D242D6D97B1F871415BC9BF3B8A31F5949EE0527376E47CA7641C761D6B493B127983E004808CFF3C771BC6F7C9C1F2D1604F63181CF3081CC020101302A3016311430120603550403130B526F6F74204167656E63790210E88D67F4A7370890466E384629253DC5300906052B0E03021A0500300D06092A864886F70D0101010500048180523C53D7BEE988D2D059C931DCC19B86C258837CD92B6B7AEACC9D9500F07449EF9C994638E54DAA591B1D149F4B57347AD4CF379AA0BC21B6FD1B044100101C4156F060C2DAD53AC2A28CB3558D47529B9818E710E7F186ED43548C5E1AFBB33375427C9D88C9007C965FB2C32E70FFC60E6B013066EC67E03C74F85FF81761",
                    reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}

