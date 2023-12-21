package OopSolidConcepts.Class05Lambda.Class1BasicLambdaConcepts;

import java.util.ArrayList;

public class LambdaForEach {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.forEach(x -> System.out.println(x));
    }

}
