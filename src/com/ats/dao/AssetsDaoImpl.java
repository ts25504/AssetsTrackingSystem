package com.ats.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ats.domain.CimDepartment;
import com.ats.domain.CimPersonnel;
import com.ats.domain.FamAssets;
import com.ats.domain.FamPurchase;

public class AssetsDaoImpl implements AssetsDao {
	private Configuration config = new Configuration().configure();
	private SessionFactory sf = config.buildSessionFactory();
	private Session session = sf.openSession();
	private Transaction ts = session.beginTransaction();

	@Override
	public boolean assetsAdd(FamAssets famAssets, int dep_id, int personnel_id,
			int pur_id) {

		CimDepartment cimDepartment = (CimDepartment) session.get(
				CimDepartment.class, dep_id);
		CimPersonnel cimPersonnel = (CimPersonnel) session.get(
				CimPersonnel.class, personnel_id);
		FamPurchase famPurchase = (FamPurchase) session.get(FamPurchase.class,
				pur_id);

		if (cimDepartment == null
				|| cimPersonnel == null
				|| famPurchase == null
				|| cimPersonnel.getCimDepartment().getId() != cimDepartment
						.getId()) {
			return false;
		}
		famAssets.setCimDepartment(cimDepartment);
		famAssets.setCimPersonnel(cimPersonnel);
		famAssets.setFamPurchase(famPurchase);

		session.save(famAssets);
		ts.commit();
		return true;
	}

	@Override
	public boolean assetsDelete(int id) {
		FamAssets famAssets = (FamAssets) session.get(FamAssets.class, id);

		if (famAssets == null)
			return false;
		session.delete(famAssets);
		ts.commit();
		return true;
	}

	@Override
	public boolean assetsModify(FamAssets famAssets, int dep_id,
			int personnel_id, int pur_id) {
		CimDepartment cimDepartment = (CimDepartment) session.get(
				CimDepartment.class, dep_id);
		CimPersonnel cimPersonnel = (CimPersonnel) session.get(
				CimPersonnel.class, personnel_id);
		FamPurchase famPurchase = (FamPurchase) session.get(FamPurchase.class,
				pur_id);
		FamAssets result = (FamAssets) session.get(FamAssets.class,
				famAssets.getId());

		if (cimPersonnel.getCimDepartment().getId() != cimDepartment.getId())
			return false;

		if (result == null)
			return false;

		if (!famAssets.getAssetsName().isEmpty())
			result.setAssetsName(famAssets.getAssetsName());
		if (!famAssets.getAssetsPrice().isEmpty())
			result.setAssetsPrice(famAssets.getAssetsPrice());
		if (!famAssets.getAssetsStatus().isEmpty())
			result.setAssetsStatus(famAssets.getAssetsStatus());
		if (!famAssets.getAssetsTime().isEmpty())
			result.setAssetsTime(famAssets.getAssetsTime());
		if (!famAssets.getAssetsType().isEmpty())
			result.setAssetsType(famAssets.getAssetsType());
		if (famAssets.getCimDepartment() != null)
			result.setCimDepartment(cimDepartment);
		if (famAssets.getCimPersonnel() != null)
			result.setCimPersonnel(cimPersonnel);
		if (famAssets.getFamPurchase() != null)
			result.setFamPurchase(famPurchase);

		session.save(famAssets);
		ts.commit();
		return true;
	}

	@Override
	public List<FamAssets> assetsShow() {
		Criteria criteria = session.createCriteria(FamAssets.class);
		List<FamAssets> list = criteria.list();

		return list;
	}

	@Override
	public FamAssets assetsSearch(int id) {
		FamAssets result = (FamAssets) session.get(FamAssets.class, id);

		return result;
	}
}
