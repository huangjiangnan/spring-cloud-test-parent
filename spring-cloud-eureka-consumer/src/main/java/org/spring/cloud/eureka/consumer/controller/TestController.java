package org.spring.cloud.eureka.consumer.controller;

import org.spring.cloud.eureka.consumer.inout.request.TestReq;
import org.spring.cloud.eureka.consumer.inout.response.TestResp;
import org.spring.cloud.eureka.consumer.service.HelloService;
import org.spring.cloud.eureka.consumer.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/** 
* 类说明 
* @author  sunney
* @version V1.0  创建时间：2018年3月7日 上午12:37:08 
*/

@RestController
@Api("测试消费者")
public class TestController {
	
	@Autowired
	private HelloService helloService;
	
	@Autowired
	private TestService testService;
	
	@RequestMapping(value="/hello-ribbon",method=RequestMethod.GET)
	@ApiOperation(value = "测试消费者", notes = "测试消费者")
	public TestResp helloRibbon(){
		return this.helloService.test("测试");
	}

	
	@RequestMapping(value="/hello-feign",method=RequestMethod.GET)
	@ApiOperation(value = "测试消费者2", notes = "测试消费者2")
	public TestResp helloFeign(){
		return this.testService.hello(new TestReq());
	}
}
 