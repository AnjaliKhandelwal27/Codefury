package com.demo.service.assetService;

import java.sql.Date;

import com.demo.beans.Asset;
import com.demo.beans.User;
import com.demo.dao.assetDao.AssetDao;
import com.demo.dao.assetDao.AsssetDaoImpl;
import com.demo.exceptions.assetExceptions.AssetNotFoundException;

public class AssetInterfaceImpl implements AssetInterface {
	
	AssetDao dao;
	       AssetInterfaceImpl(){
	    	   dao=new AsssetDaoImpl();
	       }

	@Override
	public int addAsset(Asset a) {
		int status=dao.addAsset(a);
		return status;
	}

	@Override
	public Asset searchAssetByName(String name) throws AssetNotFoundException {
		Asset a=dao.searchAssetByName(name);
		return a;
		
	}

	@Override
	public Asset searchAssetByDate(Date date) throws AssetNotFoundException {
		Asset a=dao.searchAssetByDate(date);
		return a;
	}

	@Override
	public Asset searchAssetByCategory(String category) throws AssetNotFoundException {
		Asset a=dao.searchAssetByCategory(category);
		return a;
	}

	@Override
	public int issueAsset(User user, Asset asset) throws AssetNotFoundException {
		int status=dao.issueAsset(user, asset);
		return status;
	}

	@Override
	public Asset[] getAllAssets() {
		Asset[] assets=dao.getAllAssets();
		return assets;
	}

	@Override
	public int AddAssetAdmin(Asset a) {
		int status=dao.AddAssetAdmin(a);
		return status;
	}
}
