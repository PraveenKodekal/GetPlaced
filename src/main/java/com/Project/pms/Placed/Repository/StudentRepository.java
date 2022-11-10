package com.Project.pms.Placed.Repository;

import java.lang.annotation.Native;
import java.util.List;

import com.Project.pms.Placed.Entity.StudentProfile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface StudentRepository extends JpaRepository<StudentProfile, String> {

//	Query
//	List<StudentProfile> getBystudentPercentage(double studentPercentage);

	@Query("select u FROM StudentProfile u")
	List<StudentProfile> getAllStudentProfile();
	
	@Query(value="select * from studentProfile where studentPercentage>40.0", nativeQuery = true)
	List<StudentProfile> getStudentProfileBystudentPercentage(double studentPercentage);

	StudentProfile findBystudentRegNo(String studentRegNo);
	

}
