package com.cts.training.ServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.cts.training.model.Company;
import com.cts.training.repo.CompanyRepo;
import com.cts.training.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService {
	@Autowired
	CompanyRepo pr;
	@Autowired
	JavaMailSender jsm;
	@Override
	public Company addCompany(Company com) {
		Company company = new Company();
		BeanUtils.copyProperties(com, company);
		pr.save(company);
		return company;
	}


	@Override
	public List<Company> getAllCompanies(){
		List<Company> entities = pr.findAll();
		List<Company> companies = new ArrayList<Company>();
		for(Company entity: entities) {
			Company company = new Company();
			BeanUtils.copyProperties(entity, company);
			companies.add(company);
		}
		System.out.println("Entity: "+entities);
		System.out.println("DTO: "+companies);
		return companies;
	}
	@Override
	public void deleteCompany(int id) {
		pr.deleteById(id);
	}

	@Override
	public Company getCompanyById(int id) {
		Optional<Company> companies = pr.findById(id);
		Company company = new Company();
		BeanUtils.copyProperties(companies.orElse(new Company()), company);
		return company;
	}
	@Override
	public Company updateCompany(Company regDTO) {
		Company reg = new Company();
		BeanUtils.copyProperties(regDTO, reg);
		pr.save(reg);
		return regDTO;
	}
}



