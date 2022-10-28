package com.Project.pms.Placed.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
@Entity
public class CompanyProfile {
	
	@Id
	private String companyId;
	@NotBlank(message="Name  is Mandatory")
	private String companyName;
	@NotNull
	private String companyLocation;
	/*
	 * @Positive
	 * 
	 * @Size(min=40,max=100)
	 */	private double eligiblePercentage;
	@NotBlank
	private String eligibleBranches;
	@NotNull
	private long packageOffering;
	@NotNull
	private int bondIfAny;
	private String Role;
	
	public CompanyProfile() {
		//TODO Auto-generated constructor stub
	}
	
	
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyLocation() {
		return companyLocation;
	}
	public void setCompanyLocation(String companyLocation) {
		this.companyLocation = companyLocation;
	}
	public double getEligiblePercentage() {
		return eligiblePercentage;
	}
	public void setEligiblePercentage(double eligiblePercentage) {
		this.eligiblePercentage = eligiblePercentage;
	}
	public String getEligibleBranches() {
		return eligibleBranches;
	}
	public void setEligibleBranches(String eligibleBranches) {
		this.eligibleBranches = eligibleBranches;
	}
	public long getPackageOffering() {
		return packageOffering;
	}
	public void setPackageOffering(long packageOffering) {
		this.packageOffering = packageOffering;
	}
	public int getBondIfAny() {
		return bondIfAny;
	}
	public void setBondIfAny(int bondIfAny) {
		this.bondIfAny = bondIfAny;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	
	
	
	
	
	

}
