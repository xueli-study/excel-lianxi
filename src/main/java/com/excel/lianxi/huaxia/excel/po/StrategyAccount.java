package com.excel.lianxi.huaxia.excel.po;

/**
 * @ClassName StrategyAccount
 * @Author sherry
 * @Date 2021/4/1 17:04
 * @Description StrategyAccount
 * @Version 1.0
 */
public class StrategyAccount {

    private String applicationNo;
    private String custAccountNo;
    private String strategyAccountId;
    private String strategyId;
    private String transactionAccountId;

    public String getApplicationNo() {
        return applicationNo;
    }

    public void setApplicationNo(String applicationNo) {
        this.applicationNo = applicationNo;
    }

    public String getCustAccountNo() {
        return custAccountNo;
    }

    public void setCustAccountNo(String custAccountNo) {
        this.custAccountNo = custAccountNo;
    }

    public String getStrategyAccountId() {
        return strategyAccountId;
    }

    public void setStrategyAccountId(String strategyAccountId) {
        this.strategyAccountId = strategyAccountId;
    }

    public String getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(String strategyId) {
        this.strategyId = strategyId;
    }

    public String getTransactionAccountId() {
        return transactionAccountId;
    }

    public void setTransactionAccountId(String transactionAccountId) {
        this.transactionAccountId = transactionAccountId;
    }
}
