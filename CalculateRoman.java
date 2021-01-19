package JavaMentorCalc;

public class CalculateRoman {

    static String[] in = StringIn.getInput();

    static int[] numbers = {1, 4, 5, 9, 10, 50, 100, 500, 1000 };

    static String[] letters = { "I", "IV", "V", "IX", "X", "L", "C", "D", "M"};

    public static int convertRomanToInt(String romanNumeral) {
        int integerValue = 0;


        for (int i = 0; i < romanNumeral.length(); i++) {
            char ch = romanNumeral.charAt(i);
            int number = letterToNumber(ch);
            integerValue += number;
        }
        return integerValue;
    }

    private static int letterToNumber(char letter) {

        switch (letter) {
            case 'I':  return 1;
            case 'V':  return 5;
            case 'X':  return 10;
            case 'L':  return 50;
            case 'C':  return 100;
            case 'D':  return 500;
            case 'M':  return 1000;
            default:   return -1;
        }
    }
    public static String convertIntegerToRoman(int number) {
        String romanValue = "";
        int N = number;
        while (N > 0) {
            for (int i = 0; i < numbers.length; i++) {
                if ( N < numbers[i] ) {
                    N -= numbers[i-1];
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

        if ("+".equals(in[1])) {
            result = (a + b);
        } else if ("-".equals(in[1])) {
            result = (a - b);
        } else if ("*".equals(in[1])) {
            result = (a * b);
        } else if (("/".equals(in[1])) && (b != 0)) {
            result = (a / b);
        }
        String res = CalculateRoman.convertIntegerToRoman(result);

        System.out.println(res);
    }
}
