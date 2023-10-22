public class Lession2Main{
    public static void main(String[] args) {
        Cliente cliente1= new Cliente("Edward");
        System.out.println(cliente1.clienteId);
        Cliente cliente2= new Cliente("juim");
        System.out.println(cliente2.clienteId);
        //adding compra1 to cliente 1
        cliente1.compras.add(new Compra(new Item(200000.00,"CAR",1)));   
        cliente1.compras.add(new Compra(new Item(10000.00, "Opcionais", 1)));
        System.out.println(cliente1.toString());
        cliente1.adcionarItem(new Item (15000.00, "bitch", 10), 0);
        System.out.println(cliente1.toString());
    }
}