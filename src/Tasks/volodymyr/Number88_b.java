package Tasks.volodymyr;

import java.util.Scanner;
import Tasks.Action;
public class Number88_b implements Action {

    @Override
    public void run() {
        System.out.println("Enter number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number + "in reverse : " + reverseNumber(number));
    }

    static int reverseNumber( int number){

        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /=10;
        }
        System.out.println(reversedNumber);
        return reversedNumber;

    }

}
