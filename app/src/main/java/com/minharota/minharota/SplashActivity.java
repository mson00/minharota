package com.minharota.minharota;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by madsonfelipe on 24/07/15.
 */
public class SplashActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent i = new Intent(SplashActivity.this, LoginActivity.class);
                    startActivity(i);
                }
            }
        };
        timerThread.start();
    }
}
