package com.kodilla.testing.shapes;

class Square implements Shape {

    private double sideLength;
    private String nameOfShape = "Square";

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        return Double.compare(square.sideLength, sideLength) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(sideLength);
        return (int) (temp ^ (temp >>> 32));
    }

    public String getShapeName() {
        return nameOfShape;
    }

    public double getField() {
        return sideLength*2;
    }
}
