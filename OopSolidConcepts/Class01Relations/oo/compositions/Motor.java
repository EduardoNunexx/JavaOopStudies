
public class Motor {
    int hp;
    float fatorInjecao=1.0f;
    boolean ligado = false;
    
    int  giros(){
        if (ligado==false){
            return 0;
        }
        return (int) fatorInjecao*3000;
    }
}