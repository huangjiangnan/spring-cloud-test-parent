package org.spring.cloud.eureka.provider.service;

import java.io.Serializable;

/** 
* 类说明 
* @author  sunney
* @version V1.0  创建时间：2018年3月7日 上午12:32:53 
*/
public class TestResp implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4572109881945069502L;

	private String nickname;
	
	private int age;

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
 