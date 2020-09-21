package main.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

    public static void main(String[] args) throws ParseException {

        Pattern pat = Pattern.compile("F......");
        Matcher mat = pat.matcher("Florian");

        System.out.println("-----First method-----");
        boolean result1 = mat.matches();
        System.out.println(result1);

        System.out.println("-----Second method-----");
        boolean result2 = Pattern.compile("F......").matcher("Florian").matches();
        System.out.println(result2);

        System.out.println("-----Third method-----");
        boolean result3 = Pattern.matches("F......", "Florian");
        System.out.println(result3);

        System.out.println("-----No matches-----");
        boolean result4 = Pattern.matches("F%", "Florian");
        System.out.println(result4);

        System.out.println("-----No matches-----");
        boolean result5 = Pattern.matches("F*", "Florian");
        System.out.println(result5);

        System.out.println("-----Matches with all after the letter F-----");
        boolean result6 = Pattern.matches("F.*", "Florian");
        System.out.println(result6);

        System.out.println("-----Matches with all before and/or after ori-----");
        boolean result7 = Pattern.matches(".*ori.*", "Florian");
        System.out.println(result7);

    }

    public static void menu() {

    }
}
