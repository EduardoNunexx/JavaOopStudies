package LessionChallenge;

import java.util.ArrayList;

public class Cliente {
    String nome;
    int idCliente;
    ArrayList<Compra> compras = new ArrayList<>();
    void adcionarCompra(){
        this.compras.add(new Compra());
    }
    double obterValorTotal(){
        double total=0;
        for(Compra x:compras){
            total+=x.valorCompra();
        }
        return total;
    }
    @Override
    public String toString() {
        return "Cliente [nome=" + nome + " idCliente=" + idCliente + " compras=" + compras.toString() + "]";
    }
}
