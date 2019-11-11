package com.kodilla.testing.shapes;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure(){

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(4);
        //When
        shapeCollector.addFigure(shape);
        //Then
        Assert.assertEquals(1, shapeCollector.getShapeCollection().size());
    }

    @Test
    public void testRemoveFigure(){

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(4);
        shapeCollector.addFigure(shape);
        //When
        boolean result = shapeCollector.removeFigure(shape);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.getShapeCollection().size());
    }

    @Test
    public void testRemoveFigureWhichDoesNotExist(){

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Square(5));
        //When
        boolean result = shapeCollector.removeFigure(new Square(4));
        //Then
        Assert.assertFalse(result);
        Assert.assertEquals(1, shapeCollector.getShapeCollection().size());
    }

    @Test
    public void testShowFigures(){

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(4);
        shapeCollector.addFigure(shape);
        ArrayList<Shape> shapeList= new ArrayList<>();
        shapeList.add(shape);
        //When
        List<Shape> shapeResultList = shapeCollector.getShapeCollection();
        //Then
        Assert.assertEquals(shapeList.toString(), shapeResultList.toString());
    }
}