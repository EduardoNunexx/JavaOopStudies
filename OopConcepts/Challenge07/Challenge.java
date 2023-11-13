package OopConcepts.Challenge07;
//this is an exercicie about polimorfism
//here i use some visibility concepts
//i just remove all the equals methos and attributes in the classes and did a inherence between the classes and the class food 
public class Challenge {
    public static void main(String[] args) {
        Person pessoa = new Person(99.60);
        Rize arroz = new Rize(0.25);
        Beans feijao = new Beans(0.18);
        System.out.println(pessoa.getWeight());
        pessoa.eat(arroz);
        pessoa.eat(feijao);
        System.out.println(pessoa.getWeight());
        IceCream sorvete = new IceCream(0.4);
        pessoa.eat(sorvete);
        System.out.println();
    }
}
