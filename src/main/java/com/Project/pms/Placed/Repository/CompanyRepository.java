package com.Project.pms.Placed.Repository;

import com.Project.pms.Placed.Entity.CompanyProfile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CompanyRepository extends JpaRepository<CompanyProfile, String> {

	

	CompanyProfile findBYcompanyId(String companyId);

	CompanyProfile getBycompanyId(String companyId);

}
