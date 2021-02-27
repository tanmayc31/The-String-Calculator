package tanmay_.string_calculator;


public class Calculator {

	public int calculate(String string) {
		if(string.isEmpty()) {
		return 0;
		}
		return Integer.parseInt(string);
	}
	

}
