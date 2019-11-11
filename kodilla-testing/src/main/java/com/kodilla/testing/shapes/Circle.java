package com.kodilla.testing.shapes;

class Circle implements Shape {
    private String nameOfShape = "Circle";
    private double radius;
    final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.radius, radius) != 0) return false;
        if (Double.compare(circle.PI, PI) != 0) return false;
        return nameOfShape != null ? nameOfShape.equals(circle.nameOfShape) : circle.nameOfShape == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nameOfShape != null ? nameOfShape.hashCode() : 0;
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(PI);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public double getField() {
        return PI * radius * radius;
    }

    public String getShapeName() {
        return nameOfShape;
    }
}