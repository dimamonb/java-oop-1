package oothinking.part6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar g = new GregorianCalendar();
        this.year = g.get(Calendar.YEAR);
        this.month = g.get(Calendar.MONTH);
        this.day = g.get(Calendar.DAY_OF_MONTH);
    }

    public MyDate(long timeInMilliseconds) {
        Calendar g = new GregorianCalendar();
        g.setTimeInMillis(timeInMilliseconds);
        year = g.get(Calendar.YEAR);
        month = g.get(Calendar.MONTH);
        day = g.get(Calendar.DAY_OF_MONTH);
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setDate(long elapseTime) {
        Calendar g = new GregorianCalendar();
        g.setTimeInMillis(elapseTime);
        year = g.get(Calendar.YEAR);
        month = g.get(Calendar.MONTH);
        day = g.get(Calendar.DAY_OF_MONTH);
    }

    public static void main(String[] args) {
        MyDate md1 = new MyDate();
        MyDate md2 = new MyDate(34355555133101L);

        System.out.println(md1.getYear() +"/"+ md1.getMonth() +"/"+ md1.getDay());
        System.out.println(md2.getYear() +"/"+ md2.getMonth() +"/"+ md2.getDay());

    }
}
