package ChallengesOopJava.Challenge05;

//Dinner challenge 
//you must to create a person class and a food class that both have 2 attributes, name and weitgh
//down below n the Dinner class, you must to make a dinner!!
//create a person and a food and the eat method
//when the person eat the food he will recieve the food weigth 
public class Dinner {
    public static void main(String[] args) {
        // creating the foods
        Food barbecue = new Food("Barbecue", 1000.00);
        Food angry = new Food("Im angry", 1200.0);

        Person mark = new Person("Mark", 85000.00);
        Person mirela = new Person("Mirella", 58000.00);
        System.out.println(mirela.weigth+" "+mark.weigth);
        eat(mirela, angry);
        eat(mark,barbecue);
        System.out.println(mirela.weigth+" "+mark.weigth);
    }
    public static void eat(Person x, Food y){
        if(y.weigth!=0.00){
            x.weigth+=y.weigth;
            y.weigth=0.0;
        }

    }
}
