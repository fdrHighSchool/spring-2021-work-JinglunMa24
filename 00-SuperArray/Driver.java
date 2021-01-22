public class Driver {
  public static void main(String[] args) {
    SuperArray arr1 = new SuperArray(5);
    arr1.add(90);
    arr1.add(100);
    arr1.add(95);
    arr1.add(95);
    arr1.add(95);
    System.out.println(arr1);
    arr1.set(2, 100);
    arr1.set(3, 100);
    System.out.println(arr1);
    System.out.println(arr1.isEmpty());

    SuperArray arr2 = new SuperArray();
    arr2.add(90);
    arr2.set(4, 90);
    arr2.set(2, 90);
    arr2.add(99);
    arr2.set(9, 100);
    System.out.println(arr2);

  } //end main

} //end class
