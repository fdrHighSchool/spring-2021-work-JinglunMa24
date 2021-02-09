public class Driver2 {
  public static void main(String[] args) {
    GradeBook book1 = new GradeBook();
    book1.addExamGrade(90);
    book1.addExamGrade(100);
    book1.addExamGrade(95);
    book1.addHWGrade(90);
    System.out.println(book1);
    System.out.println(book1.getExamAverage());

  } //end main

} //end class
