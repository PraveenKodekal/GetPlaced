package com.Project.pms.Placed.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.NotFound;

@Entity
@XmlRootElement
public class StudentProfile {
	
	@Id
	@Size(min=10,max=10)
	private String studentRegNo;
	@NotBlank(message="Name should be Mandatory")
	//@Min(value=4, message ="name should atleast contain 4 characters")
	private String studentName;
	@NotNull()
	private String studentAddress;
	@Email(message="Use Valid EmailId..!")
	private String studentEmailId;
	/*
	 * @Positive
	 * 
	 * @NotBlank(message="Percentage is must ")
	 * 
	 * @Min(value=40,
	 * message="Minimum percentage to register for placement is 40...!")
	 * 
	 * @Max(value=100,
	 * message="Maximum percentage to register for placement is 100...!")
	 */	private double studentPercentage;
	@NotBlank()
	private String studentBranch;
	@NotNull
	
	//@Pattern(regexp="\\d{10}")
	private long studentMobile;
	
	
	public StudentProfile() {
		//TODO Auto-generated constructor stub
	}


	public String getStudentRegNo() {
		return studentRegNo;
	}


	public void setStudentRegNo(String studentRegNo) {
		this.studentRegNo = studentRegNo;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getStudentAddress() {
		return studentAddress;
	}


	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}


	public String getStudentEmailId() {
		return studentEmailId;
	}


	public void setStudentEmailId(String studentEmailId) {
		this.studentEmailId = studentEmailId;
	}


	public double getStudentPercentage() {
		return studentPercentage;
	}


	public void setStudentPercentage(double studentPercentage) {
		this.studentPercentage = studentPercentage;
	}


	public String getStudentBranch() {
		return studentBranch;
	}


	public void setStudentBranch(String studentBranch) {
		this.studentBranch = studentBranch;
	}


	public long getStudentMobile() {
		return studentMobile;
	}


	public void setStudentMobile(long studentMobile) {
		this.studentMobile = studentMobile;
	}
	
	
	

}
