package objectsandclasses.part3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Random;

public class StopWatch {
    private static final Logger logger = LogManager.getLogger(StopWatch.class);

    private LocalTime startTime;
    private LocalTime endTime;
    private Long d;

    public StopWatch() {
        this.startTime = LocalTime.now();
        this.d = System.currentTimeMillis();
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public LocalTime start() {
        return LocalTime.now();
    }

    public LocalTime stop() {
        endTime = LocalTime.now();
        return endTime;
    }

    public Long getElapsedTime(LocalTime startT, LocalTime endT) {
        return Duration.between(startT, endT).getSeconds();
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        StopWatch stopWatch = new StopWatch();
        Random rnd = new Random(20);
        for (int i = 0; i < 100000; i++) {
            arrayList.add(1 + rnd.nextInt(99999));
        }

        LocalTime startTime = stopWatch.start();
        for (int i = 0; i < arrayList.size() - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(j).compareTo(arrayList.get(minIdx)) < 0) {
                    minIdx = j;
                }
            }
            int temp = arrayList.get(i);
            arrayList.set(i, arrayList.get(minIdx));
            arrayList.set(minIdx, temp);
        }
        LocalTime endTime = stopWatch.stop();
        logger.info(stopWatch.getElapsedTime(startTime, endTime));
        logger.info(arrayList.toString());
    }
}
