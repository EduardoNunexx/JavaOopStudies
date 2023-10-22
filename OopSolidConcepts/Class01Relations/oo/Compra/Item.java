public class Item {
    int itemId=idItemCount;
    int quantidade;
    double valor;
    String categoria;
    static int idItemCount=1;
    Item(double valor,String categoria,int quantidade){
        this.valor = valor;
        this.categoria = categoria;
        this.quantidade=quantidade;
        idItemCount++;
    }

    @Override
    public String toString() {
        return "Item [itemId=" + itemId + ", quantidade=" + quantidade + ", valor=" + valor + ", categoria=" + categoria
                + "]";
    }
    
}
