package ChallengesOopJava.Challenge06.Challenge0603;
//implementing the acces level 
public class Car {
    public int currentSpeed=0;
    //new Atribute 
    protected final int MAX_SPEED;
    Car(int MAX_SPEED){
        this.MAX_SPEED=MAX_SPEED;
    }
    public void accelerate(){
        currentSpeed+=10;
        if(currentSpeed>MAX_SPEED){
            currentSpeed=MAX_SPEED;
        }
    }
    public void brake(){
        if(currentSpeed>0){
            currentSpeed-=10;
        }
    }
}
