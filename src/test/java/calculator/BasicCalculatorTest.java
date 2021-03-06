package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class BasicCalculatorTest {

    private  final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing sum: 1+1 = 2")
    public void sum() {
        //ARRANGE
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        //ACT
        Long result = basicCalculator.sum(number1, number2);

        //ASSERT
        Assertions.assertEquals(expectedValue, result);
    }


    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSums(Long first, Long second, long expectedResult) {
        Assertions.assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first +" + "+ second +" should equal "+ expectedResult);
    }

    //TEST FOR SUBTRACTING
    @Test
    @DisplayName("Testing substract: 7-2 = 5")
    public void subtract() {
        //ARRANGE
        Long number1 = 7L;
        Long number2 = 2L;
        Long expectedValue = 5L;

        //ACT
        Long result = basicCalculator.subtract(number1, number2);

        //ASSERT
        Assertions.assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several subtractions")
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "3,    1,   2",
            "5,    2,   3",
            "49,  15, 34",
            "100,  55, 45"
    })
    public void severalSubtractions(Long first, Long second, long expectedResult) {
        Assertions.assertEquals(expectedResult, basicCalculator.subtract(first, second),
                () -> first +" - "+ second +" should equal "+ expectedResult);
    }

    //TEST FOR MULTIPLICATION
    @Test
    @DisplayName("Testing multiplication: 4 * 8 = 32")
    public void multiply() {
        //ARRANGE
        Long number1 = 4L;
        Long number2 = 8L;
        Long expectedValue = 32L;

        //ACT
        Long result = basicCalculator.multiply(number1, number2);

        //ASSERT
        Assertions.assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several multiplications")
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "3,    1,   3",
            "5,    2,   10",
            "49,  5, 245",
            "11,  55, 605"
    })
    public void severalMultiplications(Long first, Long second, long expectedResult) {
        Assertions.assertEquals(expectedResult, basicCalculator.multiply(first, second),
                () -> first +" * "+ second +" should equal "+ expectedResult);
    }

    //TEST FOR DIVISION
    @Test
    @DisplayName("Testing division: 15 / 3 = 5")
    public void division() {
        //ARRANGE
        Long number1 = 15L;
        Long number2 = 3L;
        Long expectedValue = 5L;

        //ACT
        Long result = basicCalculator.division(number1, number2);

        //ASSERT
        Assertions.assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several divisions")
    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "3,    1,   3",
            "5,    2,   2",
            "45,  5, 9",
            "72,  3, 24"
    })
    public void severalDivisions(Long first, Long second, long expectedResult) {
        Assertions.assertEquals(expectedResult, basicCalculator.division(first, second),
                () -> first +" / "+ second +" should equal "+ expectedResult);
    }
}
