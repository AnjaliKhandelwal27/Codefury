package com.demo.service.assetService;

import java.sql.Date;

import com.demo.beans.Asset;
import com.demo.beans.User;
import com.demo.exceptions.assetExceptions.AssetNotFoundException;
import com.demo.exceptions.assetExceptions.AssetNotIssuedException;
import com.demo.exceptions.assetExceptions.AssetNotFoundException;
public interface AssetInterface {
	
	// method that will enable admin to add asset
	public int addAsset(Asset a);
	
	// method that will search an IT asset by name
	public Asset searchAssetByName(String name) throws AssetNotFoundException;
	
	// method that will search an IT asset by date
	public Asset searchAssetByDate(Date date) throws AssetNotFoundException;
	
	// method that will search an It asset by category
	public Asset searchAssetByCategory(String category) throws AssetNotFoundException;
	
	// method that will take user and Asset data as an input and issue an asset
	public int issueAsset(User user,Asset asset) throws AssetNotFoundException;
	
}
