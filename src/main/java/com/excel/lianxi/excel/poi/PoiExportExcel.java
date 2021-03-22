package com.excel.lianxi.excel.poi;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @auther: zxl
 * @Date: 2021/3/18 13:30
 * @Description:使用poi导出excel
 */
public class PoiExportExcel {

    public static void main(String[] args) {

        //初始化列名
        String[] title = {"id", "name", "sex"};
        //创建excel工作铺
        HSSFWorkbook workbook = new HSSFWorkbook();
        //创建一个工作表sheet
        HSSFSheet sheet = workbook.createSheet();
        //创建第一行
        HSSFRow row = sheet.createRow(0);
        //初始化单元格
        HSSFCell cell = null;
        //插入第一行数据 id name sex
        for (int i = 0; i < title.length; i++) {
            cell = row.createCell(i);
            cell.setCellValue(title[i]);
        }
        //追加数据
        for (int i = 1; i <= 10; i++) {
            //创建一行
            HSSFRow nextRow = sheet.createRow(i);
            //追加创建行的第一列字段值
            HSSFCell nextCell = nextRow.createCell(0);
            nextCell.setCellValue("id" + i);
            //追加创建行的第二列字段值
            nextCell = nextRow.createCell(1);
            nextCell.setCellValue("name" + i);
            //追加创建行的第三列字段值
            nextCell = nextRow.createCell(2);
            nextCell.setCellValue("sex" + i);
        }
        //创建一个文件
        File file = new File("E:/idea-test-data/poi_excel.xls");
        try {
            file.createNewFile();
            //文件输出流
            FileOutputStream stream = FileUtils.openOutputStream(file);
            //将工作铺写入文件中
            workbook.write(stream);
            //关闭文件流
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
