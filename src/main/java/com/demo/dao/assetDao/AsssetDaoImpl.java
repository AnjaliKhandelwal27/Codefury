package com.demo.dao.assetDao;

import java.sql.Date;

import com.demo.beans.Asset;
import com.demo.beans.User;
import com.demo.exceptions.assetExceptions.AssetNotFoundException;

public class AsssetDaoImpl implements AssetDaoIntf {

	Connection conn = null;
	
	
	public AssetDaoImpl() {

		conn = ConnectionFactory.getDBConnection();
	}

	// for adding asset
	@Override
	public  void addAsset(Asset a) throws SQLException {

		PreparedStatement ps = null;

		// sql query for insertion
		String sql1 = "Insert into Asset ( assetName,assetType,assetDescription,assetDateAdded,assetAvailability,assetLendingPeriod,assetLateReturnFee,assetBannedDays) values(?,?,?,?,?,?,?,?)";

		

			ps = conn.prepareStatement(sql1);

			ps.setString(1, a.getAssetName());
			ps.setString(2, a.getAssetType());
			ps.setString(3, a.getAssetDescription());
			ps.setString(4, a.getAssetDateAdded());
			ps.setInt(5, a.getAssetAvailable());
			ps.setInt(6, a.getAssetLendingPeriod());
			ps.setFloat(7, a.getAssetLateReturnFee());
			ps.setInt(8, a.getAssetBannedDays());

			int i = ps.executeUpdate();

			if (i > 0)
				System.out.println("Insert successful");

		

	}

	// for displaying all the assets
	public List<Asset> displayAllAssets() throws AssetNotFoundException, SQLException {

		List<Asset> alist = new ArrayList<>();
		Asset a = null;

		// sql query for fetching all the assets
		String sql = "Select * from Asset";
		PreparedStatement ps = null;
		ResultSet rs = null;

		
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs.next()) {
				a = new Asset(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6),
						rs.getInt(7), rs.getInt(8), rs.getInt(9));
				alist.add(a);
				while (rs.next()) {
					a = new Asset(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6),
							rs.getInt(7), rs.getInt(8), rs.getInt(9));
					alist.add(a);

				}
			} else
				throw new AssetNotFoundException("There are no assets available");

	
		return alist;

	}

	// getting assets by name
	public List<Asset> getAssetByName(String name) throws AssetNotFoundException, SQLException {

		PreparedStatement ps = null;
		List<Asset> alist = new ArrayList<>();
		ResultSet rs = null;
		Asset a = null;
		String sql = "Select * from Asset where assetName=?";
		
			ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			rs = ps.executeQuery();
			if (rs.next()) {
				a = new Asset(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6),
						rs.getInt(7), rs.getInt(8), rs.getInt(9));
				alist.add(a);
				while (rs.next()) {

					a = new Asset(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6),
							rs.getInt(7), rs.getInt(8), rs.getInt(9));
					alist.add(a);
				}
			} else
				throw new AssetNotFoundException("No Assets available ");


		return alist;

	}

	// getting assets by category
	public List<Asset> getAssetByCategory(String categoryName) throws AssetNotFoundException, SQLException {

		
		PreparedStatement ps = null;
		List<Asset> alist = new ArrayList<>();
		Asset a = null;
		ResultSet rs = null;
		String sql = "Select * from Asset where assetType=?";
		
			ps = conn.prepareStatement(sql);
			ps.setString(1, categoryName);
			rs = ps.executeQuery();
			if (rs.next()) {
				a = new Asset(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6),
						rs.getInt(7), rs.getInt(8), rs.getInt(9));
				alist.add(a);
				while (rs.next()) {

					a = new Asset(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6),
							rs.getInt(7), rs.getInt(8), rs.getInt(9));
					alist.add(a);
				}
			} else
				throw new AssetNotFoundException("No Asset found in this Category");

		

		return alist;

	}

//getting assets by date
	public List<Asset> getAssetByDate(String date) throws AssetNotFoundException, SQLException {

		PreparedStatement ps = null;
		List<Asset> alist = new ArrayList<>();
		Asset a = null;
		ResultSet rs = null;
		String sql = "Select * from Asset where assetDateAdded=?";
		
			ps = conn.prepareStatement(sql);
			ps.setString(1, date);
			rs = ps.executeQuery();
			if (rs.next()) {
				a = new Asset(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6),
						rs.getInt(7), rs.getInt(8), rs.getInt(9));
				alist.add(a);
				while (rs.next()) {

					a = new Asset(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6),
							rs.getInt(7), rs.getInt(8), rs.getInt(9));
					alist.add(a);
				}
			} else
				throw new AssetNotFoundException("No assets were added on this date");

		

		return alist;

	}

}
