import java.text.DecimalFormat;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;



public class Challenge {
    public static void main(String[] args) {
        Product p = new Product("Ipad",3235.89,0.13);
        Function<Product,Double> realValue= product-> product.value*(1-product.disc);  
        UnaryOperator<Double> cityTax= product-> product>=2500 ? product*1.085: product;
        UnaryOperator<Double> freight= product-> product>3000 ? product+100: product;
        Function<Double, String> format = product-> {
            DecimalFormat forma =new DecimalFormat("#.##");
            String f = forma.format(product);
            return f;};
        UnaryOperator<String> exit = value-> "The real value is:"+value;
        System.out.println(realValue.andThen(cityTax).andThen(freight).andThen(format).andThen(exit).apply(p));
    }
    
}
