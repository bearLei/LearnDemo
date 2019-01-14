package lei.com.lib_javademo.synchronized_2;

import android.util.Log;

import lei.com.lib_javademo.synchronized_1.TestThreadA;
import lei.com.lib_javademo.synchronized_1.TestThreadB;

/**
 * create by lei on 2019/1/11/011
 * desc:测试实例变量非线程安全
 * 多个线程共同访问1个对象的实例变量，可能造成非线程安全问题
 * 加个synchronized可以解决
 */
public class SynchronizedClass02 {

    int num = 5;
    public void add(String str){
        synchronized (this) {
            if (str.equalsIgnoreCase("a")) {
                num++;
            } else {
                num--;
            }
            Log.d("lei", "当前运行线程-->" + Thread.currentThread().getName() + "-->" + num);

        }
    }

    public void test(){
        TestThread2A testThreadA = new TestThread2A(this);
        TestThread2B testThreadB = new TestThread2B(this);
        testThreadA.start();
        testThreadB.start();
    }


}
