package dto;

import java.io.Serializable;

public class CalendarDto implements Serializable{
	private int seq; //시퀀스 - 중복되지 않은 숫자
	private String id; //자기 일정만 봐야함.
	private String title; //일정 제목
	private String content; //일정 내용
	private String rdate; //약속 날짜와 시간
	private String wdate; //일정을 적은 날짜
	
	public CalendarDto() {
		
	}

	public CalendarDto(String id, String title, String content, String rdate) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.rdate = rdate;
	}

	public CalendarDto(int seq, String id, String title, String content, String rdate, String wdate) {
		super();
		this.seq = seq;
		this.id = id;
		this.title = title;
		this.content = content;
		this.rdate = rdate;
		this.wdate = wdate;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRdate() {
		return rdate;
	}

	public void setRdate(String rdate) {
		this.rdate = rdate;
	}

	public String getWdate() {
		return wdate;
	}

	public void setWdate(String wdate) {
		this.wdate = wdate;
	}

	@Override
	public String toString() {
		return "CalendarDto [seq=" + seq + ", id=" + id + ", title=" + title + ", content=" + content + ", rdate="
				+ rdate + ", wdate=" + wdate + "]";
	}
	
}
