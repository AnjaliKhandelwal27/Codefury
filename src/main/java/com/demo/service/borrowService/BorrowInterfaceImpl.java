package com.demo.service.borrowService;

import java.sql.Date;

import com.demo.beans.User;
import com.demo.dao.borrowDao.BorrowDao;
import com.demo.dao.borrowDao.BorrowDaoImpl;
import com.demo.exceptions.borrowExceptions.BorrowerNotFoundException;

public class BorrowInterfaceImpl implements BorrowInterface {
	
	BorrowDao dao;
	    BorrowInterfaceImpl(){
	    	dao=new BorrowDaoImpl();
	    }

	@Override
	public User[] getAllborrowers() throws BorrowerNotFoundException {
		User[] users=dao.getAllborrowers();
		return users;
	}

	@Override
	public User getBorrowerById(int id) throws BorrowerNotFoundException {
		User user=dao.getBorrowerById(id);
		return user;
	}

	@Override
	public User getBorowerByName(String name) throws BorrowerNotFoundException {
		User user=dao.getBorowerByName(name);
		return user;
	}

	@Override
	public User getBorowerByDate(Date date) throws BorrowerNotFoundException {
		User user=dao.getBorowerByDate(date);
		return user;
	}

	@Override
	public User getBorowerByCategory(String category) throws BorrowerNotFoundException {
		User user=dao.getBorowerByCategory(category);
		return user;
	}

	@Override
	public int sendMessage(int borrowerId) {
		int status =dao.sendMessage(borrowerId);
		return status;
	}

	@Override
	public int returnAsset(int borrowerId, int assetId) {
		int status=dao.returnAsset(borrowerId, assetId);
		return status;
	}

}
