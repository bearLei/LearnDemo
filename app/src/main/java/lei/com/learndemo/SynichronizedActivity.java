package lei.com.learndemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import lei.com.lib_javademo.synchronized_1.SynchronizedClass01;

public class SynichronizedActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView synichronized_btn_01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synichronized);
        bindView();
        registListener();
    }

    private void bindView(){
        synichronized_btn_01 = findViewById(R.id.synchronized_btn_01);
    }

    private void registListener() {
        synichronized_btn_01.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.synchronized_btn_01:
                test01();
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


}

