package com.mall.pay.biz.payment.validator;

import com.mall.commons.result.AbstractRequest;
import com.mall.order.OrderQueryService;
import com.mall.pay.biz.abs.BaseValidator;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 *
 * @author 风骚的Michael 老师
 */
@Service("aliPaymentValidator")
public class AliPaymentValidator extends BaseValidator {
	@Reference(timeout = 3000,check = false)
	OrderQueryService orderQueryService;

	@Override
	public void specialValidate(AbstractRequest request) {
       super.commonValidate(request,orderQueryService);
	}
}
