package com.Project.pms.Placed.Entity;

import java.util.List;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class CollegeProfile {

	@Id
	private long collegeId;
	private String collegeName;
	private String collegeLocation;
	private String collegePassword;
	@ElementCollection
	Set<String> studentRegNo;

	public CollegeProfile() {
		// TODO Auto-generated constructor stub
	}

	public CollegeProfile(long collegeId, String collegeName, String collegeLocation, String collegePassword,
			Set<String> studentRegNo) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.collegeLocation = collegeLocation;
		this.collegePassword = collegePassword;
		this.studentRegNo = studentRegNo;
	}

	public long getCollegeId() {
		return collegeId;
	}

	
	
	public Set<String> getStudentRegNo() {
		return studentRegNo;
	}

	public void setStudentRegNo(Set<String> studentRegNo) {
		this.studentRegNo = studentRegNo;
	}

	public void setCollegeId(long collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getCollegeLocation() {
		return collegeLocation;
	}

	public void setCollegeLocation(String collegeLocation) {
		this.collegeLocation = collegeLocation;
	}

	public String getCollegePassword() {
		return collegePassword;
	}

	public void setCollegePassword(String collegePassword) {
		this.collegePassword = collegePassword;
	}

}
