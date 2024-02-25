package br.com.end.demo01.model.entities;

import jakarta.persistence.*;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;



@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	//default validator annotation to set that this attribute can't be blank
	@NotBlank
	private String name;
	
	//using the default validator to set the min value that this attribute can get
	@Min(0)
	private double price;
	
	//using the default validator to set the min and the max value that this attribute can get
	@Min(1)
	@Max(4)
	private double descount;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDescount() {
		return descount;
	}
	public void setDescount(double descount) {
		this.descount = descount;
	}
	
	public Product(String name, double price, double descount) {
		super();
		this.name = name;
		this.price = price;
		this.descount = descount;
	}
	public Product() {
	}
	
}

