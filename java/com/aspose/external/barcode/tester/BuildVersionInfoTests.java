package com.aspose.external.barcode.tester;

import com.aspose.barcode.BuildVersionInfo;
import com.aspose.barcode.auxiliary.TestDataVerifier;
import org.testng.annotations.Test;

public class BuildVersionInfoTests
{
    @Test
    public void testData()
    {
        TestDataVerifier.verifyAssemblyDataJava(BuildVersionInfo.ASSEMBLY_VERSION,BuildVersionInfo.PRODUCT,
                BuildVersionInfo.RELEASE_DATE);
    }
}
