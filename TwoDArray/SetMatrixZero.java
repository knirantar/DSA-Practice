package TwoDArray;

/*
 * Given a matrix if an element in the matrix is 0 then 
 * you will have to set its entire column and row to 0 and then return the matrix.
 */
import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZero {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

        for (int i = 0; i < matrix.size(); i++) {
            System.out.println(matrix.get(i));
        }
        
    }

}
