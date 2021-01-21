public class Driver {
  public static void main(String[] args) {
    SuperArray arr1 = new SuperArray(5);
    arr1.add(90);
    arr1.add(100);
    arr1.add(95);
    arr1.add(95);
    arr1.add(95);
    System.out.println(arr1);
    System.out.println(arr1.isEmpty());
    arr1.grow(2);
    arr1.add(95);
    System.out.println(arr1);

  } //end main

} //end class
