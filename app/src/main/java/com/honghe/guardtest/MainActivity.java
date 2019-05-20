package com.honghe.guardtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyApplication.setMainActivity(MainActivity.this);
    }

    public void openLocal(View view) {
        startService(new Intent(this, LocalService.class));
    }

    public void closeLocal(View view) {
//        stopService(new Intent(this, LocalService.class));
        JniLoader jniLoader = new JniLoader();
        TextView tv_mess = findViewById(R.id.tv_message);
        tv_mess.setText(jniLoader.getHelloString());
    }

    public void closeRemote(View view) {
        stopService(new Intent(this, RemoteService.class));
    }

}
