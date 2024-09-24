package com.transunion.thread.service;

import java.util.concurrent.CountDownLatch;

public class ThreadService {
	private static final int THREAD_COUNT = 5;
    private static CountDownLatch latch;

    public static void main(String[] args) {
        latch = new CountDownLatch(THREAD_COUNT);

        // Start threads T1, T2, T3, T4
        for (int i = 1; i <= THREAD_COUNT - 1; i++) {
            startThread(i);
        }
        
        // Start thread T5
        startThread5();
    }

    private static void startThread(int id) {
        new Thread(() -> {
            process(id);
        }, "T" + id).start();
    }

    private static void startThread5() {
        new Thread(() -> {
            try {
                latch.await(); // Wait for T1, T2, T3, T4 to finish
                System.out.println("T5 is now processing.");
                Thread.sleep(1000); // Simulate work for T5
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("T5 has finished processing.");
            }
        }, "T5").start();
    }

    private static void process(int threadId) {
        try {
            System.out.println("T" + threadId + " is processing.");
            Thread.sleep(1000); // Simulate work
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            latch.countDown(); // Decrement latch count
            System.out.println("T" + threadId + " has finished processing.");
        }
    }
}
