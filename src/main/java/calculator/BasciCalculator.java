package calculator;

//import java.util.logging.Logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasciCalculator {

    private static final Logger logger = LoggerFactory.getLogger(BasciCalculator.class);

    //METHOD: SUM
    public Long sum(Long number1, Long number2) {
        logger.info("Summing {} + {}", number1, number2);
        return number1 + number2;
    }

    //Todo:finish the others methods


}
