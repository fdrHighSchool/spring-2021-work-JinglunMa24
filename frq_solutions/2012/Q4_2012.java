public class Q4_2012 {

  // Part A
  public int countWhitePixels() {
    int count = 0;
    for (int row = 0; row < pixelValues.length; row++) {
      for (int col = 0; col < pixelValues[row].length; col++) {
        if (pixelValues[row][col] == WHITE) {
          count++;
        } //end if
      } //end for col loop
    } //end for row loop
    return count;
  } //end countWhitePixels()


  // Part B
  public void processImage() {
    for (int row = 0; row < pixelValues.length; row++) {
      for (int col = 0; col < pixelValues[row].length; col++) {
        if (row + 2 < pixelValues.length && col + 2 < pixelValues[row].length) {
          pixelValues[row][col] -= pixelValues[row + 2][col + 2];
        } //end if
        if (pixelValues[row][col] < BLACK) {
          pixelValues[row][col] == BLACK;
        } //end if
      } //end for col loop
    } //end for row loop
  } //end processImage()

} //end class
