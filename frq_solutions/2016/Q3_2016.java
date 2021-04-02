public class Q3_2016 {

  // Part A
  private boolean toBeLabled(int r, int c, boolean[][] blackSquares) {
    if (blackSquares[r][c]) {
      return false;
    } //end if
    if (r == 0 || c == 0) {
      return true;
    } //end else if
    if (blackSquares[r - 1][c] || blackSquares[r][c-1]) {
      return true;
    } //end if
    return false;
  } //end toBeLabled()


  // Part B
  public Crossword(boolean[][] blackSquares) {
    puzzle = new Square[blackSquares.length][blackSquares[0].length];
    int n = 1;
    for (int i = 0; i < blackSquares.length; i++) {
      for (int j = 0; j < blackSquares[0].length; j++) {
        if (toBeLabled(i, j, blackSquares)) {
          puzzle[i][j] = new Square(false, n);
          n++;
        } //end if
        else {
          puzzle[i][j] = new Square(blackSquares[i][j], 0);
        } //end else
      } //end for j loop
    } //end i loop
  } //end Crossword

} //end Q3_2016
