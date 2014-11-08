package com.ats.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.ats.domain.SrfPersonnelform;
import com.ats.service.PersonnelformService;
import com.ats.service.PersonnelformServiceImpl;

public class PersonnelformAction {
	private PersonnelformService personnelformService;

	public String execute() {
		personnelformService = new PersonnelformServiceImpl();
		HttpServletRequest request = ServletActionContext.getRequest();
		List<SrfPersonnelform> list = personnelformService.personnelformShow();
		
		request.setAttribute("list", list);

		return "SHOW";
	}
}
