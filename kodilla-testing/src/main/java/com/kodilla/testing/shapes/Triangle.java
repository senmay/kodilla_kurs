package com.kodilla.testing.shapes;

class Triangle implements Shape {

    private double height;
    private double base;
    private String nameOfShape = "Triangle";

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.height, height) != 0) return false;
        if (Double.compare(triangle.base, base) != 0) return false;
        return nameOfShape != null ? nameOfShape.equals(triangle.nameOfShape) : triangle.nameOfShape == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(height);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(base);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (nameOfShape != null ? nameOfShape.hashCode() : 0);
        return result;
    }

    public double getField() {
        return base/2 * height;
    }
    public String getShapeName() {
        return nameOfShape;
    }
}