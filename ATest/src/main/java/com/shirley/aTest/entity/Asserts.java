package com.shirley.aTest.entity;

/**
 * @Description: TODO(校验类)
 * @author 371683941@qq.com
 * @date 2019年7月3日 下午12:35:45
 */
public class Asserts {
	private String key;
	private String method;
	private String value;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "\n" + "key=" + key + ", method=" + method + ", value=" + value;
	}

}