package com.excel.lianxi.huaxia.excel.po;

/**
 * @ClassName Account
 * @Author sherry
 * @Date 2021/4/1 17:03
 * @Description Account
 * @Version 1.0
 */
public class ConsultAccount {

    private String applicationNo;
    private String custAccountNo;
    private String investorName;
    private String certificateNo;

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

    public String getInvestorName() {
        return investorName;
    }

    public void setInvestorName(String investorName) {
        this.investorName = investorName;
    }

    public String getCertificateNo() {
        return certificateNo;
    }

    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
    }
}
