package threads;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Created by: Denis Timofeev
 * Date: 16.01.2019
 */
@DisplayName("Working with threads")
class ThreadsTest {

    @Test
    @DisplayName("Create thread via implementing Runnable")
    void runnable() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(String.format("Running in %s", Thread.currentThread()));
            }
        };
        new Thread(runnable).start();
    }

    @Test
    @DisplayName("Create thread via extending Thread")
    void thread() {
        class MyThread extends Thread {

            private String name;

            private MyThread(String name) {
                super(name);
                this.name = name;
            }

            @Override
            public void run() {
                super.run();
                System.out.println(String.format("Running [%s] in %s", name, Thread.currentThread()));
            }
        }
        System.out.println("main thread is " + Thread.currentThread());
        MyThread threadStart = new MyThread("start");
        threadStart.start();
        MyThread threadRun = new MyThread("RUN");
        threadRun.run();
    }
}
