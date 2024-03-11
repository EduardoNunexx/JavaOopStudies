import java.util.ArrayList;

public class Sqrt {
    public static void main(String[] args) {
        //System.out.println(sqrt(10));
        int[] x= {10,9,8,7,6,5};
        order(x);
        for (int i : x) {
            System.out.println(i);
        }
    }

    public static int sqrt(int number){
        int i=0;
        while (i*i<=number) {
            i++;
        }   
        return i-1;
    }
    public static void order(int[] array){
        for (int i = 0; i < array.length; i++) {
            int aux=i;
            int aux2=array[i];
            for (int j = i+1; j < array.length; j++) {
                if(array[j]<aux2){
                    aux=j;
                    aux2=array[j];
                }
            }
            int aux3=array[i];
            array[i]=array[aux];
            array[aux]=aux3;
        }
        
    }
}
