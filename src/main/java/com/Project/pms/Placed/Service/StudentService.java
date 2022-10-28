package com.Project.pms.Placed.Service;

import java.util.List;

import com.Project.pms.Placed.Entity.StudentProfile;
import com.Project.pms.Placed.Repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;

	public StudentProfile saveStudent(StudentProfile studentProfile) {

		
		return studentRepository.save(studentProfile);

	}
	
	
	public StudentProfile studentDetailsByRegNo(String studentRegNo) {
		
		StudentProfile studentProfile=studentRepository.findBystudentRegNo(studentRegNo);
		return studentProfile;
	}
	
	
	public StudentProfile studentLoginByMobile(long studentMobile) {
		StudentProfile studentProfile=studentRepository.findBystudentMobile(studentMobile);
		return studentProfile;
	}
	
	public StudentProfile findStudentBypercentage(double studentPercentage) {
		StudentProfile studentProfile= studentRepository.findBystudentPercentage(studentPercentage);
		return studentProfile;
	}
	
	public StudentProfile findStudentBranch(String studentBranch) {
		StudentProfile studentProfile= studentRepository.findBystudentBranch(studentBranch);
			return studentProfile;
		
	}
	
	
	
}
