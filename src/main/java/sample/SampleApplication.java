package sample;


/**
 * @since       2023.07.20
 * @author      jerry
 * @description SampleApplication
 **********************************************************************************************************************/
public class SampleApplication {

    public static void main(String[] args) {
        CalculationRequest request = new CalculationRequestReader().read();
        long answer = new Calculator().calculate(request.getNum1(), request.getOperator(), request.getNum2());
        System.out.println("answer = " + answer);
    }
}
