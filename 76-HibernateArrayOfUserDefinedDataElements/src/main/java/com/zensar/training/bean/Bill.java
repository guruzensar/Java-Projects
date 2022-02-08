package com.zensar.training.bean;

import java.time.LocalDate;
import java.util.Arrays;

import java.util.LinkedList;
import java.util.List;

public class Bill {
	int id;
	String customerName;
	LocalDate billingDate;
	BillItem[] billItems;
	int index;
	
	public Bill(String customerName, LocalDate billingDate,int size) {
		super();
		this.customerName = customerName;
		this.billingDate = billingDate;
		this.billItems=new BillItem[size];
	}

	public Bill() {
		super();
		
	}
	
	public void addBillItem(BillItem billItem){
		this.billItems[index++]=billItem;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public LocalDate getBillingDate() {
		return billingDate;
	}

	public void setBillingDate(LocalDate billingDate) {
		this.billingDate = billingDate;
	}

	public BillItem[] getBillItems() {
		return billItems;
	}

	public void setBillItems(BillItem[] billItems) {
		this.billItems = billItems;
	}

	@Override
	public String toString() {
		return "Bill [id=" + id + ", customerName=" + customerName + ", billingDate=" + billingDate + ", billItems="
				+ Arrays.toString(billItems) + "]";
	}
	
	
	
}
