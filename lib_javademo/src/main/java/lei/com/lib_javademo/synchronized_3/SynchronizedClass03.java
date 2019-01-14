package lei.com.lib_javademo.synchronized_3;

import android.util.Log;

import lei.com.lib_javademo.synchronized_1.TestThreadA;
import lei.com.lib_javademo.synchronized_1.TestThreadB;

/**
 * create by lei on 2019/1/11/011
 * 多个对象多个锁，
 * 但是如果是static的话，锁的就不是对象而是类了，这个时候就构成了线程同步
 */
public class SynchronizedClass03 {

    volatile int num = 5;
    public  synchronized void add(String str){

            if (str.equalsIgnoreCase("a")) {
                num++;
            } else {
                num--;
            }
            Log.d("lei", "当前运行线程-->"+Thread.currentThread().getName()+"-->"+num);

    }


}
