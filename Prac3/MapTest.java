package Prac3;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Semaphore;

public class MapTest {
    void run () {
        Map<String, Integer> notThreadSafeHashMap = new HashMap<>();
        Map<String, Integer> imaginaryThreadSafeHashMap = new ImaginaryThreadSafeMap<>();
        Map<String, Integer> threadSafeHashMap = new HashMap<>();
        String test = "test";
        Semaphore semaphore = new Semaphore(1);

        notThreadSafeHashMap.put(test, 0);
        imaginaryThreadSafeHashMap.put(test, 0);
        threadSafeHashMap.put(test, 0);

        //Race condition
        Thread one = new Thread(() -> {
            for (int i = 0; i < 5000; i++) {
                int temp = notThreadSafeHashMap.get(test);
                notThreadSafeHashMap.put(test, ++temp);
            }

            for (int i = 0; i < 5000; i++) {
                int temp = imaginaryThreadSafeHashMap.get(test);
                imaginaryThreadSafeHashMap.put(test, ++temp);
            }

            for (int i = 0; i < 5000; i++) {
                try {
                    semaphore.acquire();
                    int temp = threadSafeHashMap.get(test);
                    threadSafeHashMap.put(test, ++temp);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                semaphore.release();
            }
        });

        Thread two = new Thread(() -> {
            for (int i = 0; i < 5000; i++) {
                int temp = notThreadSafeHashMap.get(test);
                notThreadSafeHashMap.put(test, ++temp);
            }

            for (int i = 0; i < 5000; i++) {
                int temp = imaginaryThreadSafeHashMap.get(test);
                imaginaryThreadSafeHashMap.put(test, ++temp);
            }

            for (int i = 0; i < 5000; i++) {
                try {
                    semaphore.acquire();
                    int temp = threadSafeHashMap.get(test);
                    threadSafeHashMap.put(test, ++temp);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                semaphore.release();
            }
        });

        one.start();
        two.start();

        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
        System.out.println("Not thread-safe implementation: " + notThreadSafeHashMap.get(test));
        System.out.println("Imaginary thread-safe implementation: " + notThreadSafeHashMap.get(test));
        System.out.println("Thread-safe implementation:" + threadSafeHashMap.get(test));
    }
}
