package ChallengesOopJava.Challenge06;
//A challenge using inerance 
//You must o create a generic class called car 
//In this class you must to set the attribute currentSpeed
//And 2 methods called accelerate and brake 
//when u use one of these methods the attrubte currentSpeed will change 
//if the velocity be 0 you cant to down it
//And create two specifcs cars classes  



public class Challenge {
    public static void main(String[] args) {
        Ferrari ferrari = new Ferrari();
        Bmw bmw = new Bmw();
        ferrari.accelerate();
        ferrari.accelerate();
        ferrari.accelerate();
        ferrari.accelerate();
        ferrari.brake();
        ferrari.brake();
        ferrari.brake();
        ferrari.brake();
        ferrari.brake();
        ferrari.brake();
        ferrari.brake();
        System.out.println(ferrari.currentSpeed);
        bmw.accelerate();
        bmw.accelerate();
        bmw.accelerate();
        bmw.accelerate();
        System.out.println(bmw.currentSpeed);
    }
}
