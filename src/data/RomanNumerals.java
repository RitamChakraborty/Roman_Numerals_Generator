package data;

import java.util.HashMap;

public class RomanNumerals {
    private final HashMap<Integer, String> map;
    private static RomanNumerals instance;
    
    private RomanNumerals() {
        map = new HashMap<>();

        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");
    }

    public static RomanNumerals getInstance() {
        if (instance == null) {
            instance = new RomanNumerals();
        }

        return instance;
    }

    public HashMap<Integer, String> map() {
        return map;
    }
}
