package com.natwest.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.natwest.learning.dao.UserDAO;
import com.natwest.learning.model.User;

@Controller
public class UserController {
	
	private UserDAO dao;
    
	@Autowired
	public UserController(UserDAO dao) {
		super();
		this.dao = dao;
//		dao.addUser(new User("Gaurav", "Mumbai", "Gaurav@gmail.com"));
//		dao.addUser(new User("Amrutha", "Delhi", "Amrutha@gmail.com"));
//		dao.addUser(new User("Haresh", "Bangalore", "Haresh@gmail.com"));
	}
	
	// Get All Users
	@GetMapping("/")
	public String indexPage(Model model) {
		model.addAttribute("userList", dao.listAllUsers());
		return "index";
		
	}
	
 // Add new User
	@PostMapping("/addUser")
	public String addUser(@RequestParam("name") String name,
			              @RequestParam("city") String city,
			              @RequestParam("email") String email) {
		User user=new User(name,city,email);
		dao.addUser(user);
		
		return "redirect:/";
				
	}
	
// Delete User
	@GetMapping("/deleteUser/{email}")
	public String deleteUser(@PathVariable("email")String email, ModelMap model) {
		dao.deleteUser(email);
		
		return "redirect:/";
	}
	

}
