import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
  
        @Test
        public void twoPlusTwoEqualsFour(){
            Calculator calc = new Calculator();
            assertEquals(4, calc.add(2, 2));
        }

        @Test
        public void twoMinusTwoEqualsZero(){
            Calculator calc = new Calculator();
            assertEquals(0, calc.subtract(2, 2));
        }

        @Test
        public void twoTimesThreeEqualsSix(){
            Calculator calc = new Calculator();
            assertEquals(6, calc.multiply(2, 3));
        }

        @Test
        public void tenDividedByTwoEqualsFive(){
            Calculator calc = new Calculator();
            assertEquals(5, calc.divide(10, 2));
        }
    
}



