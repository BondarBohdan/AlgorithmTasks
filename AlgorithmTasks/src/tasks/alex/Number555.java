
package tasks.alex;

import tasks.Action;

import java.util.Scanner;

public class Number555 implements Action {
    Scanner scanner = new Scanner(System.in);
    @Override
    public void run() {

        System.out.println("input");


        new Number555().triangle();
    }
    public void triangle(){
        int ii=scanner.nextInt();
        long mat [][] = new long [ii][ii];
        for (int i = 0; i < ii; i++) {
            for (int j = 0; j < ii; j++) {
                if(j==0||j==i) {
                    mat[i][j] = 1;
                    System.out.print(mat[i][j] + " ");
                }
                else if(i>j){
                    mat[i][j]=mat[(i-1)][(j-1)]+mat[(i-1)][j];
                    System.out.print(mat[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
