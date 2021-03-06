package com.mall.pay.bootstrap;

import com.mall.pay.PayCoreService;
import com.mall.pay.constants.PayChannelEnum;
import com.mall.pay.dto.PaymentRequest;
import com.mall.pay.dto.PaymentResponse;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

/**
 * @author: jia.xue
 * @create: 2020-03-31 14:42
 * @Description
 **/
public class AlipayTest extends PayProviderApplicationTests {

    @Autowired
    private PayCoreService payCoreService;

    @Test
    public void testPay(){


        PaymentRequest request = new PaymentRequest();

//        JSONObject object= JSON.parseObject(userInfo);

        Long uid=Long.parseLong("66");
        request.setUserId(uid);
        BigDecimal money= new BigDecimal(0.1);
        request.setOrderFee(money);
        request.setPayChannel(PayChannelEnum.ALI_PAY.getCode());
        request.setSubject("测试数据");
        request.setSpbillCreateIp("115.195.125.164");
        request.setTradeNo("19081913521928018");
        request.setTotalFee(money);

        PaymentResponse paymentResponse = payCoreService.execPay(request);

        System.out.println(paymentResponse);

    }
}