import tasks.Action;
import tasks.alex.*;


import java.util.*;

import tasks.alex.*;

import tasks.romanBoiarchuk.*;

public class Main {
    public static void main(String[] args) {


        Map<String,Class<? extends Action>> numbersTasks=new HashMap<>();

        numbersTasks.put("178D", Number178D.class);
        numbersTasks.put("178G",Number178G.class);
        numbersTasks.put("555", Number555.class);


        System.out.println("Available tasks: ");
        numbersTasks.keySet().forEach(System.out::println);

        System.out.println("Number: ");
        Scanner scanner=new Scanner(System.in);
        String number=scanner.nextLine();

        try {
            numbersTasks.get(number).getConstructor().newInstance().run();
        } catch (Exception ex) {}

    }
}
