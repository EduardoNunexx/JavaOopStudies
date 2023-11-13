package OopConcepts.Challenge06.Challenge0603;

public class Ferrari extends Car{
    Ferrari(){
        //solving the problem :)
        super(300);
    }
    public void accelerate(){
        currentSpeed+=30;
        if(currentSpeed>MAX_SPEED){
            currentSpeed= MAX_SPEED;
        }
    }
    public void brake(){
        if(currentSpeed<20){
            currentSpeed=0;
        }else{
        currentSpeed-= 20;
        }
    }
}
