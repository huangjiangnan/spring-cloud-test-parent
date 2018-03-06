package org.spring.cloud.eureka.provider.controller;

import org.spring.cloud.eureka.provider.service.TestReq;
import org.spring.cloud.eureka.provider.service.TestResp;
import org.spring.cloud.eureka.provider.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/** 
* 类说明 
* @author  sunney
* @version V1.0  创建时间：2018年3月7日 上午12:37:08 
*/

@RestController
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@RequestMapping(value="/hello",method=RequestMethod.POST)
	public TestResp hello(@RequestBody TestReq testReq){
		return this.testService.test(testReq);
	}

}
 