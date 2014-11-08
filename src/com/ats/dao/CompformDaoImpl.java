package com.ats.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ats.domain.FamAssets;
import com.ats.domain.SrfCompanyform;

public class CompformDaoImpl implements CompformDao {
	private Configuration config = new Configuration().configure();
	private SessionFactory sf =  config.buildSessionFactory();
	private Session session = sf.openSession();
	
	@Override
	public SrfCompanyform compformShow() {
		Criteria criteria = session.createCriteria(FamAssets.class);
		List<FamAssets> famAssetsList = criteria.list();
		SrfCompanyform srfCompanyform = new SrfCompanyform();
		
		int count = 0;
		int price = 0;
		
		for (FamAssets famAssets : famAssetsList) {
			count++;
			price = price + Integer.parseInt(famAssets.getAssetsPrice());
		}
		
		srfCompanyform.setAssetsCount(count);
		srfCompanyform.setAssetsMoney(price);	
		
		return srfCompanyform;
	}
}
