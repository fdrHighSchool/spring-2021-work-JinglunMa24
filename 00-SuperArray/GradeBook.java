public class GradeBook {
  SuperArray exam;
  SuperArray homework;
  private double examAverage;
  private double homeworkAverage;

  public GradeBook() {
    this.exam = new SuperArray("exam");
    this.homework = new SuperArray("homework");
  } //end constructor

  public void addExamGrade(int val) {
    this.exam.add(val);
  } //end addExamGrade

  public void addHWGrade(int val) {
    this.homework.add(val);
  } //end addHWGrade()

  public double getAverage(SuperArray arr) {
    double sum = 0;
    for (int i = 0; i < arr.getSize(); i++) {
      sum += arr.getValues(i);
    } //end for loop
    return sum / arr.getSize();
  } //end getAverage()

  public void replaceExamLowestValue(int val) {
    int index = 0;
    int lowest = this.exam.getValues(0);
    for (int i = 0; i < this.exam.getSize(); i++) {
      if (this.exam.getValues(i) < lowest) {
        lowest = this.exam.getValues(i);
        index = i;
      } //end
    } //end for loop
    this.exam.add(index, val);
  } //end replaceLowest()

  public void replaceHWLowestValue(int val) {
    int index = 0;
    int lowest = this.homework.getValues(0);
    for (int i = 0; i < this.homework.getSize(); i++) {
      if (this.homework.getValues(i) < lowest) {
        lowest = this.homework.getValues(i);
        index = i;
      } //end
    } //end for loop
    this.homework.add(index, val);
  } //end replaceLowest()

  public void displayAverages() {
    System.out.println("exam average: " + getAverage(this.exam));
    System.out.println("homework average: " + getAverage(this.homework));
    System.out.println("Total average: " + (getAverage(this.exam) + getAverage(this.homework)) / 2);
  } //end displayAverages()

  public String toString() {
    String output = "";
    output += this.exam + "\n" + this.homework;
    return output;
  } //end toString()

} //end class
