package com.github.stokito.unitTestExample.calculator;

public class Calculator {

	public int sum(int a, int b) {
		return a + b;
	}

	public int minus(int a, int b) {
		return a - b;// There was error
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}
	public int supersum(int a, int b){
		return a*a*b*b;
	}

}
