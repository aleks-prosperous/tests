package com.aspose.external.barcode.tester.helpers;

import com.aspose.external.barcode.tester.helpers.data.CodetextWithType;

import java.util.ArrayList;
import java.util.List;

public class TimeoutScanInfo
{
    public int RequiredTimeout = 0;
    public int ScanDuration = 0;
    public List<CodetextWithType> RecognizedResults = new ArrayList<>();

    public TimeoutScanInfo(int aRequiredTimeout)
    {
        RequiredTimeout = aRequiredTimeout;
    }

    public TimeoutScanInfo(int aRequiredTimeout, int aScanDuration, List<CodetextWithType> aRecognizedResults)
    {
        RequiredTimeout = aRequiredTimeout;
        ScanDuration = aScanDuration;
        RecognizedResults.addAll(aRecognizedResults);
    }
}
