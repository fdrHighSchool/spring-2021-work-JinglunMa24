public class Q1_2016 {

  // Part A
  public class RandomStringChooser {
    private ArrayList<String> arr;  // 1 point
    public RandomStringChooser(String[] a) {  // 1 point
      this.arr = new ArrayList<String>(); // 1 point
      for (String word : a) {
        this.arr.add(word);
      } //end for each loop
    } //end RandomStringChooser

    public String getNext() {
      if (this.arr.size() == 0) {
        return "NONE";  // 1 point
      } //end if
      int index = (int)(Math.random() * this.arr.size());  // 1 point
      return this.arr.remove(index);  // 2 points
    } //end getNext()
  } //end class


  // Part B
  public RandomLetterChooser(String str) {
    super(getSingleLetters(str));   // 2 points
  } //end RandomLetterChooser

  // Total points earned: 7 points

} //end Q1_2016
