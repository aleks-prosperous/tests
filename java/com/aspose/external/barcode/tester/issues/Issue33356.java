//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33356.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="23.10.2012 12:38:21">
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


//@Test (description = "Tests for Issue33356.")
public class Issue33356
{
    private final String folder = Global.getTestDataFolder("Issues/Issue33356");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void Try()
    {
        tryRead("aspose.png", "(01)00075678164125");
        tryRead("Aztec-Barcode-Premium-Package.jpg", "Barcodesoft");
        tryRead("aztec.gif", "Code 2D!");
        tryRead("aztec.jpg", "12345678");
        tryRead("aztec2.gif", "\r\nDatascan Font Service Ltd\r\nFirst Floor, 2 Wren Avenue\r\nLondon NW2 6UH\r\nEngland");
        tryRead("aztec2.png", "1234567890");
        tryRead("Aztec_Code.jpg", "Waveform Solutions Unit 1B, 11 Canal Bank, Hume Ave, Parkwest, Dublin 12  Ireland Ph:01-6209700 Fax: 01-6209701");
        tryRead("aztecbmp.bmp", "MW6 DemoMW6 DemoMW6 Demo");
        tryRead("azteccode-0.jpg", "Bt2TPe2weCdhWfu4vbcHO1H9D1MbsLHJvbHz4RTxlgxo2CEJkqaULlUJm3PXRbDS4Uw4Y4AdIog");
        tryRead("azteccode-1.jpg", "DdGAxC1Bvw7KH7MAB5fJcetiQJvpq6MgFmFJxPkOkBhHWlxbr9cMJWPithtnRLVykbEe1DNwVQjb7lLoWU7qd9WsWgZPf");
        tryRead("azteccode-10.jpg", "ySsdgyxPpQtzrI9Khal93a4Jhmec6GmjFAcmUyzcxLBYVUSyldi2xtvYXi53TUSjnJtrpWztkJMsYgyNUq1dhtw");
        tryRead("azteccode-11.jpg", "OEOv36Ic3cuLkkIPnzSnhD91usjndyB3WYdlHE0oAty6vnmth");
        tryRead("azteccode-12.jpg", "0rbJyKEXBKWe9Ea0zMHhIi9omxODGHF0G17UcNjTguDpRgtuf4xalAdSrxgA5BQ4FfYIHFYlmyAYfUWG");
        tryRead("azteccode-13.jpg", "ehMTpPGYpmoriXe");
        tryRead("azteccode-14.jpg", "IkvIlnZfMxx9FwXbZ6beDlaQRtbdt4Daf4Wuk8c1HrH1bHT2ONRl6AahJe01L6wRu");
        tryRead("azteccode-15.jpg", "dLZn0bejWWdizKaiOfnbefdykFIkpL4zHFnHdlXzHWoDDkppbm");
        tryRead("azteccode-16.jpg", "QoS18rkDuT43LbobtgSFmIxUI0Zv9acJCcoLyNpa2imgMccmZJ5IIhFI07tHRzDU1v1swdmg12NEfQHpXxV0eTAfXgU1");
        tryRead("azteccode-17.jpg", "hICeSpbluz6gZRQUAmj0EtedN0huVVQIvCUtKjNlqEn7ZUECuKW3uBZxoiRbHqPZi");
        tryRead("azteccode-18.jpg", "uX6gJbZ8JAFgE3wfAL8XXumgElSve9yOZljrFNA5ew1ZrIeYplqEaLa9uachIndKL1HcTFaxKC2k3Ny6H4G2TuxNLk6ovdx0SqN0BBE");
        tryRead("azteccode-19.jpg", "L24XSzFglfZNhl0bD3RsIvBrPCSMA85Gzgra0Z4WeZCPDjTr0vwHtVbZ1NIQh2gnkTYA4Zln95Ost");
        tryRead("azteccode-2.jpg", "7Yqsh5gSjowq13xylIWER7NoVkEWHUn8QYSKuODQHDuT4xId4i5R3apAKCX71KKPByadknDWEF7NM4tiblcjZVEzsS9s1FZ72fSGWo2RfiNxdcyQSzgPrlzp");
        tryRead("azteccode-20.jpg", "nqtkWOLxWdERjnRoyl3YotKSxaKJIyHsqEjbh6gRcx645m08VUGmzUH4fax6EBphWWlfD0H1Fl61wQWLjMxxrf3V6p5GJjNbIYij");
        tryRead("azteccode-21.jpg", "V4fNOgNY");
        tryRead("azteccode-22.jpg", "HPEmW2O1z0cPiY5AsfYftYswKORSjc9q7qhqCh");
        tryRead("azteccode-23.jpg", "VMQirGuxfkNgAz3gtgRbHk6SW1wS10P8L");
        tryRead("azteccode-24.jpg", "CSdzAqabvrW680EKyJuFFvQ8M0Uc6pVOVswkD3glBq");
        tryRead("azteccode-25.jpg", "O5a36NqBGOFMRBfnKV7fGWIlPDdH5mJEZ6CCv7YOPnPAPgfjiQWPDKs1xzn2ujGdEBwV9c1N7tPcHHVti4joQ4AONLO6Tgepgv5NtKkFZ");
        tryRead("azteccode-26.jpg", "RU4Ptqd4TzAcMKAhHxO53bOk");
        tryRead("azteccode-27.jpg", "VLH9YTdPHmqT7bicYMopEjvNLCw1dPzFUTXeV54fgMEhUOJWpcfPj41wa4xVhmv2wk9oDEHdRJI1eN272ZLBukgZclDaIj83bMutOfTlVB7av9SNCzcHbuI");
        tryRead("azteccode-28.jpg", "EjMcAqVsKOaScJtXGjpsnGncS0YSG0c");
        tryRead("azteccode-29.jpg", "DippS0koqOPhiAu2GFA2Faj75tJKRCmTwuO4dDEP8ABY0G3SGfMA0kln9rujraXnm5uyv0ZDAu3EYKHy00Dv0ldMI");
        tryRead("azteccode-3.jpg", "kvSnUf8q9UqmnLxsKD1HRVQdtZCjJPQqmXw3knKCPGeHHnpnshgi8hcOfy44dYhtEA9PY3Ih2y2K1IWFuY0lsssF4hYvtPi");
        tryRead("azteccode-4.jpg", "jvCHoZPzZ9pJpRXWcyKFh5AWS4V1fWxnPBkGFObUIBMtCiamKCS4FdTouqztEXUCMC3nrQQNXz6fsRTtesqcD2hwr6VZZrQurKgApw53wFhPg");
        tryRead("azteccode-5.jpg", "5dXFOWr18TeG6u41ypjLyiuTEswxq8VSP3B2BTc4DzMNfi0L84Q1pV9WsEBgj3L98M0CsCzeMpH9Whyf1lyvsdm43oK7S6UJoMPSrxc6");
        tryRead("azteccode-6.jpg", "wo9NAAKPfo7FZRej5I");
        tryRead("azteccode-7.jpg", "12LQV8UJSfyEJ2q");
        tryRead("azteccode-8.jpg", "zmr3oArxRXEO4vsvoYFNkYoOp01uqkyMsVp7NPZ1KX973GPhwCZvxdVa7cNxI7Gqi1fjFvhZ8OCMYqVjlU7oKCZPAO9uBlsMRSZBkpbAeAxiaIBQHoMy9bg");
        tryRead("azteccode-9.jpg", "bQi1wwXWf05FRT9526KJP0z2MsnXZ4Nzw2kUHjOrnbDkM58ypR5CRWQkaqpEJA6knGTZt");
    }

    public void tryRead(String file, String codetext)
    {
        tryRead(file, codetext, false);
    }

    public void tryRead(String file, String codetext, boolean failed)
    {
        String fileName = Global.pathCombine(folder, file);
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.AZTEC);
        {
            if (!failed)
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
            }
            else
            {
                Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
            }
        }
    }
}

