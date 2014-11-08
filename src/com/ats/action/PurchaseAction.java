package com.ats.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.ats.domain.FamPurchase;
import com.ats.service.PurchaseService;
import com.ats.service.PurchaseServiceImpl;

public class PurchaseAction {
	private FamPurchase famPurchase;
	private PurchaseService purchaseService;

	private Integer id;
	private String purchase;

	public void setFamPurchase(FamPurchase famPurchase) {
		this.famPurchase = famPurchase;
	}

	public void setPurchaseService(PurchaseService purchaseService) {
		this.purchaseService = purchaseService;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setPurchase(String purchase) {
		this.purchase = purchase;
	}


	public String add() {
		purchaseService = new PurchaseServiceImpl();

		famPurchase = new FamPurchase(purchase, null);
		
		if (purchaseService.purchaseAdd(famPurchase)) {
			return "SUCCESS";
		} else {
			return "FAILED";
		}
	}
	
	public String delete() {
		purchaseService = new PurchaseServiceImpl();
	
		if (id == null)
			return "FAILED";
		if (purchaseService.purchaseDelete(id)) {
			return "SUCCESS";
		} else {
			return "FAILED";
		}
	}
	
	public String modify() {
		purchaseService = new PurchaseServiceImpl();
		
		if (id == null)
			return "FAILED";
		famPurchase = new FamPurchase(purchase, null);
		famPurchase.setId(id);
		
		if (purchaseService.purchaseModify(famPurchase)) {
			return "SUCCESS";
		} else {
			return "FAILED";
		}
	}
	
	public String search() {
		purchaseService = new PurchaseServiceImpl();
		HttpServletRequest request = ServletActionContext.getRequest();
		
		if (id == null)
			return "FAILED";
		
		FamPurchase list = purchaseService.purchaseSearch(id);
		request.setAttribute("list", list);
		return "SHOW";
	}
	
	public String show() {
		purchaseService = new PurchaseServiceImpl();
		HttpServletRequest request = ServletActionContext.getRequest();
		List<FamPurchase> list = purchaseService.purchaseShow();
		
		request.setAttribute("list", list);
		return "SHOW";
	}
}
