package com.Project.pms.Placed.Controller;

import com.Project.pms.Placed.Entity.CollegeProfile;
import com.Project.pms.Placed.Service.CollegeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Placed")
public class CollegeController {
	
	@Autowired
	private CollegeService collegeService;
	
	@PostMapping("/save")
	public CollegeProfile saveCollegetoDb(@RequestBody CollegeProfile collegeProfile) {
		return collegeService.saveCollege(collegeProfile);
	}
	
	
}
