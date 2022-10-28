package com.Project.pms.Placed.Service;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import com.Project.pms.Placed.Entity.CollegeProfile;
import com.Project.pms.Placed.Repository.CollegeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CollegeService {
	@Autowired
	private CollegeRepository collegeRepository ;
	
	
	public CollegeProfile saveCollege(CollegeProfile collegeProfile) {
		
		Set<String> saveRegNo=new LinkedHashSet<String>();
		saveRegNo.add("2022ABC001");
		saveRegNo.add("2022ABC002");
		saveRegNo.add("2022ABC003");
		saveRegNo.add("2022ABC004");
		saveRegNo.add("2022ABC005");
		saveRegNo.add("2022ABC006");
		saveRegNo.add("2022ABC007");
		saveRegNo.add("2022ABC008");
		saveRegNo.add("2022ABC009");
		saveRegNo.add("2022ABC010");
		
		CollegeProfile collegeProfile1=new CollegeProfile(1111, "BERET", "DVg", "123BVG", saveRegNo);
		
		return collegeRepository.save(collegeProfile1);
		
	}
	
	

}
