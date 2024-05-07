package com.kh.practice.list.music.model.vo;

public class Music {
	//필드
	private String title;
	private String singer;

		
	public void setTitle(String title) {
		this.title = title;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getTitle() {
		return title;
	}
	public String getSinger() {
		return singer;
	}
	public Music() {
		
	}
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	
	
	
	}
}
	
	

