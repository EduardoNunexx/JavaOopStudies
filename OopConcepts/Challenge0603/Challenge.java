package OopConcepts.Challenge0603;
//this the third challenge part
//Now you must to implement the attribute  and methods acces level in all classes 

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
