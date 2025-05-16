package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entities.User;
import service.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	//Get the single value of the data
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user){
		
		User user1=userService.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);
	}
	
	
	//Get the single user
  @GetMapping("/userId")
  public ResponseEntity<User> getSingleUser(@PathVariable String userId){
	  
	  User user=userService.getUser(userId);
	  return ResponseEntity.ok(user);
	  
  }
  
  //Get all the user 
 @GetMapping
 public ResponseEntity<List<User>> getAllUser(){
	 List<User> allUsers=userService.getAllUser();
	 return ResponseEntity.ok(allUsers);
 }
 
}
