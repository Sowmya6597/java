package com.cts.training.model;

import java.io.Serializable;

public class AccountEntity implements Serializable {
	private static final long serialVersionUID = -7465032086641800357L;
	private int id;
	private long  balance;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getBalance() {
		return balance;
		}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "AccountEntity [id=" + id + ", balance=" + balance + "]";
	}
	

}
