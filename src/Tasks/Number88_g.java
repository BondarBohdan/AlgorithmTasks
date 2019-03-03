package Tasks;

import java.util.Scanner;

public class Number88_g implements Action {
    @Override
    public void run() {
        System.out.println("Enter number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number);
        String stringNumber = String.valueOf(number);
        stringNumber = "1" + stringNumber + "1";
        Integer replacedInteger = Integer.valueOf(stringNumber);
        System.out.println(replacedInteger);
    }
}
