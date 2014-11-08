package com.ats.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ats.domain.CimDepartment;
import com.ats.domain.CimPersonnel;
import com.ats.domain.FamAssets;
import com.ats.domain.SrfDepartureform;
import com.ats.domain.SrfPersonnelform;

public class DepformDaoImpl implements DepformDao {
	private Configuration config = new Configuration().configure();
	private SessionFactory sf =  config.buildSessionFactory();
	private Session session = sf.openSession();
	
	@Override
	public List<SrfDepartureform> depformShow() {
		Criteria criteria = session.createCriteria(CimDepartment.class);
		List<CimDepartment> cimDepartmentList = criteria.list();
		criteria = session.createCriteria(FamAssets.class);
		List<FamAssets> famAssetsList = criteria.list();
		
		List<SrfDepartureform> list = new ArrayList();
		int count;
		int price;

		for (CimDepartment cimDepartment : cimDepartmentList) {
			count = 0;
			price = 0;
			SrfDepartureform srfDepartureform = new SrfDepartureform();
			srfDepartureform.setDepId(cimDepartment.getId());
			for (FamAssets famAssets : famAssetsList) {
				if (famAssets.getCimDepartment().getId() == cimDepartment.getId()) {
					count++;
					price = price + Integer.parseInt(famAssets.getAssetsPrice());
				}
			}
			srfDepartureform.setAssetsCount(count);
			srfDepartureform.setAssetsMoney(price);
			list.add(srfDepartureform);
		}
		return list;
	}
}
