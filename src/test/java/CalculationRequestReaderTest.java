import org.junit.jupiter.api.Test;
import sample.CalculationRequest;
import sample.CalculationRequestReader;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @since       2023.07.20
 * @author      jerry
 * @description calculation request reader
 **********************************************************************************************************************/
public class CalculationRequestReaderTest {

    @Test
    public void readData(){
        // given
        CalculationRequestReader calculationRequestReader = new CalculationRequestReader();

        // when
        System.setIn(new ByteArrayInputStream("1+2".getBytes()));
        CalculationRequest result = calculationRequestReader.read();

        // then
        assertEquals(1, result.getNum1());
        assertEquals("+", result.getOperator());
        assertEquals(2, result.getNum2());
    }
}
