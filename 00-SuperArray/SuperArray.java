import java.util.*;

public class SuperArray {
  private int[] array;
  private int numValues;

  public SuperArray(int size) {
    this.array = new int[size];
    this.numValues = 0;
  } //end structor

  public SuperArray() {
    this.array = new int[10];
    this.numValues = 0;
  } //end overloaded

  public void add(int val) {
    this.array[this.numValues] = val;
    this.numValues++;
  } //end add()

  public void add(int index, int val) {
    this.array[index] = val;
    if (index > this.numValues) {
      this.numValues = index + 1;
    } //end if
  } //end second add()

  public void grow(int n) {
    int size = this.array.length;
    this.array = new int[size + n];
  } //end grow()

  public void set(int i, int val) {
    if (this.array[i] != 0) {
      for (int j = this.numValues; j >= this.numValues - i; j--) {
        this.array[j] = this.array[j - 1];
      } //end for loop
      this.array[i] = val;
      this.numValues++;
    } //end if the value in that index is not 0

    else {
      if (i > this.numValues) {
        this.array[i] = val;
        this.numValues = i + 1;
      } //end if

      else {
        this.array[i] = val;
      } //end else

    } //end else

  } //end set()

  public boolean isEmpty() {
    return (this.numValues == 0);
  } //end isEmpty()

  public void remove(int index) {

  } //end remove()

  public String toString() {
    String output = "";
    for (int i = 0; i < this.numValues; i++) {
      output += this.array[i] + " ";
    } //end for loop
    return output;
  } //end toString()

} //end class
