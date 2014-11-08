package com.ats.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.ats.domain.CimPersonnel;
import com.ats.service.PersonnelService;
import com.ats.service.PersonnelServiceImpl;

public class PersonnelAction {
	private CimPersonnel cimPersonnel;
	private PersonnelService personnelService;

	private Integer id;

	private String personnelName;
	private String personnelPwd;
	private String personnelSex;
	private String personnelPositon;
	private String personnelPhone;
	private String personnelPole;
	private String assetsName;

	private int dep_id;

	public String getAssetsName() {
		return assetsName;
	}

	public void setAssetsName(String assetsName) {
		this.assetsName = assetsName;
	}

	public CimPersonnel getCimPersonnel() {
		return cimPersonnel;
	}

	public PersonnelService getPersonnelService() {
		return personnelService;
	}

	public Integer getId() {
		return id;
	}

	public String getPersonnelName() {
		return personnelName;
	}

	public String getPersonnelPwd() {
		return personnelPwd;
	}

	public String getPersonnelSex() {
		return personnelSex;
	}

	public String getPersonnelPositon() {
		return personnelPositon;
	}

	public String getPersonnelPhone() {
		return personnelPhone;
	}

	public String getPersonnelPole() {
		return personnelPole;
	}

	public void setCimPersonnel(CimPersonnel cimPersonnel) {
		this.cimPersonnel = cimPersonnel;
	}

	public void setPersonnelService(PersonnelService personnelService) {
		this.personnelService = personnelService;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setPersonnelName(String personnelName) {
		this.personnelName = personnelName;
	}

	public void setPersonnelPwd(String personnelPwd) {
		this.personnelPwd = personnelPwd;
	}

	public void setPersonnelSex(String personnelSex) {
		this.personnelSex = personnelSex;
	}

	public void setPersonnelPositon(String personnelPositon) {
		this.personnelPositon = personnelPositon;
	}

	public void setPersonnelPhone(String personnelPhone) {
		this.personnelPhone = personnelPhone;
	}

	public void setPersonnelPole(String personnelPole) {
		this.personnelPole = personnelPole;
	}

	public void setDep_id(int dep_id) {
		this.dep_id = dep_id;
	}

	public String add() {
		personnelService = new PersonnelServiceImpl();

		cimPersonnel = new CimPersonnel(null, personnelName, personnelPwd,
				personnelSex, personnelPositon, personnelPhone, personnelPole,
				null);
		
		if (personnelService.personnelAdd(cimPersonnel, dep_id)) {
			return "SUCCESS";
		} else {
			return "FAILED";
		}
	}

	public String delete() {
		personnelService = new PersonnelServiceImpl();

		if (id == null)
			return "FAILED";
		if (personnelService.personnelDelete(id)) {
			return "SUCCESS";
		} else {
			return "FAILED";
		}
	}

	public String modify() {
		personnelService = new PersonnelServiceImpl();

		if (id == null)
			return "FAILED";
		cimPersonnel = new CimPersonnel(null, personnelName, personnelPwd,
				personnelSex, personnelPositon, personnelPhone, personnelPole,
				null);
		cimPersonnel.setId(id);

		if (personnelService.personnelModify(cimPersonnel, dep_id)) {
			return "SUCCESS";
		} else {
			return "FAILED";
		}
	}

	public String search() {
		personnelService = new PersonnelServiceImpl();
		HttpServletRequest request = ServletActionContext.getRequest();
		
		if (id == null)
			return "FAILED";
		
		CimPersonnel list = personnelService.personnelSearch(id);
		request.setAttribute("list", list);
		return "SHOW";
	}
	
	public String show() {
		personnelService = new PersonnelServiceImpl();
		HttpServletRequest request = ServletActionContext.getRequest();
		List<CimPersonnel> list = personnelService.personnelShow();

		request.setAttribute("list", list);
		return "SHOW";
	}
}
