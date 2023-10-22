import java.util.ArrayList;

public class Compra{
    int idCompra=countId;
    String data;
    double valor=0;
    static int countId=1;
    ArrayList<Item> itens= new ArrayList<>();
    Compra(Item item){
        itens.add(item);
        this.valor+=item.valor*item.quantidade;
        countId++;
    }
    @Override
    public String toString() {
        return "Compra [idCompra=" + idCompra + ", data=" + data + ", valor=" + valor + ", itens=" + itens.toString() + "]";
    }
    void adcionarItem(Item item){
        itens.add(item);
    }
    
}