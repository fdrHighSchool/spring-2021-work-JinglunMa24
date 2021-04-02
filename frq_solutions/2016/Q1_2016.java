public class Q1_2016 {

  // Part A
  public class RandomStringChooser {
    private ArrayList<String> arr;
    public RandomStringChooser(String[] a) {
      this.arr = new ArrayList<String>();
      for (String word : a) {
        this.arr.add(word);
      } //end for each loop
    } //end RandomStringChooser

    public String getNext() {
      if (this.arr.size() == 0) {
        return "NONE";
      } //end if
      int index = (int)(Math.random() * this.arr.size());
      return this.arr.remove(index);
    } //end getNext()
  } //end class


  // Part B
  public RandomLetterChooser(String str) {
    super(getSingleLetters(str));
  } //end RandomLetterChooser

} //end Q1_2016
