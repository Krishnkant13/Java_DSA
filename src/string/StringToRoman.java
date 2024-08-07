package string;

import java.util.HashMap;
import java.util.Map;

public class StringToRoman {

    public static int romanToInt(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentVal = romanValues.get(s.charAt(i));

            // If the current value is smaller than the next value, subtract it
            if (i < s.length() - 1 && currentVal < romanValues.get(s.charAt(i + 1))) {
                result -= currentVal;
            } else {
                result += currentVal;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String romanNumeral = "IX";
        int result = romanToInt(romanNumeral);
        System.out.println("The integer representation of " + romanNumeral + " is: " + result);
    }
}
