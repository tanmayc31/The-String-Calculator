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
	
	public void emptyStringReturnsZero() throws Exception {
		assertEquals(calculator.calculate(""), 0);
	}
	public void singleValueReturned() throws Exception {
		assertEquals(calculator.calculate("1"), 1);
	}
	public void twoNumbersSumCommaDelimiter() throws Exception{
		assertEquals(calculator.calculate("1,2"),3);
	}
	public void twoNumbersSumNewLineDelimiter() throws Exception{
		assertEquals(calculator.calculate("1\n2"),3);
	}
	public void moreThanTwoNumbersSumBothWaysDelimiter() throws Exception{
		assertEquals(calculator.calculate("1,2,3"),6);
	}
	@Test(expectedExceptions=Exception.class)
	public void negetiveNumberThrowsException() throws Exception {
		calculator.calculate("-1");
	}
	public void ignoreNumberGreaterThan1000() throws Exception{
		assertEquals(calculator.calculate("2,1001"),2);
	}
	public void diffDelimiter() throws Exception{
		assertEquals(calculator.calculate("//;\n1;2"),3);
	}
}
