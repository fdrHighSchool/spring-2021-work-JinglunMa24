import java.util.*;

public class Driver {
  public static void main (String[] args) {
    ArrayList<Point> points = new ArrayList<Point> ();
    Point p1 = new Point();
    Point p2 = new Point(2, 4);
    Point p3 = new Point(-6, 8);
    points.add(p1);
    points.add(p2);
    points.add(p3);
    System.out.println(points);

    System.out.println(p1.midPoint( p2.getX(), p2.getY() ));
    System.out.println(p1.distance( p3.getX(), p3.getY() ));
    System.out.println(p1.isCollinear( p2.getX(), p2.getY(), p3.getX(), p3.getY() ));

  } //end main

} //end class
