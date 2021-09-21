package com.demo.dao.borrowDao;

import java.sql.Date;

import com.demo.beans.User;
import com.demo.exceptions.borrowExceptions.BorrowerNotFoundException;

public interface BorrowDao {
 
	
	// method to display all borrowers
		public User[] getAllborrowers() throws BorrowerNotFoundException;
		
		// method to get borrower by id
		public User getBorrowerById(int id) throws BorrowerNotFoundException;
	  
		// method to get borrower by name
		public User getBorowerByName(String name) throws BorrowerNotFoundException;
		
		// method to get borrower by date
		public User getBorowerByDate(Date date) throws BorrowerNotFoundException;
		
		// method to get borrower by date
		public User getBorowerByCategory(String category) throws BorrowerNotFoundException;
			
		// method that enable admin to send message to borrower
		public int sendMessage(int borrowerId);
		
		// method that will perform return Asset operation by a borrower
		public int returnAsset(int borrowerId, int assetId);
}
