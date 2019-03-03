package tasks.alex;


public class Number178D extends Number178 {
    @Override
    public void run() {

        System.out.println("input");
        new Number178D().naturalNumbersD();
    }

    private int calculateFactorial(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;
    }


    private void naturalNumbersD(){
        System.out.println("результат");
        int ii=scanner.nextInt();
        int mat []= genArray(ii);
        for (int i=0;i<ii;i++ ) {
            if ((2^i)<mat[i]&&mat[i]<calculateFactorial(i))
                System.out.println(mat[i]);
        }
    }
}
