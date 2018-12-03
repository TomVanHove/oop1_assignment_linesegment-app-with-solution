package be.vives.oop.linesegment;

/**
 * LineSegment
 */
public class LineSegment {

  public LineSegment(int xStart, int yStart, int xEnd, int yEnd) {
    start = new Point(xStart, yStart);
    end = new Point(xEnd, yEnd);
  }

  public double length() {
    double xSquaredDiff = (end.getX() - start.getX()) * (end.getX() - start.getX());
    double ySquaredDiff = (end.getY() - start.getY()) * (end.getY() - start.getY());
    return Math.sqrt(xSquaredDiff + ySquaredDiff);
  }

  public double slope() {
    return (double)(end.getY() - start.getY()) / (end.getX() - start.getX());
  }

  @Override
  public String toString() {
    String length = String.format("%1$,.2f", length());
    String slope = String.format("%1$,.2f", slope());

    return "Line starts @ " + start + " and ends at " + end + ".\n"
      + "Its length is " + length + " and it has a slope of " + slope + ".";
  }

  private Point start = new Point();
  private Point end = new Point();
}