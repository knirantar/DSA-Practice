package BitManipulation;

public class BitManipulationPractice {
    public static void main(String[] args) {
        int a = 88;
        // 1010000
        int i = 4;
        // 11000
        // 1000
        // 01000
        // if ((a & (1 << i)) != 0) {
        // System.out.println("bit is set");
        // } else {
        // System.out.println("bit is not set");
        // }

        // set the ith bit
        //a = a | (1 << 1);
        System.out.println(a);

        // clear the ith bit
        //a = a & (1 << i);
        System.out.println(a);

        // toggle the ith bit
        //a = a ^ (1 << i);
        System.out.println(a);

        //clear the last set bit rightmost
        a = a & (a-1);
        System.out.println(a);

    }
}
