package com.alex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringUtilTest {
    @Test
    @DisplayName("Checks concat of two strings")
    public void shouldReturnHelloWorld() {
        // given
        String hello = "Hello";
        String world = "World";
        String expectedResult = "HelloWorld";

        // when
        String actualResult = StringUtil.concat(hello, world);

        // then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Checks concat of string with empty string")
    public void shouldReturnHello() {
        // given
        String hello = "Hello";
        String expectedResult = "Hello";

        // when
        String actualResult = StringUtil.concat(hello, "");

        // then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Checks count of spaces")
    public void shouldReturn1() {
        // given
        String str = "Hello world";
        int expectedResult = 1;

        // when
        long actualResult = StringUtil.countSpaces(str);

        // then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Checks if spaces are removed")
    public void shouldReturnHelloWorldWithoutSpace() {
        // given
        String str = "Hello World";
        String expectedResult = "HelloWorld";

        // when
        String actualResult = StringUtil.removeSpaces(str);

        // then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Checks if string isEmpty")
    public void shouldReturnTrueAsStringIsEmpty() {
        // given
        String str = "";

        // when
        boolean actualResult = StringUtil.isEmpty(str);

        // then
        Assertions.assertTrue(actualResult);
    }

    @Test
    @DisplayName("Checks if string isEmpty")
    public void shouldReturnFalseAsStringIsNotEmpty() {
        // given
        String str = "Hello world";

        // when
        boolean actualResult = StringUtil.isEmpty(str);

        // then
        Assertions.assertFalse(actualResult);
    }

    @Test
    @DisplayName("Checks if string isEmpty")
    public void shouldReturnTrueAsStringIsNotEmpty() {
        // given
        String str = "Hello world";

        // when
        boolean actualResult = StringUtil.isNotEmpty(str);

        // then
        Assertions.assertTrue(actualResult);
    }

    @Test
    @DisplayName("Checks if string isEmpty")
    public void shouldReturnFalseAsStringIsEmpty() {
        // given
        String str = "";

        // when
        boolean actualResult = StringUtil.isNotEmpty(str);

        // then
        Assertions.assertFalse(actualResult);
    }
}