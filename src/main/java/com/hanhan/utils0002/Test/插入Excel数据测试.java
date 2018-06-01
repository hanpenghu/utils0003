package com.hanhan.utils0002.Test;

import java.io.*;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

/**
 * Created by Administrator on 2018/6/1.
 */
public class 插入Excel数据测试 {

    public static void main(String[] args) throws IOException {
        new 插入Excel数据测试().f();
    }


    private void f() throws IOException {
        HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(new File("e:/testExcel.xls"))); // 读取的文件
        HSSFSheet sheet = null;
        int i = workbook.getSheetIndex("sheet1"); // sheet表名
        sheet = workbook.getSheetAt(i);

        HSSFRow row = sheet.getRow(0); // 获取指定的行对象，无数据则为空，需要创建
        if (row == null) {
            row = sheet.createRow(0); // 该行无数据，创建行对象
        }

        Cell cell = row.createCell(1); // 创建指定单元格对象。如本身有数据会替换掉
        cell.setCellValue("tt"); // 设置内容

        FileOutputStream fo = new FileOutputStream("e:/testExcel.xls"); // 输出到文件
        workbook.write(fo);
    }


}
