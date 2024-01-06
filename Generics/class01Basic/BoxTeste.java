public class BoxTeste {
    public static void main(String[] args) {
        //Instantiating the box and passing the generic type that will be used 
        Box<Integer> x = new Box<>();
        //now all the values that you put the type t will be of the type Integer
        x.saveThing(1);
        System.out.println(x.openThing());
        Box<Box> x1 = new Box<>();
        x1.saveThing(x);
        System.out.println(x1.openThing().openThing());
        OtherBox x3 = new OtherBox();
        x3.saveThing("musto to be a string");
        System.out.println(x3.openThing());
    }
}
