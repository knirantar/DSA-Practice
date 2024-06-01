package String;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/*
 * Given a string s, sort it in decreasing order based on the 
 * frequency of the characters. The frequency of a character is the
 * number of times it appears in the string.
 * 
 */
public class SortCharactersByFrequency {
    public static void main(String[] args) {
        String a = "Aabb";
        System.out.println(sortByFrequency(a));
    }

    private static String sortByFrequency(String a) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            Character ch = a.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        }
        List<Character> li = new ArrayList(map.keySet());
        li.sort((ob1, ob2) -> map.get(ob2) - map.get(ob1));

        for (Character c : li) {
            for (int i = 0; i < map.get(c); i++) {
                ans.append(c);
            }
        }
        return ans.toString();

    }

}
