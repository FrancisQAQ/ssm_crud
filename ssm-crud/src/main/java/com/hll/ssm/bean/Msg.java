package com.hll.ssm.bean;

import java.util.HashMap;
import java.util.Map;

public class Msg {
	private boolean success;
	
	private String reason;
	
	private Map<String,Object> extend = new HashMap<String, Object>();
	
	public static Msg success(){
		Msg result = new Msg();
		result.setSuccess(true);
		result.setReason("处理成功");
		return result;
	}
	
	public static Msg fail(){
		Msg result = new Msg();
		result.setSuccess(false);
		result.setReason("处理失败");
		return result;
	}
	
	public Msg add(String key,Object value){
		this.getExtend().put(key,value);
		return this;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Map<String, Object> getExtend() {
		return extend;
	}

	public void setExtend(Map<String, Object> extend) {
		this.extend = extend;
	}
	
	

}
