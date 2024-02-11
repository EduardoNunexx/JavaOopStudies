package br.com.edn.financial;

import br.com.end.calc.Calculator;

public class App {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.sum(1,2,3,4));
	}
}
