package OopSolidConcepts.Class04AbstractClass;
//this is the concrete class, so here you need to implement all the abstracts methods that the super classes have 
public class Dog  extends Mammal{
    //implementing the super class method
    @Override
    public void move() {
        System.out.println("Walking");
    }
    
}
 