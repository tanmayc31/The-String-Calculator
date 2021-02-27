package tanmay_.string_calculator;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

@Test
public class TestCalculator {
	
	private Calculator calculator;
	
	@BeforeTest
	public void init() {
		calculator = new Calculator();
		
	}
	public void emptyStringReturnsZero() {
		assertEquals(calculator.calculate(""), 0);
	}
	public void singleValueReturned() {
		assertEquals(calculator.calculate("1"), 1);
	}
	public void twoNumbersSumCommaDelimiter(){
		assertEquals(calculator.calculate("1,2"),3);
	}
	public void twoNumbersSumNewLineDelimiter(){
		assertEquals(calculator.calculate("1\n2"),3);
	}

}
