package class05NToN;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

//doing a bidirectional relation
@Entity
public class Uncle {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	//making the relation 
	@ManyToMany
	List<Nephew> nephews= new ArrayList<>();

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

	public List<Nephew> getNephews() {
		return nephews;
	}

	public void setNephews(List<Nephew> nephews) {
		this.nephews = nephews;
	}

	public Uncle(String name) {
		super();
		this.name = name;
	}

	public Uncle() {
	}
	
}
