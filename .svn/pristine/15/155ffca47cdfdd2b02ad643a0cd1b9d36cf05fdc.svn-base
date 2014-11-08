package com.ats.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ats.domain.CimPersonnel;
import com.ats.domain.FamAssets;
import com.ats.domain.SrfPersonnelform;

public class PersonnelformDaoImpl implements PersonnelformDao {
	private Configuration config = new Configuration().configure();
	private SessionFactory sf =  config.buildSessionFactory();
	private Session session = sf.openSession();

	@Override
	public List<SrfPersonnelform> personnelformShow() {
		Criteria criteria = session.createCriteria(CimPersonnel.class);
		List<CimPersonnel> cimPersonnelList = criteria.list();
		criteria = session.createCriteria(FamAssets.class);
		List<FamAssets> famAssetsList = criteria.list();
		
		List<SrfPersonnelform> list = new ArrayList();
		int count;
		int price;

		for (CimPersonnel cimPersonnel : cimPersonnelList) {
			count = 0;
			price = 0;
			SrfPersonnelform srfPersonnelform = new SrfPersonnelform();
			srfPersonnelform.setPersonnelId(cimPersonnel.getId());
			for (FamAssets famAssets : famAssetsList) {
				if (famAssets.getCimPersonnel().getId() == cimPersonnel.getId()) {
					count++;
					price = price + Integer.parseInt(famAssets.getAssetsPrice());
				}
			}
			srfPersonnelform.setAssetsCount(count);
			srfPersonnelform.setAssetsMoney(price);
			list.add(srfPersonnelform);
		}
		return list;
	}

}
