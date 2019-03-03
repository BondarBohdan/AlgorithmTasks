package mota;

import java.util.Scanner;

/**
 * Number86 a,b. Count digits and sum of digits in natural number
 *
 * @author Yurii Mota
 * @version 1.0 02 March 2018=9
 */
public class Number86 implements Action {
    private final int divider = 10;

    public int countN(int n) {
        int count = 0;
        while (n > 0) {
            n /= divider;
            count++;
        }
        return count;
    }

    public int countSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % divider;
            n /= divider;
        }
        return sum;
    }

    @Override
    public void run() {
        int n;
        int action;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter natural number n");
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
            System.out.println("Choose your action\n1-Count digits in number \n2-Find sum of digits number n");
            action = scanner.nextInt();
            switch (action) {
                case 1:
                    System.out.println(countN(n));
                    break;
                case 2:
                    System.out.println(countSum(n));
                    break;
                default:
                    System.out.println("Wrong action. Try again");
            }
        } else {
            System.out.println("Wrong number");
        }


    }

}
