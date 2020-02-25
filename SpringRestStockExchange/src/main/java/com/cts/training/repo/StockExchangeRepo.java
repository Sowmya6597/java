package com.cts.training.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.training.model.Company;

public interface StockExchangeRepo extends JpaRepository<Company, Integer> {

}
