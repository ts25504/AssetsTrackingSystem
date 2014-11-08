package com.ats.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.ats.domain.SrfCompanyform;
import com.ats.service.CompformService;
import com.ats.service.CompformServiceImpl;

public class CompformAction {
	private CompformService compformService;

	public String execute() {
		compformService = new CompformServiceImpl();
		HttpServletRequest request = ServletActionContext.getRequest();
		SrfCompanyform compform = compformService.compformShow();
		
		request.setAttribute("compform", compform);

		return "SHOW";
	}
}
