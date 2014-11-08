package com.ats.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.ats.domain.SrfDepartureform;
import com.ats.service.DepformService;
import com.ats.service.DepformServiceImpl;

public class DepformAction {
	private DepformService depformService;

	public String execute() {
		depformService = new DepformServiceImpl();
		HttpServletRequest request = ServletActionContext.getRequest();
		List<SrfDepartureform> list = depformService.depformShow();
		
		request.setAttribute("list", list);

		return "SHOW";
	}
}
