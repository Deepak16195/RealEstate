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
import com.google.android.material.textfield.TextInputLayout;

import md.soft.com.realestatevendor.R;

public class PasswordActivity extends AppCompatActivity {

    private LinearLayout linearLayout2;
    private ImageView Back;
    private TextInputLayout textInputLayout3;
    private TextInputEditText Paswsword;
    private Button buttonSubmit;
    private TextView Otp;
    private TextView FPassword;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
        initView();

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i= new Intent(PasswordActivity.this,VerifyActivity.class);
                startActivity(i);
            }
        });



    }

    public void back(View view) {
        super.onBackPressed();
    }

    private void initView() {
        linearLayout2 = (LinearLayout) findViewById(R.id.linearLayout2);
        Back = (ImageView) findViewById(R.id.Back);
        textInputLayout3 = (TextInputLayout) findViewById(R.id.textInputLayout3);
        Paswsword = (TextInputEditText) findViewById(R.id.Paswsword);
        buttonSubmit = (Button) findViewById(R.id.button_Submit);
        Otp = (TextView) findViewById(R.id.Otp);
        FPassword = (TextView) findViewById(R.id.F_Password);
    }
}
