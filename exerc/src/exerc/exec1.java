package exerc;

import java.util.ArrayList;
import java.util.List;

public class exec1 {
	 public static void main(String[] args) {
	        List<Integer> x = fibo(10);
	        x.forEach(a->System.out.println(a));
	    }

	 public static List<Integer>fibo(int n){
		 try {
			 if(n<0) {
				 throw new Exception();
			 }else {
				 int start=0;
				 int aux1=1;
				 int aux2=0;
				 List<Integer> numbers= new ArrayList<>();
				 while(start<n) {
					 numbers.add(aux1);
					 int newValue = aux1+aux2;
					 aux2=aux1;
					 aux1= newValue;
					 start++;
				 }
				 return numbers;
			}
		} catch (Exception e) {
			throw new ArithmeticException("Negative value");
		}
		 
		 
	 }
}
