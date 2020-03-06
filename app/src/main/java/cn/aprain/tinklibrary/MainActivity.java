package cn.aprain.tinklibrary;

import androidx.appcompat.app.AppCompatActivity;
import cn.aprain.library.TinkUtil;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TinkUtil.toast(this,"11111111");
    }
}
