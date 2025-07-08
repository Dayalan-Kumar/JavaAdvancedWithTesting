package com.java.advanced.patternmatching;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PatternMatchingExampleTest {

    PatternMatchingExample patternMatchingExample = new PatternMatchingExample();

    @ParameterizedTest
    @MethodSource("input")
    void pattern(Object value, String expectedResult){
        var output = patternMatchingExample.pattern(value);
        assertEquals(expectedResult, output);
    }

    @ParameterizedTest
    @MethodSource("input")
    void patternMatchingExampleInstanceOf(Object value, String expectedResult){
        var output = patternMatchingExample.patternMatchingExampleInstanceOf(value);
        assertEquals(expectedResult, output);
    }

    @ParameterizedTest
    @MethodSource("input")
    void patternUsingSwitch(Object value, String expectedResult){
        var output = patternMatchingExample.patternUsingSwitch(value);
        assertEquals(expectedResult, output);
    }

    private static Stream<Arguments> input(){
        return Stream.of(
                Arguments.of("Daya","String of length:4"),
                Arguments.of(1, "Integer:1")
              //  Arguments.of(null, "Not a string or integer")
        );
    }

}