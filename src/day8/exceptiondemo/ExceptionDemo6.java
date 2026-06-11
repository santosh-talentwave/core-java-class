package day8.exceptiondemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo6 {

    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);
        formatDate(now);
        System.out.println("================");
        String event = "2026-06-15";
        System.out.println(event);
        try {
            parseDate(event);
        } catch (ParseException e) {
            System.out.println(e);
        }
    }

    public static void parseDate(String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parsedDate = sdf.parse(date);
        System.out.println(parsedDate);
    }

    public static void formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss a");
        String formattedDate = sdf.format(date);
        System.out.println(formattedDate);
    }
}
