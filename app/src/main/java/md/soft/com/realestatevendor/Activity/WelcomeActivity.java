package md.soft.com.realestatevendor.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import md.soft.com.realestatevendor.R;

public class WelcomeActivity extends AppCompatActivity {

    private ImageView Back;
    private TextInputLayout textInputLayout3;
    private TextInputEditText UserEmailorNumber;
    private Button GoNext;
    private TextView Register;
    private TextView tc;
    private TextView textView4;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        initView();


        GoNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i= new Intent(WelcomeActivity.this,PasswordActivity.class);
                startActivity(i);
            }
        });


        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i= new Intent(WelcomeActivity.this,RegisterActivity.class);
                startActivity(i);
            }
        });


    }
    public void back(View view) {
        super.onBackPressed();
    }
    private void initView() {
        Back = (ImageView) findViewById(R.id.Back);
        textInputLayout3 = (TextInputLayout) findViewById(R.id.textInputLayout3);
        UserEmailorNumber = (TextInputEditText) findViewById(R.id.UserEmailorNumber);
        GoNext = (Button) findViewById(R.id.Go_Next);
        Register = (TextView) findViewById(R.id.Register);
        tc = (TextView) findViewById(R.id.tc);
        textView4 = (TextView) findViewById(R.id.textView4);
    }
}
