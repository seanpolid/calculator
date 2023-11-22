package seanp.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTests {
	
	@Test
	public void test_sum_success() {
		// Act
		int sum = Calculator.sum(1, 2);
		
		// Assert
		assertEquals(3, sum);
	}
}
