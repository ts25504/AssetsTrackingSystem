package com.ats.service;

import java.util.List;

import com.ats.dao.DepDao;
import com.ats.dao.DepDaoImpl;
import com.ats.domain.CimDepartment;

public class DepServiceImpl implements DepService {

	private DepDao depDao;

	@Override
	public boolean depAdd(CimDepartment cimDepartment) {
		depDao = new DepDaoImpl();
		
		if (depDao.depAdd(cimDepartment)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean depDelete(int id) {
		depDao = new DepDaoImpl();
		
		if (depDao.depDelete(id)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean depModify(CimDepartment cimDepartment) {
		depDao = new DepDaoImpl();
		
		if (depDao.depModify(cimDepartment)) {
			return true;
		}
		return false;
	}

	@Override
	public List<CimDepartment> depShow() {
		depDao = new DepDaoImpl();
		
		return depDao.depShow();
	}

	@Override
	public CimDepartment depSearch(int id) {
		depDao = new DepDaoImpl();
		
		return depDao.depSearch(id);
	}
}
