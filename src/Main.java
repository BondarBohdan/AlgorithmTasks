import Tasks.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Map<String,Class<? extends Action>> numbersTasks=new HashMap<>();
        numbersTasks.put("178", Number178.class);
        numbersTasks.put("554",Number554.class);
        numbersTasks.put("332", Number332.class);
        numbersTasks.put("88_v", Number88_v.class);
        numbersTasks.put("88_g", Number88_g.class);

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
