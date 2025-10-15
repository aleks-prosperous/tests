package com.aspose.external.barcode.tester.releases.v21_6;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class StringTestUtils
{
//    internal static void WriteNormalStringToFile(string Filename, string aString, bool Append)
//{
//    string lCSharp = "\"" + aString + "\"\n";
//    WriteStringToFile(Filename, lCSharp, Append);
//}
//
//    internal static void WriteConvertedToCSharpStringToFile(string Filename, string aString, bool Append)
//{
//    string lCSharp = ConvertNormalStringToCSharpString(aString);
//    WriteStringToFile(Filename, lCSharp, Append);
//}
//
//    internal static void WriteConvertedToCSharpIntArrayToFile(string Filename, int[] Arr, string ArrName, bool Append)
//{
//    WriteConvertedToCSharpIntArrayToFile(Filename, Arr, ArrName, int.MaxValue, false, Append);
//}
//
//    internal static void WriteConvertedToCSharpByteArrayToFile(string Filename, byte[] Arr, string ArrName, bool Append)
//{
//    WriteConvertedToCSharpByteArrayToFile(Filename, Arr, ArrName, int.MaxValue, false, Append);
//}
//
//    internal static void WriteConvertedToCSharpIntArrayToFile(string Filename, int[] Arr, bool Append)
//{
//    WriteConvertedToCSharpIntArrayToFile(Filename, Arr, "lTestArray", int.MaxValue, false, Append);
//}
//
//    internal static void WriteConvertedToCSharpByteArrayToFile(string Filename, byte[] Arr, bool Append)
//{
//    WriteConvertedToCSharpByteArrayToFile(Filename, Arr, "lTestArray", int.MaxValue, false, Append);
//}
//
//    internal static void DeleteFile(string Filename)
//{
//    if (System.IO.File.Exists(Filename))
//        System.IO.File.Delete(Filename);
//}
    public static void writeStringToFile(String Filename, String aString, boolean Append) throws IOException
    {
        BufferedWriter lWriter = new BufferedWriter(new FileWriter(Filename, true));
        if (Append)
        {
            if (new File(Filename).exists())
            {
                lWriter.append(aString);
            }
            else
                lWriter.write(aString);
        }
        else
        {
            if (new File(Filename).exists())
                new File(Filename).delete();
            lWriter.write(aString);
        }
        lWriter.flush();
        lWriter.close();
    }

//    internal static void WriteConvertedToCSharpIntArrayToFile(string Filename, int[] Arr, string ArrName, int ElementInRow, bool Hex, bool Append)
//{
//    //byte[] lArr = new byte[] { 1, 2, 3 };
//    string lRes = "int[] " + ArrName + " = new int[] { ";
//    StringBuilder lArrBld = new StringBuilder();
//
//    int lCurrElemCnt = 0;
//    for (int i = 0; i < Arr.Length; ++i)
//    {
//        string lElem;
//        if (Hex)
//            lElem = "0x" + Arr[i].ToString("X");
//        else
//            lElem = Arr[i].ToString("D");
//
//        if (i != (Arr.Length - 1))
//            lElem += ", ";
//
//        //
//        lCurrElemCnt++;
//        if (ElementInRow <= lCurrElemCnt)
//        {
//            lCurrElemCnt = 0;
//            lElem += "\n";
//        }
//
//        lArrBld.Append(lElem);
//    }
//    lRes += lArrBld.ToString() + " };\n";
//
//    WriteStringToFile(Filename, lRes, Append);
//}
//
//    internal static void WriteConvertedToCSharpByteArrayToFile(string Filename, byte[] Arr, string ArrName, int ElementInRow, bool Hex, bool Append)
//{
//    //byte[] lArr = new byte[] { 1, 2, 3 };
//    string lRes = "byte[] " + ArrName + " = new byte[] { ";
//    StringBuilder lArrBld = new StringBuilder();
//
//    int lCurrElemCnt = 0;
//    for (int i = 0; i < Arr.Length; ++i)
//    {
//        string lElem;
//        if (Hex)
//            lElem = "0x" + Arr[i].ToString("X");
//        else
//            lElem = Arr[i].ToString("D");
//
//        if (i != (Arr.Length - 1))
//            lElem += ", ";
//
//        //
//        lCurrElemCnt++;
//        if (ElementInRow <= lCurrElemCnt)
//        {
//            lCurrElemCnt = 0;
//            lElem += "\n";
//        }
//
//        lArrBld.Append(lElem);
//    }
//    lRes += lArrBld.ToString() + " };\n";
//
//    WriteStringToFile(Filename, lRes, Append);
//}
}
