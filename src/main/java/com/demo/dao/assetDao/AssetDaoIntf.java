package com.demo.dao.assetDao;

import java.sql.Date;

import com.demo.beans.Asset;
import com.demo.beans.User;
import com.demo.exceptions.assetExceptions.AssetNotFoundException;

public interface AssetDaoIntf {
	
	public void addAsset(Asset a) throws SQLException;
	public List<Asset> displayAllAssets() throws AssetNotFoundException, SQLException;
	public List<Asset> getAssetByName(String name) throws AssetNotFoundException, SQLException;
	public List<Asset> getAssetByCategory(String categoryName) throws AssetNotFoundException, SQLException;
	public List<Asset> getAssetByDate(String date) throws AssetNotFoundException, SQLException;
	
		

}
