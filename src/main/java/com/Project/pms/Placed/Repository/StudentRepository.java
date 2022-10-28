package com.Project.pms.Placed.Repository;

import java.util.List;

import com.Project.pms.Placed.Entity.StudentProfile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StudentRepository extends JpaRepository<StudentProfile, String> {

	StudentProfile findBystudentRegNo(String studentRegNo);

	StudentProfile findBystudentMobile(long studentMobile);

	StudentProfile findBystudentPercentage(double studentPercentage);


	//StudentProfile findBystudentBranch(String studentBranch);

	//StudentProfile findBystudentBranch(String studentBranch);

	StudentProfile findBystudentBranch(String studentBranch);
	

}
