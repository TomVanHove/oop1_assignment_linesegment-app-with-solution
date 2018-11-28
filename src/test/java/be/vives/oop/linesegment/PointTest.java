package be.vives.oop.linesegment;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for Point class.
 */
public class PointTest {
  @Test
  public void testDefaultConstructor() {
    Point point = new Point();

    assertEquals(0, point.getX());
    assertEquals(0, point.getY());
  }

  @Test
  public void testXYConstructor() {
    Point point = new Point(10, 20);

    assertEquals(10, point.getX());
    assertEquals(20, point.getY());
  }

  @Test
  public void testXSetter() {
    Point point = new Point();
    point.setX(55);

    assertEquals(55, point.getX());
  }

  @Test
  public void testYSetter() {
    Point point = new Point();
    point.setY(123);

    assertEquals(123, point.getY());
  }

  @Test
  public void testToString() {
    Point point = new Point(44, -13);

    assertEquals("[44, -13]", point.toString());
  }
}
