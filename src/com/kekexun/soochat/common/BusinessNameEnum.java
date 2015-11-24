package com.kekexun.soochat.common;

public enum BusinessNameEnum {

	// ��¼ҵ��
	LOGIN_BUSINESS("login_service/login");
	
	private String name;
	
	private BusinessNameEnum(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
