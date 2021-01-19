package JavaMentorCalc;


import java.io.IOException;
import java.util.Arrays;

public class Calculator {

    public static void main(String[] args) throws IOException {
            System.out.println("Калькулятор принимает арабские и римские числа от 1 до 10.\nВозможные операции: +, -, *, /.\nВедите выражение в формате ЧИСЛО ОПЕРАЦИЯ ЧИСЛО. Например: 5 + 2 или II * V.");

            String[] roman = new String[] {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
            String[] arabic = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

            StringIn.in();
            String[] in = StringIn.getInput();

            String num1 = in[0];
            String num2 = in[2];

            if (Arrays.asList(arabic).contains(num1) && Arrays.asList(arabic).contains(num2)) {
                CalculateArabic.calculate();
            } else if (Arrays.asList(roman).contains(num1) && Arrays.asList(roman).contains(num2)) {
                CalculateRoman.calculate();
            } else {
                System.out.println("Что-то пошло не так! Повторите ввод.");
            }
    }
}
