package sample;

/**
 * @since       2023.07.20
 * @author      jerry
 * @description calculator
 **********************************************************************************************************************/
public class Calculator {

    public long calculate(long num1, String operator, long num2) {
        long answer = 0;

        switch (operator){
            case "+":
                answer = num1 + num2;
                break;
            case "-":
                answer = num1 - num2;
                break;
            case "*":
                answer = num1 * num2;
                break;
            case "/":
                answer = num1 / num2;
                break;
            default:
                throw new InvalidOperatorException();
        }

        return answer;
    }
    
}
