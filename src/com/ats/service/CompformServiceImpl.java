package com.ats.service;

import com.ats.dao.CompformDao;
import com.ats.dao.CompformDaoImpl;
import com.ats.domain.SrfCompanyform;

public class CompformServiceImpl implements CompformService {
	private CompformDao compformDao;
	
	@Override
	public SrfCompanyform compformShow() {
		compformDao = new CompformDaoImpl();
		
		return compformDao.compformShow();
	}

}
