package com.aspose.barcode.auxiliary;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

public class TestDataVerifier
{
    private static String tag = "TestDataVerifier";
    private static String[] PATHS_TO_PROPERTY_FILES =
            {"test_release_date.properties", "../../test_release_date.properties", "../../../test_release_date.properties"};

    private static String formatDate = "dd.MM.yyyy";

    public static TestData initTestData()
    {
        TestData testData = new TestData();
        try
        {
            String propertiesPathDetermined = determinePropertiesPath();
//            java.io.File currentDirectory = new java.io.File(new File(".").getAbsolutePath());
//            print("currentDirectory.getCanonicalPath() " + currentDirectory.getCanonicalPath());
//            print("currentDirectory.getAbsolutePath() " + currentDirectory.getAbsolutePath());
            if (propertiesPathDetermined == null)
            {
                throw new Exception("Cannot find properties file");
            }
            Properties releaseProperties = new Properties();
            releaseProperties.load(obtainStream(propertiesPathDetermined));

            testData.setVersionForTests(releaseProperties.getProperty("version_for_tests"));
            testData.setFirstDateOfReleasePeriod(convertStringToDate(releaseProperties.getProperty("release_date_from")));
            testData.setLastDateOfReleasePeriod(convertStringToDate(releaseProperties.getProperty("release_date_until")));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return testData;
    }

    private static String determinePropertiesPath()
    {
        for (String path : PATHS_TO_PROPERTY_FILES)
        {
            if (new File(path).exists())
            {
                return path;
            }
        }
        return null;
    }

    private static LocalDate convertStringToDate(String s) throws ParseException
    {
        return LocalDate.parse(s, DateTimeFormatter.ofPattern(formatDate));
    }

    public static String convertDateToString(LocalDate d)
    {
        return d.format(DateTimeFormatter.ofPattern(formatDate));
    }

    private static FileInputStream obtainStream(String pathToTestsProperties)
    {
        FileInputStream fis = null;
        try
        {
            fis = new FileInputStream(pathToTestsProperties);
        }
        catch (FileNotFoundException fnfe)
        {
            print(fnfe.getMessage());
        }
        return fis;
    }

    private static void print(String mess)
    {
        System.out.println(tag + ":" + mess);
    }

    public static void main(String[] args)
    {
        TestData testData = initTestData();
        System.out.println(testData);
    }


    public static void verifyAssemblyData(String productExp, String assemblyVersionAct, String productAct, LocalDate releaseDateAct)
    {
        TestData testData = initTestData();
        System.out.println("BuildVersionInfo.ASSEMBLY_VERSION : " + assemblyVersionAct);
        Assert.assertEquals(assemblyVersionAct, testData.getVersionForTests());
        System.out.println("BuildVersionInfo.PRODUCT : " + productAct);
        Assert.assertEquals(productAct, productExp);
        System.out.println("BuildVersionInfo.RELEASE_DATE : " + convertDateToString(releaseDateAct));
        LocalDate firstDateOfReleasePeriod = testData.getFirstDateOfReleasePeriod();
        LocalDate lastDateOfReleasePeriod = testData.getLastDateOfReleasePeriod();
        System.out.println("Expected period from " + convertDateToString(firstDateOfReleasePeriod)
                + " to " + convertDateToString(lastDateOfReleasePeriod));
        Assert.assertTrue(releaseDateAct.isAfter(firstDateOfReleasePeriod) ||
                        releaseDateAct.equals(firstDateOfReleasePeriod),
                "actual releaseDate equal or after firstDateOfReleasePeriod");
        Assert.assertTrue(releaseDateAct.isBefore(lastDateOfReleasePeriod) ||
                        releaseDateAct.equals(lastDateOfReleasePeriod),
                "actual releaseDate before or equals lastDateOfReleasePeriod");
    }

    @Test
    public static void verifyAssemblyDataJava(String assemblyVersionAct, String productAct, LocalDate releaseDateAct)
    {
        String productExp = "Aspose.BarCode for Java";
        verifyAssemblyData(productExp, assemblyVersionAct, productAct, releaseDateAct);
    }

    @Test
    public static void verifyAssemblyDataPHP(String assemblyVersionAct, String productAct, LocalDate releaseDateAct)
    {
        String productExp = "Aspose.BarCode for PHP via Java";
        verifyAssemblyData(productExp, assemblyVersionAct, productAct, releaseDateAct);
    }

    @Test
    public static void verifyAssemblyDataPython(String assemblyVersionAct, String productAct, LocalDate releaseDateAct)
    {
        String productExp = "Aspose.BarCode for Python via Java";
        verifyAssemblyData(productExp, assemblyVersionAct, productAct, releaseDateAct);
    }

    public static void verifyAssemblyDataNodejs(String assemblyVersionAct, String productAct, LocalDate releaseDateAct)
    {
        String productExp = "Aspose.BarCode for Node.js via Java";
        verifyAssemblyData(productExp, assemblyVersionAct, productAct, releaseDateAct);
    }

    public static void verifyAssemblyDataJR(String assemblyVersionAct, String productAct, LocalDate releaseDateAct)
    {
        String productExp = "Aspose.BarCode for JasperReports";
        verifyAssemblyData(productExp, assemblyVersionAct, productAct, releaseDateAct);
    }
}
