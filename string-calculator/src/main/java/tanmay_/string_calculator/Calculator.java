package tanmay_.string_calculator;


public class Calculator {
	private final String delimiter=",|\n";
	public int calculate(String input) {
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
	
	private int addNum(String[] numbers) {
		int sum=0;
		for(int i=0;i<numbers.length;i++) {
			sum +=Integer.parseInt(numbers[i]);
		}
		return sum;
	}
	
	private boolean isEmpty(String input) {
		return input.isEmpty();
		
	}
	
	private int stringToInt(String input) {
		return Integer.parseInt(input);
	}

}
