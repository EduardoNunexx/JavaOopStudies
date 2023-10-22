package LessionChallenge;

import java.util.ArrayList;

public class Produto {
    ArrayList<Item> itens= new ArrayList<>();
    String nomeProduto;
    double preco;
    Produto(String nome,double preco){
        this.nomeProduto=nome;
        this.preco=preco;
    }
    @Override
    public String toString() {
        return "Produto [nomeProduto=" + nomeProduto + "]";
    }
    
}
