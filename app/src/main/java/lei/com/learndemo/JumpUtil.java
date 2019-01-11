package lei.com.learndemo;

import android.content.Context;
import android.content.Intent;

/**
 * create by lei on 2019/1/11/011
 * desc:
 */
public class JumpUtil {


    public static void jump(Context context,Class tClass){
        Intent intent = new Intent(context,tClass);
        context.startActivity(intent);
    }
}
