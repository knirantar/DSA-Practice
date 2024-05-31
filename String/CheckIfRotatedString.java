package String;

public class CheckIfRotatedString {
    public static void main(String[] args) {
        String a = "bbbacddceeb";
        String goal = "ceebbbbacdd";
        System.out.println(ifRotated(a, goal));
    }

    private static Boolean ifRotated(String a, String goal) {

        if (a.length() != goal.length())
            return false;

        String temp = a + a;
        if (temp.contains(goal)) {
            return true;
        } else {
            return false;
        }
    }

}
