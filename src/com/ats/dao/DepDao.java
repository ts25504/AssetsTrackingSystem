package com.ats.dao;

import java.util.List;

import com.ats.domain.CimDepartment;

public interface DepDao {
	public boolean depAdd(CimDepartment cimDepartment);
	public boolean depDelete(int id);
	public boolean depModify(CimDepartment cimDepartment);
	public List<CimDepartment> depShow();
	
	public CimDepartment depSearch(int id);
}
