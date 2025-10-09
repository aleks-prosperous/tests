//-----------------------------------------------------------------------------------------------------------
// <copyright file="Pair.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="23.05.2013 11:37:10">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.barcode.auxiliary;

// ********* THIS FILE IS AUTO PORTED *********


public class Pair<T1, T2>
{
    private final int _hashCode;

    private T1 first;
    private T2 second;

    public T1 getFirst()
    {
        return first;
    }

    public void setFirst(T1 first)
    {
        this.first = first;
    }

    public T2 getSecond()
    {
        return second;
    }

    public void setSecond(T2 second)
    {
        this.second = second;
    }

    public Pair(T1 first, T2 second)
    {
        setFirst(first);
        setSecond(second);
        _hashCode = first.hashCode() ^ second.hashCode();
    }

    public int hashCode()
    {
        return _hashCode;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof Pair)
        {
            Pair<T1, T2> anotherPair = (Pair<T1, T2>) obj;
            if (_hashCode != anotherPair._hashCode)
            {
                return false;
            }

            return getFirst().equals(anotherPair.getFirst()) && getSecond().equals(anotherPair.getSecond());
        }
        return false;
    }
}

