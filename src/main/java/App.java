import calculator.BasicCalculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //get the numbers by console
        System.out.println("Enter number 1: ");
        String stringNumber1 = sc.nextLine();

        System.out.println("Enter number 2: ");
        String stringNumber2 = sc.nextLine();

        // Transform string to long
        Long number1 = Long.valueOf(stringNumber1);
        Long number2 = Long.valueOf(stringNumber2);

        //Call the methods
        BasicCalculator calculator = new BasicCalculator();
        Long result = calculator.sum(number1, number2);

        System.out.println(number1 + " + " + number2 + " = " + result);

        //Method of subtraction
        Long resultSubtraction = calculator.subtract(number1, number2);
        System.out.println(number1 + " - " + number2 + " = " + resultSubtraction);

    }
}
