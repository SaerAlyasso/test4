package calculator;

public class Calculator {

	
	public double addNumbers(double one, double two){
		
		return one+two;
	}
	
	public double subtractNumbers(double one, double two){
		
		return one-two;
	}
	
	public double mulipicateNumbers(double one, double two){
		
		return one*two;
	}
	
	public double divideNumbers(double one, double two){
		
		if(one==0.0){
			return -100;
		}
		
		return one/two;
	}
}
