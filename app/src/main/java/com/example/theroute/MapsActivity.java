package com.example.theroute;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
//import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
//import android.renderscript.Sampler;
import android.widget.Toast;

import com.example.theroute.MetaClass.LanLong;
import com.example.theroute.PermissionUtils.PermissionUtils;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
//import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends AppCompatActivity implements
        GoogleMap.OnMyLocationButtonClickListener,
        GoogleMap.OnMyLocationClickListener,
        OnMapReadyCallback,
        ActivityCompat.OnRequestPermissionsResultCallback {

    private static final int LOCATION_PERMISSION_REQUEST_CODE = 1;
    private boolean permissionDenied = false;
    private GoogleMap mMap;
    int a, whichMap;
    LanLong lanLong;
    Context appContext;

    /*public MapsActivity(int whichMap) {
        this.whichMap = whichMap;
    }*/
//    GetLocationAccess getLocationAccess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        appContext = getApplicationContext();
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        assert mapFragment != null;
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
   /* private void getLocationAccess() {
        if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            mMap.isMyLocationEnabled() = true;
        else
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION), Location_Permission_Request);
        }
        override fun onRequestPermissionsResult(requestCode :Int, permission:Array<String>,
        grantResult:
        IntArray){
            if (requestCode == Location_Permission_Request) {
                if (grantResult.contains(PackageManager.PERMISSION_GRANTED)) {
                    mMap.isMyLocationEnabled() = true;
                } else {
                    Toast.makeText(this, "Access Denied", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        }
    }*/
    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;
//        getLocationAccess =new GetLocationAccess(mMap);
        Intent intent = getIntent();
        LatLng zoomOn = new LatLng(27.7023816, 85.3282081);
       /* mMap.addMarker(new MarkerOptions().position(zoomOn)).setIcon(BitmapFromVector(getApplicationContext(), R.drawable.ic_bus_icon_for_map));
                // below line is use to add custom marker on our map.*/
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(zoomOn, 12));
        lanLong=new LanLong(mMap,appContext);
        mMap.setOnMyLocationButtonClickListener(this);
        mMap.setOnMyLocationClickListener(this);
        enableMyLocation();
        a = Integer.parseInt(intent.getStringExtra("optionMap"));
        try {
            switch (a) {
                case 0:
                    lanLong.forChandragiri();
                    break;
                case 1:
                    lanLong.forSundarijal();
                    break;
                case 2:
                    lanLong.forSanga();
                    break;
                case 3:
                    lanLong.forRatnapark();
                    break;
                case 4:
                    lanLong.forChampadevi();
                    break;
                case 5:
                    lanLong.forKalanki();
                    break;
                case 6:
                    lanLong.forPilotBaba();
                    break;
                case 7:
                    lanLong.forDolesworMahadev();
                    break;
                case 8:
                    lanLong.forNagarkot();
                    break;
                case 9:
                    lanLong.forDhulikhel();
                    break;
                default:
                    Toast.makeText(this, "Invalid choice", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
        catch (NullPointerException e){
            Toast.makeText(this, "Access Cannot be denied", Toast.LENGTH_SHORT).show();

        }
        /*Intent map=getIntent();
        whichMap= Integer.parseInt(map.getStringExtra("whichMap"));
        if( whichMap==1){
         a = Integer.parseInt(intent.getStringExtra("optionMap"));
        externalMap(a);
        }
        else{
        String $destination,$busStand;
        $destination=intent.getStringExtra("aInternal");
        $busStand=intent.getStringExtra("busStand");
        internalMap($destination,$busStand);
        }*/
    }
    /*public void externalMap(int op){
        try {
            switch (op) {
                case 0:
                    lanLong.forChandragiri();
                    break;
                case 1:
                    lanLong.forSundarijal();
                    break;
                case 2:
                    lanLong.forSanga();
                    break;
                case 3:
                    lanLong.forRatnapark();
                    break;
                case 4:
                    lanLong.forChampadevi();
                    break;
                case 5:
                    lanLong.forKalanki();
                    break;
                case 6:
                    lanLong.forPilotBaba();
                    break;
                case 7:
                    lanLong.forDolesworMahadev();
                    break;
                case 8:
                    lanLong.forNagarkot();
                    break;
                case 9:
                    lanLong.forDhulikhel();
                    break;
                default:
                    Toast.makeText(this, "Invalid choice", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
        catch (NullPointerException e){
            Toast.makeText(this, "Access Cannot be denied", Toast.LENGTH_SHORT).show();

        }
    }
    public void internalMap(String des,String bS){
        try {
            switch (des) {
                case "chandragiri": {
                    switch (bS) {
                        case "thankot":
                        case "kalimati":
                        case "kalanki":
                        case "purano buspark":
                        case "ratnapark":
                        case "koteswor":
                        case "lagankhel":
                        case "naya buspark":
                            lanLong.forChandragiri(bS);
                            break;
                        default:
                            Toast.makeText(this, "Sorry We can't help you on this Destination.", Toast.LENGTH_SHORT).show();
                    }
                    break;
                }
                case "sundarijal": {
                    switch (bS) {
                        case "purano buspark":
                        case "ratnapark":
                        case "koteswor":
                        case "chakrapat":
                        case "naya buspark":
                        case "gausala":
                        default:
                            Toast.makeText(this, "Sorry We can't help you on this Destination.", Toast.LENGTH_SHORT).show();
                    }
                    break;
                }
                case "sanga": {
                    switch (bS) {
                        case "kamalvinayek":
                        case "baneshwor":
                        case "maitighar":
                        case "purano buspark":
                        case "ratnapark":
                        case "koteswor":
                        case "lagankhel":
                        case "naya buspark":
                            break;
                        default:
                            Toast.makeText(this, "Sorry We can't help you on this Destination.", Toast.LENGTH_SHORT).show();
                    }
                    break;
                }
                case "ratnapark": {
                    switch (bS) {
                        case "thankot":
                        case "kalimati":
                        case "kalanki":
                        case "baneshwor":
                        case "balkhu":
                        case "koteswor":
                        case "lagankhel":
                        case "naya buspark":
                            break;
                        default:
                            Toast.makeText(this, "Sorry We can't help you on this Destination.", Toast.LENGTH_SHORT).show();
                    }
                    break;
                }
                case "champadevi": {
                    switch (bS) {
                        case "purano buspark":
                        case "ratnapark":
                        case "lagankhel":
                        case "ekantakuna":
                            break;
                        default:
                            Toast.makeText(this, "Sorry We can't help you on this Destination.", Toast.LENGTH_SHORT).show();
                    }
                    break;
                }
                case "kalanki": {
                    switch (bS) {
                        case "thankot":
                        case "kalimati":
                        case "purano buspark":
                        case "naya buspark":
                        case "ratnapark":
                        case "baneshwor":
                        case "tikathali":
                        case "lagankhel":
                        case "pepsicola":
                            break;
                        default:
                            Toast.makeText(this, "Sorry We can't help you on this Destination.", Toast.LENGTH_SHORT).show();
                    }
                    break;
                }
                case "pilot baba":
                case "doleswor mahadev":{
                    switch (bS) {
                        case "kamalvinayek":
                        case "purano buspark":
                        case "ratnapark":
                        case "koteswor":
                        case "baneshwor":
                        case "suryabinayek":
                            break;
                        default:
                            Toast.makeText(this, "Sorry We can't help you on this Destination.", Toast.LENGTH_SHORT).show();
                    }
                    break;
                }
                case "nagarkot": {
                    switch (bS) {
                        case "kamalvinayek":
                            break;
                        default:
                            Toast.makeText(this, "Sorry We can't help you on this Destination.", Toast.LENGTH_SHORT).show();
                    }
                    break;
                }
                case "dhulikhel": {
                    switch (bS) {
                        case "kamalvinayek":
                        case "purano buspark":
                        case "naya buspark":
                        case "ratnapark":
                        case "koteswor":
                        case "lagankhel":
                        case "baneshwor":
                        case "maitighar":
                        case "kalanki":
                            break;
                        default:
                            Toast.makeText(this, "Sorry We can't help you on this Destination.", Toast.LENGTH_SHORT).show();
                    }
                    break;
                }
                default: {
                    Toast.makeText(this, "Sorry we can't Help you on this currently", Toast.LENGTH_SHORT).show();
                }
            }
        }catch (RuntimeException e){
            Toast.makeText(appContext, "Error"+e, Toast.LENGTH_SHORT).show();
        }
    }*/
    /**
     * Enables the My Location layer if the fine location permission has been granted.
     */
    private void enableMyLocation() {
        // [START maps_check_location_permission]
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) {
            if (mMap != null) {
                mMap.setMyLocationEnabled(true);
            }
        } else {
            // Permission to access the location is missing. Show rationale and request permission
            PermissionUtils.requestPermission(this, LOCATION_PERMISSION_REQUEST_CODE,
                    Manifest.permission.ACCESS_FINE_LOCATION, true);
        }
        // [END maps_check_location_permission]
    }

    @Override
    public boolean onMyLocationButtonClick() {
        Toast.makeText(this, "MyLocation button clicked", Toast.LENGTH_SHORT).show();
        // Return false so that we don't consume the event and the default behavior still occurs
        // (the camera animates to the user's current position).
        return false;
    }

    @Override
    public void onMyLocationClick(@NonNull Location location) {
        Toast.makeText(this, "Current location:\n" + location, Toast.LENGTH_LONG).show();
    }

    // [START maps_check_location_permission_result]
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode != LOCATION_PERMISSION_REQUEST_CODE) {
            return;
        }

        if (PermissionUtils.isPermissionGranted(permissions, grantResults, Manifest.permission.ACCESS_FINE_LOCATION)) {
            // Enable the my location layer if the permission has been granted.
            enableMyLocation();
        } else {
            // Permission was denied. Display an error message
            // [START_EXCLUDE]
            // Display the missing permission error dialog when the fragments resume.
            permissionDenied = true;
            // [END_EXCLUDE]
        }
    }
    // [END maps_check_location_permission_result]

    @Override
    protected void onResumeFragments() {
        super.onResumeFragments();
        if (permissionDenied) {
            // Permission was not granted, display error dialog.
            showMissingPermissionError();
            permissionDenied = false;
        }
    }

    /**
     * Displays a dialog with error message explaining that the location permission is missing.
     */
    private void showMissingPermissionError() {
        PermissionUtils.PermissionDeniedDialog
                .newInstance(true).show(getSupportFragmentManager(), "dialog");
    }

}