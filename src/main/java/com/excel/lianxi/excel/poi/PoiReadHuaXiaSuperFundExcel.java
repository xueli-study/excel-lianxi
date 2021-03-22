package com.excel.lianxi.excel.poi;





import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.IOException;

/**
 * @auther: zxl
 * @Date: 2021/3/18 14:20
 * @Description:读取华夏蚂蚁接口excel数据，并生成对应的insertsql
 */
public class PoiReadHuaXiaSuperFundExcel {

    public static void main(String[] args) {

        //需要解析的Excel文件
        File file = new File("D:/huaxia/蚂蚁财富F001接口 - 权益优选组合-0312.xlsx");
        try {
            //创建Excel，读取文件内容
            XSSFWorkbook workbook = new XSSFWorkbook(FileUtils.openInputStream(file));
            //获取第一个工作表workbook.getSheet("Sheet0");
//			HSSFSheet sheet = workbook.getSheet("Sheet0");
            //读取默认第一个工作表sheet
            XSSFSheet sheet = workbook.getSheetAt(0);
            int firstRowNum = 0;
            //获取sheet中最后一行行号
            int lastRowNum = sheet.getLastRowNum();
            String str = "insert into tp_super_fund_item_config(APP_SHEET_SERIAL_NO,STRATEGY_ID,Strategy_Name,Strategy_Type,Strategy_Desc,STRATEGY_RISK_LEVEL,ESTABLISH_DATE,SUGGEST_HOLD_TIME,Expect_Yield_Star,Expect_Yield_End,Business_Code,Is_Trigger_Adjustment,Min_Purchase_Amount,Max_Purchase_Amount,Min_Hold_Amount,Min_Add_To_Amount,Strategy_Config_Mode,Transfer_In_Rule,Transfer_Out_Rule,Adjustment_Period,Deviation_Threshold,Max_Fund_Deviation_Days,Category_Deviation_Threshold,Max_Category_Deviation_Days,Dividend_Method,Asset_Report_Period,Strategy_Fee_Rule,Service_Rate,Is_Block_Adj_For_Seven_Fee,Adjustment_Reason,Risk_Reveal_Display_Methods,Is_Display_Detail,CREATE_TIME,LAST_UPDATE_TIME)values(";
            for (int i = firstRowNum; i <= 36; i++) {
                XSSFRow row = sheet.getRow(i);
                //获取当前行最后单元格列号
                int lastCellNum = row.getLastCellNum();
                //获取需要转换成sql的那一列
                XSSFCell cell = row.getCell(7);
                cell.setCellType(CellType.STRING);
                String value = cell.getStringCellValue();
                if (i == 0 || i == 27 || i == 28 || i == 29) {
                    continue;
                }
                if (i == 1) {
                    value = "2021031800001";
                }
                if (i == 2) {
                    value = "SF1016";
                }
                str = str + "'" + value + "'";
                if (i != 36) {
                    str = str + ",";
                }
            }
            str = str + ")";
            System.out.println(str);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
