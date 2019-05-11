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

public class RegisterActivity extends AppCompatActivity {

    private LinearLayout linearLayout;
    private ImageView Back;
    private TextInputEditText Firstname;
    private TextInputEditText Lastname;
    private TextInputEditText Mobile;
    private TextInputEditText Email;
    private TextInputEditText Password;
    private Button buttonSubmit;
    private TextView Tm;
    private TextView textView4;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initView();
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i= new Intent(RegisterActivity.this,HomeActivity.class);
                startActivity(i);
            }
        });


    }

    public void back(View view) {
        super.onBackPressed();
    }

    private void initView() {
        linearLayout = (LinearLayout) findViewById(R.id.linearLayout);
        Back = (ImageView) findViewById(R.id.Back);
        Firstname = (TextInputEditText) findViewById(R.id.Firstname);
        Lastname = (TextInputEditText) findViewById(R.id.Lastname);
        Mobile = (TextInputEditText) findViewById(R.id.Mobile);
        Email = (TextInputEditText) findViewById(R.id.Email);
        Password = (TextInputEditText) findViewById(R.id.Password);
        buttonSubmit = (Button) findViewById(R.id.button_Submit);
        Tm = (TextView) findViewById(R.id.Tm);
        textView4 = (TextView) findViewById(R.id.textView4);
    }
}
