package com.alex;

public class InputHandler {
    public int getInputFirstNumber() {
        String inputFromKeyboard = "1"; // input from keyboard
        return getNumber(inputFromKeyboard); // validate and parse input
    }

    public int getInputSecondNumber() {
        String inputFromKeyboard = "2"; // input from keyboard
        return getNumber(inputFromKeyboard); // validate and parse input
    }

    private int getNumber(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Error! Wrong input: " + input);
        }
    }
}
