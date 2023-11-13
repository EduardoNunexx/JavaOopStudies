package OopConcepts.Challenge06.Challenge0602;

public class Car {
    int currentSpeed=0;
    //new Atribute 
    final int MAX_SPEED;
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
