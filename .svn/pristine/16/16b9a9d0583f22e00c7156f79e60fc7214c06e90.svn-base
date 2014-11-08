package com.ats.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.ats.domain.CimDepartment;
import com.ats.service.DepService;
import com.ats.service.DepServiceImpl;

public class DepAction {
	private CimDepartment cimDepartment;
	private DepService depService;

	private Integer id;
	private String depName;
	private String depLeavel;
	private String depManager;

	public void setCimDepartment(CimDepartment cimDepartment) {
		this.cimDepartment = cimDepartment;
	}

	public void setDepService(DepService depService) {
		this.depService = depService;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public void setDepLeavel(String depLeavel) {
		this.depLeavel = depLeavel;
	}

	public void setDepManager(String depManager) {
		this.depManager = depManager;
	}

	public String add() {
		depService = new DepServiceImpl();

		cimDepartment = new CimDepartment(depName, depLeavel, depManager, null,
				null);

		if (depService.depAdd(cimDepartment)) {
			return "SUCCESS";
		} else {
			return "FAILED";
		}
	}

	public String delete() {
		depService = new DepServiceImpl();

		if (id == null)
			return "FAILED";
		if (depService.depDelete(id)) {
			return "SUCCESS";
		} else {
			return "FAILED";
		}
	}

	public String modify() {
		depService = new DepServiceImpl();

		if (id == null)
			return "FAILED";
		cimDepartment = new CimDepartment(depName, depLeavel, depManager, null,
				null);
		cimDepartment.setId(id);

		if (depService.depModify(cimDepartment)) {
			return "SUCCESS";
		} else {
			return "FAILED";
		}
	}

	public String search() {
		depService = new DepServiceImpl();
		HttpServletRequest request = ServletActionContext.getRequest();
		
		if (id == null)
			return "FAILED";
		
		CimDepartment list = depService.depSearch(id);
		request.setAttribute("list", list);
		return "SHOW";
	}
	
	public String show() {
		depService = new DepServiceImpl();
		HttpServletRequest request = ServletActionContext.getRequest();
		List<CimDepartment> list = depService.depShow();

		request.setAttribute("list", list);
		return "SHOW";
	}
}
