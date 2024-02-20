package br.com.end.demo01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.end.demo01.models.Clients;

@RestController
//using the annotation @RequesMapping to set the default URL of this class
@RequestMapping("/clients")
public class ClientController {
	@GetMapping(path = "/any")
	public Clients getClients() {
		return new Clients(28, "James", "123.456.789-00");
	}
	//first way to get parameters by url 
	//how to receive data by URL (creating URL variables)
	@GetMapping("/cars/{id}")
	//using @Pathvariable annotation to set that id variable will be placed  in the method parameter
	public Clients getCLientById01(@PathVariable int id) {
	 	//how we don't use database yet we'll return new client using the id that are pass
		return new Clients(id, "French girl", "987.654.321-00");
	}
	//second way (standard way) to set parameters by URL (using QueryStrings)
	//setting the @RequesParam to get what is passed in the id var on url
	@GetMapping
	public Clients getClientsById02(@RequestParam(name = "id") int id) {
		return new Clients(id, "Italian man", "111.222.333-00");
	}
}
