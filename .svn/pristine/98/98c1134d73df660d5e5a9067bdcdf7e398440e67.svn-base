package com.ats.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.ats.domain.FamAssets;
import com.ats.service.AssetsService;
import com.ats.service.AssetsServiceImpl;

public class AssetsAction {
	private FamAssets famAssets;
	private AssetsService assetsService;
	private Integer id;

	private int dep_id;
	private int personnel_id;
	private int pur_id;
	private String assetsName;
	private String assetsType;
	private String assetsPrice;

	public FamAssets getFamAssets() {
		return famAssets;
	}

	public AssetsService getAssetsService() {
		return assetsService;
	}

	public Integer getId() {
		return id;
	}

	public int getDep_id() {
		return dep_id;
	}

	public int getPersonnel_id() {
		return personnel_id;
	}

	public int getPur_id() {
		return pur_id;
	}

	public String getAssetsName() {
		return assetsName;
	}

	public String getAssetsType() {
		return assetsType;
	}

	public String getAssetsPrice() {
		return assetsPrice;
	}

	public String getAssetsTime() {
		return assetsTime;
	}

	public String getAssetsStatus() {
		return assetsStatus;
	}

	private String assetsTime;
	private String assetsStatus;

	public void setFamAssets(FamAssets famAssets) {
		this.famAssets = famAssets;
	}

	public void setAssetsService(AssetsService assetsService) {
		this.assetsService = assetsService;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setDep_id(int dep_id) {
		this.dep_id = dep_id;
	}

	public void setPersonnel_id(int personnel_id) {
		this.personnel_id = personnel_id;
	}

	public void setPur_id(int pur_id) {
		this.pur_id = pur_id;
	}

	public void setAssetsName(String assetsName) {
		this.assetsName = assetsName;
	}

	public void setAssetsType(String assetsType) {
		this.assetsType = assetsType;
	}

	public void setAssetsPrice(String assetsPrice) {
		this.assetsPrice = assetsPrice;
	}

	public void setAssetsTime(String assetsTime) {
		this.assetsTime = assetsTime;
	}

	public void setAssetsStatus(String assetsStatus) {
		this.assetsStatus = assetsStatus;
	}

	public String add() {
		assetsService = new AssetsServiceImpl();

		famAssets = new FamAssets(null, null, null, assetsName, assetsType,
				assetsPrice, assetsTime, assetsStatus);

		if (assetsService.assetsAdd(famAssets, dep_id, personnel_id, pur_id)) {
			return "SUCCESS";
		} else {
			return "FAILED";
		}
	}

	public String delete() {
		assetsService = new AssetsServiceImpl();

		if (id == null)
			return "FAILED";
		if (assetsService.assetsDelete(id)) {
			return "SUCCESS";
		} else {
			return "FAILED";
		}
	}

	public String modify() {
		assetsService = new AssetsServiceImpl();

		famAssets = new FamAssets(null, null, null, assetsName, assetsType,
				assetsPrice, assetsTime, assetsStatus);
		
		if (id == null)
			return "FAILED";
		
		famAssets.setId(id);

		if (assetsService.assetsModify(famAssets, dep_id, personnel_id, pur_id)) {
			return "SUCCESS";
		} else {
			return "FAILED";
		}
	}

	public String search() {
		assetsService = new AssetsServiceImpl();
		HttpServletRequest request = ServletActionContext.getRequest();
		
		if (id == null)
			return "FAILED";
		
		FamAssets list = assetsService.assetsSearch(id);
		request.setAttribute("list", list);
		return "SHOW";
	}
	
	public String show() {
		assetsService = new AssetsServiceImpl();
		HttpServletRequest request = ServletActionContext.getRequest();
		List<FamAssets> list = assetsService.assetsShow();

		request.setAttribute("list", list);
		return "SHOW";
	}
}
