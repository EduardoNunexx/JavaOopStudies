package class07Inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("SCS")
public class ScholarshipStudent extends Student{
		
	private Double schorlarshipValue;
	
	public ScholarshipStudent() {
		
	}
	public ScholarshipStudent(Long studentRegistration,String name, Double value) {
		super(studentRegistration,name);
		this.schorlarshipValue=value;
	}
	public Double getSchorlarshipValue() {
		return schorlarshipValue;
	}
	public void setSchorlarshipValue(Double schorlarshipValue) {
		this.schorlarshipValue = schorlarshipValue;
	}
	
}

