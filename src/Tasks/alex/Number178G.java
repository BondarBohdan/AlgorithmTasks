package tasks.alex;


public class Number178G extends Number178 {
    @Override
    public void run() {
        System.out.println("input");
        new Number178G().naturalNumbersG();
    }

    private void naturalNumbersG(){

        int ii=scanner.nextInt();
        int mat []= genArray(ii);
        System.out.println("результат");
        for (int i=0;i<ii;i++ ) {
            if (i == 0 || i == ii)
                continue;
            if (mat[i] < ((mat[i - 1] + mat[i + 1]) / 2))
                System.out.println(mat[i]);
        }
    }
}
