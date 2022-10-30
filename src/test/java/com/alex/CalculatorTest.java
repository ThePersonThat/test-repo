package com.alex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CalculatorTest {
    @Mock
    private InputHandler inputHandlerMock;
    @InjectMocks
    private Calculator calculator;

    @Test
    @DisplayName("Should calculate add")
    public void shouldReturn4() {
        // given
        Mockito.when(inputHandlerMock.getInputFirstNumber()).thenReturn(3);
        Mockito.when(inputHandlerMock.getInputSecondNumber()).thenReturn(1);
        int expectedResult = 4;

        // when
        int actualResult = calculator.calcAdd();

        // then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should calculate add")
    public void shouldReturn7() {
        // given
        Mockito.when(inputHandlerMock.getInputFirstNumber()).thenReturn(10);
        Mockito.when(inputHandlerMock.getInputSecondNumber()).thenReturn(3);
        int expectedResult = 7;

        // when
        int actualResult = calculator.calcSub();

        // then
        Assertions.assertEquals(expectedResult, actualResult);
    }
}