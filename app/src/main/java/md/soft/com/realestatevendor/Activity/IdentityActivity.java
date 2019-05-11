package md.soft.com.realestatevendor.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import md.soft.com.realestatevendor.R;

public class IdentityActivity extends AppCompatActivity {

    private ImageView Back;
    private LinearLayout AadarCard;
    private LinearLayout PanCard;
    private LinearLayout CurrentAddress;
    private LinearLayout GstDetails;
    private LinearLayout Declaration;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identity);
        initView();

        AadarCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i= new Intent(IdentityActivity.this,AadarActivity.class);
                startActivity(i);
            }
        });

        PanCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i= new Intent(IdentityActivity.this,AadarActivity.class);
                startActivity(i);
            }
        });

        CurrentAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i= new Intent(IdentityActivity.this,CurrentAddressActivity.class);
                startActivity(i);
            }
        });

        GstDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i= new Intent(IdentityActivity.this,GstDetilsActivity.class);
                startActivity(i);
            }
        });




    }

    public void back(View view) {
        super.onBackPressed();
    }

    private void initView() {
        Back = (ImageView) findViewById(R.id.Back);
        AadarCard = (LinearLayout) findViewById(R.id.AadarCard);
        PanCard = (LinearLayout) findViewById(R.id.PanCard);
        CurrentAddress = (LinearLayout) findViewById(R.id.CurrentAddress);
        GstDetails = (LinearLayout) findViewById(R.id.GstDetails);
        Declaration = (LinearLayout) findViewById(R.id.Declaration);
    }
}
