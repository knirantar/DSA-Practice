package String;

/*
 * 
 * Given two strings needle and haystack, return the index of the first occurrence of 
 * needle in haystack, or -1 if needle is not part of haystack.
 */
public class FindIndexOfFirstOccurrence {
    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issip";
        int ind = findNeedleInHaytsack(haystack, needle);
        System.out.println(ind);
    }

    private static int findNeedleInHaytsack(String haystack, String needle) {
        if (needle.length() == 0)
            return 0;
        for (int i = 0; i < haystack.length() + 1 - needle.length(); i++) {
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
                if (j == needle.length() - 1) {
                    return i;
                }
            }
        }
        return -1;
    }

}
