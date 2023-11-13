package OopConcepts.Challenge07;
//i had create this class to use the dinamic polimorfism and solve the challenge
//this is an abstract class this means that u cant instanciate her, her are here just to be inherit
public abstract class Food {
    private double weight;

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        if(weight>=0){
        this.weight = weight;
        }
    }
    
}
