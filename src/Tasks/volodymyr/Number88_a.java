package Tasks.volodymyr;
import Tasks.Action;
import java.util.Scanner;

public class Number88_a  implements Action {

    @Override
    public void run() {
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("Enter power : ");
        int power = scanner.nextInt();

        System.out.println("Enter digit : ");
        int digit = scanner.nextInt();

        if(hasDigit(number,power,digit)){
            System.out.println(number + "^" + power + "  contains    " + digit );
        }else {
            System.out.println(number + "^" + power + " doesn't contain " + digit );
        }
    }

    static boolean hasDigit( int number, int power,  int digit){
        int m = (int)Math.pow(number, power);
        int checkingNumber  = m;
        while (checkingNumber > 0){
            if(checkingNumber % 10 == digit){
                return true;
            }
            checkingNumber/=10;
        }
        return false;
    }
}
