package class07app;

import class07Inheritance.ScholarshipStudent;
import class07Inheritance.Student;
import infra.DAO;

public class NewStudent {

	public static void main(String[] args) {
		DAO<Student> daoStudent = new DAO<>(Student.class);
		
		Student student01 = new Student(123L, "jhon");
		ScholarshipStudent student02 = new ScholarshipStudent(345L,"Mark",1000.0);
		
		daoStudent.includeWithEverything(student01);
		daoStudent.includeWithEverything(student02);
		daoStudent.close();
	}
	
}
