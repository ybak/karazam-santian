//package com.klzan.plugin.pay.common.module;
//
//import com.klzan.core.util.SpringUtils;
//import com.klzan.plugin.pay.common.PayType;
//import com.klzan.plugin.pay.common.PayUtils;
//import com.klzan.plugin.pay.common.dto.UserInfoRequest;
//import com.klzan.plugin.pay.cpcn.ChinaClearingConfig;
//import com.klzan.plugin.pay.cpcn.model.CpcnPayAccountInfo;
//import payment.api.tx.TxBaseRequest;
//import payment.api.tx.paymentaccount.Tx4241Request;
//
///**
// * 登录 - 支付组件
// *
// * @author: chenxinglin
// */
//public class PayAddWithdrawModule extends PayModule{
//
//    @Override
//    public PayType getPayPortal {
//        return PayType.add_withdraw;
//    }
//
//    @Override
//    public TxBaseRequest getReqParam() {
//        PayUtils payUtils = SpringUtils.getBean(PayUtils.class);
//        UserInfoRequest req = (UserInfoRequest)getRequest();
//        CpcnPayAccountInfo info = payUtils.getCpcnPayAccountInfo(req.getUserId());
//        String paymentAccountNumber = info.getAccountNumber();
//
//        Tx4241Request request = new Tx4241Request();
//        request.setInstitutionID(ChinaClearingConfig.INSTITUTION_ID);
//        request.setPaymentAccountNumber(paymentAccountNumber);
//        request.setBindingSystemNo(getSn());
//        request.setPageURL(ChinaClearingConfig.PAGE_URL + getSn());
//        return request;
//    }
//
//}