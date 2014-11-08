package com.ats.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * CimPersonnel entity. @author MyEclipse Persistence Tools
 */

public class CimPersonnel implements java.io.Serializable {

	// Fields

	private Integer id;
	private CimDepartment cimDepartment;
	private String personnelName;
	private String personnelPwd;
	private String personnelSex;
	private String personnelPositon;
	private String personnelPhone;
	private String personnelPole;
	private Set famAssetses;

	// Constructors

	/** default constructor */
	public CimPersonnel() {
	}

	/** full constructor */
	public CimPersonnel(CimDepartment cimDepartment, String personnelName,
			String personnelPwd, String personnelSex, String personnelPositon,
			String personnelPhone, String personnelPole, Set famAssetses) {
		this.cimDepartment = cimDepartment;
		this.personnelName = personnelName;
		this.personnelPwd = personnelPwd;
		this.personnelSex = personnelSex;
		this.personnelPositon = personnelPositon;
		this.personnelPhone = personnelPhone;
		this.personnelPole = personnelPole;
		this.famAssetses = famAssetses;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CimDepartment getCimDepartment() {
		return this.cimDepartment;
	}

	public void setCimDepartment(CimDepartment cimDepartment) {
		this.cimDepartment = cimDepartment;
	}

	public String getPersonnelName() {
		return this.personnelName;
	}

	public void setPersonnelName(String personnelName) {
		this.personnelName = personnelName;
	}

	public String getPersonnelPwd() {
		return this.personnelPwd;
	}

	public void setPersonnelPwd(String personnelPwd) {
		this.personnelPwd = personnelPwd;
	}

	public String getPersonnelSex() {
		return this.personnelSex;
	}

	public void setPersonnelSex(String personnelSex) {
		this.personnelSex = personnelSex;
	}

	public String getPersonnelPositon() {
		return this.personnelPositon;
	}

	public void setPersonnelPositon(String personnelPositon) {
		this.personnelPositon = personnelPositon;
	}

	public String getPersonnelPhone() {
		return this.personnelPhone;
	}

	public void setPersonnelPhone(String personnelPhone) {
		this.personnelPhone = personnelPhone;
	}

	public String getPersonnelPole() {
		return this.personnelPole;
	}

	public void setPersonnelPole(String personnelPole) {
		this.personnelPole = personnelPole;
	}

	public Set getFamAssetses() {
		return this.famAssetses;
	}

	public void setFamAssetses(Set famAssetses) {
		this.famAssetses = famAssetses;
	}

}