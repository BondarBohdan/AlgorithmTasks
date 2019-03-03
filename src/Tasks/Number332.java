package Tasks;

import java.util.Scanner;

public class Number332 implements Action {
    @Override
    public void run() {
        System.out.println("Enter number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int val = (int) Math.sqrt(number) + 1;
        for (int a = 0; a <= val; a++)
            for (int b = 0; b <= val; b++)
                for (int c = 0; c <= val; c++)
                    for (int d = 0; d <= val; d++) {
                        if (a * a + b * b + c * c + d * d == number) {
                            System.out.println(a + " " + b + " " + c + " " + d);
                        }
                    }
    }
}
