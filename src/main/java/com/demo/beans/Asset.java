package com.demo.beans;

public class Asset {
	
	
	private String assetName , assetType ,assetDescription;
	private String assetDateAdded;
	private int assetAvailable ,assetLendingPeriod;
	private float assetLateReturnFee ;
	private int assetBannedDays;
	
	
	public Asset() {
		
	}


	public Asset( String assetName, String assetType, String assetDescription, String assetDateAdded,
			int assetAvailable, int assetLendingPeriod, float assetLateReturnFee, int assetBannedDays) {
		
		
		this.assetName = assetName;
		this.assetType = assetType;
		this.assetDescription = assetDescription;
		this.assetDateAdded = assetDateAdded;
		this.assetAvailable = assetAvailable;
		this.assetLendingPeriod = assetLendingPeriod;
		this.assetLateReturnFee = assetLateReturnFee;
		this.assetBannedDays = assetBannedDays;
	}


	


	


	public String getAssetName() {
		return assetName;
	}


	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}


	public String getAssetType() {
		return assetType;
	}


	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}


	public String getAssetDescription() {
		return assetDescription;
	}


	public void setAssetDescription(String assetDescription) {
		this.assetDescription = assetDescription;
	}


	public String getAssetDateAdded() {
		return assetDateAdded;
	}


	public void setAssetDateAdded(String assetDateAdded) {
		this.assetDateAdded = assetDateAdded;
	}


	public int getAssetAvailable() {
		return assetAvailable;
	}


	public void setAssetAvailable(int assetAvailable) {
		this.assetAvailable = assetAvailable;
	}


	public int getAssetLendingPeriod() {
		return assetLendingPeriod;
	}


	public void setAssetLendingPeriod(int assetLendingPeriod) {
		this.assetLendingPeriod = assetLendingPeriod;
	}


	public float getAssetLateReturnFee() {
		return assetLateReturnFee;
	}


	public void setAssetLateReturnFee(float assetLateReturnFee) {
		this.assetLateReturnFee = assetLateReturnFee;
	}


	public int getAssetBannedDays() {
		return assetBannedDays;
	}


	public void setAssetBannedDays(int assetBannedDays) {
		this.assetBannedDays = assetBannedDays;
	}


	@Override
	public String toString() {
		return "Asset [ assetName=" + assetName + ", assetType=" + assetType
				+ ", assetDescription=" + assetDescription + ", assetDateAdded=" + assetDateAdded + ", assetAvailable="
				+ assetAvailable + ", assetLendingPeriod=" + assetLendingPeriod + ", assetLateReturnFee="
				+ assetLateReturnFee + ", assetBannedDays=" + assetBannedDays + "]";
	}
	
	
	
	

}

