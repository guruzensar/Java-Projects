package com.zensar.training.bean.pack6;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;


public class CustomerRating {
	
	
	private int id;
	private String ratedBy;
	
	
	Map<String, Customer> customerRating=new HashMap<>();
	public CustomerRating(String ratedBy) {
		super();
		this.ratedBy = ratedBy;
	}
	public CustomerRating() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRatedBy() {
		return ratedBy;
	}
	public void setRatedBy(String ratedBy) {
		this.ratedBy = ratedBy;
	}
	public Map<String, Customer> getCustomerRating() {
		return customerRating;
	}
	public void setCustomerRating(Map<String, Customer> customerRating) {
		this.customerRating = customerRating;
	}
	@Override
	public String toString() {
		return "CustomerRating [id=" + id + ", ratedBy=" + ratedBy + ", customerRating=" + customerRating + "]";
	}
	
	
}
