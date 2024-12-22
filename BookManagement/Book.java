package com.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
	
	@Id
	private int bid;
	private String bname;
	private double bprice;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int bid, String bname, double bprice) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bprice = bprice;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public double getBprice() {
		return bprice;
	}

	public void setBprice(double bprice) {
		this.bprice = bprice;
	}
	
	

}
