package md.soft.com.realestatevendor.Activity;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.theartofdev.edmodo.cropper.CropImage;
import com.theartofdev.edmodo.cropper.CropImageView;

import java.io.ByteArrayOutputStream;

import md.soft.com.realestatevendor.R;
import md.soft.com.realestatevendor.Utilitys.PermissionUtility;

public class UploadWorkActivity extends AppCompatActivity {

    private ImageView Back;
    private ImageView FirstImage;
    private LinearLayout LLFirst;
    private ImageView SecandImage;
    private LinearLayout LLSecand;
    private ImageView thiredImage;
    private LinearLayout LLThired;
    private ImageView ForthImage;
    private LinearLayout LLForth;
    private ImageView FiveImage;
    private LinearLayout LLFive;
    private ImageView plus1;
    private ImageView SixImage;
    private LinearLayout LLSix;
    private Uri mCropImageUri;
    String ClickedData = "";
    private LinearLayout llMain1;
    private LinearLayout llMain2;
    private LinearLayout llMain3;
    private LinearLayout llMain4;
    private LinearLayout llMain5;
    private LinearLayout llMain6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_work);
        initView();

        llMain1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickedData = "llMain1";
                if (PermissionUtility.checkPermissionCameraAccessAndReadExternalStorage(UploadWorkActivity.this)) {
                    onSelectImageClick(v);
                }
            }
        });
        llMain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickedData = "llMain2";
                if (PermissionUtility.checkPermissionCameraAccessAndReadExternalStorage(UploadWorkActivity.this)) {
                    onSelectImageClick(v);
                }
            }
        });
        llMain3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickedData = "llMain3";
                if (PermissionUtility.checkPermissionCameraAccessAndReadExternalStorage(UploadWorkActivity.this)) {
                    onSelectImageClick(v);
                }
            }
        });


        llMain4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickedData = "llMain4";
                if (PermissionUtility.checkPermissionCameraAccessAndReadExternalStorage(UploadWorkActivity.this)) {
                    onSelectImageClick(v);
                }
            }
        });

        llMain5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickedData = "llMain5";
                if (PermissionUtility.checkPermissionCameraAccessAndReadExternalStorage(UploadWorkActivity.this)) {
                    onSelectImageClick(v);
                }
            }
        });
        llMain6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickedData = "llMain6";
                if (PermissionUtility.checkPermissionCameraAccessAndReadExternalStorage(UploadWorkActivity.this)) {
                    onSelectImageClick(v);
                }
            }
        });


    }

    private void initView() {
        Back = (ImageView) findViewById(R.id.Back);
        FirstImage = (ImageView) findViewById(R.id.FirstImage);
        LLFirst = (LinearLayout) findViewById(R.id.LL_First);
        SecandImage = (ImageView) findViewById(R.id.SecandImage);
        LLSecand = (LinearLayout) findViewById(R.id.LL_Secand);
        thiredImage = (ImageView) findViewById(R.id.thiredImage);
        LLThired = (LinearLayout) findViewById(R.id.LL_thired);
        ForthImage = (ImageView) findViewById(R.id.ForthImage);
        LLForth = (LinearLayout) findViewById(R.id.LL_forth);
        FiveImage = (ImageView) findViewById(R.id.FiveImage);
        LLFive = (LinearLayout) findViewById(R.id.LL_five);
        plus1 = (ImageView) findViewById(R.id.plus1);
        SixImage = (ImageView) findViewById(R.id.SixImage);
        LLSix = (LinearLayout) findViewById(R.id.LL_Six);
        llMain1 = (LinearLayout) findViewById(R.id.ll_Main1);
        llMain2 = (LinearLayout) findViewById(R.id.ll_Main2);
        llMain3 = (LinearLayout) findViewById(R.id.ll_Main3);
        llMain4 = (LinearLayout) findViewById(R.id.ll_Main4);
        llMain5 = (LinearLayout) findViewById(R.id.ll_Main5);
        llMain6 = (LinearLayout) findViewById(R.id.ll_Main6);
    }

    @Override
    @SuppressLint("NewApi")
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        // handle result of pick image chooser
        if (requestCode == CropImage.PICK_IMAGE_CHOOSER_REQUEST_CODE && resultCode == Activity.RESULT_OK) {
            Uri imageUri = CropImage.getPickImageResultUri(this, data);

            // For API >= 23 we need to check specifically that we have permissions to read external storage.
            if (CropImage.isReadExternalStoragePermissionsRequired(this, imageUri)) {
                // request permissions and handle the result in onRequestPermissionsResult()
                requestPermissions(new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 0);
            } else {
                // no permissions required or already grunted, can start crop image activity
                startCropImageActivity(imageUri);
            }
        }

        // handle result of CropImageActivity
        if (requestCode == CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE) {
            CropImage.ActivityResult result = CropImage.getActivityResult(data);
            if (resultCode == RESULT_OK) {
                if(ClickedData.equalsIgnoreCase("llMain1"))
                {
                    mCropImageUri = result.getUri();
                    String path = result.getUri().toString().toString().trim();
                    FirstImage.setImageURI(result.getUri());
                    FirstImage.setImageURI(mCropImageUri);
                    LLFirst.setVisibility(View.GONE);
                }
                if(ClickedData.equalsIgnoreCase("llMain2"))
                {
                    mCropImageUri = result.getUri();
                    String path = result.getUri().toString().toString().trim();
                    SecandImage.setImageURI(result.getUri());
                    SecandImage.setImageURI(mCropImageUri);
                    LLSecand.setVisibility(View.GONE);
                }
                if(ClickedData.equalsIgnoreCase("llMain3"))
                {
                    mCropImageUri = result.getUri();
                    String path = result.getUri().toString().toString().trim();
                    thiredImage.setImageURI(result.getUri());
                    thiredImage.setImageURI(mCropImageUri);
                    LLThired.setVisibility(View.GONE);
                }
                if(ClickedData.equalsIgnoreCase("llMain4"))
                {
                    mCropImageUri = result.getUri();
                    String path = result.getUri().toString().toString().trim();
                    ForthImage.setImageURI(result.getUri());
                    ForthImage.setImageURI(mCropImageUri);
                    LLForth.setVisibility(View.GONE);
                }
                if(ClickedData.equalsIgnoreCase("llMain5"))
                {
                    mCropImageUri = result.getUri();
                    String path = result.getUri().toString().toString().trim();
                    FiveImage.setImageURI(result.getUri());
                    FiveImage.setImageURI(mCropImageUri);
                    LLFive.setVisibility(View.GONE);
                }
                if(ClickedData.equalsIgnoreCase("llMain6"))
                {
                    mCropImageUri = result.getUri();
                    String path = result.getUri().toString().toString().trim();
                    SixImage.setImageURI(result.getUri());
                    SixImage.setImageURI(mCropImageUri);
                    LLSix.setVisibility(View.GONE);
                }



            }

            // Toast.makeText(this, "Cropping successful, Sample: " + result.getSampleSize(), Toast.LENGTH_LONG).show();else if (resultCode == CropImage.CROP_IMAGE_ACTIVITY_RESULT_ERROR_CODE) {
            //  Toast.makeText(this, "Cropping failed: " + result.getError(), Toast.LENGTH_LONG).show();
        }
    }
    public void back(View view) {
        super.onBackPressed();
    }



    private void startCropImageActivity(Uri imageUri) {
        CropImage.activity(imageUri)
                .setGuidelines(CropImageView.Guidelines.OFF)
                .setMultiTouchEnabled(true)
//                .setRequestedSize(500, 500, CropImageView.RequestSizeOptions.RESIZE_INSIDE)
//                .setMinCropWindowSize(0,0)
//                .setAspectRatio(100, 100)
                .start(this);
    }


    public void onSelectImageClick(View view) {
        CropImage.startPickImageActivity(this);
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String permissions[], @NonNull int[] grantResults) {
        if (requestCode == PermissionUtility.REQUEST_PERMISSION_CAMERA) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // profileMainPicIv.performClick();
            }
        }
        if (mCropImageUri != null && grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            // required permissions granted, start crop image activity
            startCropImageActivity(mCropImageUri);
        }
    }



}
