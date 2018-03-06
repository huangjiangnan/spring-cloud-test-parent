package org.spring.cloud.eureka.provider.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/** 
* 类说明 
* @author  sunney
* @version V1.0  创建时间：2018年3月7日 上午12:43:50 
*/
@Service
public class TestService {
	
	@Value("${server.port}")
	private String port;
	
	public TestResp test(TestReq req){
		TestResp resp=new TestResp();
		resp.setNickname(port);
		return resp;
	}

}
 