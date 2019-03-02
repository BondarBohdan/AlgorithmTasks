package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Number178 implements Action {
    // 178 б) в)
    @Override
    public void run() {
        Scanner scanner=new Scanner(System.in);
        System.out.print("n (count of numbers) - ");
        int n=scanner.nextInt();
        int[] sequence=new int[n];
        System.out.println("Fill sequence of n numbers ");
        for (int i=0;i<n;++i){
            sequence[i]=scanner.nextInt();
        }
        int multiple3notMultiple5count= (int)Arrays.stream(sequence)
                .filter(number->number%3<Double.MIN_VALUE)
                .filter(number->number%5>Double.MIN_VALUE)
                .count();
        int squareOfEvenNumberCount=(int)Arrays.stream(sequence)
                .filter(number->Math.sqrt(number)%2<Double.MIN_VALUE).count();
        System.out.println("Count of numbers multiple 3 but not multiple 5: "
        + multiple3notMultiple5count);
        System.out.println("Count of numbers which are squares of even numbers: "
        + squareOfEvenNumberCount);
    }
}
