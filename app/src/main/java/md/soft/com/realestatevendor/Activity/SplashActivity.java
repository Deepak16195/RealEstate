package md.soft.com.realestatevendor.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import md.soft.com.realestatevendor.R;

public class SplashActivity extends AppCompatActivity {

    String Userid;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

//        final int id =SharePrefarence.getmInstance(this).getUserId();
//        if (!(id==0)) {
//            i= new Intent(this,DashBoardActivity.class);//DashBoardActivity
//
//        }else {
//            i= new Intent(this,IntroActivity.class);
//        }

        i = new Intent(this, LoginActivity.class);
        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(i);
                    finish();

                }
            }
        };
        timer.start();
    }
}
