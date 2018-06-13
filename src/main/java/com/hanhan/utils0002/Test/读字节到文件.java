package com.hanhan.utils0002.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Administrator on 2018/6/13.
 */
public class 读字节到文件 {

    public static void main(String[] args) throws IOException {
//现在我有一个Byte[]
        byte[] bs = new byte[]{1,2,3,4,5};
//确定写出文件的位置
        File file = new File("Test.txt");
        writeByteToFile(bs,file);
    }



    public static void writeByteToFile(byte[] bs,File file) throws IOException {
        //建立输出字节流
        FileOutputStream fos = new FileOutputStream(file);
//用FileOutputStream 的write方法写入字节数组
        fos.write(bs);
        System.out.println("写入成功");
        fos.flush();
//为了节省IO流的开销，需要关闭
        fos.close();
    }




}
