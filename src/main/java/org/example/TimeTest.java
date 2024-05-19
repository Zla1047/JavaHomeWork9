package org.example;

import java.util.List;
import java.util.Random;

public class TimeTest {
    public static long testPut (List<Integer> list) {
        long putTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        } long doneTime = System.currentTimeMillis();
        return doneTime - putTime;
    }

    public static long testRandom (List<Integer> list) {
        Random random = new Random();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            int index = random.nextInt(list.size());
            list.get(index);
        } long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

}
