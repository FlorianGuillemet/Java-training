package main.basics;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.util.Locale;

public class DateAndTime {

    public static void main(String[] args) throws ParseException {

        Date d = new Date();

        System.out.println("-----Date to String-----");
        System.out.println(d.toString());

        System.out.println("-----Date to instant-----");
        System.out.println(d.toInstant());

        System.out.println("-----Number of milliseconds since 1970-----");
        System.out.println(d.getTime());

        System.out.println("-----1970-----");
        Date date1970 = new Date(0);
        System.out.println(date1970.toString());

        System.out.println("-----Date with simple date format-----");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(simpleDateFormat.format(d));

        System.out.println("-----Date created with a simple date format-----");
        SimpleDateFormat sdateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date dateDefine = sdateFormat.parse("21-09-2020");
        System.out.println(dateDefine.toString());

    }
}
