package com.excel.lianxi.huaxia.excel.po;

/**
 * @ClassName Share
 * @Author sherry
 * @Date 2021/4/1 17:05
 * @Description Share
 * @Version 1.0
 */
public class Share {

    private String strategyAccountId;
    private String transactionAccountNo;
    private String amount;

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

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
