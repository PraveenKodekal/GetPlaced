package com.Project.pms.Placed.Controller;

import javax.validation.Valid;

import com.Project.pms.Placed.Entity.StudentProfile;
import com.Project.pms.Placed.Exception.StudentLoginExceptions.StudentMobileNoNotFoundException;
import com.Project.pms.Placed.Exception.StudentLoginExceptions.StudentRegNoNotFoundException;
import com.Project.pms.Placed.Service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("/GetPlaced/")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/RegisterStudent")
	public ResponseEntity<StudentProfile> saveStudent(@Valid @RequestBody StudentProfile studentProfile) {

		if (studentProfile != null) {
			return new ResponseEntity<StudentProfile>(studentService.saveStudent(studentProfile), HttpStatus.CREATED);
		} else
			return ResponseEntity.status(401).body(null);
	}

	@GetMapping("login/ByRegNo/{studentRegNo}")
	public ResponseEntity<StudentProfile> getStudentDetails(@RequestHeader("studentRegNo") String studentRegNo,
			String password) throws StudentRegNoNotFoundException {

		StudentProfile studentProfile = studentService.studentDetailsByRegNo(studentRegNo);
		if (studentProfile != null && password.equals("123BVG"))

			return new ResponseEntity<StudentProfile>(studentProfile, HttpStatus.OK);

		else {
			throw new StudentRegNoNotFoundException(studentRegNo+"Please Use Valid Register Number");
		}
	}

	@GetMapping("login/mobile/{studentMobile}")
	public ResponseEntity<StudentProfile> studentLoginWithMobile(@RequestHeader("studentMobile") String password,
			long studentMobile) throws StudentMobileNoNotFoundException {

		StudentProfile studentProfile= studentService.studentLoginByMobile(studentMobile);
		if (studentProfile!=null&& password.equals("123BVG"))
			return new ResponseEntity<StudentProfile>(studentProfile,
					HttpStatus.OK);

		else
			throw new StudentMobileNoNotFoundException(studentMobile);

	}

	@GetMapping("findStudentPercentage/{studentPercentage}")
	public ResponseEntity<StudentProfile> findStudentByPercentage(
			@PathVariable("studentPercentage") double studentPercentage) {
		StudentProfile studentProfile = studentService.findStudentBypercentage(studentPercentage);
		if (studentProfile != null) {
			return new ResponseEntity<StudentProfile>(studentProfile, HttpStatus.OK);
		} else {
			return ResponseEntity.status(401).body(null);
		}

	}

	@GetMapping("findStudentBranch/{studentBranch}")
	public ResponseEntity<StudentProfile> findStudentBranch(@PathVariable("studentBranch") String studentBranch) {
		return new ResponseEntity<StudentProfile>(studentService.findStudentBranch(studentBranch), HttpStatus.OK);
	}

}
