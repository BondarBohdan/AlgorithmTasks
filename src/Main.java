import Tasks.Action;
import Tasks.Number178;
import Tasks.Number554;
import Tasks.mota.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Map<String,Class<? extends Action>> numbersTasks=new HashMap<>();
        numbersTasks.put("178", Number178.class);
        numbersTasks.put("554",Number554.class);
        numbersTasks.put("86",Number86.class);
        numbersTasks.put("330",Number330.class);

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
