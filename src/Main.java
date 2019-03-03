import Tasks.*;

import Tasks.Number178;
import Tasks.Number554;
import Tasks.alex.*;
import Tasks.mota.*;
import Tasks.bohdan.*;
import Tasks.olena.Number107;
import Tasks.olena.Number243;
import Tasks.volodymyr.Number88_a;
import Tasks.volodymyr.Number88_b;
import Tasks.volodymyr.Number322;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Map<String,Class<? extends Action>> numbersTasks=new HashMap<>();

        numbersTasks.put("178D", Number178D.class);
        numbersTasks.put("178G",Number178G.class);
        numbersTasks.put("555", Number555.class);
        numbersTasks.put("178", Number178.class);
        numbersTasks.put("554",Number554.class);
        numbersTasks.put("332", Number332.class);
        numbersTasks.put("88_a", Number88_a.class);
        numbersTasks.put("88_b", Number88_b.class);
        numbersTasks.put("88_v", Number88_v.class);
        numbersTasks.put("88_g", Number88_g.class);
        numbersTasks.put("322", Number322.class);
        numbersTasks.put("86",Number86.class);
        numbersTasks.put("330",Number330.class);
        numbersTasks.put("87", Number87.class);
        numbersTasks.put("226", Number226.class);
        numbersTasks.put("559", Number559.class);
        numbersTasks.put("107", Number107.class);
        numbersTasks.put("243", Number243.class);


        System.out.println("Available tasks: ");
        numbersTasks.keySet().forEach(System.out::println);

        System.out.println("Number: ");
        Scanner scanner=new Scanner(System.in);
        String number=scanner.nextLine();

        try {
            numbersTasks.get(number).getConstructor().newInstance().run();
        } catch (Exception ex) {}
        main();
    }
}
