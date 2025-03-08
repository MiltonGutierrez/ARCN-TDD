package edu.escuelaing.arcn;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    void testFizzBuzzReturnsNumber() {
        // Arrange
        int num = 1;
        String expected = "1";
        String result;
        // Act
        result = FizzBuzz.fizzbuzz(num);
        // Assert
        assertEquals(expected, result);
    }

    @Test
    void testFizzBuzzMultiplo3() {
        // Arrange
        int num = 3;
        String expected = "Fizz";
        String result;
        // Act
        result = FizzBuzz.fizzbuzz(num);
        // Assert
        assertEquals(expected, result);
    }

    @Test
    void testFizzBuzzMultiplo5() {
        // Arrange
        int num = 5;
        String expected = "Buzz";
        String result;
        // Act
        result = FizzBuzz.fizzbuzz(num);
        // Assert
        assertEquals(expected, result);
    }

    @Test
    void testFizzBuzzMultiplo3y5() {
        // Arrange
        int num = 15;
        String expected = "FizzBuzz";
        String result;
        // Act
        result = FizzBuzz.fizzbuzz(num);
        // Assert
        assertEquals(expected, result);
    }
}
