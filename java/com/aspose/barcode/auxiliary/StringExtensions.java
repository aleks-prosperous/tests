package com.aspose.barcode.auxiliary;

import org.apache.commons.io.FilenameUtils;

public class StringExtensions
{
    public static final String Empty = "";
    public static String concat(String... input)
    {
        String res = "";
        for (String el : input)
        {
            res += el;
        }
        return res;
    }

    public static String remove(String base, int startIndex, int count) {
        if (base == null) {
            throw new NullPointerException();
        } else if (startIndex < 0) {
            throw new IllegalArgumentException("startIndex Cannot be negative.");
        } else if (count < 0) {
            throw new IllegalArgumentException("count Cannot be negative.");
        } else if (startIndex > base.length() - count) {
            throw new IllegalArgumentException("count startIndex + count > this.length");
        } else {
            return (new StringBuilder(base)).delete(startIndex, startIndex + count).toString();
        }
    }

    public static String replace(String basestr, char ch, char toCh) {
        return basestr.replace(ch, toCh);
    }

    public static String replace(String basestr, String oldValue, String newValue)
    {
        return basestr.replace(oldValue, newValue);
    }

    public static String concat(String a, char b)
    {
        return a + b;
    }

    public static boolean isNullOrEmpty(String s)
    {
        return (s == null || s.length() < 1);
    }

    public static String getExtension(String input)
    {
        return FilenameUtils.getExtension(input);
    }

    public static String substring(String str, int startIndex)
    {
        if (str == null)
        {
            throw new NullPointerException();
        }
        if (startIndex == 0)
        {
            return str;
        }
        if (startIndex < 0 || startIndex > str.length())
        {
            throw new IndexOutOfBoundsException("startIndex");
        }

        return str.substring(startIndex);
    }

    public static String newString(char c, int count)
    {
        if (count > 0)
        {
            char[] charArray = new char[count];

            for (int i = 0; i < count; ++i)
            {
                charArray[i] = c;
            }
            return new String(charArray);
        }
        else
        {
            return "";
        }
    }

//    public static String substring(String input, int beginIndex)
//    {
//        if(input == null || input.length() < 1)
//        {
//            return input;
//        }
//        return input.substring(beginIndex);
//    }

    public static String substring(String str, int startIndex, int length) {
//        if (str == null) {
//            throw new NullReferenceException();
//        } else if (length < 0) {
//            throw new ArgumentOutOfRangeException("length", "Cannot be negative.");
//        } else if (startIndex < 0) {
//            throw new ArgumentOutOfRangeException("startIndex", "Cannot be negative.");
//        } else if (startIndex > str.length()) {
//            throw new ArgumentOutOfRangeException("startIndex", "Cannot exceed length of string.");
//        } else if (startIndex > str.length() - length) {
//            throw new ArgumentOutOfRangeException("length", "startIndex + length cannot exceed length of string.");
//        } else {
            return startIndex == 0 && length == str.length() ? str : str.substring(startIndex, startIndex + length);
//        }
    }

    public static String substringLength(String str, int startIndex, int length)
    {
        if (str == null)
        {
            throw new NullPointerException();
        }
        if (length < 0)
        {
            throw new IndexOutOfBoundsException("Cannot be negative.");
        }
        if (startIndex < 0)
        {
            throw new IndexOutOfBoundsException("Cannot be negative.");
        }
        if (startIndex > str.length())
        {
            throw new IndexOutOfBoundsException("Cannot exceed length of string.");
        }
        if (startIndex > str.length() - length)
        {
            throw new IndexOutOfBoundsException("startIndex + length cannot exceed length of string.");
        }
        if (startIndex == 0 && length == str.length())
        {
            return str;
        }

        return str.substring(startIndex, startIndex + length);
    }
}
