package OopSolidConcepts.Class06StramApi.Class1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class WaysToCreateStreams {
    // here some ways to create streams and examples to how to use
    public static void main(String[] args) {
        
        // associating the stram to a variable linking whit an list
        ArrayList<String> s = new ArrayList<>(List.of("x", "y", "z"));
        Stream<String> stream = s.stream();
        stream.forEach(System.out::println);

        // Using Stream.of

        // here i'm creating a stream without link with a list
        Stream<String> languages = Stream.of("java", "javaScript", "C", "Go");
        languages.forEach(System.out::println);
        String[] vector = { "Html", "Css", "Sql" };

        // creating a temporary stream and forEach
        Stream.of(vector).forEach(System.out::println);

        // Creating a stream using an array
        Arrays.stream(vector).forEach(System.out::println);

    }
}
