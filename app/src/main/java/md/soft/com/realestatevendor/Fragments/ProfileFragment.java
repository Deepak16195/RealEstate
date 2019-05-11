package md.soft.com.realestatevendor.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import de.hdodenhof.circleimageview.CircleImageView;
import md.soft.com.realestatevendor.Activity.ContectUsActivity;
import md.soft.com.realestatevendor.Activity.EditProfileActivity;
import md.soft.com.realestatevendor.Activity.IdentityActivity;
import md.soft.com.realestatevendor.Activity.SettingActivity;
import md.soft.com.realestatevendor.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {


    private CircleImageView UserImage;
    private TextView Name;
    private TextView VTital;
    private TextView VText;
    private LinearLayout Identity;
    private LinearLayout AboutService;
    private LinearLayout Upladwork;
    private LinearLayout Servicelocation;
    Intent i;
    public static ProfileFragment newInstance() {
        ProfileFragment fragment = new ProfileFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
        Identity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i= new Intent(getActivity(), IdentityActivity.class);
                startActivity(i);
            }
        });




    }





    private void initView() {
        UserImage = (CircleImageView) getView().findViewById(R.id.User_image);
        Name = (TextView) getView().findViewById(R.id.Name);
        VTital = (TextView) getView().findViewById(R.id.V_tital);
        VText = (TextView) getView().findViewById(R.id.V_text);
        Identity = (LinearLayout) getView().findViewById(R.id.Identity);
        AboutService = (LinearLayout) getView().findViewById(R.id.AboutService);
        Upladwork = (LinearLayout) getView().findViewById(R.id.Upladwork);
        Servicelocation = (LinearLayout) getView().findViewById(R.id.Servicelocation);
    }
}
