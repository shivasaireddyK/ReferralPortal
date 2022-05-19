package com.example.referralportal.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Job")
public class Job {
	
	@Id
	private Long jobid;
	private String posname;
	private String skill;
	private String quali;
	private String exp;
	
	
	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Long getJobid() {
		return jobid;
	}
	public void setJobid(Long jobid) {
		this.jobid = jobid;
	}
	public String getPosname() {
		return posname;
	}
	public void setPosname(String posname) {
		this.posname = posname;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getQuali() {
		return quali;
	}
	public void setQuali(String quali) {
		this.quali = quali;
	}
	public String getExp() {
		return exp;
	}
	public void setExp(String exp) {
		this.exp = exp;
	}
	
	
	@Override
	public String toString() {
		return "Job [jobid=" + jobid + ", posname=" + posname + ", skill=" + skill + ", quali=" + quali + ", exp=" + exp
				+ "]";
	}
		

}
