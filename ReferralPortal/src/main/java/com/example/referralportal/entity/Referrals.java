package com.example.referralportal.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Referrals")
public class Referrals {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long refid;
	private String empid;
	private String candname;
	private String jobid;
	private String status = null;
	private String level = null;
	private String msg = null;
	
	
	


	public Referrals() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Long getRefid() {
		return refid;
	}
	public void setRefid(Long refid) {
		this.refid = refid;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getCandname() {
		return candname;
	}
	public void setCandname(String candname) {
		this.candname = candname;
	}
	public String getJobid() {
		return jobid;
	}
	public void setJobid(String jobid) {
		this.jobid = jobid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}


	@Override
	public String toString() {
		return "Referrals [refid=" + refid + ", empid=" + empid + ", candname=" + candname + ", jobid=" + jobid
				+ ", status=" + status + ", level=" + level + ", msg=" + msg + "]";
	}
	
	
	
	
	
	
}
