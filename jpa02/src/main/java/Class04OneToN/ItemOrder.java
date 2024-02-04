package Class04OneToN;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import class02.Product; 

@Entity
public class ItemOrder {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Ordr order;
	
	@ManyToOne
	private Product product;
	
	
	@Column(nullable = false)
	private int qtd;
	@Column(nullable = false)
	private Double price;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Ordr getOrder() {
		return order;
	}

	public void setOrder(Ordr order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
		if(product!=null&& this.price==null) {
			this.setPrice(product.getPrice());
		}
	}

	public ItemOrder(int qtd, Ordr order, Product product) {
		super();
		this.setQtd(qtd);
		this.setOrder(order);
		this.setProduct(product); 
	}
	public ItemOrder() {
		
	}
	
	
}
