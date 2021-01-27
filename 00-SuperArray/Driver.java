public class Driver {
  public static void main(String[] args) {
    SuperArray arr1 = new SuperArray("arr1", 5);
    arr1.add(90);
    arr1.add(100);
    arr1.add(95);
    arr1.add(95);
    arr1.add(95);
    System.out.println(arr1);
    arr1.add(2, 100);
    arr1.add(3, 100);
    System.out.println(arr1);
    System.out.println(arr1.isEmpty());

    SuperArray arr2 = new SuperArray("arr2");
    arr2.add(90);
    arr2.add(4, 90);
    arr2.add(2, 90);
    arr2.add(99);
    arr2.add(9, 100);
    System.out.println(arr2);

    SuperArray arr3 = new SuperArray("arr3");
    arr3.add(90);
    arr3.add(91);
    arr3.add(93);
    arr3.add(94);
    arr3.add(95);
    System.out.println(arr3);
    arr3.set(2, 92);
    System.out.println(arr3);
    arr3.add(7, 97);
    System.out.println(arr3);
    arr3.set(6, 96);
    System.out.println(arr3);
    arr3.set(9, 99);
    System.out.println(arr3);

    SuperArray arr4 = new SuperArray("arr4");
    for (int i = 0; i < 10; i++) {
      arr4.add(i * 10);
    } //end for loop
    System.out.println(arr4);
    arr4.grow(2);
    arr4.add(100);
    arr4.add(110);
    System.out.println(arr4);

    SuperArray arr5 = new SuperArray("arr5", 5);
    for (int i = 0; i < 5; i++) {
      arr5.add(i * 10);
    } //end for loop
    System.out.println(arr5);
    arr5.add(100);
    System.out.println(arr5);
    arr5.add(7, 90);
    System.out.println(arr5);

  } //end main

} //end class
