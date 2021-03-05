import java.util.*;

public class Q4_2018 {
  public static int[] getColumn(int[][] arr2D, int c) {
    int[] result = new int[arr2D.length];
    for (int i = 0; i < arr2D.length; i++) {
      result[i] = arr2D[i][c];
    } //end for loop
    return result;
  } //end getColumn()

  public static boolean isLatin(int[][] square) {
    if (containsDuplicates(square[0])) {
      for (int i = 0; i < square.length; i++) {
        if (hasAllValues(square[0], square[i]) && hasAllValues(square[0], getColumn(square, i))) {
          return true;
        } //end if
        return false;
      } //end for loop
    } //end if
    return false;
  } //end isLatin()

} //end class
