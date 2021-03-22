package com.excel.lianxi.excel.jxl;


import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import java.io.File;

/**
 * @auther: zxl
 * @Date: 2021/3/18 12:18
 * @Description:JXL方式写入excel excel没有行与列的概念只有坐标 x，y（横标，纵标）
 */
public class JxlWriterExcel {


    public static void main(String[] args) {
        //定义数组
        String[] title = {"id", "name", "sex"};
        //创建excel
        File file = new File("E:/idea-test-data/jxl_excel.xls");
        try {
            file.createNewFile();
            //创建工作铺
            WritableWorkbook workbook = Workbook.createWorkbook(file);
            //创建sheet页
            WritableSheet sheet = workbook.createSheet("sheet1", 0);
            //添加数据
            Label label = null;
            //第一行设置列名
            for (int i = 0; i < title.length; i++) {
                label = new Label(i, 0, title[i]);
                sheet.addCell(label);
            }
            for (int i = 1; i < 10; i++) {
                label = new Label(0, i, "id" + i);
                sheet.addCell(label);
                label = new Label(1, i, "name" + i);
                sheet.addCell(label);
                label = new Label(2, i, "sex" + i);
                sheet.addCell(label);
            }
            //开始写
            workbook.write();
            //关闭写入流
            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

