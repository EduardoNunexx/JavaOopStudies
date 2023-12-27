package ChallengesOopJava.Challenge01;

public class App {
    public static void main(String[] args) {
        Date date1= new Date();
        date1.Year=1900;
        date1.mounth="February";
        date1.day=891182912;

        Date date2= new Date();
        date2.Year=1768;
        date2.day=182537;
        date2.mounth="march";
        System.out.println(date1.show());
        System.out.println(date2.show());
    }
}
