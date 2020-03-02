package com.cts.training.service;

import java.util.List;


import com.cts.training.model.Register;

public interface RegisterService 
{
	//public RegisterDTO insert(RegisterDTO pd);
	public String addUser(Register user);
    public void deleteUser(int id);
    public Register updateUser(Register user);
    public List<Register> getAllUsers();
    public Register getUserById(int id);

}
