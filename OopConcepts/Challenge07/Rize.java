package OopConcepts.Challenge07;
//i just remove all the equals methos and attributes in the classes and did a inherence between the classes and the class food 
public class Rize extends Food{
    //i just remove all the equals methos and attributes in the classes and did a inherence between the classes and the class food 
    /*private double weight;
    public Rize(double weight){
        setWeight(weight);
    }
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight>=0){
        this.weight = weight;
        }
    }*/
    //how i set a new constructor i  the super class food i need to specify what is the constructor that i will use ]
    public Rize(double weight){
        super.setWeight(weight);
    }
}
