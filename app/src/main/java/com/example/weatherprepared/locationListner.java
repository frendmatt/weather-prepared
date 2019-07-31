package com.example.weatherprepared;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

public class locationListner implements LocationListener {

    String longitude = "";
    String latitude = "";

    public String getLongitude() {
        return longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    @Override
    public void onLocationChanged(Location location) {
        longitude = Double.toString(location.getLongitude());
        latitude = Double.toString(location.getLatitude());
    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {

    }

    @Override
    public void onProviderEnabled(String s) {

    }

    @Override
    public void onProviderDisabled(String s) {

    }
}
