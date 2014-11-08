package com.ats.dao;

import java.util.List;

import com.ats.domain.CimPersonnel;

public interface PersonnelDao {
	public boolean personnelAdd(CimPersonnel cimPersonnel, int dep_id);
//	public boolean personnelAdd(CimPersonnel cimPersonnel,String famName);
	public boolean personnelDelete(int id);
	public boolean personnelModify(CimPersonnel cimPersonnel, int dep_id);
	public List<CimPersonnel> personnelShow();
	public CimPersonnel getByName(String userid);
	public boolean isAdmin(String userid);
	public CimPersonnel personnelSearch(int id);
}
