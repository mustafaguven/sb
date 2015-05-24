package com.timboict.saglikbakanligi;

import android.app.ProgressDialog;
import android.graphics.Color;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.nispok.snackbar.Snackbar;
import com.nispok.snackbar.enums.SnackbarType;
import com.timboict.saglikbakanligi.component.FormEditText;
import com.timboict.saglikbakanligi.component.FormPhotoAlbum;
import com.timboict.saglikbakanligi.component.FormSpinner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mustafaguven on 19.05.2015.
 */
public class BaseActivity extends ActionBarActivity {

    private boolean isOpenedForUpdate = false;
    protected void setOpenedForUpdate(boolean position){
        this.isOpenedForUpdate = position;
    }

    protected boolean isOpenedForUpdate(){
        return this.isOpenedForUpdate;
    }
    private ProgressDialog mProgress;

    private LocationManager mLocationManager;

    public double getLong() {
        return mLong;
    }

    public void setLong(double mLong) {
        this.mLong = mLong;
    }

    public double getLat() {
        return mLat;
    }

    public void setLat(double mLat) {
        this.mLat = mLat;
    }

    private double mLong = 0;
    private double mLat = 0;


    protected enum ItemType{
        EDITTEXT, SPINNER
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mLocationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
        mLocationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 30 * 1000,
                0, mLocationListener);
    }

    public void showSnackBar(String message){
        showSnackBar(message, true);
    }

    public void showSnackBar(String message, boolean isError){
        Snackbar.with(this)
                .type(SnackbarType.MULTI_LINE)
                .color(isError ? Color.RED : Color.GREEN)
                .text(message)
                .show(this);

    }

    public void showProgress() {
        try {
            if (this.mProgress == null) {
                mProgress = new ProgressDialog(this);
                mProgress.setMessage("İşlem yapılıyor...");
            }
            if (!mProgress.isShowing() && !isFinishing()) {
                mProgress.show();
                setProgressCancelable(true);
            }
        } catch (Exception e) {
            Log.e("showProgress", (e.getMessage() != null ? e.getMessage() : ""));
        }
    }

    public void showProgress(boolean cancelable) {
        setProgressCancelable(cancelable);
        showProgress();
    }

    public void hideProgress() {
        try {
            if (mProgress != null && mProgress.isShowing()) {
                mProgress.cancel();
                mProgress.dismiss();
            }
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("hideProgress", (e.getMessage() != null ? e.getMessage() : ""));
        }
    }

    public void setProgressCancelable(boolean progressCancelable) {
        if (mProgress != null)
            this.mProgress.setCancelable(progressCancelable);
    }

    protected FormSpinner createSpinnerFormItem(String title){
        return createSpinnerFormItem(title, new String[]{"EVET", "HAYIR"});
    }

    protected FormSpinner createSpinnerFormItem(String title, String[] source){
        return createSpinnerFormItem(title, source, null);
    }

    protected FormSpinner createSpinnerFormItem(String title, String[] items, FormSpinner.OnItemSelectedListener listener){
        final FormSpinner spinnerItem = new FormSpinner(this);
        spinnerItem.setLbl(title);
        List<String> source = new ArrayList<>();
        source.add("SEÇİNİZ");
        for (String item : items) {
            source.add(item);
        }
        spinnerItem.setDdl(source.toArray(new String[source.size()]));
        spinnerItem.setOnItemSelected(listener);
        return spinnerItem;
    }

    protected FormEditText createEditTextItem(String title){
        return createEditTextItem(title, "");
    }

    protected FormEditText createEditTextItem(String title, String description){
        final FormEditText editTextItem = new FormEditText(this);
        editTextItem.setLbl(title);
        editTextItem.setTxt(description);
        return editTextItem;
    }

    protected FormPhotoAlbum createPhotoAlbum() {
        final FormPhotoAlbum formPhotoAlbum = new FormPhotoAlbum(this);
        return formPhotoAlbum;
    }

    protected LinearLayout createCommonSub(String title){
        LinearLayout lnCommonSub = (LinearLayout) getLayoutInflater().inflate(R.layout.form_common_sub, null);
        ((TextView)(lnCommonSub.findViewById(R.id.lblSubTitle))).setText(title);
        return lnCommonSub;
    }

    private final LocationListener mLocationListener = new LocationListener() {
        @Override
        public void onLocationChanged(final Location location) {
            mLong = location.getLongitude();
            mLat = location.getLatitude();
        }

        @Override
        public void onStatusChanged(String provider, int status, Bundle extras) {

        }

        @Override
        public void onProviderEnabled(String provider) {

        }

        @Override
        public void onProviderDisabled(String provider) {

        }
    };

}
