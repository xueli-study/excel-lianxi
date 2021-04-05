package com.excel.lianxi.huaxia.excel.controller;

import com.excel.lianxi.huaxia.excel.service.GenertExcelService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * @ClassName GenertExcelController
 * @Author sherry
 * @Date 2021/4/1 16:43
 * @Description GenertExcelController
 * @Version 1.0
 */
@RestController
@EnableAutoConfiguration
public class GenertExcelController {

    @Resource
    private GenertExcelService genertExcelService;


    @RequestMapping
    public String genertExcel() {
        try {
            genertExcelFile();
        } catch (Exception e) {

        } finally {

        }
        return "文件已生成";
    }

    private void genertExcelFile() throws IOException {
        genertExcelService.genertExcelFile();
    }
}
