package bohdan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Tasks.Action;

public class Number559 implements Action{

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("Дано натуральне число n. Знайти всі менші n числа Мерсена. "
				+ "\n(Просте число називається числом Мерсена, якщо воно може бути представлено "
				+ "\nу вигляді 2^p - 1, де р - також просте число.)");
        System.out.println("n = ");
        n = sc.nextInt();
        
        try {
        	System.out.println(task(n));
        } catch(Exception e) {
        	System.out.println(e);
        }
	}
	
	public List<Integer> task(int p){
		List<Integer> list = new ArrayList<>();
		for (int j = 1; j <= p; j++) {
			int n = j;
			int n1 = n + 1;

			int power = 0;
			for (int i = 0;; i++) {
				power = (int) Math.pow(2, i);
				if (power > n1) {
					break;
				} else if (power == n1) {
					list.add(j);
				}
			}
		}
		return list;
	}
}
