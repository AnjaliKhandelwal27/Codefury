package com.demo.dao.assetDao;

import java.sql.Date;

import com.demo.beans.Asset;
import com.demo.beans.User;
import com.demo.exceptions.assetExceptions.AssetNotFoundException;

public interface AssetDaoIntf {
	
	public void addAsset(Asset a);
	public List<Asset> displayAllAssets() throws AssetNotFoundException;
	public List<Asset> getAssetByName(String name) throws AssetNotFoundException;
	public List<Asset> getAssetByCategory(String categoryName) throws AssetNotFoundException;
	public List<Asset> getAssetByDate(String date) throws AssetNotFoundException;
	
		

}
