package class04OneToN;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ordr {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	@Column(nullable = false)
	private Date data;
	//setting the one to many relation 
	//setting the fetch to tell how will works the entity loads  
	
	@OneToMany(mappedBy = "order",fetch = FetchType.EAGER) 
	private List<ItemOrder> itens;
	
	public Ordr() { 
		this(new Date());
	}
	
	public List<ItemOrder> getItens() {
		return itens;
	}

	public void setItens(List<ItemOrder> itens) {
		this.itens = itens;
	}

	public Ordr(Date data) {
		super();
		this.data = data;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
}	
