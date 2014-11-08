package com.ats.service;

import java.util.List;

import com.ats.dao.AssetsDao;
import com.ats.dao.AssetsDaoImpl;
import com.ats.domain.FamAssets;

public class AssetsServiceImpl implements AssetsService {

	private AssetsDao assetsDao;

	@Override
	public boolean assetsAdd(FamAssets famAssets, int dep_id, int personnel_id,
			int pur_id) {
		assetsDao = new AssetsDaoImpl();

		if (assetsDao.assetsAdd(famAssets, dep_id, personnel_id, pur_id))
			return true;
		return false;
	}

	@Override
	public boolean assetsDelete(int id) {
		assetsDao = new AssetsDaoImpl();

		if (assetsDao.assetsDelete(id))
			return true;
		return false;
	}

	@Override
	public boolean assetsModify(FamAssets famAssets, int dep_id,
			int personnel_id, int pur_id) {
		assetsDao = new AssetsDaoImpl();

		if (assetsDao.assetsModify(famAssets, dep_id, personnel_id, pur_id))
			return true;
		return false;
	}

	@Override
	public List<FamAssets> assetsShow() {
		assetsDao = new AssetsDaoImpl();

		return assetsDao.assetsShow();

	}

	@Override
	public FamAssets assetsSearch(int id) {
		assetsDao = new AssetsDaoImpl();
		
		return assetsDao.assetsSearch(id);
	}
}
