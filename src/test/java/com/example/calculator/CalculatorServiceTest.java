package com.example.calculator;
import static com.example.calculator.Const.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {

    private CalculatorService calculatorService = new CalculatorServiceImpl();

        @Test
        public void resultSumMustBeOneAndOne () {
            int result = calculatorService.plus(ONE, ONE);
            assertEquals(ONE + ONE, result);
        }


        @Test
        public void resultSumMustBeOneAndTwo () {
            int result = calculatorService.plus(ONE, TWO);
            assertEquals(ONE + TWO, result);
        }
        @Test
        public void resultSubstrMustBeTwoAndOne () {
            int result = calculatorService.minus(TWO, ONE);
            assertEquals(TWO - ONE, result);
        }

        @Test
        public void resultSubstrMustBeTwoAndZero () {
            int result = calculatorService.minus(TWO, ZERO);
            assertEquals(TWO - ZERO, result);
        }

        @Test
        public void resultMultiplyMustBeTwoAndThree () {
            int result = calculatorService.multiply(TWO, THREE);
            assertEquals(TWO * THREE, result);
        }
        @Test
        public void resultMultiplyMustBeThreeAndOne () {
            int result = calculatorService.multiply (THREE, ONE);
            assertEquals( THREE * ONE, result);
        }
        @Test
        public void resultDivisionMustBeThreeAndThree () {
            int result = calculatorService.divide(THREE, THREE);
            assertEquals(THREE / THREE, result);
        }
    @Test
        public void resultDivisionMustBeThreeAndOne () {
            int result = calculatorService.divide(THREE, ONE);
            assertEquals(THREE / ONE, result);
        }
    @Test

    public void divisionByZero (){
            assertThrows(ByZeroException.class,()-> calculatorService.divide(ONE, ZERO));
    }



}
