// ---------------- COUNTER WITH MYTHREAD ----------------
// Multiple threads ek hi counter variable ko increment karenge.
// Agar synchronized use nahi kare to race condition hogi.
// Synchronization se correct result milega.

class Counter {
    int count = 0;

    // synchronized method -> ek time me ek hi thread access karega
    public synchronized void increment() {
        count++;
    }
}

class MyThread extends Thread {
    Counter counter;

    MyThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 1; i <= 1000; i++) {
            counter.increment();
        }
    }
}

public class MyThreadCounterDemo {
    public static void main(String[] args) throws Exception {
        Counter c = new Counter();

        // 2 threads same counter increment karenge
        MyThread t1 = new MyThread(c);
        MyThread t2 = new MyThread(c);

        t1.start();
        t2.start();

        // main thread wait kare dono ke khatam hone tak
        t1.join();
        t2.join();

        // final result
        System.out.println("Final Count = " + c.count);
    }
}
