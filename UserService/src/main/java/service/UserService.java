package service;

import java.util.List;

import entities.User;

public interface UserService {
	
	//user operation
	
	//create
	User saveUser(User user);
	
	//get all user
	List<User> getAllUser();
	
	// get the user 
	User getUser(String userId);
	
	
	//delete user
	 void deleteUser(String userId);
	//update user
	 User updateUser(User updatedUser);

}
