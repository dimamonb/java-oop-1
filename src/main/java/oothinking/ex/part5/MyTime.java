package oothinking.ex.part5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar g = new GregorianCalendar();
        hour = g.get(Calendar.HOUR);
        minute = g.get(Calendar.MINUTE);
        second = g.get(Calendar.SECOND);
    }

    public MyTime(long timeInMilliseconds) {
        Calendar g = new GregorianCalendar();
        g.setTimeInMillis(timeInMilliseconds);
        hour = g.get(Calendar.HOUR);
        minute = g.get(Calendar.MINUTE);
        second = g.get(Calendar.SECOND);
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void  setTime(long elapseTime) {
        Calendar g = new GregorianCalendar();
        g.setTimeInMillis(elapseTime);
        hour = g.get(Calendar.HOUR);
        minute = g.get(Calendar.MINUTE);
        second = g.get(Calendar.SECOND);
    }

    public static void main(String[] args) {
        MyTime myTime1 = new MyTime();
        System.out.println(myTime1.getHour() + " : " + myTime1.getMinute() + " : " + myTime1.getSecond());

        MyTime myTime2 = new MyTime(555550000);
        System.out.println(myTime2.getHour() + " : " + myTime2.getMinute() + " : " + myTime2.getSecond());

        MyTime myTime3 = new MyTime(5, 23, 55);
        System.out.println(myTime3.getHour() + " : " + myTime3.getMinute() + " : " + myTime3.getSecond());
    }
}
