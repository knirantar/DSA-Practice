package RandomQuestions;

public class MinChairs {
    public static void main(String[] args) {
        String s = "CRUL";

        calculateMinChairs(s);
    }

    public static int calculateMinChairs(String s) {
        int res = 0;
        int occ = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'C') {
                res++;
                occ++;
            } else if (s.charAt(i) == 'R') {
                if (occ != 0) {
                    occ--;
                }
            } else if (s.charAt(i) == 'U') {
                occ++;
            } else if (s.charAt(i) == 'L') {
                occ--;
            }
        }
        return res;
    }

}
