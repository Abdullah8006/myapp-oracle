package com.appster.abdullah.util;

public class ResponseEnvelope {

	public Object data;
	public String message;
	
	public ResponseEnvelope(Object data, String message) {
		super();
		this.data = data;
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
