package Prac3;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ListTest {
    void run () {
        List<Integer> notThreadSafeLinkedList = new LinkedList<>();
        List<Integer> threadSafeLinkedList = new LinkedList<>();

        final Lock lock = new ReentrantLock();

        notThreadSafeLinkedList.add(0, 0);
        threadSafeLinkedList.add(0, 0);

        //Race condition
        Thread one = new Thread(() -> {
            for (int i = 0; i < 5000; i++) {
                int temp = notThreadSafeLinkedList.get(0);
                notThreadSafeLinkedList.add(0, ++temp);
            }

            for (int i = 0; i < 5000; i++) {
                lock.lock();
                int temp = threadSafeLinkedList.get(0);
                threadSafeLinkedList.add(0, ++temp);
                lock.unlock();
            }
        });

        Thread two = new Thread(() -> {
            for (int i = 0; i < 5000; i++) {
                int temp = notThreadSafeLinkedList.get(0);
                notThreadSafeLinkedList.add(0, ++temp);
            }

            for (int i = 0; i < 5000; i++) {
                lock.lock();
                int temp = threadSafeLinkedList.get(0);
                threadSafeLinkedList.add(0, ++temp);
                lock.unlock();
            }
        });

        one.start();
        two.start();

        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
        System.out.println("\nNot thread-safe implementation: " + notThreadSafeLinkedList.get(0));
        System.out.println("Thread-safe implementation:" + threadSafeLinkedList.get(0));
    }
}
