package net.javaonline.spring.restful.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldService {
	/*
	 * @RequestMapping public String helloMethod1(@RequestParam(value="name",
	 * defaultValue="World") String name) {
	 * 
	 * return "Hello  "+ name; }
	 */

	@RequestMapping(value = "/hello/{fname}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String helloMethod1(@PathVariable String fname) {
		System.out.println("name:::" + fname);
		return "Hello  " + fname;
	}

	@RequestMapping(value = "/hello/{firstName}/{lastName}", method = RequestMethod.GET)
	public String helloMethod2(@PathVariable String firstName, @PathVariable String lastName) {
		return "Hello " + firstName + " " + lastName;
	}

}