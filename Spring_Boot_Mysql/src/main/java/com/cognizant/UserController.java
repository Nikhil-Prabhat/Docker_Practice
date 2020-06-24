package com.cognizant;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController 
{
	
	@Autowired
	private Repo repo;
	
	@GetMapping("/adduser")
	public String addStudents()
	{
		User user1 = new User();
		user1.setName("Nik");
		user1.setTech("CSE");
		
		repo.save(user1);
		
		User user2 = new User();
		user2.setName("Pra");
		user2.setTech("IT");
		repo.save(user2);
		
		return "Added";
	}
	
	@GetMapping("/getuser")
	public List<User> getStudents()
	{
		return repo.findAll();
	}
	
	

}
