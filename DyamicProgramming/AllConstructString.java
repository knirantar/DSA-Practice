package DyamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class AllConstructString {
    public static void main(String[] args) {
        String target = "purple";
        String[] a = { "purp", "p", "ur", "le", "purpl", "eeeeeeeeeee", "eeeeeee" };
        Map<String, Integer> map = new HashMap<>();
        System.out.println(allConstruct(target, a));
    }

    private static List<List<String>> allConstruct(String target, String[] a) {
        if (target.equals(""))
            return new ArrayList<>(List.of(new ArrayList<>()));

        List<List<String>> result = new ArrayList<>(); // Specify the type arguments

        for (String word : a) {
            if (target.indexOf(word) == 0) {
                String suffix = target.substring(word.length());
                List<List<String>> suffixWays = allConstruct(suffix, a);

                for (List<String> way : suffixWays) {
                    List<String> newWay = new ArrayList<>(way);
                    newWay.add(0, word);
                    result.add(newWay);
                }
            }
        }

        return result;
    }

}
