package OopSolidConcepts.Class07Map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

//in this challenge must to change a list of Integer to binary, invert the binary and convert to decimal again
// all this using map, method references and lambda functions
/*
 * Integer to binary ... 6 ->"110"
 * invert the binary ... "110"->"011"
 * binary to integer ... "011"->3
 */
public class ChallengeMap {
    public static void main(String[] args) {
        //creating the list 
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);    
        //creating the lambda functions 
        
        //to invert the binary
        UnaryOperator<String> invert = x -> new StringBuilder(x).reverse().toString();

        // to  convert the binary to integer
        Function<String,Integer> toBinary = s -> Integer.parseInt(s,2);

        numbers.stream().map(Integer::toBinaryString).map(invert).map(toBinary).forEach(System.out::println);
    }   
}
