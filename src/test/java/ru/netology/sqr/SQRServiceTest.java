package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    private final SQRService sqrService = new SQRService();

    @ParameterizedTest
    @CsvSource (value = {"200,300,3","100,200,5","200,225,1","200,200,0","225,225,1","99,100,1"})

    public void shouldGetNumberSQRInRange(int aRange,int bRange, int expected) {
         assertEquals(expected,sqrService.numberOfSqrInRange(aRange,bRange));
    }
}