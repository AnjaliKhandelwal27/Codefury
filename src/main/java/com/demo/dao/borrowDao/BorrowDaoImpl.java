package com.demo.dao.borrowDao;

import java.sql.Date;

import com.demo.beans.User;
import com.demo.exceptions.borrowExceptions.BorrowerNotFoundException;

public class BorrowDaoImpl implements BorrowDao{

	@Override
	public User[] getAllborrowers() throws BorrowerNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getBorrowerById(int id) throws BorrowerNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getBorowerByName(String name) throws BorrowerNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getBorowerByDate(Date date) throws BorrowerNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getBorowerByCategory(String category) throws BorrowerNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int sendMessage(int borrowerId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int returnAsset(int borrowerId, int assetId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
