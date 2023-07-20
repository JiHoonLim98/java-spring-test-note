package sample;

import sample.CalculationRequest;

import java.util.Scanner;

/**
 * @since       2023.07.20
 * @author      jerry
 * @description calculation request reader
 **********************************************************************************************************************/
public class CalculationRequestReader {

    public CalculationRequest read() {
        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();
        String[] parts = result.split("");
        return new CalculationRequest(parts);
    }
}
