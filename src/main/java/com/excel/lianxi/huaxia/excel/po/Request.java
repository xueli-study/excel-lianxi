package com.excel.lianxi.huaxia.excel.po;

/**
 * @ClassName Request
 * @Author sherry
 * @Date 2021/4/1 17:05
 * @Description Request
 * @Version 1.0
 */
public class Request {

    private String appSheetSerialNo;
    private String invertConsultAccountId;
    private String strategyAccountId;
    private String transactionAccountNo;
    private String businessCode;
    private String strategyId;
    private String fundCode;
    private String amount;

    public String getAppSheetSerialNo() {
        return appSheetSerialNo;
    }

    public void setAppSheetSerialNo(String appSheetSerialNo) {
        this.appSheetSerialNo = appSheetSerialNo;
    }

    public String getInvertConsultAccountId() {
        return invertConsultAccountId;
    }

    public void setInvertConsultAccountId(String invertConsultAccountId) {
        this.invertConsultAccountId = invertConsultAccountId;
    }

    public String getStrategyAccountId() {
        return strategyAccountId;
    }

    public void setStrategyAccountId(String strategyAccountId) {
        this.strategyAccountId = strategyAccountId;
    }

    public String getTransactionAccountNo() {
        return transactionAccountNo;
    }

    public void setTransactionAccountNo(String transactionAccountNo) {
        this.transactionAccountNo = transactionAccountNo;
    }

    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }

    public String getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(String strategyId) {
        this.strategyId = strategyId;
    }

    public String getFundCode() {
        return fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
