package com.excel.lianxi.excel.jxl;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

import java.io.File;

/**
 * @auther: zxl
 * @Date: 2021/3/18 13:19
 * @Description:JXL方式读取excel excel没有行与列的概念只有坐标 x，y（横标，纵标）
 */
public class JxlReadExcel {
    public static void main(String[] args) {
        try {
            //创建workbook
            Workbook workbook = Workbook.getWorkbook(new File("E:/idea-test-data/jxl_excel.xls"));
            //获取第一个工作表sheet
            Sheet sheet = workbook.getSheet(0);
            //获取数据（先获取行，再获取列）
            for(int i=0;i<sheet.getRows();i++){
                for(int j=0; j<sheet.getColumns();j++){
                //获取每个单元格
                    Cell cell=sheet.getCell(j,i);
                    System.out.print(cell.getContents()+" ");
                }
                System.out.println();
            }
            workbook.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
