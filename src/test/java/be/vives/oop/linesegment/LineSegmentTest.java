package be.vives.oop.linesegment;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for LineSegmentTest class.
 */
public class LineSegmentTest {
  @Test
  public void testToString() {
    LineSegment segment = new LineSegment(234, 22, 2, -13);

    String expected = "Line starts @ [234, 22] and ends at [2, -13].\n"
      + "Its length is 234.63 and it has a slope of 0.15.";
    
    assertEquals(expected, segment.toString());
  }

  @Test
  public void testLength() {
    LineSegment segment1 = new LineSegment(0, 0, 8, 8);
    assertEquals(11.31, segment1.length(), 0.01);

    LineSegment segment2 = new LineSegment(-5, -5, 8, 8);
    assertEquals(18.38, segment2.length(), 0.01);

    LineSegment segment3 = new LineSegment(234, 22, 2, -13);
    assertEquals(234.63, segment3.length(), 0.01);
  }

  @Test
  public void testSwitchingStartAndEndShouldHaveSameLength() {
    LineSegment segment4 = new LineSegment(2, -13, 234, 22);
    assertEquals(234.63, segment4.length(), 0.01);
  }

  @Test
  public void testSlope() {
    LineSegment segment1 = new LineSegment(0, 0, 8, 8);
    assertEquals(1.00, segment1.slope(), 0.01);

    LineSegment segment2 = new LineSegment(-5, 5, -8, 8);
    assertEquals(-1.00, segment2.slope(), 0.01);

    LineSegment segment3 = new LineSegment(234, 22, 2, -13);
    assertEquals(0.15, segment3.slope(), 0.01);
  }

  @Test
  public void testSwitchingStartAndEndShouldHaveSameSlope() {
    LineSegment segment4 = new LineSegment(2, -13, 234, 22);
    assertEquals(0.15, segment4.slope(), 0.01);
  }

}
