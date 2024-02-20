package br.com.end.demo01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
	//getting the values using the stand way and sum the values 
	@GetMapping("/sum")
	public static int sum(@RequestParam("a")int a,@RequestParam("b") int b) {
		return a+b;
	}	
	//the url http://localhost:8080/calculator/sum?a=1&b=1
	//getting the values using the not stand way and sub them
	@GetMapping("/sub/{a}-{b}")
	public static int sub(@PathVariable(value = "a") int a, @PathVariable(value = "b") int b){
		return a-b;
	}
	//the url http://localhost:8080/calculator/sub/30-10
	
}
