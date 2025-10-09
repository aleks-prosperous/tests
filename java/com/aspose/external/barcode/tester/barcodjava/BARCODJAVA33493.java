package com.aspose.external.barcode.tester.barcodjava;

public class BARCODJAVA33493
{
//    @Test(description = "Java specific issue found in GrayNormalizingFilterTests.GrayNormalizingFilterTests(),blocked by CSPORT-ODS-35298")
//    public void testFormat64bppArgbRecognize()
//    {
//        String generatedFolder = "external/Aspose.BarCode.NET/testdata/BarCodeRecognition/Recognition/Imaging/BinarizedBitmap";
//        String filePath =  Global.pathCombine(generatedFolder, "00.png");
//        BufferedImage bitmap = this.convertPixelFormat(new Bitmap(filePath), PixelFormat.Format64bppArgb);
//        BarCodeReader reader = new BarCodeReader(bitmap, DecodeType.CODE_39);
//        org.testng.Assert.assertTrue(reader.read());
//        Assert.assertEquals(result.getCodeText(), "00");
//    }
//
//    private Bitmap convertPixelFormat(Bitmap source, /*PixelFormat*/int pixelFormat)
//    {
//        Bitmap b2 = new Bitmap(source.getWidth(), source.getHeight(), pixelFormat);
//        Graphics g = Graphics.fromImage(b2);
//        g.drawImage(source, new Point(0, 0));
//        g.dispose();
//        return b2;
//    }
}
