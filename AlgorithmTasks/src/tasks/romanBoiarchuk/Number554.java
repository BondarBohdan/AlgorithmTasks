package Tasks;

import java.util.Scanner;

public class Number554 implements Action {
    @Override
    public void run() {
        Scanner scanner=new Scanner(System.in);
        System.out.print("n (max value of Pifagore triple) : ");
        int n=scanner.nextInt();
        int a;
        double squareA;
        System.out.println("triples of numbers that correspond the condition: a^2+b^2=c^2 ");
        for (int c=1;c<=n;++c){
            for (int b=1;b<c;++b){
                squareA=Math.pow(c,2)-Math.pow(b,2);
                a=(int)Math.sqrt(squareA);
                if (Math.sqrt(squareA)%1<Double.MIN_VALUE){
                    System.out.println("a="+a+" b="+b+ " c="+c);
                }
            }
        }
    }
}
