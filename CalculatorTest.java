import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	@Test 
	void twoPlusTwoShouldEqualFour() {
		var calc = new Calculator();
		assertEquals(expected:4, calc.add(numberA:2, numberB:2));
	}
}