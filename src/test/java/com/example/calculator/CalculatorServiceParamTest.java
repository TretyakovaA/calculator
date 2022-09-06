package com.example.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.example.calculator.Const.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceParamTest {
    private CalculatorService calculatorService = new CalculatorServiceImpl();
    @ParameterizedTest
    @MethodSource ("privateCalculatorParams")

    public void resultSum (int num1, int num2) {
        int result = calculatorService.plus( num1,  num2);
        assertEquals(num1 + num2, result);
    }


    @ParameterizedTest
    @MethodSource ("privateCalculatorParams")
    public void resultSubstr (int num1, int num2) {
        int result = calculatorService.minus(num1, num2);
        assertEquals(num1 - num2, result);
    }


    @ParameterizedTest
    @MethodSource ("privateCalculatorParams")
    public void resultMultiply (int num1, int num2) {
        int result = calculatorService.multiply(num1, num2);
        assertEquals(num1 * num2, result);
    }

    @ParameterizedTest
    @MethodSource ("privateCalculatorParams")
    public void resultDivision (int num1, int num2) {
        int result = calculatorService.divide(num1, num2);
        assertEquals(num1 / num2, result);
    }
    private static Stream <Arguments> privateCalculatorParams(){
        return Stream.of(Arguments.of(ONE, TWO), Arguments.of(TWO, TWO), Arguments.of(THREE, THREE), Arguments.of(ZERO, TWO));
    }
}
