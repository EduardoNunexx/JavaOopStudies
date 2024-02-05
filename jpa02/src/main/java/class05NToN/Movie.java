package class05NToN;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Movies")
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private Double avrg;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	//using the join table notation to configure the relation table 
	//using the property name to set the table name 
	//using the property join column to set how this entity will be called in the relation table 
	//using the property inverse join column to set how the other relation side will be called in the table 
	@JoinTable(name = "Actors_Movies", joinColumns = @JoinColumn(name="Movie_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "Actor_id", referencedColumnName = "id"))
	private List<Actor> actors = new ArrayList<>();

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

	public Double getAvrg() {
		return avrg;
	}

	public void setAvrg(Double avrg) {
		this.avrg = avrg;
	}

	public List<Actor> getActors() {
		return actors;
	}

	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}

	public Movie(String name, Double avrg) {
		super();
		this.name = name;
		this.avrg = avrg;
	}

	public Movie() {

	}
	//Simplifying the insertion
	public void addActor(Actor actor) {
		if(actor!=null && !getActors().contains(actor)) {
		getActors().add(actor);
			if(!actor.getMovies().contains(this)) {
				actor.getMovies().add(this);
			}
		}
	}
	
}
