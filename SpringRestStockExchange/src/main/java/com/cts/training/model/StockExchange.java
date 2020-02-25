package com.cts.training.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
@Entity
@Table(name="stockexchange")
@XmlRootElement (name="sto")
public class StockExchange implements Serializable {
	
	private static final long serialVersionUID = -8821827642583307350L;
	@Id
	@GeneratedValue
	private int id;
	private String stock;
	private String brief;
	private String  address;
	private String remarks;
	
	public StockExchange() {
		super();
	}
	public StockExchange(int id, String stock, String brief, String address, String remarks) {
		super();
		this.id = id;
		this.stock = stock;
		this.brief = brief;
		this.address = address;
		this.remarks = remarks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "StockExchange [id=" + id + ", stock=" + stock + ", brief=" + brief + ", address=" + address
				+ ", remarks=" + remarks + "]";
	}
	

}
