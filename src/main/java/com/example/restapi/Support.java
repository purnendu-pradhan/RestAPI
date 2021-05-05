package com.example.restapi;

public class Support {

	private String url;
	private String txt;
	
	public Support() {
		
	}

	public Support(String url, String txt) {
		super();
		this.url = url;
		this.txt = txt;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTxt() {
		return txt;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}
	
}
