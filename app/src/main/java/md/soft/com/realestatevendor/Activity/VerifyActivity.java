package md.soft.com.realestatevendor.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

import md.soft.com.realestatevendor.R;

public class VerifyActivity extends AppCompatActivity {

    private LinearLayout linearLayout4;
    private ImageView Back;
    private TextInputEditText Otp;
    private TextView Time;
    private Button buttonSubmit;
    private TextView ResendOtp;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
        initView();

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i= new Intent(VerifyActivity.this,NewPasswordActivity.class);
                startActivity(i);
            }
        });

    }

    public void back(View view) {
        super.onBackPressed();
    }

    private void initView() {
        linearLayout4 = (LinearLayout) findViewById(R.id.linearLayout4);
        Back = (ImageView) findViewById(R.id.Back);
        Otp = (TextInputEditText) findViewById(R.id.Otp);
        Time = (TextView) findViewById(R.id.Time);
        buttonSubmit = (Button) findViewById(R.id.button_Submit);
        ResendOtp = (TextView) findViewById(R.id.ResendOtp);
    }
}
