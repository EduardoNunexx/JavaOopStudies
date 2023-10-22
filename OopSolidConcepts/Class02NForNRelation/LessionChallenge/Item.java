package LessionChallenge;

public class Item {
    int itemId;
    Produto produto;
    int quantidade;
    Item(Produto produto, int quantidade){
        this.produto= new Produto(produto.nomeProduto, produto.preco);
        this.produto=produto;
        produto.itens.add(this);
        this.quantidade=quantidade;
    }

    @Override
    public String toString() {
        return "Item [itemId=" + itemId + ", produto=" + produto + "]";
    }
    public double valorItem(){
        return this.produto.preco*quantidade;
    }
    
}
