package com.Project.pms.Placed.Repository;

import com.Project.pms.Placed.Entity.CollegeProfile;
import com.Project.pms.Placed.Service.CollegeService;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CollegeRepository extends JpaRepository<CollegeProfile, Long> {

	//CollegeProfile saveCollegeProfile(CollegeProfile collegeProfile);

	

	

	

}
