package com.cts.training.model;

import java.io.Serializable;

public class CustomerEntity implements Serializable{

	private static final long serialVersionUID = -1162935953193855411L;
	private int id;
	private String name;
	private String address;
	private long phone;
	private String accountnumber;
	private String bankname;
	private AccountEntity account;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	public String getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	@Override
	public String toString() {
		return "CustomerEntity [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone
				+ ", accountnumber=" + accountnumber + ", bankname=" + bankname + "]";
	}
	
	
	

}
