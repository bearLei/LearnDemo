package lei.com.lib_javademo.synchronized_2;

import lei.com.lib_javademo.synchronized_1.SynchronizedClass01;

/**
 * create by lei on 2019/1/11/011
 * desc:
 */
public class TestThread2B extends Thread {

    private SynchronizedClass02 synchronizedClass02;

    public TestThread2B(SynchronizedClass02 synchronizedClass02) {
        this.synchronizedClass02 = synchronizedClass02;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10; i++) {
            synchronizedClass02.add("a");
        }
    }
}
