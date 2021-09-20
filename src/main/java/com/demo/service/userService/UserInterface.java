package com.demo.service.userService;

import com.demo.beans.User;
import com.demo.exceptions.userExceptions.EmailAlreadyExistException;
import com.demo.exceptions.userExceptions.UserNotFoundException;

public interface UserInterface {
	
	// method that will register user for the first time in database
	public int RegisterUser(User user) throws EmailAlreadyExistException;
	// method that will login existing user in database
	public int LoginUser(String email,String password) throws EmailAlreadyExistException;
	// method that will give access to admin to import a list of valid users in database
	public int uploadArrayOfUsers(User[]users);
	// method to get user by id
	public User getUserById(int id) throws UserNotFoundException;
	
	

}
