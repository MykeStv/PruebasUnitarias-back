package calculator;

//import java.util.logging.Logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {

    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    //METHOD: SUM
    public Long sum(Long number1, Long number2) {
        logger.info("Summing {} + {}", number1, number2);
        return number1 + number2;
    }

    //METHOD: SUBTRACTION
    public Long subtract(Long number1, Long number2) {
        logger.info("subtracting {} - {}", number1, number2);
        return number1 - number2;
    }

    //METHOD: MULTIPLICATION
    public Long multiply(Long number1, Long number2) {
        logger.info("multiplication {} * {}", number1, number2);
        return number1 * number2;
    }

    //Todo:finish the others methods


}
