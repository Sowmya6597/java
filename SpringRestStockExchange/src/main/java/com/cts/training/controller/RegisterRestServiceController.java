
package com.cts.training.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
//import org.springframework.http.HttpStatus;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
//import org.springframework.http.ResponseEntity;
//import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.cts.training.model.Register;
import com.cts.training.repo.RegisterRepo;
import com.cts.training.service.RegisterService;
@RestController
@CrossOrigin(origins="*")
public class RegisterRestServiceController {
////	@Value("${welcome.message}")
////	String welcomemsg;
	@Autowired
	RegisterRepo rr;
	@Autowired
	RegisterService rs;
	@Autowired
	JavaMailSender jms;
	@GetMapping("/register")
	public ResponseEntity<?> getAllUsers(){
		List<Register> user=rs.getAllUsers();
		if(user.size()>0) {
			return new ResponseEntity<List<Register>>(user, HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("No users in the list", HttpStatus.NOT_FOUND);
		}
	}
	@RequestMapping(value="/register/{id}", method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Register findone(@PathVariable int id)
	{
	   Optional<Register> reg = rr.findById(id);
	   Register r = reg.get();
	   return r;
	}
	@RequestMapping(value="/register", method= RequestMethod.POST)
	public String save(@RequestBody Register reg) {
//		RegisterDTO user;
		String usermail;
		usermail=rs.addUser(reg);
		return usermail;
//		try {
//			SimpleMailMessage sm = new SimpleMailMessage();
//			sm.setFrom("tanusreevidya13@gmail.com");
//			sm.setTo(reg.getEmail());
//			usermail=reg.getEmail();
//			if(rr.findByEmail(usermail)!= null) {
//				return "{\"res\":\"0\"}";
//			}
//			else {
//				user=rs.insert(reg);
//			sm.setSubject("testing mail...");
//			sm.setText("Account created click on 'http://localhost:4200/activate?" + user.getEmail()
//					+ "'");
//			jms.send(sm);
////			sm.setText("Account created click on <a href='http://localhost:4200/registerUser/activate?'>Click</a>");
////			jms.send(sm);			
//			System.out.println("sending mail...");
//			return "{\"res\":\"1\"}";
//		}
//		}catch (Exception e) {
//			e.printStackTrace();
//			return "{\"res\":\"2\"}";
//		}
	}
////	public ResponseEntity<RegisterDTO> save(@RequestBody RegisterDTO reg)
////	{
////		rs.insert(reg);
////		return new ResponseEntity<RegisterDTO>(reg,HttpStatus.CREATED);		
////	}
////	public Register save(@RequestBody Register reg){
////		Register register = rr.save(reg);
////		
////		try {
////			SimpleMailMessage sm = new SimpleMailMessage();
////			sm.setFrom("tanusreevidya13@gmail.com");
////			sm.setTo("tanusreevidya13@gmail.com");
////			sm.setSubject("testing mail...");
////			sm.setText("Account created click on <a href='http://localhost:4200/activate?"+register.getEmail()+"'>Click</a>");
////			jms.send(sm);
////			System.out.println("sending mail...");
////		}
////		catch (Exception e){
////			e.printStackTrace();
////		}
//////		return "{\"reg\":\"ok\"}";
////		register.setActive("yes");
////		return register;
////		}
//
	@RequestMapping(value="/register/{id}", method= RequestMethod.DELETE)
	public void  deleteUser(@PathVariable int id){
		rr.deleteById(id);
	}
	@RequestMapping(value = "/register", method = RequestMethod.PUT)
	public Register update(@RequestBody Register reg) {
	Register user = rs.updateUser(reg);
	return user;
	}
	@RequestMapping(value="/activate",method= RequestMethod.PUT)
	public Register activate(@RequestBody String email)
	{
		String str=email.substring(email.indexOf(":")+2,email.lastIndexOf("\""));
		System.out.println("email ::"+str);
		Register u=	rr.findByEmail(str);
		System.out.println("uname :"+u.getName());
		u.setActive("yes");
		Register rs = rr.save(u);
	    return rs;
	}
}