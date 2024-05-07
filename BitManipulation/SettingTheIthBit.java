package BitManipulation;

public class SettingTheIthBit {
    public static void main(String[] args) {
        int x = 11;
        int i = 2;
        // 0001 --> 0100
        // 0100 | 1011 --> 1111
        // Left shift the 1 by i bits and then OR operation with number
        int result = x | (1 << i);
        System.out.println(result);
    }

}
