package OopConcepts.Challenge07;

public class Person {
    private double weight;
    public Person(double weight){
        setWeight(weight);
    }
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight>=0){
        this.weight = weight;
        }
    }
    //using overload polimorfism (static polimorfism)
    //i change this old method for a new method that will recive a super class food and will be preperated to recive allthe foods sons 
    /*public void eat(Rize rize){
        this.weight+=rize.getWeight();
    }
    public void eat(Beans beans){
        this.weight+=beans.getWeight();
    }
    public void eat(IceCream iceCream){
        this.weight+=iceCream.getWeight();
    }*/
    //i had use the dinamics polimorfism
    //now i will have just one method that will recive the super class and will do the things by himself
    public void eat(Food food){
        this.weight+=food.getWeight();
    }
}
