package class06Composition;

import javax.persistence.Embeddable;
@Embeddable
public class Adress {
	private String street;
	private String complement;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getComplement() {
		return complement;
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}
	
}
