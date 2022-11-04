package com.geunho.study28.Dto;

public class ContentDto {
	
	private int mid;
	private String mwriter;
	private String mcontent;
	
	
	public ContentDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getMwriter() {
		return mwriter;
	}

	public void setMwriter(String mwriter) {
		this.mwriter = mwriter;
	}

	public String getMcontent() {
		return mcontent;
	}

	public void setMcontent(String mcontent) {
		this.mcontent = mcontent;
	}

	public ContentDto(int mid, String mwriter, String mcontent) {
		super();
		this.mid = mid;
		this.mwriter = mwriter;
		this.mcontent = mcontent;
	}


	
}
