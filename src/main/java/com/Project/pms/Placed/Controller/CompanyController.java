 package com.Project.pms.Placed.Controller;

import java.util.List;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import com.Project.pms.Placed.Entity.CompanyProfile;
import com.Project.pms.Placed.Service.CompanyService;

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
@RestController
@RequestMapping
@Validated
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;
	   
	@PostMapping("/RegisterCompany")
	public ResponseEntity<CompanyProfile> registerCompany(@Valid @RequestBody CompanyProfile companyProfile){
		if(companyProfile!=null)
		return new ResponseEntity<CompanyProfile>(companyService.saveCompany(companyProfile), HttpStatus.OK);
		else
			return ResponseEntity.status(401).body(null);
	}
	
	@GetMapping("/getCompanyList")
	public ResponseEntity<List<CompanyProfile>> findAllCompanies(){
		return new ResponseEntity<List<CompanyProfile>>(companyService.allCompanyList(),HttpStatus.OK);
	}
	
	
	@GetMapping("/zzzzz")
	public ResponseEntity<CompanyProfile> loginwithId(@RequestHeader("companyId") String companyId, String password ){
		if(password=="CMP123") {
			return new ResponseEntity<CompanyProfile>(companyService.loginWithcompanyId(companyId), HttpStatus.OK);
		}
		return ResponseEntity.status(401).body(null);
		
		
	}
	
	@GetMapping("/percentage/{eligiblePercentage}")
	public ResponseEntity<CompanyProfile> getByeligiblePercentage(@PathVariable("eligilePercentage") double eligiblePercentage){
		return new ResponseEntity<CompanyProfile>(companyService.getByPercentage(eligiblePercentage), HttpStatus.OK);
	}
	
	
	
	
	
	
	
	

}
