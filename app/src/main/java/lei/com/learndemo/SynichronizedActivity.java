package lei.com.learndemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import lei.com.lib_javademo.synchronized_1.SynchronizedClass01;
import lei.com.lib_javademo.synchronized_2.SynchronizedClass02;
import lei.com.lib_javademo.synchronized_3.SynchronizedClass03;
import lei.com.lib_javademo.synchronized_3.TestThread3A;
import lei.com.lib_javademo.synchronized_3.TestThread3B;

public class SynichronizedActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView synichronized_btn_01,synichronized_btn_02,synichronized_btn_03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synichronized);
        bindView();
        registListener();
    }

    private void bindView(){
        synichronized_btn_01 = findViewById(R.id.synchronized_btn_01);
        synichronized_btn_02 = findViewById(R.id.synchronized_btn_02);
        synichronized_btn_03 = findViewById(R.id.synchronized_btn_03);
    }

    private void registListener() {
        synichronized_btn_01.setOnClickListener(this);
        synichronized_btn_02.setOnClickListener(this);
        synichronized_btn_03.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.synchronized_btn_01:
                test01();
                break;
            case R.id.synchronized_btn_02:
                test02();
                break;
            case R.id.synchronized_btn_03:
                test03();
                break;
        }
    }

    /**
     * 测试方法内的变量是线程安全的
     */
    private SynchronizedClass01 synchronizedClass01 = new SynchronizedClass01();
    private void test01() {
        synchronizedClass01.test();
    }
    private SynchronizedClass02 synchronizedClass02 = new SynchronizedClass02();
    private void test02(){
        synchronizedClass02.test();
    }

    private void test03(){
        SynchronizedClass03 synchronizedClassFirst = new SynchronizedClass03();
        SynchronizedClass03 synchronizedClassLast = new SynchronizedClass03();
        TestThread3A testThread3A = new TestThread3A(synchronizedClassFirst);
        TestThread3B testThread3B = new TestThread3B(synchronizedClassLast);
        testThread3A.start();
        testThread3B.start();
    }
}

