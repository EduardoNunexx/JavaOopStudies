package br.com.end.demo01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//using the annotations to map 
@RestController
public class FirstController {
		//@RequestMapping(method = RequestMethod.GET, path = "/hello")
		@GetMapping(path = {"hello","Nice"})
		public String hello() {	
			return"Hello world !";
		}
}
