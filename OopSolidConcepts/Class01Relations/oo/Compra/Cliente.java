import java.util.ArrayList;

public class Cliente {
    String nome;
    int clienteId=countId;
    static int countId=1;
    ArrayList<Compra>compras= new ArrayList<>(); 
    Cliente (String nome){
        this.nome=nome;
        countId++;
    }
    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", clienteId=" + clienteId + ", compras=" + compras.toString() + "]";
    }
    void adcionarItem(Item iten, int index){
        compras.get(index).adcionarItem(iten);
    }
    
}
