package md.soft.com.realestatevendor.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

import md.soft.com.realestatevendor.R;

public class NewPasswordActivity extends AppCompatActivity {

    private LinearLayout linearLayout3;
    private ImageView Back;
    private TextInputEditText NewPassword;
    private TextInputEditText ConfirmPassowrd;
    private Button buttonNext;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_password);
        initView();
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i= new Intent(NewPasswordActivity.this,RegisterActivity.class);
                startActivity(i);
            }
        });


    }
    public void back(View view) {
        super.onBackPressed();
    }
    private void initView() {
        linearLayout3 = (LinearLayout) findViewById(R.id.linearLayout3);
        Back = (ImageView) findViewById(R.id.Back);
        NewPassword = (TextInputEditText) findViewById(R.id.New_Password);
        ConfirmPassowrd = (TextInputEditText) findViewById(R.id.Confirm_passowrd);
        buttonNext = (Button) findViewById(R.id.button_Next);
    }
}
