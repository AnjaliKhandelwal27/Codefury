package com.demo.dao.assetDao;

import java.sql.Date;

import com.demo.beans.Asset;
import com.demo.beans.User;
import com.demo.exceptions.assetExceptions.AssetNotFoundException;

public interface AssetDao {
	
		// method that will enable admin to add asset
		public void addAsset(Asset a);
		
		// method that will search an IT asset by name
		public Asset searchAssetByName(String name) throws AssetNotFoundException;
		
		// method that will search an IT asset by date
		public List<Asset> searchAssetByDate(Date date) throws AssetNotFoundException;
		
		// method that will search an It asset by category
		public List<Asset> searchAssetByCategory(String category) throws AssetNotFoundException;
		
		
		// method to getAllAssets 
		public List<Asset> getAllAssets();
	
		//update asset quantity if it already exists
		public void updateAsset(Asset a);
		

}
