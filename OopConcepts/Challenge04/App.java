package OopConcepts.Challenge04;

public class App {
    int a=1; //the challenge is, how to get acesse to this variable
    static int b=2;
    public static void main(String[] args) {
        //first solution
        App app= new App();
        System.out.println(app.a);
        //second solution turn in a static atributte
        System.out.println(b);
    }
}
