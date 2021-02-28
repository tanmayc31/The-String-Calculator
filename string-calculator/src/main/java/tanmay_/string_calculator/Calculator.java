package tanmay_.string_calculator;


public class Calculator {
	private final String delimiter=",|\n";
	public int calculate(String input) throws Exception {
		String[] numbers = input.split(delimiter);
		
		if(isEmpty(input)) {
		return 0;
		}
		if(input.length() == 1) {
			return stringToInt(input);
				
		}
		else {
			
			return addNum(numbers);
		}
		}
	
	private int addNum(String[] numbers) throws Exception {
		
		negetiveNumbersInput(numbers);
		
		int sum=0;
		for(String i:numbers) {
			if(stringToInt(i)>1000) {
				continue;
			}
			sum +=stringToInt(i);
		}
		return sum;
	}
	
	private void negetiveNumbersInput(String[] numbers) throws Exception {
		for (String i:numbers) {
			if(stringToInt(i) < 0) {
				throw new Exception("negatives not allowed");		
			}
		}	
	}
	
	private boolean isEmpty(String input) {
		return input.isEmpty();
		
	}
	
	private int stringToInt(String input) {
		return Integer.parseInt(input);
	}

}
