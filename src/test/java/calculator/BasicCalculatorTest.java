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
    @ParameterizedTest(name = "{3} - {1} = {2}")
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
    
}