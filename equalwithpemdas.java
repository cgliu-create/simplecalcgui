
import java.util.ArrayList;

public class equalwithpemdas {

	public equalwithpemdas() {
	}
	private static ArrayList<Double>numbers = new ArrayList<Double>();
	private static ArrayList<Character>operations= new ArrayList<Character>();
	
	public double equalopm (String input) {
		String temp = "";
		for(int i = 0; i<input.length(); i++) {
			if(input.charAt(i) != '+' && input.charAt(i) != '-' && input.charAt(i) != '/' && input.charAt(i) != '*') {
				temp = temp + input.charAt(i);
			}
			if(input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '/' || input.charAt(i) == '*' || i == input.length()-1) {
				double num1 = Double.parseDouble(temp);
				numbers.add(num1);
				operations.add(input.charAt(i));
				temp = "";
			}
		}
		double tempm = 0;
		//mdas of pemdas
		for(int i = operations.size()-1; i>=0; i--) {
			if(operations.get(i) == '*') {
				tempm = numbers.get(i) * numbers.get(i+1);
				numbers.set(i+1, tempm);
				operations.remove(i);
				numbers.remove(i);
				tempm = 0;
			}
		}
		for(int i = operations.size()-1; i>=0; i--) {
			if(operations.get(i) == '/') {
				tempm = numbers.get(i) / numbers.get(i+1);
				numbers.set(i+1, tempm);
				operations.remove(i);
				numbers.remove(i);
				tempm = 0;
			}
		}
		for(int i = operations.size()-1; i>=0; i--) {
			if(operations.get(i) == '+') {
				tempm = numbers.get(i);
				tempm = tempm + numbers.get(i+1);
				numbers.set(i+1, tempm);
				operations.remove(i);
				numbers.remove(i);
				tempm = 0;
			}
		}
		for(int i = operations.size()-1; i>=0; i--) {
			if(operations.get(i) == '-') {
				tempm = numbers.get(i);
				tempm = tempm - numbers.get(i+1);
				numbers.set(i+1, tempm);
				operations.remove(i);
				numbers.remove(i);
				tempm = 0;
			}
		}
		return numbers.get(0);
	}
	// testing method below
	public static void main(String[] args) {
		
		equalwithpemdas chris = new equalwithpemdas();
		double num = chris.equalopm("1+2*3+4/5");
		System.out.println(num);
		
		
		// list of numbers
				// list of operations
				String input = "1+2*3+4/5";
				String temp = "";
				// reads input, recording numbers and operations
				for(int i = 0; i<input.length(); i++) {
					if(input.charAt(i) != '+' && input.charAt(i) != '-' && input.charAt(i) != '/' && input.charAt(i) != '*') {
						temp = temp + input.charAt(i);
					}
					if(input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '/' || input.charAt(i) == '*' || i == input.length()-1) {
						double num1 = Double.parseDouble(temp);
						numbers.add(num1);
						operations.add(input.charAt(i));
						temp = "";
					}
				}
				// goes through operation on associated list of numbers
				// reads list of operations, looks for operation
				// 1 + 2 + 3 * 4 + 5
				// 1, 2, 3, 4, 5
				// +, +, *, +
				// 0  1  2  3  4
				double tempm = 0;
				for(int i = operations.size()-1; i>=0; i--) {
					if(operations.get(i) == '*') {
						tempm = numbers.get(i) * numbers.get(i+1);
						numbers.set(i+1, tempm);
						operations.remove(i);
						numbers.remove(i);
						tempm = 0;
					}
				}
				for(int i = operations.size()-1; i>=0; i--) {
					if(operations.get(i) == '/') {
						tempm = numbers.get(i) / numbers.get(i+1);
						numbers.set(i+1, tempm);
						operations.remove(i);
						numbers.remove(i);
						tempm = 0;
					}
				}
				// does operation, changes list of numbers and list of operations
				
				for(int i = operations.size()-1; i>=0; i--) {
					if(operations.get(i) == '+') {
						tempm = numbers.get(i);
						tempm = tempm + numbers.get(i+1);
						numbers.set(i+1, tempm);
						operations.remove(i);
						numbers.remove(i);
						tempm = 0;
					}
				}
				
				for(int i = operations.size()-1; i>=0; i--) {
					if(operations.get(i) == '-') {
						tempm = numbers.get(i);
						tempm = tempm - numbers.get(i+1);
						numbers.set(i+1, tempm);
						operations.remove(i);
						numbers.remove(i);
						tempm = 0;
					}
				}
				System.out.println( numbers.get(0));
		
		
	}
}
