package class03.OneToOneRelation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import class02.Entit;

@Entity
@Table (name="customers")
public class Customer implements Entit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	//doing the relation
	//this will crate a attribute called accent_id in the customer table
	@OneToOne
	//ensuring that the attribute will be one to one relationship  
	@JoinColumn(name= "accent_id", unique = true)
	private Accent accent;
	
	public Customer() {
		
	}
	
	public Customer( String name, Accent accent) {
		super();
		this.name = name;
		this.accent = accent;
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

	public Accent getAccent() {
		return accent;
	}

	public void setAccent(Accent accent) {
		this.accent = accent;
	}
	
	
}
