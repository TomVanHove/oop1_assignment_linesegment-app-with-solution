package be.vives.oop.linesegment;

/**
 * Point
 */
public class Point {

  public Point() {
    this(0, 0);
  }

  public Point(int x, int y) {
    setX(x);
    setY(y);
  }
  
  public void setX(int x) {
    this.x = x;
  }
  
  public void setY(int y) {
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  @Override
  public String toString() {
    return "[" + x + ", " + y + "]";
  }

  private int x = 0;
  private int y = 0;
}