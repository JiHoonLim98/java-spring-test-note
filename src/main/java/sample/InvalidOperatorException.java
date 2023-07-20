package sample;

/**
 * @since       2023.07.20
 * @author      jerry
 * @description invalid operator exception
 **********************************************************************************************************************/
public class InvalidOperatorException extends RuntimeException{

    public InvalidOperatorException(){
        super("Invalid operator, you need to choose one of (+, -, *, %) ");
    }
}
