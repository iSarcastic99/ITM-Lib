package com.example.itmlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.example.itmlibrary.ui.login.LoginActivity;

public class SplashActivity extends AppCompatActivity {
    int time = 2000, i;
    String S, name, status;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences preferences = getSharedPreferences(S,i);
        status = preferences.getString("Status", "No");
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed((new Runnable() {
            @Override
            public void run() {
                if(status.equals("No")) {
                    Intent intro = new Intent(SplashActivity.this, LoginActivity.class);
                    startActivity(intro);
                }
                else{
                    Intent intent = new Intent(SplashActivity.this,MainActivity.class);
                    startActivity(intent);
                }
                finish();
            }
        }),time);
    }
}