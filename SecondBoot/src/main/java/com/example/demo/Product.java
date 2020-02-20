package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
@Entity
@Table(name = "prod")
@XmlRootElement(name="item")
public class Product {
	@Id 
	@GeneratedValue
	private Integer id;
	private String description;
	private int price;
	public Product() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
