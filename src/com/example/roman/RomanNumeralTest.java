package com.example.roman;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralTest {
    private static RomanNumeral romanNumeral;

    @BeforeAll
    static void setUp() {
        romanNumeral = new RomanNumeral();
    }

    @Test
    void testSingleLetters() {
        assertEquals(1, romanNumeral.romanToInt("I"));
        assertEquals(5, romanNumeral.romanToInt("V"));
        assertEquals(10, romanNumeral.romanToInt("X"));
        assertEquals(50, romanNumeral.romanToInt("L"));
        assertEquals(100, romanNumeral.romanToInt("C"));
        assertEquals(500, romanNumeral.romanToInt("D"));
        assertEquals(1000, romanNumeral.romanToInt("M"));
    }

    @Test
    void testManyLetters() {
        assertEquals(11, romanNumeral.romanToInt("XI"));
    }

    @Test
    void testSubtractiveNotation() {
        assertEquals(4, romanNumeral.romanToInt("IV"));
        assertEquals(14, romanNumeral.romanToInt("XIV"));
    }

    @Test
    void testRepetition() {
        assertEquals(2, romanNumeral.romanToInt("II"));
    }

    @Test
    void testFirstNumber() {
        assertEquals(1, romanNumeral.romanToInt("I"));
    }

    @Test
    void testInvalidLetter() {
        assertEquals(0, romanNumeral.romanToInt("Z"));
    }

    @Test
    void testInvalidAndValidLetter() {
        assertEquals(0, romanNumeral.romanToInt("XIZ"));
    }

    @Test
    void testNotValid() {
        assertEquals(0, romanNumeral.romanToInt("VV"));
    }

    @Test
    void testNull() {
        assertEquals(0, romanNumeral.romanToInt(null));
    }
}



