package md.soft.com.realestatevendor.Activity;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.theartofdev.edmodo.cropper.CropImage;
import com.theartofdev.edmodo.cropper.CropImageView;

import java.io.ByteArrayOutputStream;

import md.soft.com.realestatevendor.R;
import md.soft.com.realestatevendor.Utilitys.PermissionUtility;

public class AadarActivity extends AppCompatActivity {

    private ImageView Back;
    private ImageView FrontSideImage;
    private LinearLayout FrontShowPlus;
    private ImageView plus1;
    private ImageView FrontBcakImage;
    private LinearLayout FrontBackPlus;
    private Button buttonSubmit;
    private Uri mCropImageUri;
    String ClickedData = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aadar);
        initView();
        FrontSideImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickedData = "FrontSideImage";
                if (PermissionUtility.checkPermissionCameraAccessAndReadExternalStorage(AadarActivity.this)) {
                    //showPictureDialog();
                    onSelectImageClick(v);
                }
            }
        });

        FrontBcakImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickedData = "FrontBcakImage";
                if (PermissionUtility.checkPermissionCameraAccessAndReadExternalStorage(AadarActivity.this)) {
                    //showPictureDialog();
                    onSelectImageClick(v);
                }
            }
        });


    }

    public void back(View view) {
        super.onBackPressed();
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
                if (ClickedData.equalsIgnoreCase("FrontSideImage")) {
                    mCropImageUri = result.getUri();
                    String path = result.getUri().toString().toString().trim();
                    FrontSideImage.setImageURI(result.getUri());
                    FrontSideImage.setImageURI(mCropImageUri);
                    FrontShowPlus.setVisibility(View.GONE);
                    // Bitmap bitmap = loadBitmap(path);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    //  bitmap.compress(Bitmap.CompressFormat.JPEG, 40, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    //image_base64_string = Base64.encodeToString(byteArray, Base64.DEFAULT);
                } else {

                    mCropImageUri = result.getUri();
                    String path = result.getUri().toString().toString().trim();
                    FrontBcakImage.setImageURI(result.getUri());
                    FrontBcakImage.setImageURI(mCropImageUri);
                    FrontBackPlus.setVisibility(View.GONE);

                    // Bitmap bitmap = loadBitmap(path);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    //  bitmap.compress(Bitmap.CompressFormat.JPEG, 40, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    //image_base64_string = Base64.encodeToString(byteArray, Base64.DEFAULT);


                }


            }

            // Toast.makeText(this, "Cropping successful, Sample: " + result.getSampleSize(), Toast.LENGTH_LONG).show();else if (resultCode == CropImage.CROP_IMAGE_ACTIVITY_RESULT_ERROR_CODE) {
            //  Toast.makeText(this, "Cropping failed: " + result.getError(), Toast.LENGTH_LONG).show();
        }
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


    private void initView() {
        Back = (ImageView) findViewById(R.id.Back);
        FrontSideImage = (ImageView) findViewById(R.id.FrontSideImage);
        FrontShowPlus = (LinearLayout) findViewById(R.id.FrontShowPlus);
        plus1 = (ImageView) findViewById(R.id.plus1);
        FrontBcakImage = (ImageView) findViewById(R.id.FrontBcakImage);
        FrontBackPlus = (LinearLayout) findViewById(R.id.FrontBackPlus);
        buttonSubmit = (Button) findViewById(R.id.button_Submit);
    }
}
