package LessionChallenge;

import java.util.ArrayList;

public class Compra {
    double valorCompra;
    ArrayList<Item> itens = new ArrayList<>();

    void adcionarItens(Produto produto,int quantidade){
        this.itens.add(new Item(produto,quantidade));
    }
    public String toString(){
        return itens.toString();
    }
    public double valorCompra(){
        double valor=0;
        for(Item x:itens){
           valor+=x.valorItem(); 
        }
        return valor;
    }
}
