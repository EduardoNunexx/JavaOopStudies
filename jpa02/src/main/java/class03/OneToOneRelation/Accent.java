package class03.OneToOneRelation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import class02.Entit;

@Entity
@Table(name= "Accents")
public class Accent implements Entit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	//doing the bidirectional relation
	//i'm telling to JPA that this's an relation already mapped
	@OneToOne(mappedBy = "accent")
	private Customer customer;
	
	public Accent(String name) {
		super(); 
		this.name = name;
	}
	public Accent() {
		
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
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
