package BitManipulation;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    public static void main(String[] args) {
        List<Integer> inp = new ArrayList<>();
        inp.add(1);
        inp.add(2);
        inp.add(3);
        inp.add(4);
        int n = inp.size();
        int subsets = 1 << n;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < subsets; i++) {
            List<Integer> temp = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    temp.add(inp.get(j));
                }
            }
            ans.add(temp);
        }
        System.out.println(ans);
    }

}
