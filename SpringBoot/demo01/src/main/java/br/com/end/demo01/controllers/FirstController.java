package br.com.end.demo01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RestController;

//using the annotations to map 
@RestController
public class FirstController {
		//@RequestMapping(method = RequestMethod.GET, path = "/hello")
		@GetMapping(path = {"hello","Nice"})
		public String hello() {	
			return"Hello world !";
		}
		@PutMapping(path = {"hello","Nice"})
		public String helloPut() {
			return "Hello world in put";
		}
}
