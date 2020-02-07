package com.cts.training.model;

import java.io.Serializable;

public class FundTransferEntity implements Serializable {
	private static final long serialVersionUID = -2922287304275836114L;
	
	private int id;
	private String receivername;
	private String receiveracno;
	private long recphone;
	private double ramount;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getRamount() {
		return ramount;
	}

	public void setRamount(double ramount) {
		this.ramount = ramount;
	}
public String getReceivername() {
		return receivername;
	}
	public void setReceivername(String receivername) {
		this.receivername = receivername;
	}
	public String getReceiveracno() {
		return receiveracno;
	}
	public void setReceiveracno(String receiveracno) {
		this.receiveracno = receiveracno;
	}
	public long getRecphone() {
		return recphone;
	}
	public void setRecphone(long recphone) {
		this.recphone = recphone;
	}

	@Override
	public String toString() {
		return "FundTransferEntity [id=" + id + ", receivername=" + receivername + ", receiveracno=" + receiveracno
				+ ", recphone=" + recphone + ", ramount=" + ramount + "]";
	}
	
	

}
