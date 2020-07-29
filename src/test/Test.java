package test;

import controller.RomanNumeralConvector;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

    @org.junit.Test
    public void regexCheck() {
        Pattern pattern =
                Pattern.compile("^(M){0,3}(?!M)(C){0,3}[DM]?(C){0,3}(X){0,3}[CL]?(X){0,3}(I){0,3}[XV]?(I){0,3}$");

        boolean allMatch = IntStream.rangeClosed(0, 3999).boxed().allMatch(n -> {
            String roman = romanNumeralConvector.convertToRoman(n);
            Matcher matcher = pattern.matcher(roman);
            return matcher.matches();
        });
        assertTrue(allMatch);
    }
}
