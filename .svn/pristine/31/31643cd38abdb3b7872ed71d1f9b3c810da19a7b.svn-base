package com.ats.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * CimDepartment entity. @author MyEclipse Persistence Tools
 */

public class CimDepartment implements java.io.Serializable {

	// Fields

	private Integer id;
	private String depName;
	private String depLeavel;
	private String depManager;
	private Set famAssetses = new HashSet(0);
	private Set cimPersonnels = new HashSet(0);

	// Constructors

	/** default constructor */
	public CimDepartment() {
	}

	/** full constructor */
	public CimDepartment(String depName, String depLeavel, String depManager,
			Set famAssetses, Set cimPersonnels) {
		this.depName = depName;
		this.depLeavel = depLeavel;
		this.depManager = depManager;
		this.famAssetses = famAssetses;
		this.cimPersonnels = cimPersonnels;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDepName() {
		return this.depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public String getDepLeavel() {
		return this.depLeavel;
	}

	public void setDepLeavel(String depLeavel) {
		this.depLeavel = depLeavel;
	}

	public String getDepManager() {
		return this.depManager;
	}

	public void setDepManager(String depManager) {
		this.depManager = depManager;
	}

	public Set getFamAssetses() {
		return this.famAssetses;
	}

	public void setFamAssetses(Set famAssetses) {
		this.famAssetses = famAssetses;
	}

	public Set getCimPersonnels() {
		return this.cimPersonnels;
	}

	public void setCimPersonnels(Set cimPersonnels) {
		this.cimPersonnels = cimPersonnels;
	}

}