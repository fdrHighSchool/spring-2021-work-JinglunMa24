public class GradeBook {
  SuperArray exam;
  SuperArray homework;

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

  public double getExamAverage() {
    double sum = 0;
    for (int i = 0; i < this.exam.getSize(); i++) {
      sum += this.exam.getValues(i);
    } //end for loop
    return sum / this.exam.getSize();
  } //end getExamAverage()

  public String toString() {
    String output = "";
    output += this.exam + "\n" + this.homework;
    return output;
  } //end toString()

} //end class
