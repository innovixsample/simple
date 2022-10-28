package com.sam.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sam.company.entity.Company;
import com.sam.company.service.CompanyService;
import com.sam.user.entity.User;
import com.sam.user.service.UserService;

@RestController
public class UserCompanyRestController {

	@Autowired
	UserService userService;

	@Autowired
	CompanyService companyService;

	@GetMapping("/company/get")
	private List<Company> getAllCompany() {
		return companyService.getAllCompany();
	}

	@GetMapping("/company/{companyid}")
	public Company getCompanys(@PathVariable("companyid") int companyid) {
		return companyService.getCompanyById(companyid);
	}

	@DeleteMapping("/company/{companyid}")
	public void deleteCompany(@PathVariable("companyid") int companyid) {
		companyService.delete(companyid);
	}

	@PostMapping("/company/post")
	public int saveCompany(@RequestBody Company company) {
		companyService.saveOrUpdate(company);
		return company.getId();
	}

	@PutMapping("/company/put")
	public Company update(@RequestBody Company company) {
		companyService.saveOrUpdate(company);
		return company;
	}

	@GetMapping("/user/get")
	private List<User> getAllUser() {
		return userService.getAllUsers();
	}

	@GetMapping("/user/{userid}")
	public User getUsers(@PathVariable("userid") int userid) {
		return userService.getUserById(userid);
	}

	@DeleteMapping("/user/{userid}")
	public void deleteUser(@PathVariable("userid") int userid) {
		userService.delete(userid);
	}

	@PostMapping("/user/post")
	public int saveUser(@RequestBody User user) {
		userService.saveOrUpdate(user);
		return user.getId();
	}

	@PutMapping("/user/put")
	public User update(@RequestBody User user) {
		userService.saveOrUpdate(user);
		return user;
	}

}