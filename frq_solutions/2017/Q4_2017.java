public class Q4_2017 {

  // Part A
  public static Position findPosition(int num, int[][] intArr) {
    for (int row = 0; row < intArr.length; row++) {
      for (int col = 0; col < intArr[row].length; col++) {
        if (intArr[row][col] == num) {
          return Position(row, col)
        } //end if
      } //end for col
    } //end for row
    return null;
  } //end findPosition()


  // Part B
  public static Poition[][] getSuccessorArray(int[][] intArr) {
    Position[][] result = new Position[intArr.length][intArr[0].length];
    for (int row = 0; row < intArr.length; row++) {
      for (int col = 0; col < intArr[row].length; col++) {
        result[row][col] = findPosition(intArr[row][col] + 1, intArr);
      } //end for col
    } //end for row
    return result;
  } //end getSuccessorArray()

} //end class
