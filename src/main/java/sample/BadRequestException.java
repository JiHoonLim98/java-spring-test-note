package sample;

/**
 * @since       2023.07.20
 * @author      jerry
 * @description bad request exception
 **********************************************************************************************************************/
public class BadRequestException extends RuntimeException {

    public BadRequestException() {
        super("Invalid input size, you must input 3 length");
    }
}
