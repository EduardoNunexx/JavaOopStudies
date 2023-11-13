package OopSolidConcepts.Class03Enum;

public class App {
    public static void main(String[] args) {
     //creating a enum var 
     DaysOfWeek enum01 = DaysOfWeek.FRIDAY;   
     //how to compare the enum value 
     if(enum01== DaysOfWeek.FRIDAY){
        System.out.println("Yeah Sr. you will be rich, i'm sure about that !");
     }
     System.out.println(enum01);
    }
}
