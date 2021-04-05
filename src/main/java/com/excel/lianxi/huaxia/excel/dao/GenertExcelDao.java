package com.excel.lianxi.huaxia.excel.dao;

import com.excel.lianxi.huaxia.excel.po.Confirm;
import com.excel.lianxi.huaxia.excel.po.ConsultAccount;
import com.excel.lianxi.huaxia.excel.po.Request;
import com.excel.lianxi.huaxia.excel.po.Share;
import com.excel.lianxi.huaxia.excel.po.StrategyAccount;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName GenertExcelDao
 * @Author sherry
 * @Date 2021/4/1 16:44
 * @Description GenertExcelDao
 * @Version 1.0
 */
public interface GenertExcelDao {

    public List<Confirm> getConfirm();

    public List<ConsultAccount> getConsultAccount();

    public List<Request> getRequest();

    public List<Share> getShare();

    public List<StrategyAccount> getStrategyAccount();
}
