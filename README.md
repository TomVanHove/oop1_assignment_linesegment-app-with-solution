# Assignment Object Oriented Programming with Java

This is an assignment for the course Object Oriented Programming with Java for students of VIVES University in Bruges.

The goal of this assignment is to learn the basics of OOP.

## Assignment

This directory contains a maven project that is accompanied by unit tests that need to succeed in order for the project to work correctly. Fix all the failing tests by adding the necessary implementation to the different classes.

Also make sure to **fill in the report** (which can be found in the file `report.md`).

## Line Segment

In geometry, a line segment is a part of a line that is bounded by two distinct end points. From now on we refer to these points as the start point and end point of the line segment. Each point in turn has an `x` and a `y` coordinate. Both are of type int.

Create both a class `Point` and a class `LineSegment`.

### Point

The point class should adhere to the following UML diagram:

```text
----------------------
- x: int
- y: int
----------------------
+ Point()
+ Point(x: int, y: int)
+ getX(): int
+ getY(): int
+ setX(x: int)
+ setY(y: int)
+ toString(): String
----------------------
```

Implement all of these attributes and methods. If done correctly the unit tests found in `PointTest.java` should succeed.

The `toString()` method is a method that returns a String representation of the object. Here in case of Point it should return the coordinates in the format `[x, y]` where `x` and `y` are the actual attribute values.

The `toString()` method can be defined using the template below:

```java
@Override
public String toString() {
  return "somestring";
}
```