public class Q1_2017 {

  // Part A
  public Digits(int num) {
    this.digitList = new ArrayList<Integer>();
    if (num == 0) {
      this.digitList.add(0);
    } //end if

    while (num > 0) {
      this.digitList.add(0, num % 10);
      num /= 10;
    } //end while
  } //end Digits()


  // Part B
  public boolean isStrictlyIncreasing() {
    for (int i = 0; i < this.digitList.size() - 1; i++) {
      if (this.digitList.get(i) >= this.digitList.get(i + 1)) {
        return false;
      } //end if
    } //end for loop
    return true;
  } //end isStrictlyIncreasing()


} //end class
