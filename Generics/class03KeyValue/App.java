package Generics.class03KeyValue;

public class App {
    public static void main(String[] args) {
        Pairs<Integer, String> notes =new Pairs<>();
        notes.add(1, "Juan");
        notes.add(2, "James");
        notes.add(3, "Juim");
        notes.add(2,"rebeca");
        System.out.println(notes.getValue(1));
        System.out.println(notes.getValue(2));
    }
    
}
