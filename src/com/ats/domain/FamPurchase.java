package com.ats.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * FamPurchase entity. @author MyEclipse Persistence Tools
 */

public class FamPurchase implements java.io.Serializable {

	// Fields

	private Integer id;
	private String purchase;
	private Set famAssetses = new HashSet(0);

	// Constructors

	/** default constructor */
	public FamPurchase() {
	}

	/** full constructor */
	public FamPurchase(String purchase, Set famAssetses) {
		this.purchase = purchase;
		this.famAssetses = famAssetses;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPurchase() {
		return this.purchase;
	}

	public void setPurchase(String purchase) {
		this.purchase = purchase;
	}

	public Set getFamAssetses() {
		return this.famAssetses;
	}

	public void setFamAssetses(Set famAssetses) {
		this.famAssetses = famAssetses;
	}

}