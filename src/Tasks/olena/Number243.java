package Tasks.olena;

import Tasks.Action;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Number243 implements Action {
	
	public void run(){
		boolean loop=true;
		Scanner scan;
		
		while(loop) {
			scan= new Scanner(System.in);
			System.out.println("Enter 'a' for 243a or 'b' for 243b." +
					"\nEnter 'exit' to exit to main menu.");
			String input = scan.nextLine();
			
			switch(input) {
				case "a":
					functionCall(true);
				break;
				
				case "b":
					functionCall(false);
				break;
				
				case "exit":
					loop=false;
				break;
				
				default:
					System.out.println("'"+input+"' is not a command. Try again.");
			}
			
		}
	}
	
	private void functionCall(boolean choice) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter n: ");
		
		try {
			int n=scan.nextInt();
			Object result;
			if(choice)
				result = SumOfSquares.a(n);
			else 
				result = SumOfSquares.b(n);
			show(result);
			
		}catch(NumberOutOfRangeException e) {
			System.out.println(e.getMessage());
		}catch(InputMismatchException e) {
			System.out.println("Input must be an integer.");
		}
	}
	
	private void show(Object o) {
		if(o == null)
			System.out.println("No natural numbers apply.");
		else if(o instanceof Pair){
			System.out.println((Pair)o);
		}else{
			for(Pair p:(Set<Pair>)o) {
				System.out.println(p);
			}
		}
	}
}
