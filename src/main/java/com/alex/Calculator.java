package com.alex;

public class Calculator {
    private InputHandler inputHandler;

    public Calculator() {
        inputHandler = new InputHandler();
    }

    public int calcAdd() {
        int firstNumber = inputHandler.getInputFirstNumber();
        int secondNumber = inputHandler.getInputSecondNumber();

        return firstNumber + secondNumber;
    }

    public int calcSub() {
        int firstNumber = inputHandler.getInputFirstNumber();
        int secondNumber = inputHandler.getInputSecondNumber();

        return firstNumber - secondNumber;
    }
}
