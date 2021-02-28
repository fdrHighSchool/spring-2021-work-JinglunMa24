import java.util.*;

public class Point {
  private int x;
  private int y;

  public Point(int x, int y) {
    setLocation(x, y);
  } //end Point (constructor)

  public Point() {
    this(0,  0);
  } //end overloaded (constructor)

  public int getX() {
    return x;
  } //end getX()

  public int getY() {
    return y;
  } //end getY()

  public void setLocation(int x, int y) {
    this.x = x;
    this.y = y;
  } //end setLocation()

  public double distanceFromOrigin() {
    return Math.sqrt(x * x + y * y);
  } //end distanceFromOrigin()

  public void translate(int dx, int dy) {
    setLocation(x + dx, y + dy);
  } //end translate()

  public double distance(Point point) {
    return Math.sqrt(Math.pow(point.getX() - this.x, 2) + Math.pow(point.getY() - this.y, 2));
  } //end distance()

  public Point midPoint(Point point) {
    return new Point((point.getX() + this.x) / 2, (point.getY() + this.y) / 2);
  } //end midPoint()

  public double slope(Point point) {
    return (point.getY() - this.y) / (point.getX() - this.x);
  } //end slope()

  public String isCollinear(Point point1, Point point2) {
    if (slope(point1) == slope(point2)) {
      return "The three points are collinear.";
    } //end if
    return "The three points are NOT collinear.";
  } //end isCollinear()

  public String toString() {
    return "(" + x + ", " + y + ")";
  } //end toString()

} //end class
