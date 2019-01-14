package lei.com.lib_javademo.synchronized_3;

import lei.com.lib_javademo.synchronized_1.SynchronizedClass01;

/**
 * create by lei on 2019/1/11/011
 * desc:
 */
public class TestThread3A extends Thread {

    private SynchronizedClass03 synchronizedClass03;

    public TestThread3A(SynchronizedClass03 synchronizedClass03) {
        this.synchronizedClass03 = synchronizedClass03;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10; i++) {
            synchronizedClass03.add("a");
        }
    }
}
