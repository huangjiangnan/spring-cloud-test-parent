package org.spring.cloud.eureka.consumer.service;

import org.spring.cloud.eureka.consumer.inout.request.TestReq;
import org.spring.cloud.eureka.consumer.inout.response.TestResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * 类说明
 * 
 * @author sunney
 * @version V1.0 创建时间：2018年3月7日 上午12:26:57
 */

@Service
public class HelloService {

	@Autowired
	RestTemplate restTemplate;

	
	@HystrixCommand(fallbackMethod = "testError")
	public TestResp test(String name) {
		TestReq testReq=new TestReq();
		testReq.setNickname(name);
		testReq.setUserId("1");
		ResponseEntity<TestResp> resp=this.restTemplate.postForEntity("http://provider-service/hello", testReq, TestResp.class);
		return resp.getBody();
	}
	
	
	public TestResp testError(String name) {
		TestResp testResp=new TestResp();
		testResp.setNickname("服务繁忙");
		testResp.setAge(0);
		return testResp;
	}

}
