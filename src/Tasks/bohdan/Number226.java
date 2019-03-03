package Tasks.bohdan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Tasks.Action;

public class Number226 implements Action{

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n;
		int m;
		
		System.out.println("Дано натуральні n, m. Отримати всі їх наутральні спільні кратні менші mn.");
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
	
	public List<Integer> task(int n, int m) {
		List<Integer> list = new ArrayList<>();
		
		for (int i = n * m; i > 0; i--) {
			if ((i % n == 0) && (i % m == 0)) {
				list.add(i);
			}
		}
		
		return list;
	}
}
