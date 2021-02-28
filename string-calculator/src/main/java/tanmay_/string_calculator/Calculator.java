package tanmay_.string_calculator;


public class Calculator {
	//private String delimiter=",|\n";
	
	public int calculate(String input) throws Exception {
		String delimiter="[,|\n";
		
		
		if(isEmpty(input)) {
		return 0;
		}
		if(input.length() == 1) {
			return stringToInt(input);			
		}
	    if(input.charAt(0)=='/') {
			  delimiter+=input.charAt(2);
			  input = input.replace(input.substring(0,4), "");
		  }
		delimiter+=']';
		String[] numbers = input.split(delimiter);
		
		return addNum(numbers);
		
		}
	
	private int addNum(String[] numbers) throws Exception {
		
		negetiveNumbersInput(numbers);
		return calculations(numbers);
	}
	
	private int calculations(String[] numbers) {
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

