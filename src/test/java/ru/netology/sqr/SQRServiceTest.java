package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource({
            "200,300,3",
            "200,400,6",
            "150,350,6",
            "50,750,18",
            "135,775,16"
    })
    public void shouldCalculateQuantitySquares(int start, int end, int expected) {
        SQRService service = new SQRService();
        int actual = service.shouldCalculateQuantitySquares(start, end);


        assertEquals(expected, actual);
    }


}
