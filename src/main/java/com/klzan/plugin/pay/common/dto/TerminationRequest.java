package com.klzan.plugin.pay.common.dto;

/**
 * 开户 - 支付响应
 *
 * @author: chenxinglin
 */
public class TerminationRequest extends Request{

    private Integer userId;

    private String agreementNo;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAgreementNo() {
        return agreementNo;
    }

    public void setAgreementNo(String agreementNo) {
        this.agreementNo = agreementNo;
    }
}