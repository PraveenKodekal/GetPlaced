package com.Project.pms.Placed.Repository;

import java.util.List;

import com.Project.pms.Placed.Entity.CompanyProfile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface CompanyRepository extends JpaRepository<CompanyProfile, String> {


	CompanyProfile findBycompanyId(String companyId);

	

	CompanyProfile findByeligiblePercentage(double eligiblePercentage);
	
	
	

	

	
}
