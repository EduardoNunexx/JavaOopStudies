package ChallengesOopJava.Challenge07;
//i just remove all the equals methos and attributes in the classes and did a inherence between the classes and the class food 
public class IceCream extends Food{
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
    public IceCream(double weight){
        super.setWeight(weight);
    }
}
