
import java.util.ArrayList;

public class equalsoperation {

	public equalsoperation() {
	}
	
	public double equalop(String input) {
		ArrayList<Double>numbers= new ArrayList<Double>();
		ArrayList<Character>operations= new ArrayList<Character>();
		String temp = "";
		// reads input, recording numbers and operations
		for(int i = 0; i<input.length(); i++) {
			if(input.charAt(i) != '+' && input.charAt(i) != '-' && input.charAt(i) != '/' && input.charAt(i) != '*') {
				temp = temp + input.charAt(i);
				//System.out.println(temp);
			}
			if(input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '/' || input.charAt(i) == '*' || i == input.length()-1) {
				double num = Double.parseDouble(temp);
				//System.out.println(num);
				numbers.add(num);
				operations.add(input.charAt(i));
				//System.out.println(input.charAt(i));
				temp = "";
			}
		}
		//System.out.println(numbers);
		//System.out.println(operations);
		double output = numbers.get(0);
		//System.out.println(output);
		// goes through list of operations on list of numbers
		for(int i = 1; i<numbers.size(); i++) {
			if(operations.get(i-1) == '+') {
				output = output + numbers.get(i);
			}
		//System.out.println(output);
			if(operations.get(i-1) == '-') {
				output = output - numbers.get(i);
			}
		//System.out.println(output);
			if(operations.get(i-1) == '/') {
				output = output / numbers.get(i);
			}
		//System.out.println(output);
			if(operations.get(i-1) == '*') {
				output = output * numbers.get(i);
			}
		//System.out.println(output);
		}
		return output;
	}
	
	
	// testing method below
	public static void main(String[] args) {
		
		equalsoperation chris = new equalsoperation();
		double num = chris.equalop("123+1.1234");
		System.out.println(num);
		
		
	}
}
