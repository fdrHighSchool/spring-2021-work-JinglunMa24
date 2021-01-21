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
  } //end overloaded

  public void add(int val) {
    this.array[this.numValues] = val;
    this.numValues++;
  } //end add()

  public void add(int index, int val) {
    
  } //end second add()

  public void grow(int n) {
    int size = this.array.length;
    this.array = new int(size + n);
  } //end grow()

  public void set(int i, int val) {

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
