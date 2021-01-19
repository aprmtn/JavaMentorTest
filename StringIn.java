package JavaMentorCalc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringIn {

    private static String[] input;

    public static void in() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        try {
            input = str.split(" ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String[] getInput() {
        return input;
    }
}
