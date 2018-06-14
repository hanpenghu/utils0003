package com.hanhan.utils0002.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import net.arnx.wmf2svg.gdi.svg.SvgGdi;
import net.arnx.wmf2svg.gdi.wmf.WmfParser;

import org.apache.batik.transcoder.TranscoderException;
import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;
import org.apache.batik.transcoder.image.ImageTranscoder;
import org.apache.batik.transcoder.image.JPEGTranscoder;
import org.apache.batik.transcoder.image.PNGTranscoder;
import org.apache.batik.transcoder.wmf.tosvg.WMFTranscoder;
import org.w3c.dom.Document;
/**
 * Created by Administrator on 2018/6/13.
 */
public class WmfTopng {
    public static void main(String[] args) {

        String result = convert("E:/0425.wmf");
        System.out.println(result);

    }

    @Deprecated
    public static String convert2(String path) throws TranscoderException,
            IOException {
        String wmfPath = path;
        File wmf = new File(wmfPath);
        FileInputStream wmfStream = new FileInputStream(wmf);
        ByteArrayOutputStream imageOut = new ByteArrayOutputStream();
        int noOfByteRead = 0;
        while ((noOfByteRead = wmfStream.read()) != -1) {
            imageOut.write(noOfByteRead);
        }
        imageOut.flush();
        wmfStream.close();
        // wmf 转换为svg
        WMFTranscoder transcoder = new WMFTranscoder();
        // TranscodingHints hints = new TranscodingHints();
        // hints.put(WMFTranscoder.KEY_HEIGHT, 1000f);
        // hints.put(WMFTranscoder.KEY_WIDTH, 1500f);
        // transcoder.setTranscodingHints(hints);
        TranscoderInput input = new TranscoderInput(new ByteArrayInputStream(
                imageOut.toByteArray()));
        ByteArrayOutputStream svg = new ByteArrayOutputStream();
        TranscoderOutput output = new TranscoderOutput(svg);
        transcoder.transcode(input, output);
        String svgFile = replace(wmfPath, "wmf", "svg");
        FileOutputStream fileOut = new FileOutputStream(svgFile);
        fileOut.write(svg.toByteArray());
        fileOut.flush();
        fileOut.close();
        svg.close();
        // svg -> jpg
        ImageTranscoder it = new JPEGTranscoder();
        it.addTranscodingHint(JPEGTranscoder.KEY_QUALITY, new Float(0.5f));
        ByteArrayOutputStream jpg = new ByteArrayOutputStream();
        it.transcode(new TranscoderInput(new ByteArrayInputStream(svg
                .toByteArray())), new TranscoderOutput(jpg));
        String jpgFile = replace(wmfPath, "wmf", "jpg");
        FileOutputStream jpgOut = new FileOutputStream(jpgFile);
        jpgOut.write(jpg.toByteArray());
        jpgOut.flush();
        jpgOut.close();
        jpg.close();
        // Filor.deleteFile(svgFile);// 删除掉中间文件
        return jpgFile;
    }

    public static String convert(String path) {
        try {
            String svgFile = replace(path, "wmf", "svg");
            wmfToSvg(path, svgFile);
            String jpgFile = replace(path, "wmf", "png");
            svgToJpg(svgFile, jpgFile);
            return jpgFile;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    /**
     * 将svg转化为JPG
     *
     * @param src
     * @param dest
     */
    public static String  svgToJpg(String src, String dest) {
        FileOutputStream jpgOut = null;
        FileInputStream svgStream = null;
        ByteArrayOutputStream svgOut = null;
        ByteArrayInputStream svgInputStream = null;
        ByteArrayOutputStream jpg = null;
        try {
            // 获取到svg文件
            File svg = new File(src);
            svgStream = new FileInputStream(svg);
            svgOut = new ByteArrayOutputStream();
            // 获取到svg的stream
            int noOfByteRead = 0;
            while ((noOfByteRead = svgStream.read()) != -1) {
                svgOut.write(noOfByteRead);
            }
            JPEGTranscoder it = new JPEGTranscoder();
            it.addTranscodingHint(JPEGTranscoder.KEY_QUALITY, new Float(0.9f));
            it.addTranscodingHint(ImageTranscoder.KEY_WIDTH, new Float(100));
            jpg = new ByteArrayOutputStream();
            svgInputStream = new ByteArrayInputStream(svgOut.toByteArray());
            it.transcode(new TranscoderInput(svgInputStream),
                    new TranscoderOutput(jpg));
            jpgOut = new FileOutputStream(dest);
            jpgOut.write(jpg.toByteArray());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (svgInputStream != null) {
                    svgInputStream.close();
                }
                if (jpg != null) {
                    jpg.close();
                }
                if (svgStream != null) {
                    svgStream.close();
                }
                if (svgOut != null) {
                    svgOut.close();
                }
                if (jpgOut != null) {
                    jpgOut.flush();
                    jpgOut.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return dest;
    }
    /**
     * 将wmf转换为svg
     *
     * @param src
     * @param dest
     */
    public static void wmfToSvg(String src, String dest) {
        boolean compatible = false;
        try {
            InputStream in = new FileInputStream(src);
            WmfParser parser = new WmfParser();
            final SvgGdi gdi = new SvgGdi(compatible);
            parser.parse(in, gdi);

            Document doc = gdi.getDocument();
            OutputStream out = new FileOutputStream(dest);
            if (dest.endsWith(".svgz")) {
                out = new GZIPOutputStream(out);
            }

            output(doc, out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void output(Document doc, OutputStream out) throws Exception {
        TransformerFactory factory = TransformerFactory.newInstance();
        Transformer transformer = factory.newTransformer();
        transformer.setOutputProperty(OutputKeys.METHOD, "xml");
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty(OutputKeys.DOCTYPE_PUBLIC,
                "-//W3C//DTD SVG 1.0//EN");
        transformer.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM,
                "http://www.w3.org/TR/2001/REC-SVG-20010904/DTD/svg10.dtd");
        transformer.transform(new DOMSource(doc), new StreamResult(out));
        out.flush();
        out.close();
    }





    public static String replace(String original ,String find,String replace)
    {
        if (original==null || find==null ||replace==null)
        {
            return original;
        }
        int findLen = find.length();
        int originalLen = original.length();
        if (originalLen==0 || findLen==0)
        {
            return original;
        }
        StringBuffer sb = new StringBuffer();
        int begin = 0; //下次检索开始的位置
        int i = original.indexOf(find); //找到的子串位置
        while (i!=-1)
        {
            sb.append(original.substring(begin,i));
            sb.append(replace);
            begin = i + findLen;
            i = original.indexOf(find,begin);
        }
        if (begin<originalLen)
        {
            sb.append(original.substring(begin));
        }
        return sb.toString();
    }







}
