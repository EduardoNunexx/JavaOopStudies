import java.util.HashSet;
import java.util.TreeSet;

import java.util.Set;

public class OrderingSet {
    public static void main(String[] args) {
        Person p1 = new Person(3,"jao");
        Person p2 = new Person(2,"ana");
        Person p3 = new Person(1,"juim");
        
        Set<Person> personSet = new TreeSet();
        personSet.add(p1);
        personSet.add(p2);
        personSet.add(p3);
        System.out.println(personSet);
    }   
}
