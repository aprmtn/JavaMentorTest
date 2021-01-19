package JavaMentorCalc;

public class CalculateArabic {
    public static void calculate(){

        String[] in = StringIn.getInput();

        int a = Integer.parseInt(in[0]);
        int b = Integer.parseInt(in[2]);
        String result = null;

        if ("+".equals(in[1])) {
            result = String.valueOf(a + b);
        } else if ("-".equals(in[1])) {
            result = String.valueOf(a - b);
        } else if ("*".equals(in[1])) {
            result = String.valueOf(a * b);
        } else if (("/".equals(in[1])) && (b != 0)) {
            result = String.valueOf(a / b);
        }

        System.out.println(result);

    }
}
