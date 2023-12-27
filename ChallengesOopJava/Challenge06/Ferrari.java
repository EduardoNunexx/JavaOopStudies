package ChallengesOopJava.Challenge06;

public class Ferrari extends Car{
    public void accelerate(){
        currentSpeed+=30;
    }
    public void brake(){
        if(currentSpeed<20){
            currentSpeed=0;
        }else{
        currentSpeed-= 20;
        }
    }
}
