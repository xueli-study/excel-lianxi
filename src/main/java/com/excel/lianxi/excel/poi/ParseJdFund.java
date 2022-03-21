package com.excel.lianxi.excel.poi;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * @ClassName ParseJdFund
 * @Author sherry
 * @Date 2022/3/18 13:26
 * @Description ParseJdFund
 * @Version 1.0
 */
public class ParseJdFund {

    public static void main(String[] args) {

        //需要解析的Excel文件
        File file = new File("D:\\huaxia\\投顾二期\\京东\\持仓基金清单（合）.xlsx");
        try {
            //创建Excel，读取文件内容
            XSSFWorkbook workbook = new XSSFWorkbook(FileUtils.openInputStream(file));
            //获取第一个工作表workbook.getSheet("Sheet0");
//			HSSFSheet sheet = workbook.getSheet("Sheet0");
            //读取默认第一个工作表sheet
            XSSFSheet sheet = workbook.getSheetAt(0);
            int firstRowNum = 1;
            //获取sheet中最后一行行号
            int lastRowNum = sheet.getLastRowNum();
            String result = "";
            String value1 = null;
            String value2 = null;
            String value3 = null;
            for (int i = firstRowNum; i <= 10; i++) {
                XSSFRow row = sheet.getRow(i);
                //获取当前行最后单元格列号
                int lastCellNum = row.getLastCellNum();
                //获取需要转换成sql的那一列
                XSSFCell cell = row.getCell(0);
                cell.setCellType(CellType.STRING);
                 value1 = cell.getStringCellValue();

                XSSFCell cell2 = row.getCell(1);
                cell2.setCellType(CellType.STRING);
                 value2 = cell2.getStringCellValue();

                XSSFCell cell3 = row.getCell(2);
                cell3.setCellType(CellType.STRING);
                 value3 = cell3.getStringCellValue();

                String str = "insert into dep (name,fund_code,ta_code) values(";
                str= str+"'" +value1+"','"+value2+"','"+value3+"');"+"\r\n";
                System.out.println(str);
                result += str+"\r\n";
            }

            String path = "E:\\学习资料\\京东转义.txt";
            File pathFile = new File(path);
            PrintWriter out = new PrintWriter(new BufferedWriter(new
                    OutputStreamWriter(new FileOutputStream(pathFile), "utf-8")));
            String message = result;//需要写入的信息
            out.write(message);
            out.flush();
            out.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
