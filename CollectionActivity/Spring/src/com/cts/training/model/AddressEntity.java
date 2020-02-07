package com.cts.training.model;

public class AddressEntity { 
	private int id;
	private String housenumber;
	private String street;
	private String city;
	private String State;
	public int getId() {
		return id;
	}
	
	public AddressEntity() {
		super();
	}

	public AddressEntity(int id, String housenumber, String street, String city, String state) {
		super();
		this.id = id;
		this.housenumber = housenumber;
		this.street = street;
		this.city = city;
		this.State = State;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getHousenumber() {
		return housenumber;
	}
	public void setHousenumber(String housenumber) {
		this.housenumber = housenumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}

}
