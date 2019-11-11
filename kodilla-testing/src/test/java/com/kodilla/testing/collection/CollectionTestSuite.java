package com.kodilla.testing.collection;
import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> actual = new ArrayList<>(Arrays.asList(1, 3, 5, 87, 4, 3, 2));
        List<Integer> expected = Arrays.asList(4, 2);
        OddNumbersExterminator even = new OddNumbersExterminator();
        //When
        List<Integer> result = even.exterminate(actual);
        System.out.println("Testing" + actual);
        //Then
        Assert.assertEquals(expected, result);
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> actual = new ArrayList<>(Arrays.asList(1, 3, 5, 87, 4, 3, 2));
        OddNumbersExterminator even = new OddNumbersExterminator();
        //When
        System.out.println("Testing" + actual);
        //Then
        Assert.assertFalse(actual.isEmpty());





    }
}
