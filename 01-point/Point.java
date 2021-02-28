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

  public double distance(int x2, int y2) {
    return Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2));
  } //end distance()

  public String midPoint(int x2, int y2) {
    return "(" + (x2 - x) / 2 + ", " + (y2 - y) / 2 + ")";
  } //end midPoint()

  public double slope(int x2, int y2) {
    return (y2 - y) / (x2 - x);
  } //end slope()

  public String isCollinear(int x2, int y2, int x3, int y3) {
    if (slope(x2, y2) == slope(x3, y3)) {
      return "The three points are collinear.";
    } //end if
    return "The three points are NOT collinear.";
  } //end isCollinear()

  public String toString() {
    return "(" + x + ", " + y + ")";
  } //end toString()

} //end class
