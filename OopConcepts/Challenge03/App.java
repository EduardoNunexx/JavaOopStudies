package OopConcepts.Challenge03;

public class App {
    public static void main(String[] args) {
        Product p1= new Product();
        System.out.println(p1.disc);
        Product.disc=0.40;
        Product p2=new Product();
        System.out.println(p2.disc);
        Product.met();
    }
}
