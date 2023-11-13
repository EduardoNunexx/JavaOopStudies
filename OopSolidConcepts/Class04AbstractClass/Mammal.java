package OopSolidConcepts.Class04AbstractClass;
//this is another abstract class but him inherate the absctract class animal 
public abstract class Mammal extends Animal {
    //how this is an abstract class too, you dont need to implment the animal's abstract methods

    //here is an final method, he cannot be overrided
    public final void Breastfeed(){
        System.out.println("Feeding");
     }
}
