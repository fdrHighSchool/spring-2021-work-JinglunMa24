import java.util.*;

public class SuperArray {
  private int[] array;
  private String name;
  private int numValues;

  public SuperArray(String name, int size) {
    this.array = new int[size];
    this.name = name;
    this.numValues = 0;
  } //end structor

  public SuperArray(String name) {
    this.array = new int[10];
    this.name = name;
    this.numValues = 0;
  } //end overloaded

  public void add(int val) {
    if (this.numValues == this.array.length) {
      grow(1);
    } //end grow size if array is full
    this.array[this.numValues] = val;
    this.numValues++;
  } //end add()

  public void add(int index, int val) {
    if (index > this.array.length) {
      grow(index - this.numValues + 1);
    } //end grow size if array is full

    this.array[index] = val;
    if (index > this.numValues) {
      this.numValues = index + 1;
    } //end if
  } //end second add()

  public void grow(int n) {
    int[] temp = new int[this.array.length + n];
    for (int i = 0; i < this.numValues; i++) {
      temp[i] = this.array[i];
    } //end for loop
    this.array = temp;
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
    if (index < this.numValues) {
      for (int i = index; i < this.numValues - 1; i++) {
        this.array[i] = this.array[i + 1];
      } //end for loop
      this.numValues--;
    } //end if
  } //end remove()

  public int getSize() {
    return this.numValues;
  } //end getSize()

  public String toString() {
    String output = this.name + ": ";
    for (int i = 0; i < this.numValues; i++) {
      output += this.array[i] + " ";
    } //end for loop
    return output;
  } //end toString()

} //end class
