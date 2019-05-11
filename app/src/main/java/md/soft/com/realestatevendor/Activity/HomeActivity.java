package md.soft.com.realestatevendor.Activity;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentTransaction;

import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.TextView;

import md.soft.com.realestatevendor.Fragments.LeadFragment;
import md.soft.com.realestatevendor.Fragments.MenuFragment;
import md.soft.com.realestatevendor.Fragments.NotificationFragment;
import md.soft.com.realestatevendor.Fragments.ProfileFragment;
import md.soft.com.realestatevendor.R;
import md.soft.com.realestatevendor.Utilitys.BottomNavigationViewHelper;

public class HomeActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationItemView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        bottomNavigationItemView = (BottomNavigationView) findViewById(R.id.nav_view);
        BottomNavigationViewHelper.removeShiftMode(bottomNavigationItemView);
        androidx.fragment.app.Fragment selectedFragment = null;
        bottomNavigationItemView.setSelectedItemId(R.id.navigation_home);
        selectedFragment = LeadFragment.newInstance();
        getSupportFragmentManager().beginTransaction()
                .add(selectedFragment, "home")
                // Add this transaction to the back stack (name is an optional name for this back stack state, or null).
                .addToBackStack(null)
                .commit();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, selectedFragment);
        transaction.commit();
        bottomNavigationItemView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                androidx.fragment.app.Fragment selectedFragment = null;

                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        selectedFragment = LeadFragment.newInstance();
                        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
                        break;
                    case R.id.navigation_notifications:
                        selectedFragment = NotificationFragment.newInstance();
                        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
                        break;
                    case R.id.navigation_profile:
                        selectedFragment = ProfileFragment.newInstance();
                        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
                        break;
                    case R.id.navigation_Menu:
                        selectedFragment = MenuFragment.newInstance();
                        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
                        break;
                }
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_layout, selectedFragment);
                transaction.commit();
                return true;
            }
        });
    }


    public static void setHomeItem(Activity activity) {
        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                activity.findViewById(R.id.nav_view);
        bottomNavigationView.setSelectedItemId(R.id.navigation_home);

    }

}
