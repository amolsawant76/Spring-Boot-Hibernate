package com.amolinfo.dto;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="category")

public class Category {

	@Id
	@Column(name="catId")
	int catId;
	@Column(name="catName")
	String catName;
	@Column(name="catDesc")
	String catDesc;
	@Column(name="catImageUrl")
	String catImageUrl;
	
	
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public String getCatDesc() {
		return catDesc;
	}
	public void setCatDesc(String catDesc) {
		this.catDesc = catDesc;
	}
	public String getCatImageUrl() {
		return catImageUrl;
	}
	public void setCatImageUrl(String catImageUrl) {
		this.catImageUrl = catImageUrl;
	}
	
	
}
