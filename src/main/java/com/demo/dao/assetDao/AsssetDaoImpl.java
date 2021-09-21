package com.demo.dao.assetDao;

import java.sql.Date;

import com.demo.beans.Asset;
import com.demo.beans.User;
import com.demo.exceptions.assetExceptions.AssetNotFoundException;

public class AsssetDaoImpl implements AssetDao {

	@Override
	public int addAsset(Asset a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Asset searchAssetByName(String name) throws AssetNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Asset searchAssetByDate(Date date) throws AssetNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Asset searchAssetByCategory(String category) throws AssetNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int issueAsset(User user, Asset asset) throws AssetNotFoundException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Asset[] getAllAssets() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int AddAssetAdmin(Asset a) {
		// TODO Auto-generated method stub
		return 0;
	}

}
