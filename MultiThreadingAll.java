// ------------------ MULTITHREADING IN JAVA (ALL IN ONE) ------------------
// Ye program ek hi file me multithreading ke saare major concepts cover karega:
// 1. Thread creation (Thread class, Runnable)
// 2. Thread lifecycle + methods (start, run, sleep, join, isAlive)
// 3. Thread priority
// 4. Synchronization
// 5. Inter-thread communication (wait/notify)
// 6. Daemon thread
// 7. Thread Pool (ExecutorService)

import java.util.concurrent.*;

// --------------- 1. THREAD CREATION -----------------
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread by extending Thread class: " + getName());
    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread by implementing Runnable: " + Thread.currentThread().getName());
    }
}

// --------------- 2. SYNCHRONIZATION -----------------
class Counter {
    int count = 0;
    public synchronized void increment() {
        count++;
    }
}

// --------------- 3. INTER-THREAD COMMUNICATION -------
class Shared {
    boolean flag = false;
    synchronized void produce() {
        System.out.println("Producing data...");
        flag = true;
        notify(); // consumer ko jagao
    }
    synchronized void consume() {
        while(!flag) {
            try { wait(); } catch(Exception e) {}
        }
        System.out.println("Consuming data...");
    }
}

// --------------- MAIN CLASS -------------------------
public class MultiThreadingAll {
    public static void main(String[] args) throws Exception {

        System.out.println("\n===== 1. THREAD CREATION =====");
        MyThread t1 = new MyThread();
        Thread t2 = new Thread(new MyRunnable());
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("\n===== 2. THREAD METHODS & LIFECYCLE =====");
        Thread t3 = new Thread(() -> {
            System.out.println("Thread running...");
            try { Thread.sleep(500); } catch(Exception e) {}
            System.out.println("Thread finished.");
        });
        t3.start();
        System.out.println("t3 isAlive? " + t3.isAlive());
        t3.join();
        System.out.println("t3 isAlive after join? " + t3.isAlive());

        System.out.println("\n===== 3. THREAD PRIORITY =====");
        Thread high = new Thread(() -> {
            System.out.println("High priority thread running");
        });
        Thread low = new Thread(() -> {
            System.out.println("Low priority thread running");
        });
        high.setPriority(Thread.MAX_PRIORITY);
        low.setPriority(Thread.MIN_PRIORITY);
        high.start();
        low.start();
        high.join(); low.join();

        System.out.println("\n===== 4. SYNCHRONIZATION =====");
        Counter c = new Counter();
        Thread t4 = new Thread(() -> { for(int i=0;i<1000;i++) c.increment(); });
        Thread t5 = new Thread(() -> { for(int i=0;i<1000;i++) c.increment(); });
        t4.start(); t5.start();
        t4.join(); t5.join();
        System.out.println("Final counter value (should be 2000): " + c.count);

        System.out.println("\n===== 5. INTER-THREAD COMMUNICATION =====");
        Shared shared = new Shared();
        Thread consumer = new Thread(() -> shared.consume());
        Thread producer = new Thread(() -> shared.produce());
        consumer.start(); producer.start();
        consumer.join(); producer.join();

        System.out.println("\n===== 6. DAEMON THREAD =====");
        Thread daemon = new Thread(() -> {
            if(Thread.currentThread().isDaemon()) {
                System.out.println("Daemon thread running...");
            } else {
                System.out.println("User thread running...");
            }
        });
        daemon.setDaemon(true); // must before start()
        daemon.start();
        Thread.sleep(200); // allow daemon to print

        System.out.println("\n===== 7. THREAD POOL =====");
        ExecutorService pool = Executors.newFixedThreadPool(3);
        for(int i=1; i<=5; i++) {
            int id = i;
            pool.execute(() -> {
                System.out.println("Task " + id + " executed by " + Thread.currentThread().getName());
            });
        }
        pool.shutdown();

        System.out.println("\n===== PROGRAM END =====");
    }
}
