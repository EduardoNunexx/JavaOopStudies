package JDBC.Class02InsertionsAndSelect.Select;

public class Person {
    private int tag;
    private String name;
    
    public Person(int tag, String name) {
        this.tag = tag;
        this.name = name;
    }
    public int getTag() {
        return tag;
    }
    public void setTag(int tag) {
        this.tag = tag;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
