package com.hanhan.utils0002.Test;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;
import javax.swing.JFrame;
import javax.swing.JPanel;

import hanhan.p;
import org.freehep.graphicsio.emf.EMFInputStream;
import org.freehep.graphicsio.emf.EMFRenderer;
import org.freehep.graphicsio.emf.gdi.BitmapInfoHeader;

/**
 * Created by Administrator on 2018/6/13.
 */
public class Emf格式pic转换PNG {

    public static void main(String[] args) throws IOException {
        Emf格式pic转换PNG e=new Emf格式pic转换PNG();
        String s="E:\\2.emf";
        s="E:\\image10.emf";
        EMFInputStream inputStream = new EMFInputStream(new FileInputStream(s), EMFInputStream.DEFAULT_VERSION);
        byte[] bytes = e.emfToPng(inputStream);
        System.out.println(bytes);
        p.writeByteToFile(bytes,new File("E:/128.jpg"));
    }

    private byte[] emfToPng(InputStream is) {
        byte[] by = null;
        EMFInputStream emf = null;
        EMFRenderer emfRenderer = null;
//创建储存图片二进制流的输出流
        ByteArrayOutputStream baos = null;
//创建ImageOutputStream流
        ImageOutputStream imageOutputStream = null;
        try {
            emf = new EMFInputStream(is, EMFInputStream.DEFAULT_VERSION);


            final int width = (int) emf.readHeader().getBounds().getWidth();
            final int height = (int) emf.readHeader().getBounds().getHeight();
            final BufferedImage result = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = (Graphics2D) result.createGraphics();
            emfRenderer = new EMFRenderer(emf);

            emfRenderer.paint(g2);

//创建储存图片二进制流的输出流
            baos = new ByteArrayOutputStream();
//创建ImageOutputStream流
            imageOutputStream = ImageIO.createImageOutputStream(baos);
//将二进制数据写进ByteArrayOutputStream
            ImageIO.write(result, "png", imageOutputStream);
//inputStream = new ByteArrayInputStream(baos.toByteArray());
            by = baos.toByteArray();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (imageOutputStream != null) {
                    imageOutputStream.close();
                }
                if (baos != null) {
                    baos.close();
                }
                if (emfRenderer != null) {
                    emfRenderer.closeFigure();
                }
                if (emf != null) {
                    emf.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return by;
    }

}
