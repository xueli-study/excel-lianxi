package com.excel.lianxi.huaxia.excel.service;

import com.excel.lianxi.huaxia.excel.dao.GenertExcelDao;
import com.excel.lianxi.huaxia.excel.po.ConsultAccount;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * @ClassName GenertExcelService
 * @Author sherry
 * @Date 2021/4/1 16:44
 * @Description GenertExcelService
 * @Version 1.0
 */
@Service
public class GenertExcelService {
    @Resource
    private GenertExcelDao genertExcelDao;

    public void genertExcelFile() throws IOException {
        //初始化列名
        String[] title = {"申请单编号", "投顾账户", "投顾账户姓名","身份证号"};
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
        List<ConsultAccount> consultAccountList = genertExcelDao.getConsultAccount();
        int size = consultAccountList.size();
        //追加数据
        for (int i = 1; i <= size; i++) {
            ConsultAccount  account = consultAccountList.get(i);
            //创建一行
            HSSFRow nextRow = sheet.createRow(i);
            //追加创建行的第一列字段值
            HSSFCell nextCell = nextRow.createCell(0);
            nextCell.setCellValue(account.getApplicationNo());
            //追加创建行的第二列字段值
            nextCell = nextRow.createCell(1);
            nextCell.setCellValue(account.getCustAccountNo());
            //追加创建行的第三列字段值
            nextCell = nextRow.createCell(2);
            nextCell.setCellValue(account.getInvestorName());
            //追加创建行的第四列字段值
            nextCell = nextRow.createCell(2);
            nextCell.setCellValue(account.getCertificateNo());
        }
        //创建一个文件
        File file = new File("E:/idea-test-data/poi_excel.xls");
        FileOutputStream stream = null;
        try {
            file.createNewFile();
            //文件输出流
             stream = FileUtils.openOutputStream(file);
            //将工作铺写入文件中
            workbook.write(stream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            IOUtils.close(stream);
        }
    }


}
