package org.spring.cloud.eureka.consumer.service;

import org.spring.cloud.eureka.consumer.inout.request.TestReq;
import org.spring.cloud.eureka.consumer.inout.response.TestResp;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/** 
* 类说明 
* @author  sunney
* @version V1.0  创建时间：2018年3月7日 上午1:01:25 
*/

@FeignClient(value = "provider-service",fallback = TestServiceImpl.class)
public interface TestService {
	
	@RequestMapping(value = "/hello",method = RequestMethod.POST)
    TestResp hello(@RequestBody TestReq req);

}
 