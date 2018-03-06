package org.spring.cloud.eureka.consumer.service;

import org.spring.cloud.eureka.consumer.inout.request.TestReq;
import org.spring.cloud.eureka.consumer.inout.response.TestResp;
import org.springframework.stereotype.Component;

/** 
* 类说明 
* @author  sunney
* @version V1.0  创建时间：2018年3月7日 上午1:38:32 
*/

@Component
public class TestServiceImpl implements TestService {

	@Override
	public TestResp hello(TestReq req) {
		TestResp testResp=new TestResp();
		testResp.setNickname("服务繁忙");
		testResp.setAge(0);
		return testResp;
	}

}
 