package lei.com.learndemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView learnSynchronized;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindView();
        registListener();
    }

    private void bindView(){
        learnSynchronized = findViewById(R.id.learn_synchronized);
    }

    private void registListener(){
        learnSynchronized.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.learn_synchronized:
                JumpUtil.jump(this,SynichronizedActivity.class);
                break;
        }
    }
}
