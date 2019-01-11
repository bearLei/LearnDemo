package lei.com.lib_javademo.synchronized_1;

/**
 * create by lei on 2019/1/11/011
 * desc:
 */
public class TestThreadB extends Thread {

    private SynchronizedClass01 synchronizedClass01;

    public TestThreadB(SynchronizedClass01 synchronizedClass01) {
        this.synchronizedClass01 = synchronizedClass01;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10; i++) {
            synchronizedClass01.add("a");
        }
    }
}
