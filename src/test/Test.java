package test;

import controller.RomanNumeralConvector;

import static org.junit.Assert.assertEquals;

public class Test {
    RomanNumeralConvector romanNumeralConvector = new RomanNumeralConvector();

    @org.junit.Test
    public void test1() {
        int num = 1;
        String expect = "I";
        assertEquals(expect, romanNumeralConvector.convertToRoman(num));
    }

    @org.junit.Test
    public void test2() {
        int num = 11;
        String expect = "XI";
        assertEquals(expect, romanNumeralConvector.convertToRoman(num));
    }

    @org.junit.Test
    public void test3() {
        int num = 45;
        String expect = "XLV";
        assertEquals(expect, romanNumeralConvector.convertToRoman(num));
    }

    @org.junit.Test
    public void test4() {
        int num = 88;
        String expect = "LXXXVIII";
        assertEquals(expect, romanNumeralConvector.convertToRoman(num));
    }

    @org.junit.Test
    public void test5() {
        int num = 99;
        String expect = "XCIX";
        assertEquals(expect, romanNumeralConvector.convertToRoman(num));
    }

    @org.junit.Test
    public void test6() {
        int num = 148;
        String expect = "CXLVIII";
        assertEquals(expect, romanNumeralConvector.convertToRoman(num));
    }

    @org.junit.Test
    public void test7() {
        int num = 399;
        String expect = "CCCXCIX";
        assertEquals(expect, romanNumeralConvector.convertToRoman(num));
    }

    @org.junit.Test
    public void test8() {
        int num = 888;
        String expect = "DCCCLXXXVIII";
        assertEquals(expect, romanNumeralConvector.convertToRoman(num));
    }

    @org.junit.Test
    public void test9() {
        int num = 3888;
        String expect = "MMMDCCCLXXXVIII";
        assertEquals(expect, romanNumeralConvector.convertToRoman(num));
    }

    @org.junit.Test
    public void test10() {
        int num = 3999;
        String expect = "MMMCMXCIX";
        assertEquals(expect, romanNumeralConvector.convertToRoman(num));
    }
}
