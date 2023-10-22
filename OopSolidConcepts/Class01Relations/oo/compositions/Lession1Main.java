public class Lession1Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.ligar();
        System.out.println(carro1.estaLigado());
        carro1.acelerar();
        System.out.println(carro1.motor.giros());
        carro1.acelerar();
        System.out.println(carro1.motor.giros());
        carro1.freiar();
        System.out.println(carro1.motor.giros());
    }
}
