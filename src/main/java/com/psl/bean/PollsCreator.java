package com.psl.bean;

import java.util.Date;

public class PollsCreator {

	private int pollId;
	private String poll;
	private int employeeIdCreator;
	private double averageRate;
	private String Comment;
	private int departmentId;
	private String pollType;
	private Date date;
	public int getPollId() {
		return pollId;
	}
	public void setPollId(int pollId) {
		this.pollId = pollId;
	}
	public String getPoll() {
		return poll;
	}
	public void setPoll(String poll) {
		this.poll = poll;
	}
	public int getEmployeeIdCreator() {
		return employeeIdCreator;
	}
	public void setEmployeeIdCreator(int employeeIdCreator) {
		this.employeeIdCreator = employeeIdCreator;
	}
	public double getAverageRate() {
		return averageRate;
	}
	public void setAverageRate(double averageRate) {
		this.averageRate = averageRate;
	}
	public String getComment() {
		return Comment;
	}
	public void setComment(String comment) {
		Comment = comment;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getPollType() {
		return pollType;
	}
	public void setPollType(String pollType) {
		this.pollType = pollType;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
