package org.spring.cloud.config.client;

import org.spring.cloud.config.client.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value="测试模块")
public class TestController {
	
	
	@Autowired
	private TestService testService;

    @RequestMapping(value = "/hi",method=RequestMethod.GET)
    @ApiOperation(value="测试",notes="测试")
    public String hi(){
    	return this.testService.getFoo();
    }

}
