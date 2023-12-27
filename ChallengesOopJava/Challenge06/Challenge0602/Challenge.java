package ChallengesOopJava.Challenge06.Challenge0602;
//this the scond part of the challenge 
//Now u must to implement the maxSpeed attribute in the car class and validate if the currentSpeed are bigger than the maxSpeed value 

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
