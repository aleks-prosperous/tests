package com.aspose.external.barcode.tester.helpers;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.BaseDecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import com.aspose.external.barcode.tester.helpers.data.CodetextWithType;
import org.testng.Assert;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class TimeoutHelper
{
    protected static String ReportCodetextList(List<CodetextWithType> aList)
    {
        if (null == aList) return "";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < aList.size(); ++i)
        {
            CodetextWithType lItem = aList.get(i);
            if (null != lItem.Readtype)
            {
                sb.append("Type:");
                sb.append(lItem.Readtype.toString());
                sb.append("\n");
            }
            //
            sb.append("Codetext(");
            sb.append(lItem.Codetext.length());
            sb.append("):");
            sb.append(lItem.Codetext);
            sb.append("\n");
        }

        //
        return sb.toString();
    }

    protected static BufferedImage openSharedBitmapInMemory(String aFilepath) throws IOException
    {

//        MemoryStream lMemStr = null;
//        FileStream lFstr = new FileStream(aFilepath, FileMode.Open, FileAccess.Read, FileShare.ReadWrite))
//        {
//            byte[] lbytes = new byte[lFstr.Length];
//            lFstr.read(lbytes, 0, (int)lFstr.Length);
//            lMemStr = new MemoryStream(lbytes);
//            lMemStr.Position = 0;
//        }
        //
        return ImageIO.read(new File(aFilepath));
//        return new Bitmap(lMemStr);
    }

    protected static BufferedImage loadBitmap(String folderPath, String FileName) throws IOException
    {
        String lFilepath = Global.pathCombine(folderPath, FileName);
        boolean lIsFileExist = new File(lFilepath).exists();
        if (!lIsFileExist)
            Assert.fail("Incorrect file name:" + FileName);

        //load
        return openSharedBitmapInMemory(lFilepath);
    }

    protected static class ThreadAborter
    {
        protected BarCodeReader reader;
        protected long _startTime;//ms
        protected long _timeout;//ms
        protected volatile Thread _thread = null;
        public ThreadAborter(BarCodeReader aReader, int aTimeout, boolean isStartOnCreation)
        {
            reader = aReader;
            _timeout = aTimeout;
            _startTime = System.currentTimeMillis();//DateTime.getUtcNow().getTicks() / TimeSpan.TicksPerMillisecond;
            if (isStartOnCreation)
                Start();
        }

        public void ThreadProc() throws InterruptedException
        {
            while (true)
            {
                long lTimeDiff = System.currentTimeMillis() - _startTime;//(DateTime.getUtcNow().getTicks() / TimeSpan.TicksPerMillisecond) - _startTime;
                if (_timeout <= lTimeDiff)
                {
                    BarCodeReader lLocReader = reader;
                    try
                    {
                        if (null != lLocReader)
                            lLocReader.abort();
                    }
                    catch(Exception e)
                    { }
                    break;
                }
                Thread.sleep(10);
            }
            DisposeThreadSafe();
        }

        public void Start()
        {
            if (null != _thread) return;
            if (0 < _timeout)
            {
                _thread = new Thread(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        try
                        {
                            ThreadProc();
                        } catch (InterruptedException e)
                        {
                            e.printStackTrace();
                        }
                    }
                });
                _thread.start();
            }
        }

        private void DisposeThreadSafe()
        {
            Thread lLocThread = _thread;
            try
            {
                if (null != lLocThread)
                {
                    lLocThread.stop();
                    Thread.sleep(0);
                }
                _thread = null;
            }
            catch(Exception e)
            { }
        }

        public void dispose()
        {
            DisposeThreadSafe();
            reader = null;
        }
    }

    public static String ReportTimeoutInfo(TimeoutScanInfo aInfo)
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Required Timeout:");
        sb.append(aInfo.RequiredTimeout);
        sb.append("ms Scan time:");
        sb.append(aInfo.ScanDuration);
        sb.append("ms");

        //positive deviance in timeout
        if (0 < aInfo.RequiredTimeout)
        {
            int lDeviance = aInfo.ScanDuration - aInfo.RequiredTimeout;
            double lDeviationPercent = 0;
            if (0 < aInfo.RequiredTimeout)
                lDeviationPercent = (double)lDeviance / (double)aInfo.RequiredTimeout;
            if (0 < lDeviance)
            {
                sb.append(" Exceeded time:");
                sb.append(lDeviance);
                sb.append("ms ");
                sb.append(((int)Math.round(lDeviationPercent * 100)));
                sb.append("%");
            }
        }
        sb.append("\n");

        //write report list
        sb.append(ReportCodetextList(aInfo.RecognizedResults));

        return sb.toString();
    }

    public static void CheckAllowedTimeoutDeviance(TimeoutScanInfo aInfo, int AllowedDeviance, boolean isWriteDebugInfo)
    {
        CheckAllowedTimeoutDeviance(aInfo, AllowedDeviance, 10, isWriteDebugInfo);
    }

    public static void CheckAllowedTimeoutDeviance(TimeoutScanInfo aInfo, int AllowedDeviance, int IncreasedDevianceToFail, boolean isWriteDebugInfo)
    {
        if (isWriteDebugInfo)
            ReportTimeoutInfo(aInfo);

        //check deviance
        if (aInfo.RequiredTimeout <= 0)
            return;

        int lAssertAllowedDeviance = AllowedDeviance * IncreasedDevianceToFail;
        int lDeviance = aInfo.ScanDuration - aInfo.RequiredTimeout;
        if (lAssertAllowedDeviance < lDeviance)
        {
            String lAssertMessage = "Termination by timeout failed. Required Timeout is:" + aInfo.RequiredTimeout +
                    "ms Scan time is:" + aInfo.ScanDuration +
                    "ms Exceeded time:" + lDeviance +
                    "ms Allowed exceeding:" + AllowedDeviance +
                    "ms \n";
            Assert.fail(lAssertMessage);
        }

        if (AllowedDeviance < lDeviance)
        {
            String lWarnMessage = "Termination by timeout couldnot be completed in time. Required Timeout is:" + aInfo.RequiredTimeout +
                    "ms Scan time is:" + aInfo.ScanDuration +
                    "ms Exceeded time:" + lDeviance +
                    "ms Allowed exceeding:" + AllowedDeviance +
                    "ms";
//            WarnProcessor.warn(lWarnMessage);
            System.out.println(lWarnMessage);
        }
    }
    public static TimeoutScanInfo recognizeWithTimeout(BarCodeReader aReader, int aTimeout)
    {
        //set timeout
        aReader.setTimeout(aTimeout);

        //create read list
        List<CodetextWithType> lRecList = new ArrayList<CodetextWithType>();
        long watch = System.currentTimeMillis();

        try
        {
            for(BarCodeResult result : aReader.readBarCodes())
            lRecList.add(new CodetextWithType(result.getCodeType(), result.getCodeText()));
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

        //timeout
        int lScanDuration = (int) (System.currentTimeMillis() - watch);

        //create resut
        TimeoutScanInfo lRes = new TimeoutScanInfo(aTimeout, lScanDuration, lRecList);
        return lRes;
    }

    public static TimeoutScanInfo recognizeWithTimeout(BufferedImage aBitmap, BaseDecodeType ReadType, int aTimeout, QualitySettings aQuality, boolean StripFNC)
    {
        BarCodeReader reader = new BarCodeReader(aBitmap, ReadType);
        {
            //setup reader
            reader.setQualitySettings(aQuality);
            reader.getBarcodeSettings().setStripFNC(StripFNC);

            return recognizeWithTimeout(reader, aTimeout);
        }
    }

    public static TimeoutScanInfo recognizeWithTimeout(BufferedImage aBitmap, Rectangle[] aAreas, BaseDecodeType ReadType, int aTimeout, QualitySettings aQuality, boolean StripFNC)
    {
        BarCodeReader reader = new BarCodeReader(aBitmap, aAreas, ReadType);
        {
            //setup reader
            reader.setQualitySettings(aQuality);
            reader.getBarcodeSettings().setStripFNC(StripFNC);

            return recognizeWithTimeout(reader, aTimeout);
        }
    }

    public static TimeoutScanInfo recognizeWithTimeout(BufferedImage aBitmap, Rectangle aArea, BaseDecodeType ReadType, int aTimeout, QualitySettings aQuality, boolean StripFNC)
    {
        BarCodeReader reader = new BarCodeReader(aBitmap, aArea, ReadType);
        {
            //setup reader
            reader.setQualitySettings(aQuality);
            reader.getBarcodeSettings().setStripFNC(StripFNC);

            return recognizeWithTimeout(reader, aTimeout);
        }
    }

    public static TimeoutScanInfo recognizeWithTimeout(String FolderPath, String FileName, BaseDecodeType ReadType, int aTimeout) throws IOException
    {
        BufferedImage lOrigBmp = loadBitmap(FolderPath, FileName);
        {
            return recognizeWithTimeout(lOrigBmp, ReadType, aTimeout, QualitySettings.getHighPerformance(), true);
        }
    }

    public static TimeoutScanInfo recognizeWithTimeout(String FolderPath, String FileName, BaseDecodeType ReadType, int aTimeout, QualitySettings aQuality) throws IOException
    {
        BufferedImage lOrigBmp = loadBitmap(FolderPath, FileName);
        {
            return recognizeWithTimeout(lOrigBmp, ReadType, aTimeout, aQuality, true);
        }
    }

    public static TimeoutScanInfo recognizeWithTimeout(String FolderPath, String FileName, Rectangle[] aAreas, BaseDecodeType ReadType, int aTimeout, QualitySettings aQuality) throws IOException
    {
        BufferedImage lOrigBmp = loadBitmap(FolderPath, FileName);
        {
            return recognizeWithTimeout(lOrigBmp, aAreas, ReadType, aTimeout, aQuality, true);
        }
    }

    public static TimeoutScanInfo recognizeWithTimeout(String FolderPath, String FileName, Rectangle aArea, BaseDecodeType ReadType, int aTimeout, QualitySettings aQuality) throws IOException
    {
        BufferedImage lOrigBmp = loadBitmap(FolderPath, FileName);
        {
            return recognizeWithTimeout(lOrigBmp, aArea, ReadType, aTimeout, aQuality, true);
        }
    }

    public static TimeoutScanInfo recognizeWithAbortByTimeout(BarCodeReader aReader, int aTimeout)
    {
        aReader.setTimeout(0);
//        Stopwatch watch = new Stopwatch();

        //create read list
        List<CodetextWithType> lRecList = new ArrayList<CodetextWithType>();
        long watch = System.currentTimeMillis();
        ThreadAborter lAborter = new ThreadAborter(aReader, aTimeout, true);
        {
            for(BarCodeResult result : aReader.readBarCodes())
            lRecList.add(new CodetextWithType(result.getCodeType(), result.getCodeText()));
        }
//        watch.Stop();
        //timeout
        int lScanDuration = (int) (System.currentTimeMillis() -  watch);

        //create resut
        TimeoutScanInfo lRes = new TimeoutScanInfo(aTimeout, lScanDuration, lRecList);
        return lRes;
    }

    public static TimeoutScanInfo recognizeWithAbortByTimeout(BufferedImage aBitmap, BaseDecodeType ReadType, int aTimeout, QualitySettings aQuality, boolean StripFNC)
    {
        BarCodeReader reader = new BarCodeReader(aBitmap, ReadType);
        {
            //setup reader
            reader.setQualitySettings(aQuality);
            reader.getBarcodeSettings().setStripFNC(StripFNC);

            return recognizeWithAbortByTimeout(reader, aTimeout);
        }
    }

    public static TimeoutScanInfo recognizeWithAbortByTimeout(BufferedImage aBitmap, Rectangle[] aAreas, BaseDecodeType ReadType, int aTimeout, QualitySettings aQuality, boolean StripFNC)
    {
        BarCodeReader reader = new BarCodeReader(aBitmap, aAreas, ReadType);
        {
            //setup reader
            reader.setQualitySettings(aQuality);
            reader.getBarcodeSettings().setStripFNC(StripFNC);

            return recognizeWithAbortByTimeout(reader, aTimeout);
        }
    }

    public static TimeoutScanInfo recognizeWithAbortByTimeout(BufferedImage aBitmap, Rectangle aArea, BaseDecodeType ReadType, int aTimeout, QualitySettings aQuality, boolean StripFNC)
    {
        BarCodeReader reader = new BarCodeReader(aBitmap, aArea, ReadType);
        {
            //setup reader
            reader.setQualitySettings(aQuality);
            reader.getBarcodeSettings().setStripFNC(StripFNC);

            return recognizeWithAbortByTimeout(reader, aTimeout);
        }
    }

    public static TimeoutScanInfo recognizeWithAbortByTimeout(String FolderPath, String FileName, BaseDecodeType ReadType, int aTimeout) throws IOException
    {
        BufferedImage lOrigBmp = loadBitmap(FolderPath, FileName);
        {
            return recognizeWithAbortByTimeout(lOrigBmp, ReadType, aTimeout, QualitySettings.getHighPerformance(), true);
        }
    }

    public static TimeoutScanInfo recognizeWithAbortByTimeout(String FolderPath, String FileName, BaseDecodeType ReadType, int aTimeout, QualitySettings aQuality) throws IOException
    {
        BufferedImage lOrigBmp = loadBitmap(FolderPath, FileName);
        {
            return recognizeWithAbortByTimeout(lOrigBmp, ReadType, aTimeout, aQuality, true);
        }
    }

    public static TimeoutScanInfo recognizeWithAbortByTimeout(String FolderPath, String FileName, Rectangle[] aAreas, BaseDecodeType ReadType, int aTimeout, QualitySettings aQuality) throws IOException
    {
        BufferedImage lOrigBmp = loadBitmap(FolderPath, FileName);
        {
            return recognizeWithAbortByTimeout(lOrigBmp, aAreas, ReadType, aTimeout, aQuality, true);
        }
    }

    public static TimeoutScanInfo recognizeWithAbortByTimeout(String FolderPath, String FileName, Rectangle aArea, BaseDecodeType ReadType, int aTimeout, QualitySettings aQuality) throws IOException
    {
        BufferedImage lOrigBmp = loadBitmap(FolderPath, FileName);
        {
            return recognizeWithAbortByTimeout(lOrigBmp, aArea, ReadType, aTimeout, aQuality, true);
        }
    }
}