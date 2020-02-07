package com.cts.training.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;
@Component
public class UserEntity implements Serializable {
	private static final long serialVersionUID = 6919280827568879605L;
	private int id;
	private Set<String> username;
	private String password;
	private List<String> email;
	private long phone;
	private boolean enabled;
	private AddressEntity address;
	
	public UserEntity(int id, Set<String> username, String password, List<String> email, long phone, boolean enabled,
			AddressEntity address) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.enabled = enabled;
		this.address = address;
	}
	public void setAddress(AddressEntity address) {
		this.address = address;
	}
	public UserEntity()
	{
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Set<String> getUsername() {
		return username;
	}
	public void setUsername(Set<String> username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<String> getEmail() {
		return email;
	}
	public void setEmail(List<String> email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public boolean enabled() {
		return enabled;
	}
	public void setEnabled(boolean isEnabled) {
		this.enabled = enabled;
	}
	public AddressEntity getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", phone=" + phone + ", isEnabled=" + enabled + "]";
	}
	
	

}
