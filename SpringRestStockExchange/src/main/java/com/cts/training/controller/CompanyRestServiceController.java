/*
 * package com.cts.training.controller;
 * 
 * import java.util.List; import java.util.Optional;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.http.MediaType; import
 * org.springframework.web.bind.annotation.CrossOrigin; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestMethod; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.cts.training.model.Company; import
 * com.cts.training.repo.CompanyRepo;
 * 
 * @CrossOrigin(origins="*")
 * 
 * @RestController public class CompanyRestServiceController {
 * 
 * @Autowired CompanyRepo rr;
 * 
 * @RequestMapping(value="/company", method= RequestMethod.GET,produces =
 * MediaType.APPLICATION_JSON_VALUE) public List<Company> findAll(){ return
 * rr.findAll(); }
 * 
 * @RequestMapping(value="/company/{id}", method= RequestMethod.GET,produces =
 * MediaType.APPLICATION_JSON_VALUE) public Company findone(@PathVariable int
 * id){ Optional<Company> com = rr.findById(id); Company r = com.get(); return
 * r; }
 * 
 * @RequestMapping(value="/company", method= RequestMethod.POST) public Company
 * save(@RequestBody Company com){
 * //System.out.println("save..."+com.getCompanyname()); Company company =
 * rr.save(com); return company; }
 * 
 * @RequestMapping(value="/company/{id}", method= RequestMethod.DELETE) public
 * void delete(@PathVariable int id){ rr.deleteById(id); }
 * 
 * @RequestMapping(value = "/company", method = RequestMethod.PUT) public
 * Company update(@RequestBody Company com) { Company company = rr.save(com);
 * return company; } }
 * 
 * 
 */

package com.cts.training.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.DTO.CompanyDTO;
import com.cts.training.model.Company;
import com.cts.training.repo.CompanyRepo;
import com.cts.training.service.CompanyService;

@RestController
@CrossOrigin(origins = "*")
public class CompanyRestServiceController {
	@Autowired
	CompanyRepo rr;
	@Autowired
	CompanyService rs;
	@Autowired
	JavaMailSender jms;

	@RequestMapping(value="/company", method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
//	public List<Company> findAll(){
//		return companyRepo.findAll();
//		
//	}
	public ResponseEntity<?> getAllCompanies(){
		List<Company> list = rs.getAllCompanies();
		if(list.size()>0) {
			return new ResponseEntity<List<Company>>(list, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("No users found",HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "/company/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Company findone(@PathVariable int id) {
		Optional<Company> reg = rr.findById(id);
		Company r = reg.get();
		return r;
	}

	@RequestMapping(value="/company", method= RequestMethod.POST)
	public Company save(@RequestBody Company com){
		Company company = rr.save(com);
		return company;
	}
	@RequestMapping(value = "/company/{id}", method = RequestMethod.DELETE)
	public void deleteCompany(@PathVariable int id) {
		rr.deleteById(id);
	}

	@RequestMapping(value = "/company", method = RequestMethod.PUT)
	public Company update(@RequestBody Company reg) {
		Company user = rs.updateCompany(reg);
		return user;
	}

}