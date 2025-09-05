// ---------------- MULTITASKING IN JAVA (ALL IN ONE) ----------------
// Is program me cover hai:
// 1. Process-based Multitasking (Notepad, Calculator)
// 2. Thread-based Multitasking (Multiple threads in one program)
// 3. Thread Pool Multitasking (ExecutorService)

import java.util.concurrent.*;

// ---------------- 1. THREAD CLASSES ----------------
class MusicTask extends Thread {
    public void run() {
        for(int i=1; i<=3; i++) {
            System.out.println("🎵 Playing music...");
            try { Thread.sleep(400); } catch(Exception e) {}
        }
    }
}

class DownloadTask extends Thread {
    public void run() {
        for(int i=1; i<=3; i++) {
            System.out.println("⬇️ Downloading file...");
            try { Thread.sleep(400); } catch(Exception e) {}
        }
    }
}

class TypingTask implements Runnable {
    public void run() {
        for(int i=1; i<=3; i++) {
            System.out.println("⌨️ Typing document...");
            try { Thread.sleep(400); } catch(Exception e) {}
        }
    }
}

// ---------------- MAIN CLASS ----------------
public class MultiTaskingAll {
    public static void main(String[] args) throws Exception {

        // ===== 1. PROCESS-BASED MULTITASKING =====
        System.out.println("\n===== PROCESS-BASED MULTITASKING =====");
        Runtime r = Runtime.getRuntime();
        try {
            // Windows ke liye (Notepad + Calculator)
            r.exec("notepad");
            r.exec("calc");
            System.out.println("✅ Notepad and Calculator started as separate processes.");
        } catch(Exception e) {
            System.out.println("❌ Process start failed (may depend on OS).");
        }

        // ===== 2. THREAD-BASED MULTITASKING =====
        System.out.println("\n===== THREAD-BASED MULTITASKING =====");
        MusicTask music = new MusicTask();
        DownloadTask download = new DownloadTask();
        Thread typing = new Thread(new TypingTask());

        music.start();
        download.start();
        typing.start();

        // Main thread wait kare inke khatam hone ka
        music.join();
        download.join();
        typing.join();

        // ===== 3. THREAD POOL MULTITASKING =====
        System.out.println("\n===== THREAD POOL MULTITASKING =====");
        ExecutorService pool = Executors.newFixedThreadPool(3);

        pool.execute(() -> {
            for(int i=1; i<=3; i++) {
                System.out.println("📧 Checking emails...");
                try { Thread.sleep(400); } catch(Exception e) {}
            }
        });

        pool.execute(() -> {
            for(int i=1; i<=3; i++) {
                System.out.println("📁 Uploading files...");
                try { Thread.sleep(400); } catch(Exception e) {}
            }
        });

        pool.execute(() -> {
            for(int i=1; i<=3; i++) {
                System.out.println("📞 Video call running...");
                try { Thread.sleep(400); } catch(Exception e) {}
            }
        });

        pool.shutdown();

        System.out.println("\n===== PROGRAM END =====");
    }
}
