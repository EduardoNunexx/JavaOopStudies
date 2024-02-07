package class07Inheritance;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Type",length = 3, discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("STD")
public class Student {
	@Id
	private Long studentRegistration;
	
	private String name;

	public Long getStudentRegistration() {
		return studentRegistration;
	}

	public void setStudentRegistration(Long studentRegistration) {
		this.studentRegistration = studentRegistration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student() {
		
	}

	public Student(Long studentRegistration, String name) {
		super();
		this.studentRegistration = studentRegistration;
		this.name = name;
	}
	
	
}
