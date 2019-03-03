import Tasks.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Map<String,Class<? extends Action>> numbersTasks=new HashMap<>();

        numbersTasks.put("108",Number108.class);
        numbersTasks.put("331", Number331.class);

        System.out.println("\nAvailable tasks: ");
        numbersTasks.keySet().forEach(System.out::println);

        System.out.println("\nNumber: ");
        Scanner scanner=new Scanner(System.in);
        String number=scanner.nextLine();

        try {
            numbersTasks.get(number).getConstructor().newInstance().run();
        } catch (Exception ex) {}

        main();
    }
}
