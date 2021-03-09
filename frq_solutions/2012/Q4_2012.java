public class Q4_2012 {
  public int countWhitePixels() {
    int count = 0;
    for (int row = 0; row < pixelValues.length; row++) {
      for (int col = 0; col < pixelValues[row].length; col++) {
        if (pixelValues[row][col] == BLACK) {
          count++;
        } //end if
      } //end for col loop
    } //end for row loop
    return count;
  } //end countWhitePixels()

  public void processImage() {
    for (int row = 0; row < pixelValues.length - 2; row++) {
      for (int col = 0; col < pixelValues[row].length - 2; col++) {
        pixelValues[row][col] -= pixelValues[row + 2][col + 2];
      } //end for col loop
    } //end for row loop
  } //end processImage()

} //end class
