package Tasks;

import java.util.Scanner;

public class Number88_v implements Action{
    @Override
    public void run() {
        System.out.println("Enter number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Before:");
        System.out.println(number);
        String stringNumber = String.valueOf(number);
        char[] chars = stringNumber.toCharArray();
        char firstChar = chars[0];
        chars[0] = chars[chars.length - 1];
        chars[chars.length - 1] = firstChar;
        String replacedString = new String(chars);
        Integer replacedInteger = Integer.valueOf(replacedString);
        System.out.println("After:");
        System.out.println(replacedInteger);
    }
}
