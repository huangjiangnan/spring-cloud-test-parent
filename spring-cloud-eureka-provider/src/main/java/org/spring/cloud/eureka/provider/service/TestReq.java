package org.spring.cloud.eureka.provider.service;

import java.io.Serializable;

/** 
* 类说明 
* @author  sunney
* @version V1.0  创建时间：2018年3月7日 上午12:31:06 
*/
public class TestReq implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -117329735665122579L;
	
	
	private String userId;
	
	private String nickname;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	
	
}
 