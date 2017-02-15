package com.trollologic.worktracker;

import android.Manifest;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.greysonparrelli.permiso.Permiso;
import com.greysonparrelli.permiso.PermisoActivity;

/**
 * Created by miroslav on 15.02.17..
 */

public class BaseActivity extends PermisoActivity implements Permiso.IOnPermissionResult {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Permiso.getInstance().requestPermissions(this
        , Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION);
    }

    @Override
    public void onPermissionResult(Permiso.ResultSet resultSet) {
        if (resultSet.isPermissionGranted(Manifest.permission.ACCESS_FINE_LOCATION)) {
            // Contact permission granted!
        }
        if (resultSet.isPermissionGranted(Manifest.permission.ACCESS_COARSE_LOCATION)) {
            // Calendar permission granted!
        }
    }

    @Override
    public void onRationaleRequested(Permiso.IOnRationaleProvided callback, String... permissions) {

    }
}
//    Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION
