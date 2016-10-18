package test4;

import static org.junit.Assert.*;

import org.junit.Test;

import calculator.Calculator;

public class CalculatorTest {

	@Test
	public void testAddNumbers() {
		Calculator calc = new Calculator();
		assertEquals(calc.addNumbers(5, 5),10,0.0);
	}

	
	@Test
	public void testSubtractNumbers() {
		Calculator calc = new Calculator();
		assertEquals(calc.subtractNumbers(10, 5),5,0.0);
	}
	
	
	@Test
	public void testAddNumber() {
		Calculator calc = new Calculator();
		assertEquals(calc.divideNumbers(5, 5),1,0.0);
	}
	
	@Test
	public void testMultiplyNumbers(){
		
		Calculator calc = new Calculator();
		assertEquals(calc.multiplicateNumbers(5, 5),25,0.0);
	}
}
