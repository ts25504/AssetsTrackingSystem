package com.ats.domain;

/**
 * SrfDepartureform entity. @author MyEclipse Persistence Tools
 */

public class SrfDepartureform implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer assetsCount;
	private Integer assetsMoney;
	private Integer depId;

	// Constructors

	/** default constructor */
	public SrfDepartureform() {
	}

	/** full constructor */
	public SrfDepartureform(Integer assetsCount, Integer assetsMoney,
			Integer depId) {
		this.assetsCount = assetsCount;
		this.assetsMoney = assetsMoney;
		this.depId = depId;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAssetsCount() {
		return this.assetsCount;
	}

	public void setAssetsCount(Integer assetsCount) {
		this.assetsCount = assetsCount;
	}

	public Integer getAssetsMoney() {
		return this.assetsMoney;
	}

	public void setAssetsMoney(Integer assetsMoney) {
		this.assetsMoney = assetsMoney;
	}

	public Integer getDepId() {
		return this.depId;
	}

	public void setDepId(Integer depId) {
		this.depId = depId;
	}

}