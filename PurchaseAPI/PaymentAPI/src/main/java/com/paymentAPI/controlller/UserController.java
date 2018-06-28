package com.paymentAPI.controlller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.paymentAPI.model.User;
import com.paymentAPI.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/")
	@ResponseBody
	public String welcome() {
		return "Welcome to RestTemplate Example.";
	}

	// URL:
	// http://localhost:8080/SomeContextPath/users
	// http://localhost:8080/SomeContextPath/users.xml
	// http://localhost:8080/SomeContextPath/users.json
	@RequestMapping(value = "/users", //
			method = RequestMethod.GET, //
			produces = { MediaType.APPLICATION_JSON_VALUE, //
					MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	public List<User> getusers() {
		List<User> list = userService.getAllUsers();
		return list;
	}
	

	// URL:
	// http://localhost:8080/SomeContextPath/user/{empNo}
	// http://localhost:8080/SomeContextPath/user/{empNo}.xml
	// http://localhost:8080/SomeContextPath/user/{empNo}.json
	@RequestMapping(value = "/user/{userID}", //
			method = RequestMethod.GET, //
			produces = { MediaType.APPLICATION_JSON_VALUE, //
					MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	public User getuser(@PathVariable("userID") Long empNo) {
		return userService.getUserById(empNo);
	}
}
