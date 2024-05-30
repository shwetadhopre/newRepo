package com.spring.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CustomerDetails 
{
	@Id
	private int csid;
	private String csname;
	private String csEmail;
	private long csmobno;
	private String address;
	public int getCsid() {
		return csid;
	}
	public void setCsid(int csid) {
		this.csid = csid;
	}
	public String getCsname() {
		return csname;
	}
	public void setCsname(String csname) {
		this.csname = csname;
	}
	public String getCsEmail() {
		return csEmail;
	}
	public void setCsEmail(String csEmail) {
		this.csEmail = csEmail;
	}
	public long getCsmobno() {
		return csmobno;
	}
	public void setCsmobno(long csmobno) {
		this.csmobno = csmobno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}
