package com.ats.service;

import java.util.List;

import com.ats.dao.PersonnelformDao;
import com.ats.dao.PersonnelformDaoImpl;
import com.ats.domain.SrfPersonnelform;

public class PersonnelformServiceImpl implements PersonnelformService {
	private PersonnelformDao personnelformDao;
	
	@Override
	public List<SrfPersonnelform> personnelformShow() {
		personnelformDao = new PersonnelformDaoImpl();
	
		return personnelformDao.personnelformShow();
	}

}
