package JavaMentorCalc;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CalculateRoman {

    static String[] in = StringIn.getInput();

    static int[] numbers = {1, 4, 5, 9, 10, 40, 50, 90, 100, 101};
    static String[] letters = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CI"};

    public static int convertRomanToInt(String roman) {

        int result = 0;

        List<RomanNumeral> romanNumerals = RomanNumeral.getValues();

        int i = 0;

        while ((roman.length() > 0) && (i < romanNumerals.size())) {
            RomanNumeral rn = romanNumerals.get(i);
            if (roman.startsWith(rn.name())) {
                result += rn.getValue();
                roman = roman.substring(rn.name().length());
            } else {
                i++;
            }
        }

        return result;
    }

    enum RomanNumeral {
        I(1), IV(4), V(5), IX(9), X(10), XI(11);

        private int value;

        RomanNumeral(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static List<RomanNumeral> getValues() {
            return Arrays.stream(values())
                    .sorted(Comparator.comparing((RomanNumeral e) -> e.value).reversed())
                    .collect(Collectors.toList());
        }
    }
    public static String convertIntegerToRoman(int number) {
        String romanValue = "";
        int num = number;
        while (num > 0) {
            for (int i = 0; i < numbers.length; i++) {
                if (num < numbers[i]) {
                    num -= numbers[i-1];
                    romanValue += letters[i-1];
                    break;
                }
            }
        }
        return romanValue;
    }
    public static void calculate(){
        int a = CalculateRoman.convertRomanToInt(in[0]);
        int b = CalculateRoman.convertRomanToInt(in[2]);
        int result = 0;
        int result2 = 0;

        if ("+".equals(in[1])) {
            result = (a + b);
        } else if ("-".equals(in[1])) {
            result = (a - b);
            result2 = (b - a);
        } else if ("*".equals(in[1])) {
            result = (a * b);
        } else if (("/".equals(in[1])) && (b != 0)) {
            result = (a / b);
        }

        if (result > 0) {
            String res = CalculateRoman.convertIntegerToRoman(result);
            System.out.println(res);
        }
        else if (result < 0) {
            String res = CalculateRoman.convertIntegerToRoman(result2);
            System.out.println("-" + res);
        }
        else {
            System.out.println("0");
        }
    }
}
