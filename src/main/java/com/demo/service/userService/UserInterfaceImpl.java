package com.demo.service.userService;

import com.demo.beans.User;
import com.demo.dao.userDao.UserDao;
import com.demo.dao.userDao.UserDaoImpl;
import com.demo.exceptions.userExceptions.EmailAlreadyExistException;
import com.demo.exceptions.userExceptions.UserNotFoundException;

public class UserInterfaceImpl implements UserInterface {
	
	UserDao dao;
	UserInterfaceImpl(){
		dao=new UserDaoImpl();
	}

	@Override
	public int RegisterUser(User user) throws EmailAlreadyExistException {
		int status=dao.RegisterUser(user);
		return status;
	}

	@Override
	public int LoginUser(String email, String password) throws EmailAlreadyExistException {
		int status=dao.LoginUser(email, password);
		return status;
	}

	@Override
	public int uploadArrayOfUsers(User[] users) {
		int status=dao.uploadArrayOfUsers(users);
		return status;
	}

	@Override
	public User getUserById(int id) throws UserNotFoundException {
		User user=dao.getUserById(id);
		return user;
	}

	@Override
	public User[] getAllUsers() throws UserNotFoundException {
		User[]users=dao.getAllUsers();
		return users;
	}

}
