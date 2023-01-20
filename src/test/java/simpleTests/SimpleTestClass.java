package simpleTests;

import application.Calculator;
import org.testng.annotations.Test;

import org.testng.Assert;

public class SimpleTestClass {

    Calculator calc = new Calculator();

    @Test
    public void testAddTwoPositiveValues() {
        int a = 10;
        int b = 5;
        int expectedResult = (a + b);
        int actualResult = calc.add(a, b);
        Assert.assertEquals(actualResult, expectedResult, actualResult + " must be actual");
    }

    @Test
    public void testSubtractionTwoPositiveValues() {
        int a = 10;
        int b = 5;
        int expectedResult = (a - b);
        int actualResult = calc.subtraction(a, b);
        Assert.assertEquals(actualResult, expectedResult, actualResult + " must be actual");
    }

    @Test
    public void testMultiplicationTwoPositiveValues() {
        int a = 10;
        int b = 5;
        int expectedResult = (a * b);
        int actualResult = calc.multiplication(a, b);
        Assert.assertEquals(actualResult, expectedResult, actualResult + " must be actual");
    }

    @Test
    public void testDivisionTwoPositiveValues() {
        int a = 10;
        int b = 5;
        int expectedResult = (a / b);
        int actualResult = calc.division(a, b);
        Assert.assertEquals(actualResult, expectedResult, actualResult + " must be actual");
    }

    @Test
    public void testSquareRootPositiveValues() {
        int a = 10;
        int expectedResult = calc.squareRoot(a);
        int actualResult = calc.squareRoot(a);
        Assert.assertEquals(actualResult, expectedResult, actualResult + " must be actual");
    }

    @Test
    public void testSquarePositiveValues() {
        int a = 10;
        int expectedResult = (a*a);
        int actualResult = calc.square(a);
        Assert.assertEquals(actualResult, expectedResult, actualResult + " must be actual");
    }
}
