package md.soft.com.realestatevendor.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import md.soft.com.realestatevendor.R;

public class CurrentAddressActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_address);
    }
    public void back(View view) {
        super.onBackPressed();
    }
}
