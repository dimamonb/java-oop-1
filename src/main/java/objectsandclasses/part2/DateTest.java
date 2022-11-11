package objectsandclasses.part2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Date;

public class DateTest {
    private static final Logger logger = LogManager.getLogger(DateTest.class);
    public static void main(String[] args) {
        Date date = new Date();
        date.setTime(100000000000L);
        logger.info(date.toString());
        for (long i = 10000; i < 100000000000000L; i=i*10) {
            date.setTime(i);
            String message = date.toString();
            logger.info(message);
        }
    }
}
