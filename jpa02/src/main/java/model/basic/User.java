package model.basic;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//setting this class as a entity 
@Entity
public class User {
	//setting this attribute as primary key 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//about these others attributes by default all of them will be an collumn of this entity 
	private String name;
	private String email;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User() {
		
	}
	public User(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	
	
}