package com.cts.training.service;

import java.util.List;

import com.cts.training.model.Company;

public interface CompanyService {
	public Company addCompany(Company company);

	public void deleteCompany(int id);

	public Company updateCompany(Company company);

	public List<Company> getAllCompanies();

	public Company getCompanyById(int id);

}
