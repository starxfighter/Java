package classes;

public class calculator implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double operandOne = 0.00;
	private double operandTwo = 0.00;
	private String operation = "";
	private double result = 0.00;
	
	public calculator() {}
	
	private double getOperandOne() {
		return operandOne;
	}
	public void setOperandOne(double d) {
		this.operandOne = d;
	}
	private double getOperandTwo() {
		return operandTwo;
	}
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	private String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}

	private double getResult() {
		return result;
	}

	private void setResult(double result) {
		this.result = result;
	}
	
	public void performOperation() {
		double tempA = this.getOperandOne();
		double tempB = this.getOperandTwo();
		String oper = this.getOperation();
		if (oper == "+") {
			double result = tempA + tempB;
			this.setResult(result);
		} else if (oper == "-") {
			double result = tempA - tempB;
			this.setResult(result);
		} else {
			System.out.println("Bad Operation type");
		}

	}
	
	public void getResults() {
		System.out.println("The result of the entered information is " + this.getResult());
	}
	
	
	

}
