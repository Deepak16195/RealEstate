package md.soft.com.realestatevendor.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import md.soft.com.realestatevendor.R;

public class GstDetilsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gst_detils);
    }
    public void back(View view) {
        super.onBackPressed();
    }
}
