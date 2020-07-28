package controller;

import data.RomanNumerals;

import java.util.*;
import java.util.stream.Collectors;

public class RomanNumeralConvector {
    private final RomanNumerals romanNumerals;

    public RomanNumeralConvector() {
        romanNumerals = RomanNumerals.getInstance();
    }

    private List<Integer> getBrokenNumber(int num) {
        Deque<Integer> deque = new ArrayDeque<>();
        int index = 0;
        int power = 0;

        while (num != 0) {
            int value = (int) ((num % 10) * Math.pow(10, index++));
            int base = (int) Math.pow(10, power++);
            int div = value / base;

            if (div < 4) {
                for (int i = 0; i < div; ++i) {
                    deque.addFirst(base);
                }
            } else if (div == 4) {
                deque.addFirst(base * 5);
                deque.addFirst(base);
            } else if (div == 5) {
                deque.addFirst(base * 5);
            } else if (div < 9) {
                for (int i = 0; i < (div - 5); ++i) {
                    deque.addFirst(base);
                }
                deque.addFirst(base * 5);
            } else if (div == 9) {
                deque.addFirst(base * 10);
                deque.addFirst(base);
            }

            num /= 10;
        }

        return new ArrayList<>(deque);
    }

    public String convertToRoman(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        List<Integer> list = getBrokenNumber(num);
        list.stream().map(x -> romanNumerals.map().get(x))
                .forEach(stringBuilder::append);

        return stringBuilder.toString();
    }
}
