package Tasks;

import java.util.Scanner;

import Tasks.olena.Degree;
import Tasks.olena.NumberOutOfRangeException;

public class Number107 {
	public void run(){
		boolean loop=true;
		Scanner scan;
		
		while(loop) {
			scan= new Scanner(System.in);
			System.out.println("Enter a natural number." +
					"\nEnter 'exit' to exit to main menu.");
			String input = scan.nextLine();
			
			switch(input) {
				case "exit":
					loop=false;
				break;
				
				default:
					try {
						int m=Integer.parseInt(input);
						int result = Degree.getDegree(m);
						System.out.println("k = "+result);
						
					}catch(NumberOutOfRangeException e) {
						System.out.println(e.getMessage());
					}catch(NumberFormatException e) {
						System.out.println("Number must be an integer.");
					}
			}
		}
	}
}
