package com.demo.dao.userDao;

import com.demo.beans.User;
import com.demo.exceptions.userExceptions.EmailAlreadyExistException;
import com.demo.exceptions.userExceptions.UserNotFoundException;

public class UserDaoImpl implements UserDao{

	@Override
	public int RegisterUser(User user) throws EmailAlreadyExistException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int LoginUser(String email, String password) throws EmailAlreadyExistException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int uploadArrayOfUsers(User[] users) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User getUserById(int id) throws UserNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
