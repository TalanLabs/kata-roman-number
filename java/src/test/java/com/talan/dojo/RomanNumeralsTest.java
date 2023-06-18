package com.talan.dojo;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;

public class RomanNumeralsTest {

    @Test
    @DisplayName("converts 1")
    void convert1() {
        RomanNumerals romanNumerals = new RomanNumerals(1);
        Assertions.assertEquals("I", romanNumerals.getRomanNumeral());
    }

    @Test
    @DisplayName("converts 2")
    void convert2() {
        RomanNumerals romanNumerals = new RomanNumerals(2);
        Assertions.assertEquals("II", romanNumerals.getRomanNumeral());
    }

    @Test
    @DisplayName("converts 3")
    void convert3() {
        RomanNumerals romanNumerals = new RomanNumerals(3);
        Assertions.assertEquals("III", romanNumerals.getRomanNumeral());
    }


    @Test
    @DisplayName("converts 4")
    void convert4() {
        RomanNumerals romanNumerals = new RomanNumerals(4);
        Assertions.assertEquals("IV", romanNumerals.getRomanNumeral());
    }

    @Test
    @DisplayName("converts 5")
    void convert5() {
        RomanNumerals romanNumerals = new RomanNumerals(5);
        Assertions.assertEquals("V", romanNumerals.getRomanNumeral());
    }

    @Test
    @DisplayName("converts 9")
    void convert9() {
        RomanNumerals romanNumerals = new RomanNumerals(9);
        Assertions.assertEquals("IX", romanNumerals.getRomanNumeral());
    }

    @Test
    @DisplayName("converts 16")
    void convert16() {
        RomanNumerals romanNumerals = new RomanNumerals(16);
        Assertions.assertEquals("XVI", romanNumerals.getRomanNumeral());
    }

    @Test
    @DisplayName("converts 48")
    void convert48() {
        RomanNumerals romanNumerals = new RomanNumerals(48);
        Assertions.assertEquals("XLVIII", romanNumerals.getRomanNumeral());
    }


    @Test
    @DisplayName("converts 49")
    void convert49() {
        RomanNumerals romanNumerals = new RomanNumerals(49);
        Assertions.assertEquals("XLIX", romanNumerals.getRomanNumeral());
    }

    @Test
    @DisplayName("converts 93")
    void convert93() {
        RomanNumerals romanNumerals = new RomanNumerals(93);
        Assertions.assertEquals("XCIII", romanNumerals.getRomanNumeral());
    }

    @Test
    @DisplayName("converts 141")
    void convert141() {
        RomanNumerals romanNumerals = new RomanNumerals(141);
        Assertions.assertEquals("CXLI", romanNumerals.getRomanNumeral());
    }

    @Test
    @DisplayName("converts 402")
    void convert402() {
        RomanNumerals romanNumerals = new RomanNumerals(402);
        Assertions.assertEquals("CDII", romanNumerals.getRomanNumeral());
    }

    @Test
    @DisplayName("converts 666")
    void convert666() {
        RomanNumerals romanNumerals = new RomanNumerals(666);
        Assertions.assertEquals("DCLXVI", romanNumerals.getRomanNumeral());
    }

    @Test
    @DisplayName("converts 1024")
    void convert1024() {
        RomanNumerals romanNumerals = new RomanNumerals(1024);
        Assertions.assertEquals("MXXIV", romanNumerals.getRomanNumeral());
    }

    @Test
    @DisplayName("converts 3000")
    void convert3000() {
        RomanNumerals romanNumerals = new RomanNumerals(3000);
        Assertions.assertEquals("MMM", romanNumerals.getRomanNumeral());
    }

    @Test
    @DisplayName("converts 3999")
    void convert3999() {
        RomanNumerals romanNumerals = new RomanNumerals(3999);
        Assertions.assertEquals("MMMCMXCIX", romanNumerals.getRomanNumeral());
    }
}
