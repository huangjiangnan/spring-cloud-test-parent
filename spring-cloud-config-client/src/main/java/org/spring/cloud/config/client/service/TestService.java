package org.spring.cloud.config.client.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class TestService {
	
	@Value("${foo}")
    String foo;
	
	public String getFoo(){
		return foo;
	}

}
