package Tasks.danylo;

import Tasks.Action;

import java.util.Scanner;

public class Number331 implements Action {
    @Override
    public void run() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter natural number N: ");
        int n = scan.nextInt();

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                for (int z = 0; z < n; z++) {
                    if(n==(x*x+y*y+z*z))
                        System.out.println("\nx=" + x + " y=" + y + " z=" + z);
                }
            }
        }
    }
}
