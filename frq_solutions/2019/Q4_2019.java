import java.util.*;

public class Q4_2019{
  public LightBoard(int numRows, int numColumns){
    boolean lights = new boolean [numRows][numColumns];
    for(int i = 0; i < numRows; i++ ){
      for(int j = 0; j < numColumns; j++){
        int random = (int)(Math.random() * 101);
        if (random >= 40 ){
          this.lights[numRows][numColumns] = false;
        } //end if
      } //end for j loop
    } //end for i loop
  } //end LightBoard()

  public boolean evaluateLight(int numRows, int numColumns){
    int count = 0;
    for (int i = 0; i < lights.length; i++){
      if(lights[i][numColumns]){
        count++;
      } //end if
    } //end for loop
    if (count % 3 == 0){
      return true;
    } //end if
    else if (count % 2 == 0){
      return false;
    } //end else
    return lights[row][col];
  } //end evaluateLight()

} //end class
