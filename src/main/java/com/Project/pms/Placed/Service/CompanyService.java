package com.Project.pms.Placed.Service;

import java.util.List;

import com.Project.pms.Placed.Entity.CompanyProfile;
import com.Project.pms.Placed.Repository.CompanyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CompanyService {
	@Autowired
	private CompanyRepository companyRepository;
	
	
	public CompanyProfile saveCompany(CompanyProfile companyProfile) {
		return companyRepository.save(companyProfile);
	}
	
	public List<CompanyProfile> allCompanyList(){
		return companyRepository.findAll();
	}
	
	public CompanyProfile loginWithcompanyId(String companyId) {
		return companyRepository.findBycompanyId(companyId);
	}
	
	public CompanyProfile getByPercentage(double eligiblePercentage) {
		return companyRepository.findByeligiblePercentage(eligiblePercentage);
	}
}
