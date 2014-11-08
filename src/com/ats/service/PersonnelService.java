package com.ats.service;

import java.util.List;

import com.ats.domain.CimPersonnel;

public interface PersonnelService {
	public boolean personnelAdd(CimPersonnel cimPersonnel, int dep_id);
	public boolean personnelDelete(int id);
	public boolean personnelModify(CimPersonnel cimPersonnel, int dep_id);
	public List<CimPersonnel> personnelShow();
	public boolean validate(String userid, String password);
	public boolean isAdmin(String userid);
	public CimPersonnel personnelSearch(int id);
}
