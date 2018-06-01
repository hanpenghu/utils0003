package com.hanhan.utils0002.Test;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import javax.imageio.ImageIO;
import org.apache.poi.hssf.usermodel.HSSFClientAnchor;
import org.apache.poi.hssf.usermodel.HSSFPatriarch;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
/**
 * Created by Administrator on 2018/6/1.
 */
public class 插入Excel图片测试 {


    public static void main(String[]args){
          new 插入Excel图片测试().f();
    }

    private void f() {

        FileOutputStream fileOut = null;
        BufferedImage bufferImg = null;
        try {
            ByteArrayOutputStream byteArrayOut = new ByteArrayOutputStream();
            //加载图片
            bufferImg = ImageIO.read(new File("E:\\1\\00000\\1.png"));
            ImageIO.write(bufferImg, "jpg",byteArrayOut);
            //创建excel
            HSSFWorkbook wb = new HSSFWorkbook();
            //创建sheet1
            HSSFSheet sheet1 = wb.createSheet("sheet1");
            //创建一个图片
            HSSFPatriarch patriarch = sheet1.createDrawingPatriarch();
            /**
             dx1 - the x coordinate within the first cell.//定义了图片在第一个cell内的偏移x坐标，既左上角所在cell的偏移x坐标，一般可设0
             dy1 - the y coordinate within the first cell.//定义了图片在第一个cell的偏移y坐标，既左上角所在cell的偏移y坐标，一般可设0
             dx2 - the x coordinate within the second cell.//定义了图片在第二个cell的偏移x坐标，既右下角所在cell的偏移x坐标，一般可设0
             dy2 - the y coordinate within the second cell.//定义了图片在第二个cell的偏移y坐标，既右下角所在cell的偏移y坐标，一般可设0
             col1 - the column (0 based) of the first cell.//第一个cell所在列，既图片左上角所在列
             row1 - the row (0 based) of the first cell.//图片左上角所在行
             col2 - the column (0 based) of the second cell.//图片右下角所在列
             row2 - the row (0 based) of the second cell.//图片右下角所在行
             */
            //制造图片的位置参数
            HSSFClientAnchor anchor = new HSSFClientAnchor
                    (0, 0, 0, 0,(short) 3, 3, (short)4, 4);
            //插入图片
            patriarch.createPicture(anchor, wb.addPicture(byteArrayOut.toByteArray(), HSSFWorkbook.PICTURE_TYPE_JPEG));
            fileOut = new FileOutputStream("e:/testExcel.xls");


            // 输出文件
            wb.write(fileOut);
            wb.close();
            bufferImg.flush();
            byteArrayOut.flush();
            byteArrayOut.close();
            fileOut.flush();
            fileOut.close();
        } catch (Exception e) {
            e.printStackTrace();
        }



    }



}




