package md.soft.com.realestatevendor.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import md.soft.com.realestatevendor.Activity.ContectUsActivity;
import md.soft.com.realestatevendor.Activity.EditProfileActivity;
import md.soft.com.realestatevendor.Activity.PasswordActivity;
import md.soft.com.realestatevendor.Activity.SettingActivity;
import md.soft.com.realestatevendor.Activity.VerifyActivity;
import md.soft.com.realestatevendor.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MenuFragment extends Fragment {


    private LinearLayout EditProfile;
    private LinearLayout MyHistory;
    private LinearLayout TermsUse;
    private LinearLayout PPolicy;
    private LinearLayout ContectUs;
    private LinearLayout Share;
    private LinearLayout RateApp;
    private LinearLayout Setting;
    Intent i;
    public static MenuFragment newInstance() {
        MenuFragment fragment = new MenuFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
        EditProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i= new Intent(getActivity(), EditProfileActivity.class);
                startActivity(i);
            }
        });

        ContectUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i= new Intent(getActivity(), ContectUsActivity.class);
                startActivity(i);
            }
        });

        Setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i= new Intent(getActivity(), SettingActivity.class);
                startActivity(i);
            }
        });



    }

    private void initView() {
        EditProfile = (LinearLayout) getView().findViewById(R.id.Edit_Profile);
        MyHistory = (LinearLayout) getView().findViewById(R.id.My_History);
        TermsUse = (LinearLayout) getView().findViewById(R.id.TermsUse);
        PPolicy = (LinearLayout) getView().findViewById(R.id.P_Policy);
        ContectUs = (LinearLayout) getView().findViewById(R.id.Contect_Us);
        Share = (LinearLayout) getView().findViewById(R.id.Share);
        RateApp = (LinearLayout) getView().findViewById(R.id.RateApp);
        Setting = (LinearLayout) getView().findViewById(R.id.Setting);
    }
}
