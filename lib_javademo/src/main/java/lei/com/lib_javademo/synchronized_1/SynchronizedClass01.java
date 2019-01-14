package lei.com.lib_javademo.synchronized_1;

import android.util.Log;

/**
 * create by lei on 2019/1/11/011
 * desc:测试方法内的变量是线程安全的
 * 方法内变量不存在 非线程安全问题，原因：方法内的变量是私有
 */
public class SynchronizedClass01 {

    public  void add(String str){
        int num = 5;
            if (str.equalsIgnoreCase("a")) {
                num++;
            } else {
                num--;
            }
            Log.d("lei", "当前运行线程-->"+Thread.currentThread().getName()+"-->"+num);

    }

    public void test(){
        TestThreadA testThreadA = new TestThreadA(this);
        TestThreadB testThreadB = new TestThreadB(this);
        testThreadA.start();
        testThreadB.start();
    }


}
