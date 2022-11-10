package com.Project.pms.Placed.Service;

import java.util.List;
import java.util.Optional;

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
	
	
	public List<StudentProfile> getStudentsAll(){
		return studentRepository.findAll();
	}
	
	
	public Optional<StudentProfile> studentById(String studentRegNo) {
		return studentRepository.findById(studentRegNo);
	}
//	
//	public StudentProfile getByPercentage(double studentPercentage) {
//		return studentRepository.findByLessThan(studentPercentage);
//	}
	
	public List<StudentProfile> allStudentList(){
		return studentRepository.getAllStudentProfile();
	}
	
	public List<StudentProfile> studentPercentage(double studentPercentage){
		return studentRepository.getStudentProfileBystudentPercentage(studentPercentage);
	}
	
	public StudentProfile getStudentId(String studentRegNo) {
		return studentRepository.findBystudentRegNo(studentRegNo);
	}
}


