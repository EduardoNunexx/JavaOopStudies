package class02;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "products") //configuring the table 
public class Product implements Entit{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //setting how the pk will works
	private Long id;
	
	@Column(name = "product_name", length = 200, nullable = false)//setting how this attribute will works 
	private String name;
	
	@Column(name = "product_price", nullable = false,precision = 11) //precision are the numbers size, and scale are how many numbers you will have in the decimal size
	private Double price;
	
	public Product() {
		
	}
	
	
	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
}
