package com.ats.service;

import java.util.List;

import com.ats.dao.PersonnelDao;
import com.ats.dao.PersonnelDaoImpl;
import com.ats.domain.CimPersonnel;

public class PersonnelServiceImpl implements PersonnelService {

	private PersonnelDao personnelDao;

	@Override
	public boolean personnelAdd(CimPersonnel cimPersonnel, int dep_id) {
		personnelDao = new PersonnelDaoImpl();

		if (personnelDao.personnelAdd(cimPersonnel, dep_id))
			return true;
		return false;
	}

	@Override
	public boolean personnelDelete(int id) {
		personnelDao = new PersonnelDaoImpl();

		if (personnelDao.personnelDelete(id))
			return true;
		return false;
	}

	@Override
	public boolean personnelModify(CimPersonnel cimPersonnel, int dep_id) {
		personnelDao = new PersonnelDaoImpl();

		if (personnelDao.personnelModify(cimPersonnel, dep_id))
			return true;
		return false;
	}

	@Override
	public List<CimPersonnel> personnelShow() {
		personnelDao = new PersonnelDaoImpl();

		return personnelDao.personnelShow();
	}

	@Override
	public boolean validate(String userid, String password) {
		personnelDao = new PersonnelDaoImpl();

		CimPersonnel cimPersonnel = personnelDao.getByName(userid);

		if (cimPersonnel == null)
			return false;
		if (cimPersonnel.getPersonnelPwd().equals(password))
			return true;
		return false;
	}

	@Override
	public boolean isAdmin(String userid) {
		personnelDao = new PersonnelDaoImpl();
		
		return personnelDao.isAdmin(userid);
	}

	@Override
	public CimPersonnel personnelSearch(int id) {
		personnelDao = new PersonnelDaoImpl();
		
		return personnelDao.personnelSearch(id);
	}

}
