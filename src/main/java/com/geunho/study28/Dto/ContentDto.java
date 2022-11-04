package com.geunho.study28.Dto;

public class ContentDto {
	
	private int mid;
	private String mwriter;
	private String mcount;
	
	
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

	public String getMcount() {
		return mcount;
	}

	public void setMcount(String mcount) {
		this.mcount = mcount;
	}

	public ContentDto(int mid, String mwriter, String mcount) {
		super();
		this.mid = mid;
		this.mwriter = mwriter;
		this.mcount = mcount;
	}


	
}
