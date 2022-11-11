package objectsandclasses.part2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.GregorianCalendar;

public class GregorianCalendarEx {
    private static final Logger logger = LogManager.getLogger(GregorianCalendarEx.class);

    public static void main(String[] args) {

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.getTimeInMillis();
        String now = "Now: " + gregorianCalendar.get(GregorianCalendar.YEAR) + "-" + gregorianCalendar.get(GregorianCalendar.MONTH) +
                "-" + gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);
        logger.info(now);

        gregorianCalendar.setTimeInMillis(1234567898765L);

        String settedDate = gregorianCalendar.get(GregorianCalendar.YEAR) + "-" + gregorianCalendar.get(GregorianCalendar.MONTH) +
                "-" + gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);

        logger.info(settedDate);
    }
}
