package controller;

import classes.calculator;

public class calcTest {

	public static void main(String[] args) {
		calculator calc = new calculator();
		calc.setOperandOne(10.5);
		calc.setOperation("+");
		calc.setOperandTwo(5.2);
		calc.performOperation();
		calc.getResults();
	}

}
