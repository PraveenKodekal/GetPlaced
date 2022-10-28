package com.Project.pms.Placed.Exception;

import java.util.Date;

public class CustomErrorDetails {
	
	private Date timeStrap;
	private String message;
	private String errorDetail;
	
	public CustomErrorDetails() {
		//TODO Auto-generated constructor stub
	}
	
	
	
	
	public CustomErrorDetails(Date timeStrap, String message, String errorDetail) {
		super();
		this.timeStrap = timeStrap;
		this.message = message;
		this.errorDetail = errorDetail;
	}




	public Date getTimeStrap() {
		return timeStrap;
	}
	public void setTimeStrap(Date timeStrap) {
		this.timeStrap = timeStrap;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getErrorDetail() {
		return errorDetail;
	}
	public void setErrorDetail(String errorDetail) {
		this.errorDetail = errorDetail;
	}
	
	
	
	
	
	

}
