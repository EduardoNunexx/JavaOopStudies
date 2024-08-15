public class Person implements Comparable<Person>{
    Integer id;
    String name;
    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.name);
    }
    Person(Integer id, String name){
        this.id=id;
        this.name=name;
    }
    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + "]";
    }
    
}
