package OopConcepts.Challenge06;

public class Car {
    int currentSpeed=0;
    public void accelerate(){
        currentSpeed+=10;
    }
    public void brake(){
        if(currentSpeed>0){
            currentSpeed-=10;
        }
    }
}
