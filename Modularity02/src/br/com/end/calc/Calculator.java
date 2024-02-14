package br.com.end.calc;

import java.util.logging.Logger;

import br.com.end.calc.intern.MathOperations;

public class Calculator {
	public MathOperations mathOperations= new MathOperations();
	//using the generate delegate methods
	public double sum(double... numbers) {
		return mathOperations.sum(numbers);
	}
	Logger 
}
