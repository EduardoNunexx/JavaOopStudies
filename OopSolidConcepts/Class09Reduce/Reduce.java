package OopSolidConcepts.Class09Reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;


public class Reduce {
    public static void main(String[] args) {
        //setting a list of values
        List<Integer> numbers = Arrays.asList(1,2,3);
        //creating the lambda funtion to sum the values 
        BinaryOperator<Integer> sum = (acum,x)-> acum+=x;
        //usign the reduce and using get to get the value instead a optional
        System.out.println(numbers.stream().reduce(sum).get());
        //other way to use reduce (passing the start value)
        System.out.println(numbers.stream().reduce(100,sum));
    } 
}
