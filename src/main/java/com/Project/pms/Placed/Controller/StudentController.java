package com.Project.pms.Placed.Controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.Project.pms.Placed.Entity.CollegeProfile;
import com.Project.pms.Placed.Entity.StudentProfile;
import com.Project.pms.Placed.Exception.StudentLoginExceptions.StudentMobileNoNotFoundException;
import com.Project.pms.Placed.Exception.StudentLoginExceptions.StudentRegNoNotFoundException;
import com.Project.pms.Placed.Repository.StudentRepository;
import com.Project.pms.Placed.Service.CollegeService;
import com.Project.pms.Placed.Service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Producer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("/getPlaced/")
public class StudentController {

	@Autowired
	private StudentService studentService;

	

	@PostMapping(value="registerStudent", 
			consumes = {"application/json",
						"application/xml"},
			produces={"application/json",
			"application/xml"})
	
	public ResponseEntity<StudentProfile> registerStudent(@RequestBody StudentProfile studentProfile) {
		return new ResponseEntity<StudentProfile>(studentService.saveStudent(studentProfile), HttpStatus.CREATED);
	}
	@GetMapping(value= "allStudents",consumes = {"application/json",
	"application/xml"},
produces={"application/json",
"application/xml"})
	public ResponseEntity<List<StudentProfile>> AllStudents(){
		return new ResponseEntity<List<StudentProfile>>(studentService.getStudentsAll(), HttpStatus.OK);
	}
//	@GetMapping("/byId")
//	public ResponseEntity<Optional<StudentProfile>> loginId(@RequestHeader("studentRegNo") String studentRegNo, String password){
//		StudentProfile studentProfile= studentService.studentById(studentRegNo;)
//		if(password.equals("123BGV")) {
//		
//		return new ResponseEntity<Optional<StudentProfile>>(studentProfile,HttpStatus.OK);
//		}
//		return ResponseEntity.status(401).body(null);
//	}
//	@GetMapping("byPercentage/{studentPercentage}")
//	public ResponseEntity<StudentProfile> getByPercentage(@PathVariable("studentPercentage") double studentPercentage){
//		StudentProfile studentProfile= studentService.getByPercentage(studentPercentage);
//		
//		return new ResponseEntity<StudentProfile>(studentProfile, HttpStatus.OK);
//	}
//	
	
	@GetMapping("custom")
	public ResponseEntity<List<StudentProfile>> customAll(){
		return new ResponseEntity<List<StudentProfile>>( studentService.allStudentList(), HttpStatus.OK);
		
	}
	
	@GetMapping("percent")
	public ResponseEntity<List<StudentProfile>> customPercentage(double studentPercentage){
		return new ResponseEntity<List<StudentProfile>>(studentService.studentPercentage(studentPercentage),HttpStatus.OK);
	}
	
	

	@GetMapping("/fetchId")
	public ResponseEntity<StudentProfile> fetchBystudentId(@RequestParam String studentRegNo, @RequestParam String password){
		if(password.equals("123BGV"))
		return new ResponseEntity<StudentProfile>(studentService.getStudentId(studentRegNo), HttpStatus.OK);
	
	return ResponseEntity.status(401).body(null);

	}
	
	
	
	
	
	
	
	
	
	
	
}
