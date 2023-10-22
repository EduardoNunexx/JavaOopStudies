package LessionChallenge;

public class LessionChallengeMain {
    public static void main(String[] args) {
        //client
        Cliente cliente1= new Cliente();
        cliente1.nome="ED";
        cliente1.idCliente=1;
        //products
        Produto product1 = new Produto("Carro",100000);
        
        Produto product2 = new Produto("Perfum", 2000);
        //order
        cliente1.adcionarCompra();
        cliente1.adcionarCompra();
        //addingnew itens in an order
        cliente1.compras.get(0).adcionarItens(product1,1);
        cliente1.compras.get(0).adcionarItens(product2, 4);
        //adding a itens to a new order 
        cliente1.compras.get(1).adcionarItens(product1,1);
        cliente1.compras.get(1).adcionarItens(product2, 4);
        
        System.out.println(cliente1.obterValorTotal());
    }
}
