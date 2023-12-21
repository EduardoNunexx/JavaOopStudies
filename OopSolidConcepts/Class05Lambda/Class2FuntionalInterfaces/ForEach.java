package OopSolidConcepts.Class05Lambda.Class2FuntionalInterfaces;

import java.util.Arrays;
import java.util.List;
//susing the for each
public class ForEach {
    public static void main(String[] args) {
        //initite an array and adding some value to him 
        List<Integer> array = Arrays.asList(1,2,3,4,5); 
        array.forEach(x->System.out.println(x));
    }
    
}
