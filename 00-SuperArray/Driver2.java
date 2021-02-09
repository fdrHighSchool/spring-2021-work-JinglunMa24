public class Driver2 {
  public static void main(String[] args) {
    GradeBook book1 = new GradeBook();
    book1.addExamGrade(90);
    book1.addExamGrade(100);
    book1.addExamGrade(89);
    book1.addExamGrade(95);
    book1.addHWGrade(90);
    book1.addHWGrade(90);
    book1.addHWGrade(90);
    System.out.println(book1);
    book1.displayAverages();
    
    System.out.println();
    book1.replaceExamLowestValue(100);
    book1.replaceHWLowestValue(100);
    System.out.println(book1);

  } //end main

} //end class
