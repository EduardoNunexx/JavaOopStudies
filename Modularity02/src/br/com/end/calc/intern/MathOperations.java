package br.com.end.calc.intern;
import java.util.Arrays;
public class MathOperations {
	public double sum(double... numbers) {
		return Arrays.stream(numbers).reduce(0,(t,c)->t+c);
	}
}
