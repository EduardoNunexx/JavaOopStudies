package OopSolidConcepts.Class08Filter.Filter.ChallengeFilter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
//in this challenge you have a store and wanna show just in your main page just yur products that have a big discount and free freight 
//do this usinf filter, lambda expressions and make your owns predicates
public class Challenge {
    public static void main(String[] args) {
        Product bmw = new Product("Bmw",250000.00,0.1,true);
        Product mercedes = new Product("Mercedes",280000.00,0.1,false);
        Product audi = new Product("Audi",220000.00,0.2,false);
        Product toyota = new Product("Toyota",350000.00,0.3,true);

        List<Product> products = Arrays.asList(bmw,mercedes,audi,toyota);

        //creating the predicates 

        //have discount bigger or equals than 0.2
        Predicate<Product> discount = x->x.discount>=0.2;

        //have free freith
        Predicate<Product> freeFreight = x->x.freith;

        Consumer<Product> showProducts = x->System.out.println(x.name);

        products.stream().filter(discount).filter(freeFreight).forEach(showProducts);
    }
}
