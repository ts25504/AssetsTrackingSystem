package com.ats.action;

import java.util.Map;

import com.ats.domain.CimPersonnel;
import com.ats.service.PersonnelService;
import com.ats.service.PersonnelServiceImpl;
import com.opensymphony.xwork2.ActionContext;

public class UserAction {
	private CimPersonnel cimPersonnel;
	private PersonnelService personnelService;
	
    private String userid;
    private String password;
	
	public CimPersonnel getCimPersonnel() {
		return cimPersonnel;
	}

	public void setCimPersonnel(CimPersonnel cimPersonnel) {
		this.cimPersonnel = cimPersonnel;
	}
	
	public PersonnelService getPersonnelService() {
		return personnelService;
	}

	public void setPersonnelService(PersonnelService personnelService) {
		this.personnelService = personnelService;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String execute() {
		ActionContext context = ActionContext.getContext();
		Map session = context.getSession();
		personnelService = new PersonnelServiceImpl(); 
		if (personnelService.validate(userid, password)) {
			session.put("userid", userid);
            if (personnelService.isAdmin(userid)) {
            	session.put("authority", "admin");
            }
            else {
            	session.put("authority", "user");
            }
			return "SUCCESS";
        }else {
        	return "FAILED";
        }
	}
}
