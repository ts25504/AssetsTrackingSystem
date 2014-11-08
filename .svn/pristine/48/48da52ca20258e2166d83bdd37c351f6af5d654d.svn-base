package com.ats.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ats.domain.FamAssets;
import com.ats.domain.FamPurchase;

public class PurchaseDaoImpl implements PurchaseDao {
	private Configuration config = new Configuration().configure();
	private SessionFactory sf = config.buildSessionFactory();
	private Session session = sf.openSession();
	private Transaction ts = session.beginTransaction();

	@Override
	public boolean purchaseAdd(FamPurchase famPurchase) {
		session.save(famPurchase);
		ts.commit();
		return true;
	}

	@Override
	public boolean purchaseDelete(int id) {
		FamPurchase famPurchase = (FamPurchase) session.get(FamPurchase.class,
				id);
		Criteria criteria = session.createCriteria(FamAssets.class);
		List<FamAssets> famAssetsList = criteria.list();

		if (famPurchase == null)
			return false;
		
		for (FamAssets famAssets : famAssetsList)
			if (famAssets.getFamPurchase().getId() == id)
				return false;
				
		session.delete(famPurchase);
		ts.commit();
		return true;
	}


	@Override
	public boolean purchaseModify(FamPurchase famPurchase) {
		FamPurchase result = (FamPurchase) session.get(FamPurchase.class,
				famPurchase.getId());
		if (result == null)
			return false;
		
		result.setPurchase(famPurchase.getPurchase());
		session.update(result);
		ts.commit();

		return true;
	}

	@Override
	public List<FamPurchase> purchaseShow() {
		Criteria criteria = session.createCriteria(FamPurchase.class);
		List<FamPurchase> list = criteria.list();

		return list;
	}

	@Override
	public FamPurchase purchaseSearch(int id) {
		FamPurchase result = (FamPurchase) session.get(FamPurchase.class, id);
		
		return result;
	}
}
