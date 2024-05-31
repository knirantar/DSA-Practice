package String;

public class CheckIfRotatedString {
    public static void main(String[] args) {
        String a = "abcde";
        String goal = "cdeab";
        ifRotated(a, goal);
    }

    private static Boolean ifRotated(String a, String goal) {
        if (a.length() == 0 || a.length() == 0)
            return true;

        Character c = a.charAt(0);

        for (int i = 0; i < goal.length(); i++) {

        }
    }

}
