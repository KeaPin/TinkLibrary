package cn.aprain.library;

import android.content.Context;
import android.widget.Toast;

public class TinkUtil {
    public static void toast(Context context,String msg){
        Toast.makeText(context,msg,Toast.LENGTH_LONG).show();
    }
}
