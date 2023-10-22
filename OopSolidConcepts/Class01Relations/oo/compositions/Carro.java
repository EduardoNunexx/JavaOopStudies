public class Carro{
    //this is a relation at 1 to 1 
    //one car has one motor 
    Motor motor = new Motor();
    
    void acelerar(){
        if(motor.fatorInjecao<10){
            motor.fatorInjecao+=1;
        }
    }
    
    void freiar(){
        if(motor.fatorInjecao>0.2){
        motor.fatorInjecao-=0.4;
        }
    }
    void ligar(){
        motor.ligado=true;
    }
    void desligar(){
        motor.ligado=false;
    }
    boolean estaLigado(){
        return motor.ligado;
    }
}