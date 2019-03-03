package Tasks.volodymyr;

public class Number322  implements Tasks.Action {
    @Override
    public void run() {
        System.out.println();
        int limit = 10000;
        calculateMaxDividersSum(limit);
    }

    static void calculateMaxDividersSum(int limit){
        int dividersSum;
        int number = 0;
        int maxDividersSum = 0;

        for(int i = 0; i < limit; i++){
            dividersSum = sumOfDividers(i);
            if( dividersSum > maxDividersSum ){
                maxDividersSum = dividersSum;
                number = i;
            }
        }
        System.out.println("Number with max sum of dividers = " + number + "   sum = " + maxDividersSum );
    }

    static  int sumOfDividers(int number){
        int sum = 0;
        for(int i = 1; i < number; ++i){
            if(number % i == 0){
                sum += i;
            }
        }
        return sum;
    }
}
