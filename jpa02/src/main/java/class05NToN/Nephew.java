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
public class Nephew {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@ManyToMany(mappedBy = "nephews")
	List<Uncle> uncles= new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Uncle> getUncles() {
		return uncles;
	}

	public void setUncles(List<Uncle> uncles) {
		this.uncles = uncles;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Nephew() {
	}

	public Nephew(String name) {
		super();
		this.name = name;
	}
	
}
