package Tasks.mota;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Number330. Find all perfect number from natural number
 *
 * @author Yurii Mota
 * @version 1.0 02 March 2019
 */
public class Number330 implements Action {
    public List<Integer> findPerfectNumber(int n) {
        int sum;
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (i == sum) {
                list.add(i);
            }
        }
        return list;
    }

    @Override
    public void run() {
        List<Integer> list;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter natural number ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            list = findPerfectNumber(n);
            System.out.println(list);
        } else {
            System.out.println("Wrong number");
        }
    }
}
