package com.aspose.barcode.auxiliary;

import java.time.LocalDate;

public class TestData
{
    private String versionForTests;
    private LocalDate firstDateOfReleasePeriod;
    private LocalDate lastDateOfReleasePeriod;

    public String getVersionForTests()
    {
        return versionForTests;
    }

    public void setVersionForTests(String versionForTests)
    {
        this.versionForTests = versionForTests;
    }

    public LocalDate getFirstDateOfReleasePeriod()
    {
        return firstDateOfReleasePeriod;
    }

    public void setFirstDateOfReleasePeriod(LocalDate firstDateOfReleasePeriod)
    {
        this.firstDateOfReleasePeriod = firstDateOfReleasePeriod;
    }

    public LocalDate getLastDateOfReleasePeriod()
    {
        return lastDateOfReleasePeriod;
    }

    public void setLastDateOfReleasePeriod(LocalDate lastDateOfReleasePeriod)
    {
        this.lastDateOfReleasePeriod = lastDateOfReleasePeriod;
    }
}
