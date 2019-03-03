package Tasks;

import java.util.Scanner;
import static java.lang.Math.*;

public class Number108 implements Action {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter natural number N: ");
        int n = scanner.nextInt();
        int k =0;
        double p = 1; // p=2^k , k=0 => p=1;

        while(p<=n) {
            k++;
            p = pow(2, k);
        }
        System.out.println("Result : \n" + "p = " + p + " || p = 2^" + k);
    }
}
