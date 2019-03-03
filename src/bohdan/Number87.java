package bohdan;

import java.util.Scanner;

import Tasks.Action;

public class Number87 implements Action{

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n;
		int m;
		
		System.out.println("Дано натуральні n, m. Отримати суму m останніх цифр числа n.");
        System.out.println("n = ");
        n = sc.nextInt();
        System.out.println("m = ");
        m = sc.nextInt();
        
        try {
        	System.out.println(task(n, m));
        } catch(Exception e) {
        	System.out.println(e);
        }
	}
	
	public int task(int n, int m) throws Exception {

		int sum = 0;
		
		if(String.valueOf(n).length() < m) {
			throw new Exception("m > n.length");
		}
		
		for (int i = 0; i < m; i++) {
			sum += (n % 10);
			n /= 10;
		}
		
		return sum;
	}
}
