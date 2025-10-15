package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


@Test(description = "Tests for Issue-33125.")
public class Issue33125
{
    private static final String CodeText = "0112345600000001";
    private static final String CodeTextCode39Standard = "00";
    final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33125");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }


    @Test
    public void test1BPPIndexed() throws IOException
    {
        String file0 = Global.pathCombine(folder, "1bppIndexed rotated0.bmp");
        String file90 = Global.pathCombine(folder, "1bppIndexed rotated90.bmp");
        String file180 = Global.pathCombine(folder, "1bppIndexed rotated180.bmp");
        String file270 = Global.pathCombine(folder, "1bppIndexed rotated270.bmp");

        BufferedImage bmp = copyBitmap(ImageIO.read(new File(file0)));
        BarCodeReader reader = new BarCodeReader(bmp, DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(CodeTextCode39Standard, reader.getFoundBarCodes()[0].getCodeText());
        }

        bmp = copyBitmap(ImageIO.read(new File(file90)));
        reader = new BarCodeReader(bmp, DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(CodeTextCode39Standard, reader.getFoundBarCodes()[0].getCodeText());
        }

        bmp = copyBitmap(ImageIO.read(new File(file180)));
        reader = new BarCodeReader(bmp, DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(CodeTextCode39Standard, reader.getFoundBarCodes()[0].getCodeText());
        }

        bmp = copyBitmap(ImageIO.read(new File(file270)));
        reader = new BarCodeReader(bmp, DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(CodeTextCode39Standard, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test4BPPIndexed()
    {
        String file0 = Global.pathCombine(folder, "4bppIndexed rotated0.bmp");
        String file90 = Global.pathCombine(folder, "4bppIndexed rotated90.bmp");
        String file180 = Global.pathCombine(folder, "4bppIndexed rotated180.bmp");
        String file270 = Global.pathCombine(folder, "4bppIndexed rotated270.bmp");

        BarCodeReader reader = new BarCodeReader(file0, DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(CodeTextCode39Standard, reader.getFoundBarCodes()[0].getCodeText());
        }

        reader = new BarCodeReader(file90, DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(CodeTextCode39Standard, reader.getFoundBarCodes()[0].getCodeText());
        }

        reader = new BarCodeReader(file180, DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(CodeTextCode39Standard, reader.getFoundBarCodes()[0].getCodeText());
        }

        reader = new BarCodeReader(file270, DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(CodeTextCode39Standard, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test8BPPIndexed()
    {
        String file0 = Global.pathCombine(folder, "8bppIndexed rotated0.bmp");
        String file90 = Global.pathCombine(folder, "8bppIndexed rotated90.bmp");
        String file180 = Global.pathCombine(folder, "8bppIndexed rotated180.bmp");
        String file270 = Global.pathCombine(folder, "8bppIndexed rotated270.bmp");

        BarCodeReader reader = new BarCodeReader(file0, DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(CodeTextCode39Standard, reader.getFoundBarCodes()[0].getCodeText());
        }

        reader = new BarCodeReader(file90, DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(CodeTextCode39Standard, reader.getFoundBarCodes()[0].getCodeText());
        }

        reader = new BarCodeReader(file180, DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(CodeTextCode39Standard, reader.getFoundBarCodes()[0].getCodeText());
        }

        reader = new BarCodeReader(file270, DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(CodeTextCode39Standard, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test16BPPRGB555() throws IOException
    {
        // Bitmap class dont wont to load Format16bppRgb555 - it loads as Format24bppRgb

        String file0 = Global.pathCombine(folder, "16bppRGB555 rotated0.bmp");
        String file90 = Global.pathCombine(folder, "16bppRGB555 rotated90.bmp");
        String file180 = Global.pathCombine(folder, "16bppRGB555 rotated180.bmp");
        String file270 = Global.pathCombine(folder, "16bppRGB555 rotated270.bmp");

        BufferedImage bmp = copyBitmap(ImageIO.read(new File(file0)));
        BarCodeReader reader = new BarCodeReader(bmp, DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(CodeTextCode39Standard, reader.getFoundBarCodes()[0].getCodeText());
        }

        bmp = copyBitmap(ImageIO.read(new File(file90)));
        reader = new BarCodeReader(bmp, DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(CodeTextCode39Standard, reader.getFoundBarCodes()[0].getCodeText());
        }

        bmp = copyBitmap(ImageIO.read(new File(file180)));
        reader = new BarCodeReader(bmp, DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(CodeTextCode39Standard, reader.getFoundBarCodes()[0].getCodeText());
        }

        bmp = copyBitmap(ImageIO.read(new File(file270)));
        reader = new BarCodeReader(bmp, DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(CodeTextCode39Standard, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test16BPPRGB565() throws IOException
    {
        // Bitmap class dont wont to load Format16bppRgb565 - it loads as Format32bppRgb

        String file0 = Global.pathCombine(folder, "16bppRGB565 rotated0.bmp");
        String file90 = Global.pathCombine(folder, "16bppRGB565 rotated90.bmp");
        String file180 = Global.pathCombine(folder, "16bppRGB565 rotated180.bmp");
        String file270 = Global.pathCombine(folder, "16bppRGB565 rotated270.bmp");

        BufferedImage bmp = copyBitmap(ImageIO.read(new File(file0)));
        BarCodeReader reader = new BarCodeReader(bmp, DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(CodeTextCode39Standard, reader.getFoundBarCodes()[0].getCodeText());
        }

        bmp = copyBitmap(ImageIO.read(new File(file90)));
        reader = new BarCodeReader(bmp, DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(CodeTextCode39Standard, reader.getFoundBarCodes()[0].getCodeText());
        }

        bmp = copyBitmap(ImageIO.read(new File(file180)));
        reader = new BarCodeReader(bmp, DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(CodeTextCode39Standard, reader.getFoundBarCodes()[0].getCodeText());
        }

        bmp = copyBitmap(ImageIO.read(new File(file270)));
        reader = new BarCodeReader(bmp, DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(CodeTextCode39Standard, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test16BPPARGB1555() throws IOException
    {
        // Bitmap class dont wont to load Format16bppArgb1555 - it loads as Format32bppRgb

        String file0 = Global.pathCombine(folder, "16bppARGB1555 rotated0.bmp");
        String file90 = Global.pathCombine(folder, "16bppARGB1555 rotated90.bmp");
        String file180 = Global.pathCombine(folder, "16bppARGB1555 rotated180.bmp");
        String file270 = Global.pathCombine(folder, "16bppARGB1555 rotated270.bmp");

        BufferedImage bmp = copyBitmap(ImageIO.read(new File(file0)));
        {
            BarCodeReader reader = new BarCodeReader(bmp, DecodeType.CODE_39);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(CodeTextCode39Standard, reader.getFoundBarCodes()[0].getCodeText());
            }
        }

        bmp = copyBitmap(ImageIO.read(new File(file90)));
        {
            BarCodeReader reader = new BarCodeReader(bmp, DecodeType.CODE_39);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(CodeTextCode39Standard, reader.getFoundBarCodes()[0].getCodeText());
            }
        }

        bmp = copyBitmap(ImageIO.read(new File(file180)));
        {
            BarCodeReader reader = new BarCodeReader(bmp, DecodeType.CODE_39);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(CodeTextCode39Standard, reader.getFoundBarCodes()[0].getCodeText());
            }
        }

        bmp = copyBitmap(ImageIO.read(new File(file270)));
        {
            BarCodeReader reader = new BarCodeReader(bmp, DecodeType.CODE_39);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(CodeTextCode39Standard, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

    @Test
    public void test16BPPGrayScale() throws IOException
    {
        // Bitmap class dont wont to load Format16bppGrayScale - it loads as Format32bppRgb

        String file0 = Global.pathCombine(folder, "16bppGrayScale rotated0.bmp");
        String file90 = Global.pathCombine(folder, "16bppGrayScale rotated90.bmp");
        String file180 = Global.pathCombine(folder, "16bppGrayScale rotated180.bmp");
        String file270 = Global.pathCombine(folder, "16bppGrayScale rotated270.bmp");

        BufferedImage bmp = copyBitmap(ImageIO.read(new File(file0)));
        {
            BarCodeReader reader = new BarCodeReader(bmp, DecodeType.CODE_39);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(CodeTextCode39Standard, reader.getFoundBarCodes()[0].getCodeText());
            }
        }

        bmp = copyBitmap(ImageIO.read(new File(file90)));
        {
            BarCodeReader reader = new BarCodeReader(bmp, DecodeType.CODE_39);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(CodeTextCode39Standard, reader.getFoundBarCodes()[0].getCodeText());
            }
        }

        bmp = copyBitmap(ImageIO.read(new File(file180)));
        {
            BarCodeReader reader = new BarCodeReader(bmp, DecodeType.CODE_39);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(CodeTextCode39Standard, reader.getFoundBarCodes()[0].getCodeText());
            }
        }

        bmp = copyBitmap(ImageIO.read(new File(file270)));
        {
            BarCodeReader reader = new BarCodeReader(bmp, DecodeType.CODE_39);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(CodeTextCode39Standard, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

    @Test
    public void test24BPPRGB()
    {
        String file0 = Global.pathCombine(folder, "24bppRGB rotated0.jpg");
        String file90 = Global.pathCombine(folder, "24bppRGB rotated90.jpg");
        String file180 = Global.pathCombine(folder, "24bppRGB rotated180.jpg");
        String file270 = Global.pathCombine(folder, "24bppRGB rotated270.jpg");

        BarCodeReader reader = new BarCodeReader(file0, DecodeType.GS_1_CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)" + remove(CodeText,0, 2), reader.getFoundBarCodes()[0].getCodeText());
        }

        reader = new BarCodeReader(file90, DecodeType.GS_1_CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)" + remove(CodeText,0, 2), reader.getFoundBarCodes()[0].getCodeText());
        }

        reader = new BarCodeReader(file180, DecodeType.GS_1_CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)" + remove(CodeText,0, 2), reader.getFoundBarCodes()[0].getCodeText());
        }

        reader = new BarCodeReader(file270, DecodeType.GS_1_CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)" + remove(CodeText,0, 2), reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test32BPPRGB()
    {
        String file0 = Global.pathCombine(folder, "32bppRGB rotated0.png");
        String file90 = Global.pathCombine(folder, "32bppRGB rotated90.png");
        String file180 = Global.pathCombine(folder, "32bppRGB rotated180.png");
        String file270 = Global.pathCombine(folder, "32bppRGB rotated270.png");

        BarCodeReader reader = new BarCodeReader(file0, DecodeType.GS_1_CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)" + remove(CodeText,0, 2), reader.getFoundBarCodes()[0].getCodeText());
        }

        reader = new BarCodeReader(file90, DecodeType.GS_1_CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)" + remove(CodeText,0, 2), reader.getFoundBarCodes()[0].getCodeText());
        }

        reader = new BarCodeReader(file180, DecodeType.GS_1_CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)" + remove(CodeText,0, 2), reader.getFoundBarCodes()[0].getCodeText());
        }

        reader = new BarCodeReader(file270, DecodeType.GS_1_CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)" + remove(CodeText,0, 2), reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test32BPPARGB()
    {
        String file0 = Global.pathCombine(folder, "32bppARGB rotated0.png");
        String file90 = Global.pathCombine(folder, "32bppARGB rotated90.png");
        String file180 = Global.pathCombine(folder, "32bppARGB rotated180.png");
        String file270 = Global.pathCombine(folder, "32bppARGB rotated270.png");

        BarCodeReader reader = new BarCodeReader(file0, DecodeType.GS_1_CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)" + remove(CodeText,0, 2), reader.getFoundBarCodes()[0].getCodeText());
        }

        reader = new BarCodeReader(file90, DecodeType.GS_1_CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)" + remove(CodeText,0, 2), reader.getFoundBarCodes()[0].getCodeText());
        }

        reader = new BarCodeReader(file180, DecodeType.GS_1_CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)" + remove(CodeText,0, 2), reader.getFoundBarCodes()[0].getCodeText());
        }

        reader = new BarCodeReader(file270, DecodeType.GS_1_CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)" + remove(CodeText,0, 2), reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test32BPPPARGB() throws IOException
    {
        // Bitmap class dont wont to load Format32bppPArgb - it loads as Format32bppArgb

        String file0 = Global.pathCombine(folder, "32bppPARGB rotated0.png");
        String file90 = Global.pathCombine(folder, "32bppPARGB rotated90.png");
        String file180 = Global.pathCombine(folder, "32bppPARGB rotated180.png");
        String file270 = Global.pathCombine(folder, "32bppPARGB rotated270.png");

        BufferedImage bmp = copyBitmap(ImageIO.read(new File(file0)));
        {
            BarCodeReader reader = new BarCodeReader(bmp, DecodeType.CODE_39);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(CodeTextCode39Standard, reader.getFoundBarCodes()[0].getCodeText());
            }
        }

        bmp = copyBitmap(ImageIO.read(new File(file90)));
        {
            BarCodeReader reader = new BarCodeReader(bmp, DecodeType.CODE_39);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(CodeTextCode39Standard, reader.getFoundBarCodes()[0].getCodeText());
            }
        }

        bmp = copyBitmap(ImageIO.read(new File(file180)));
        {
            BarCodeReader reader = new BarCodeReader(bmp, DecodeType.CODE_39);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(CodeTextCode39Standard, reader.getFoundBarCodes()[0].getCodeText());
            }
        }

        bmp = copyBitmap(ImageIO.read(new File(file270)));
        {
            BarCodeReader reader = new BarCodeReader(bmp, DecodeType.CODE_39);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(CodeTextCode39Standard, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

    @Test(enabled = false) // TODO This image format is not supported by ms 22.12
    public void test48BPPRGB()
    {
        String file0 = Global.pathCombine(folder, "48bppRGB rotated0.tif");
        String file90 = Global.pathCombine(folder, "48bppRGB rotated90.tif");
        String file180 = Global.pathCombine(folder, "48bppRGB rotated180.tif");
        String file270 = Global.pathCombine(folder, "48bppRGB rotated270.tif");

        BarCodeReader reader = new BarCodeReader(file0, DecodeType.GS_1_CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)" + remove(CodeText,0, 2), reader.getFoundBarCodes()[0].getCodeText());
        }

        reader = new BarCodeReader(file90, DecodeType.GS_1_CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)" + remove(CodeText,0, 2), reader.getFoundBarCodes()[0].getCodeText());
        }

        reader = new BarCodeReader(file180, DecodeType.GS_1_CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)" + remove(CodeText,0, 2), reader.getFoundBarCodes()[0].getCodeText());
        }

        reader = new BarCodeReader(file270, DecodeType.GS_1_CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)" + remove(CodeText,0, 2), reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test64BPPARGB() throws IOException
    {
        // Bitmap class dont wont to load Format64bppArgb - it loads as Format48bppRgb

        String file0 = Global.pathCombine(folder, "64bppARGB rotated0.tif");
        String file90 = Global.pathCombine(folder, "64bppARGB rotated90.tif");
        String file180 = Global.pathCombine(folder, "64bppARGB rotated180.tif");
        String file270 = Global.pathCombine(folder, "64bppARGB rotated270.tif");

//        BufferedImage bmp = copyBitmap(ImageIO.read(new File(file0)));
        {
            BarCodeReader reader = new BarCodeReader(file0, DecodeType.GS_1_CODE_128);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals("(01)" + remove(CodeText,0, 2), reader.getFoundBarCodes()[0].getCodeText());
            }
        }

//        bmp = copyBitmap(ImageIO.read(new File(file90)));
        {
            BarCodeReader reader = new BarCodeReader(file90, DecodeType.GS_1_CODE_128);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals("(01)" + remove(CodeText,0, 2), reader.getFoundBarCodes()[0].getCodeText());
            }
        }

//        bmp = copyBitmap(ImageIO.read(new File(file180)));
        {
            BarCodeReader reader = new BarCodeReader(file180, DecodeType.GS_1_CODE_128);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals("(01)" + remove(CodeText,0, 2), reader.getFoundBarCodes()[0].getCodeText());
            }
        }

//        bmp = copyBitmap(ImageIO.read(new File(file270)));
        {
            BarCodeReader reader = new BarCodeReader(file270, DecodeType.GS_1_CODE_128);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals("(01)" + remove(CodeText,0, 2), reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

    @Test
    public void test64BPPPARGB() throws IOException
    {
        // Bitmap class dont wont to load Format64bppArgb - it loads as Format48bppRgb

        String file0 = Global.pathCombine(folder, "64bppPARGB rotated0.tif");
        String file90 = Global.pathCombine(folder, "64bppPARGB rotated90.tif");
        String file180 = Global.pathCombine(folder, "64bppPARGB rotated180.tif");
        String file270 = Global.pathCombine(folder, "64bppPARGB rotated270.tif");

//        BufferedImage bmp = copyBitmap(ImageIO.read(new File(file0)));
        {
            BarCodeReader reader = new BarCodeReader(file0, DecodeType.GS_1_CODE_128);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals("(01)" + remove(CodeText,0, 2), reader.getFoundBarCodes()[0].getCodeText());
            }
        }

//        bmp = copyBitmap(ImageIO.read(new File(file90)));
        {
            BarCodeReader reader = new BarCodeReader(file90, DecodeType.GS_1_CODE_128);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals("(01)" + remove(CodeText,0, 2), reader.getFoundBarCodes()[0].getCodeText());
            }
        }

//        bmp = copyBitmap(ImageIO.read(new File(file180)));
        {
            BarCodeReader reader = new BarCodeReader(file180, DecodeType.GS_1_CODE_128);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals("(01)" + remove(CodeText,0, 2), reader.getFoundBarCodes()[0].getCodeText());
            }
        }

//        bmp = copyBitmap(ImageIO.read(new File(file270)));
        {
            BarCodeReader reader = new BarCodeReader(file270, DecodeType.GS_1_CODE_128);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals("(01)" + remove(CodeText,0, 2), reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

    private static String remove(String source, int start, int count)
    {
        StringBuilder sb = new StringBuilder(source);
        sb.delete(start, start + count);
        return sb.toString();
    }



    static BufferedImage copyBitmap(BufferedImage source)
    {
        BufferedImage b = new BufferedImage(source.getWidth(), source.getHeight(), source.getType());
        Graphics g = b.getGraphics();
        g.drawImage(source, 0, 0, null);
        g.dispose();
        return b;
    }
}