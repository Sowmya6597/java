package com.cts.training.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.model.StockExchange;
import com.cts.training.repo.StockExchangeRepo;

@CrossOrigin(origins="*")
@RestController
public class StockExchaneRestController {
	@Autowired
	StockExchangeRepo rr;
	@RequestMapping(value="/stock", method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<StockExchange> findAll(){
		return rr.findAll();
	}
	
	@RequestMapping(value="/stock/{id}", method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public StockExchange findone(@PathVariable int id){
		Optional<StockExchange> sto = rr.findById(id);
	StockExchange r = sto.get();
		return r;
	}
	@RequestMapping(value="/stock", method= RequestMethod.POST)
	public StockExchange save(@RequestBody StockExchange com){
		//System.out.println("save..."+com.getCompanyname());
		StockExchange company = rr.save(com);
		return company;
	}
	@RequestMapping(value="/stock/{id}", method= RequestMethod.DELETE)
	public void    delete(@PathVariable int id){
		rr.deleteById(id);
	}
	@RequestMapping(value = "/stock", method = RequestMethod.PUT)
	public StockExchange update(@RequestBody StockExchange com) {
		StockExchange company = rr.save(com);
		return company;
	}
}




