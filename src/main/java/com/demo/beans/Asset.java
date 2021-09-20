package com.demo.beans;

import java.sql.Date;

public class Asset {
	private int assetId;
	private String name;
	private String category;
	private String description;
	private Date date;
	private boolean isAvailable;
	public int getAssetId() {
		return assetId;
	}
	public void setAssetId(int assetId) {
		this.assetId = assetId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	@Override
	public String toString() {
		return "Asset [assetId=" + assetId + ", name=" + name + ", category=" + category + ", description="
				+ description + ", date=" + date + ", isAvailable=" + isAvailable + "]";
	}
	public Asset(int assetId, String name, String category, String description, Date date, boolean isAvailable) {
		super();
		this.assetId = assetId;
		this.name = name;
		this.category = category;
		this.description = description;
		this.date = date;
		this.isAvailable = isAvailable;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

}
