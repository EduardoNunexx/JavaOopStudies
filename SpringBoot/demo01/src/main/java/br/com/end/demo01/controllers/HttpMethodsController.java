package br.com.end.demo01.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/methods")
public class HttpMethodsController {
	//Trying all the HTTP methods
	@GetMapping
	public String get() {
		return "GET requisition";
	}
	@PostMapping
	public String post() {
		return "POST requisition";
	}
	@PutMapping
	public String put() {
		return "PUT requisition";
	}
	@PatchMapping
	public String patch() {
		return "PATCH requisition";
	}
	@DeleteMapping
	public String delete() {
		return "DELTE requisition";
	}
	
	
	
}
