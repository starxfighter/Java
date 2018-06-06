package classes;

import java.util.ArrayList;

public class Calculator implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ArrayList<Object> operands = new ArrayList<Object>();
	
	public Calculator() {};
	
	private Object getOperand(int idx) {
		return operands.get(idx);
	}
	
	private void setOperand(Object val) {
		this.operands.add(val);
	}
	
	public void performOperation(Object val) {
		this.setOperand(val);
	}
	
	public void getResults() {
		double val1 = (double) this.getOperand(0);
		String oper = (String) this.getOperand(1);
		double val2 = (double) this.getOperand(2);
		double result = 0.00;
		int idx = 3;
		while(oper != "=") {
			switch(oper) {
				case "*":
					result = val1 * val2;
					val1 = result;
					break;
				case "/":
					if(val2 == 0) {
						System.out.println("Can not divide by zero");
						break;
					} else {
						result = val1 / val2;
						val1 = result;
						break;
					}
				case "+":
					result = val1 + val2;
					val1 = result;
					break;
				case "-":
					result = val1 - val2;
					val1 = result;
					break;
				default:
					System.out.println("Not a valid operation");
					break;
			}
			if(operands.size() > idx) {
				oper = (String) this.getOperand(idx);
			}
			if(operands.size() > (idx + 1)) {
				val2 = (double) this.getOperand(idx + 1);
			}
			idx = idx + 2;
		}
		System.out.println("The result is " + result);
	}
	
	public void getResults2() {
		int idx = 0;
		double val1 = 0.00;
		double val2 = 0.00;
		double result = 0.00;
		while(operands.size() > 2) {
			idx = operands.indexOf("*");
			if(idx != -1) {
				val1 = (double) this.getOperand(idx - 1);
				val2 = (double) this.getOperand(idx + 1);
				result = val1 * val2;
				operands.set(idx, result);
				operands.remove(idx - 1);
				operands.remove(idx + 1);
			} else {
				idx = operands.indexOf("/");
				if(idx != -1) {
					val2 = (double) this.getOperand(idx + 1);
					if(val2 == 0) {
						System.out.println("Error. Divide by zero");
					}else {
						val1 = (double) this.getOperand(idx - 1);
						result = val1 / val2;
						operands.set(idx, result);
						operands.remove(idx - 1);
						operands.remove(idx + 1);
					}
				} else {
					idx = operands.indexOf("+");
					if(idx != -1){
						val1 = (double) this.getOperand(idx - 1);
						val2 = (double) this.getOperand(idx + 1);
						result = val1 + val2;
						operands.set(idx, result);
						operands.remove(idx - 1);
						operands.remove(idx + 1);
					} else {
						idx = operands.indexOf("-");
						if(idx != -1) {
							val1 = (double) this.getOperand(idx - 1);
							val2 = (double) this.getOperand(idx + 1);
							result = val1 - val2;
							operands.set(idx, result);
							operands.remove(idx - 1);
							operands.remove(idx + 1);
						} else {
							System.out.println("Invalid Operator");
						}
					}
				}
			}
		}
		System.out.println("The result is " + operands.get(0));
	}

}
