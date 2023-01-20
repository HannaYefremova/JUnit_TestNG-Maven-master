package mediumTests;

import application.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MediumTestClass {

  Calculator calc = new Calculator();

  //TODO (**)
  //add tests for new method - average value

  @Test
  public void testAddTwoPositiveValues() {
    int a = 10;
    int b = 5;
    int expectedResult = (a + b);
    int actualResult = calc.add(a, b);
    Assert.assertEquals(actualResult, expectedResult, actualResult + " must be actual");
  }

  //TODO (**)
  //add tests for new method - even or odd

  //TODO (**)
  //add tests for new method - biggest value

}
