package OopSolidConcepts.Class08Filter.Filter;

import java.util.Arrays;
import java.util.List;

public class Filter {
    public static void main(String[] args) {
        //setting some students
        Student s1 = new Student("a",10.0);
        Student s2 = new Student("b",1.0);
        Student s3 = new Student("c",8.0);
        Student s4 = new Student("d",7.0);
        Student s5 = new Student("e",9.0);
        //create a list od students 
        List<Student> students = Arrays.asList(s1,s2,s3,s4,s5);
        
        //using the filter to get the students with good grade
        students.stream().filter(s->s.grade>=8.0).map(s-> "God job "+s.name).forEach(System.out::println);

    }
}
