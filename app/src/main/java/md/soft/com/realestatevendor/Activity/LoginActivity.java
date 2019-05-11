package md.soft.com.realestatevendor.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import md.soft.com.realestatevendor.R;

public class LoginActivity extends AppCompatActivity {

    private ImageView IvLogo;
    private Button buttonLogin;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i= new Intent(LoginActivity.this,WelcomeActivity.class);
                startActivity(i);
            }
        });


    }

    public void back(View view) {
        super.onBackPressed();
    }

    private void initView() {
        IvLogo = (ImageView) findViewById(R.id.Iv_logo);
        buttonLogin = (Button) findViewById(R.id.buttonLogin);
    }
}
