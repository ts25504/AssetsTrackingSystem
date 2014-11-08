package com.ats.service;

import java.util.List;

import com.ats.dao.PurchaseDao;
import com.ats.dao.PurchaseDaoImpl;
import com.ats.domain.FamPurchase;

public class PurchaseServiceImpl implements PurchaseService {
	private PurchaseDao purchaseDao;
	
	@Override
	public boolean purchaseAdd(FamPurchase famPurchase) {
		purchaseDao = new PurchaseDaoImpl();
		
		if (purchaseDao.purchaseAdd(famPurchase))
			return true;
		return false;
	}

	@Override
	public boolean purchaseDelete(int id) {
		purchaseDao = new PurchaseDaoImpl();
		
		if (purchaseDao.purchaseDelete(id))
			return true;
		return false;
	}

	@Override
	public boolean purchaseModify(FamPurchase famPurchase) {
		purchaseDao = new PurchaseDaoImpl();
		
		if (purchaseDao.purchaseModify(famPurchase))
			return true;
		return false;
	}

	@Override
	public List<FamPurchase> purchaseShow() {
		purchaseDao = new PurchaseDaoImpl();
		
		return purchaseDao.purchaseShow();
	}

	@Override
	public FamPurchase purchaseSearch(int id) {
		purchaseDao = new PurchaseDaoImpl();
		
		return purchaseDao.purchaseSearch(id);
	}
}
