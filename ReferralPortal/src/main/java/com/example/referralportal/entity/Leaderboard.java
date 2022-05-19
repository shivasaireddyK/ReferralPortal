package com.example.referralportal.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Leaderboard")
public class Leaderboard {
	
	@Id
	private Long empid;
	private String empname;
	private int noofref;
	
	
	public Leaderboard() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Long getEmpid() {
		return empid;
	}
	public void setEmpid(Long empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getNoofref() {
		return noofref;
	}
	public void setNoofref(int noofref) {
		this.noofref = noofref;
	}

	@Override
	public String toString() {
		return "Leaderboard [empid=" + empid + ", empname=" + empname + ", noofref=" + noofref + "]";
	}
	
	

}
