package ChallengesOopJava.Challenge02;

public class App {
    public static void main(String[] args) {
        //using the defaul constructor 
        //how i set my own constructor method, the default constructor get desabled, so if i want to use the default construct i must to create my own defaul constructor
        Car newCar= new Car();
        //using my own constructor
        Car newCar2= new Car(180000, 2022, "bmw");
    }
}
