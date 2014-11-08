package com.ats.service;

import java.util.List;

import com.ats.dao.DepformDao;
import com.ats.dao.DepformDaoImpl;
import com.ats.domain.SrfDepartureform;

public class DepformServiceImpl implements DepformService {
	private DepformDao depformDao;
	
	@Override
	public List<SrfDepartureform> depformShow() {
		depformDao = new DepformDaoImpl();
		
		return depformDao.depformShow();
	}

}
