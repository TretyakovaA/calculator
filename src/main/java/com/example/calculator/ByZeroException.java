package com.example.calculator;

public class ByZeroException extends IllegalArgumentException {
    public ByZeroException() {
    }

    public ByZeroException(String s) {
        super(s);
    }

    public ByZeroException(String message, Throwable cause) {
        super(message, cause);
    }

    public ByZeroException(Throwable cause) {
        super(cause);
    }
}
