package com.aspose.external.barcode.tester.helpers;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.*;
import com.aspose.external.barcode.tester.helpers.data.CodetextWithType;
import org.testng.Assert;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RecognitionHelper
{
    protected static CodetextWithType[] stringArrayToMatchingTypes(String[] aList)
    {
        CodetextWithType[] lRes = new CodetextWithType[aList.length];
        for (int i = 0; i < aList.length; ++i)
        {
            lRes[i] = new CodetextWithType(null, aList[i]);
        }
        return lRes;
    }

    protected static boolean isRequiredResultInList(CodetextWithType aRequired, List<CodetextWithType> aList)
    {
        return (0 <= findIndexOfRequiredResultInList(aRequired, aList));
    }

    protected static int findIndexOfRequiredResultInList(CodetextWithType aRequired, List<CodetextWithType> aList)
    {
        if (null == aRequired.Readtype)
        {
            for (int i = 0; i < aList.size(); ++i)
            {
                if (0 == aRequired.Codetext.compareTo(aList.get(i).Codetext))
                    return i;
            }
        } else
        {
            for (int i = 0; i < aList.size(); ++i)
            {
                CodetextWithType lItem = aList.get(i);
                if (lItem.Readtype.containsAny(aRequired.Readtype))
                    if (0 == aRequired.Codetext.compareTo(aList.get(i).Codetext))
                        return i;
            }
        }

        return -1;
    }

    protected static boolean isRequiredResultInListWithRemoving(CodetextWithType aRequired, List<CodetextWithType> aList)
    {
        int lIndex = findIndexOfRequiredResultInList(aRequired, aList);
        if (0 <= lIndex)
        {
            aList.remove(lIndex);
            return true;
        }
        return false;
    }

    protected static boolean isResultInRequired(CodetextWithType aResult, CodetextWithType[] aRequiredList)
    {
        for (int i = 0; i < aRequiredList.length; ++i)
        {
            CodetextWithType lReq = aRequiredList[i];
            if (null == lReq.Readtype)
            {
                if (0 == lReq.Codetext.compareTo(aResult.Codetext))
                    return true;
            } else
            {
                if (lReq.Readtype.containsAny(aResult.Readtype))
                    if (0 == lReq.Codetext.compareTo(aResult.Codetext))
                        return true;
            }
        }

        return false;
    }

    protected static String reportCodetextList(List<CodetextWithType> aList)
    {
        if (null == aList) return "";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < aList.size(); ++i)
        {
            CodetextWithType lItem = aList.get(i);
            if (null != lItem.Readtype)
            {
                sb.append("Type:");
                sb.append(lItem.Readtype);
                sb.append("\n");
            }
            sb.append("Codetext(");
            sb.append(lItem.Codetext.length());
            sb.append("):");
            sb.append(lItem.Codetext);
            sb.append("\n");
        }
        return sb.toString();
    }


    protected static String reportRecognizedList(List<CodetextWithType> aList)
    {
        if (null == aList) return "";

        StringBuilder sb = new StringBuilder();
        sb.append("Recognized:");
        sb.append(aList.size());
        sb.append("\n");
        sb.append(reportCodetextList(aList));

        return sb.toString();
    }

    protected static String reportFailed(CodetextWithType aRequired, List<CodetextWithType> aList, boolean isWriteRecognizedList)
    {
        StringBuilder sb = new StringBuilder();

        sb.append("RECOGNITION FAILED:\n");
        sb.append(reportCodetextWithType(aRequired));

        if (isWriteRecognizedList)
            sb.append(reportRecognizedList(aList));

        return sb.toString();
    }

    protected static String reportFailedWithSuccess(List<CodetextWithType> aRecognizedList, List<CodetextWithType> aList, boolean isWriteRecognizedList)
    {
        StringBuilder sb = new StringBuilder();

        sb.append("RECOGNIZED CORRECTLY:\n");
        sb.append(reportCodetextList(aRecognizedList));
        //
        if (isWriteRecognizedList)
            sb.append(reportRecognizedList(aList));

        return sb.toString();
    }

    protected static String reportCodetextWithType(CodetextWithType aCodetext)
    {
        StringBuilder sb = new StringBuilder();

        if (null != aCodetext.Readtype)
        {
            sb.append("Type:");
            sb.append(aCodetext.Readtype);
            sb.append("\n");
        }
        sb.append("Codetext(");
        sb.append(aCodetext.Codetext.length());
        sb.append("):");
        sb.append(aCodetext.Codetext);
        sb.append("\n");

        return sb.toString();
    }

    protected static String reportFakes(List<CodetextWithType> aFakesList)
    {
        StringBuilder sb = new StringBuilder();
        //
        sb.append("Recognized with fakes:\n");
        sb.append(reportCodetextList(aFakesList));

        //
        return sb.toString();
    }

    protected static void checkFakesRecognition(CodetextWithType[] Values, List<CodetextWithType> aRecList, String FileName,
                                                boolean CheckFakeRecognitions, boolean IsFakesRequired)
    {

        //check fakes
        if (CheckFakeRecognitions)
        {
            List<CodetextWithType> lFakesList = new ArrayList<>();
            for (int i = 0; i < aRecList.size(); ++i)
            {
                CodetextWithType lItem = aRecList.get(i);
                if (!isResultInRequired(lItem, Values))
                    lFakesList.add(lItem);
            }
            //report fakes
            if (!IsFakesRequired)
            {
                if (0 < lFakesList.size())
                {
                    String lStr = "TEST FAILED:" + FileName + "\n" + reportFakes(lFakesList);
                    Assert.fail(lStr);
                }
            } else
            {
                if (0 < lFakesList.size())
                {
                    String lStr = "Found fakes:" + FileName + "\n" + reportFakes(lFakesList);
                    System.out.println(lStr);
                } else
                    Assert.fail("No Fakes Now, Fix the test");
            }
        }
    }

    protected static BufferedImage openSharedBitmapInMemory(String aFilepath)
    {
        try
        {
            return ImageIO.read(new File(aFilepath));
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public static void testRecognized(String FolderPath, String FileName, BaseDecodeType ReadType, CodetextWithType[] Values, QualitySettings aQuality,
                                      ChecksumValidation ChecksumValidation, boolean StripFNC, boolean CheckFakeRecognitions, boolean IsFakesRequired, boolean isWriteRecognizedList)
    {
        File lFilepath = new File(Global.pathCombine(FolderPath, FileName));
        boolean lIsFileExist = lFilepath.exists();
        if (!lIsFileExist)
            Assert.fail("Incorrect file name:" + FileName);

        //open bitmap
        // final BufferedImage lOrigBmp = openSharedBitmapInMemory(lFilepath.getPath());
        final BarCodeReader reader = new BarCodeReader(lFilepath.getPath());
        //setup reader
        reader.setBarCodeReadType(ReadType);
        reader.setQualitySettings(aQuality);
        reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation);
        reader.getBarcodeSettings().setStripFNC(StripFNC);

        //create read list
        List<CodetextWithType> lRecList = new ArrayList<>();
        for(BarCodeResult result : reader.readBarCodes())
        lRecList.add(new CodetextWithType(result.getCodeType(), result.getCodeText()));

        //write recognized to console
        if (isWriteRecognizedList)
        {
            System.out.println(FileName);
            System.out.println(reportRecognizedList(lRecList));
        }

        List<CodetextWithType> lTestRecList = new ArrayList<>(lRecList);
        for (int i = 0; i < Values.length; ++i)
        {
            if (!isRequiredResultInListWithRemoving(Values[i], lTestRecList))
            {
                String lStr = "TEST FAILED:" + FileName + "\n" + reportFailed(Values[i], lRecList, isWriteRecognizedList);
                Assert.fail(lStr);
            }
        }

        //check fakes
        checkFakesRecognition(Values, lRecList, FileName, CheckFakeRecognitions, IsFakesRequired);
    }

    public static void testRecognized(String FolderPath, String FileName, BaseDecodeType ReadType, CodetextWithType[] Values,
                                      boolean CheckFakeRecognitions, boolean IsFakesRequired, boolean isWriteRecognizedList)
    {
        testRecognized(FolderPath, FileName, ReadType, Values, QualitySettings.getNormalQuality(), ChecksumValidation.DEFAULT, false,
                CheckFakeRecognitions, IsFakesRequired, isWriteRecognizedList);
    }

    public static void testRecognized(String FolderPath, String FileName, BaseDecodeType ReadType, String[] Values,
                                      ChecksumValidation ChecksumValidation, boolean StripFNC, boolean CheckFakeRecognitions, boolean IsFakesRequired, boolean isWriteRecognizedList)
    {
        CodetextWithType[] lValuesList = stringArrayToMatchingTypes(Values);
        testRecognized(FolderPath, FileName, ReadType, lValuesList, QualitySettings.getNormalQuality(), ChecksumValidation, StripFNC,
                CheckFakeRecognitions, IsFakesRequired, isWriteRecognizedList);
    }

    public static void testRecognized(String FolderPath, String FileName, BaseDecodeType ReadType, String Value,
                                      ChecksumValidation ChecksumValidation, boolean StripFNC, boolean CheckFakeRecognitions,
                                      boolean IsFakesRequired, boolean isWriteRecognizedList)
    {
        CodetextWithType[] lValuesList = stringArrayToMatchingTypes(new String[] { Value });
        testRecognized(FolderPath, FileName, ReadType, lValuesList, QualitySettings.getNormalQuality(), ChecksumValidation, StripFNC,
                CheckFakeRecognitions, IsFakesRequired, isWriteRecognizedList);
    }

    public static void testRecognized(String FolderPath, String FileName, BaseDecodeType ReadType, String Value,
                                      boolean CheckFakeRecognitions, boolean IsFakesRequired, boolean isWriteRecognizedList)
    {
        CodetextWithType[] lValuesList = stringArrayToMatchingTypes(new String[] { Value });
        testRecognized(FolderPath, FileName, ReadType, lValuesList, QualitySettings.getNormalQuality(), ChecksumValidation.DEFAULT, false,
                CheckFakeRecognitions, IsFakesRequired, isWriteRecognizedList);
    }

    public static void testRecognized(String FolderPath, String FileName, BaseDecodeType ReadType, String Value, boolean isWriteRecognizedList)
    {
        CodetextWithType[] lValuesList = stringArrayToMatchingTypes(new String[] { Value });
        testRecognized(FolderPath, FileName, ReadType, lValuesList, QualitySettings.getNormalQuality(), ChecksumValidation.DEFAULT, false,
                false, false, isWriteRecognizedList);
    }

    public static void testFailed(String FolderPath, String FileName, BaseDecodeType ReadType, CodetextWithType[] Values, QualitySettings aQuality,
                                  ChecksumValidation ChecksumValidation, boolean StripFNC, boolean CheckFakeRecognitions, boolean IsFakesRequired, boolean isWriteRecognizedList)
    {
        String lFilepath = Global.pathCombine(FolderPath, FileName);
        boolean lIsFileExist = new File(lFilepath).exists();
        if (!lIsFileExist)
            Assert.fail("Incorrect file name:" + FileName);

        //open bitmap
        BufferedImage lOrigBmp = openSharedBitmapInMemory(lFilepath);
        {
            BarCodeReader reader = new BarCodeReader(lOrigBmp);
            {
                //setup reader
                reader.setBarCodeReadType(ReadType);
                reader.setQualitySettings(aQuality);
                reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation);
                reader.getBarcodeSettings().setStripFNC(StripFNC);

                //create read list
                List<CodetextWithType> lRecList = new ArrayList<CodetextWithType>();
                for(BarCodeResult result : reader.readBarCodes())
                lRecList.add(new CodetextWithType(result.getCodeType(), result.getCodeText()));

                //write recognized to console
                if (isWriteRecognizedList)
                {
                    System.out.println(FileName);
                    System.out.print(reportRecognizedList(lRecList));
                }

                List<CodetextWithType> lTestRecList = new ArrayList<CodetextWithType>(lRecList);
                List<CodetextWithType> lRecognizedCorrectlyList = new ArrayList<CodetextWithType>();
                for (int i = 0; i < Values.length; ++i)
                {
                    if (isRequiredResultInListWithRemoving(Values[i], lTestRecList))
                        lRecognizedCorrectlyList.add(Values[i]);
                }
                if (0 < lRecognizedCorrectlyList.size())
                {
                    String lStr = "TEST FAILED by correct Recognition:" + FileName + "\n" + reportFailedWithSuccess(lRecognizedCorrectlyList, lRecList, isWriteRecognizedList);
                    Assert.fail(lStr);
                }

                //check fakes
                checkFakesRecognition(Values, lRecList, FileName, CheckFakeRecognitions, IsFakesRequired);

            }
        }
    }

    public static void testFailed(String FolderPath, String FileName, BaseDecodeType ReadType, CodetextWithType[] Values,
                                  boolean CheckFakeRecognitions, boolean IsFakesRequired, boolean isWriteRecognizedList)
    {
        testFailed(FolderPath, FileName, ReadType, Values, QualitySettings.getNormalQuality(), ChecksumValidation.DEFAULT, false,
                CheckFakeRecognitions, IsFakesRequired, isWriteRecognizedList);
    }

    public static void testFailed(String FolderPath, String FileName, BaseDecodeType ReadType, String[] Values,
                                  ChecksumValidation ChecksumValidation, boolean StripFNC, boolean CheckFakeRecognitions,
                                  boolean IsFakesRequired, boolean isWriteRecognizedList)
    {
        CodetextWithType[] lValuesList = stringArrayToMatchingTypes(Values);
        testFailed(FolderPath, FileName, ReadType, lValuesList, QualitySettings.getNormalQuality(), ChecksumValidation, StripFNC,
                CheckFakeRecognitions, IsFakesRequired, isWriteRecognizedList);
    }

    public static void testFailed(String FolderPath, String FileName, BaseDecodeType ReadType, String Value,
                                  boolean CheckFakeRecognitions, boolean IsFakesRequired, boolean isWriteRecognizedList)
    {
        CodetextWithType[] lValuesList = stringArrayToMatchingTypes(new String[] { Value });
        testFailed(FolderPath, FileName, ReadType, lValuesList, QualitySettings.getNormalQuality(), ChecksumValidation.DEFAULT, false,
                CheckFakeRecognitions, IsFakesRequired, isWriteRecognizedList);
    }

    public static void testFailed(String FolderPath, String FileName, BaseDecodeType ReadType, String Value, boolean isWriteRecognizedList)
    {
        CodetextWithType[] lValuesList = stringArrayToMatchingTypes(new String[] { Value });
        testFailed(FolderPath, FileName, ReadType, lValuesList, QualitySettings.getNormalQuality(), ChecksumValidation.DEFAULT, false,
                false, false, isWriteRecognizedList);
    }
}