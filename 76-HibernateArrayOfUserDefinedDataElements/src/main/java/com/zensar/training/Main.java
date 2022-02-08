package com.zensar.training;

import java.time.LocalDate;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zensar.training.bean.Bill;
import com.zensar.training.bean.BillItem;
import com.zensar.training.util.HibernateUtil;

public class Main {

	static void insertTesting() {
		Bill bill=new Bill("ABC Traders", LocalDate.of(2020, 6, 10),3);
		BillItem item1=new BillItem(1, "Product1", 2, 25.0);
		BillItem item2=new BillItem(2, "Product2", 6, 50.0);
		BillItem item3=new BillItem(3, "Product3", 4, 75.0);
		bill.addBillItem(item1);
		bill.addBillItem(item2);
		bill.addBillItem(item3);
		
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		Transaction transaction=session.beginTransaction();
		
		session.save(bill);
		
		transaction.commit();
		System.out.println("Bill Saved");
	}
	
	public static void main(String[] args) {
		
		insertTesting();
	}

}
