package com.example.theroute.MetaClass;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.Toast;

import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

import com.example.theroute.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class LanLong {
    private GoogleMap mMap;
    private Context mContext;
    LatLng Chandragiri = new LatLng(27.666319, 85.206014);
    LatLng Sanga = new LatLng(27.645964, 85.474191);
    LatLng Sundarijal = new LatLng(27.771564, 85.425902);
    LatLng Ratnapark = new LatLng(27.701129, 85.313494);
    LatLng Champadevi = new LatLng(27.645032, 85.254235);
    LatLng Kalanki = new LatLng(27.693429, 85.282465);
    LatLng PilotBaba = new LatLng(27.640474, 85.422523);
    LatLng PilotBaba1 = new LatLng(27.646939, 85.422302);
    LatLng DolesworMahadev = new LatLng(27.638883, 85.438486);
    LatLng Nagarkot = new LatLng(27.692152, 85.520013);
    LatLng Dhulikhel = new LatLng(27.618425, 85.553860);

    LatLng Lagankhel = new LatLng(27.667264, 85.323184);
    LatLng Thankot = new LatLng(27.693287, 85.219391);
    LatLng Kalimati = new LatLng(27.698259, 85.299098);
    LatLng PuranoBuspark = new LatLng(27.705476, 85.314611);
    LatLng Koteswor = new LatLng(27.679021, 85.349490);
    LatLng NayaBuspark = new LatLng(27.7224134, 85.3011652);
    LatLng Gausala = new LatLng(27.706817, 85.344710);
    LatLng Chakrapat = new LatLng(27.740193, 85.336649);
    LatLng Chahabil = new LatLng(27.717646, 85.346566);
    LatLng KamalVinayek = new LatLng(27.676199, 85.437296);
    LatLng Baneshwor = new LatLng(27.688550, 85.335026);
    LatLng MaitiGhar = new LatLng(27.693849, 85.321262);
    LatLng Balkhu = new LatLng(27.684710, 85.297357);
    LatLng EkantaKuna = new LatLng(27.666596, 85.308296);
    LatLng Tikathali = new LatLng(27.674677, 85.358072);
    LatLng Pepsicola = new LatLng(27.689006, 85.360331);
    LatLng Suryabinayek = new LatLng(27.665601, 85.425601);


    public LanLong(GoogleMap mmMap, Context context) {
        this.mMap = mmMap;
        this.mContext = context;
    }

    public void forChandragiri() {
        mMap.addMarker(new MarkerOptions().position(Chandragiri).title("Chandragiri"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic__destination_pin));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Chandragiri));
        mMap.addMarker(new MarkerOptions().position(Thankot).title("Thankot"))
                // below line is use to add custom marker on our map.
                .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Thankot));
        mMap.addMarker(new MarkerOptions().position(Kalanki).title("Kalanki"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Kalanki));
        mMap.addMarker(new MarkerOptions().position(Kalimati).title("Kalimati"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Kalimati));
        mMap.addMarker(new MarkerOptions().position(Ratnapark).title("Ratnapark"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Ratnapark));
        mMap.addMarker(new MarkerOptions().position(PuranoBuspark).title("PuranoBuspark"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(PuranoBuspark));
        mMap.addMarker(new MarkerOptions().position(Koteswor).title("Koteswor"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Koteswor));
        mMap.addMarker(new MarkerOptions().position(NayaBuspark).title("NayaBuspark"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(NayaBuspark));
        mMap.addMarker(new MarkerOptions().position(Lagankhel).title("Lagankhel"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lagankhel));
    }

    /*public void forChandragiri(String a) {
        mMap.addMarker(new MarkerOptions().position(Chandragiri).title("Chandragiri"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic__destination_pin));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Chandragiri));
        switch (a) {
            case "thankot":
                mMap.addMarker(new MarkerOptions().position(Thankot).title("Thankot"))
                        // below line is use to add custom marker on our map.
                        .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(Thankot));
                break;
            case "kalimati":
                mMap.addMarker(new MarkerOptions().position(Kalimati).title("Kalimati"))
                    // below line is use to add custom marker on our map.
                    .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(Kalimati));
                break;
            case "kalanki":
                mMap.addMarker(new MarkerOptions().position(Kalanki).title("Kalanki"))
                        // below line is use to add custom marker on our map.
                        .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(Kalanki));
                break;
            case "purano buspark":mMap.addMarker(new MarkerOptions().position(PuranoBuspark).title("Purano Buspark"))
                    // below line is use to add custom marker on our map.
                    .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(PuranoBuspark));
                break;
            case "ratnapark":mMap.addMarker(new MarkerOptions().position(Ratnapark).title("Ratnapark"))
                    // below line is use to add custom marker on our map.
                    .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(Ratnapark));
                break;
            case "koteswor":mMap.addMarker(new MarkerOptions().position(Koteswor).title("Koteswor"))
                    // below line is use to add custom marker on our map.
                    .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(Koteswor));
                break;
            case "lagankhel":mMap.addMarker(new MarkerOptions().position(Lagankhel).title("Lagankhel"))
                    // below line is use to add custom marker on our map.
                    .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(Lagankhel));
                break;
            case "naya buspark":mMap.addMarker(new MarkerOptions().position(NayaBuspark).title("Naya Buspark"))
                    // below line is use to add custom marker on our map.
                    .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(NayaBuspark));
                break;
            default:
                Toast.makeText(mContext, "Sorry we can help you on this yet", Toast.LENGTH_SHORT).show();
        }
    }*/
    public void forSundarijal(){
        mMap.addMarker(new MarkerOptions().position(Sundarijal).title("Sundarijal Dam"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic__destination_pin));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Sundarijal));
        mMap.addMarker(new MarkerOptions().position(Chakrapat).title("Chakrapat"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Chakrapat));
        mMap.addMarker(new MarkerOptions().position(Ratnapark).title("Ratnapark"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Ratnapark));
        mMap.addMarker(new MarkerOptions().position(PuranoBuspark).title("PuranoBuspark"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng( PuranoBuspark));
        mMap.addMarker(new MarkerOptions().position(Koteswor).title("Koteswor"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Koteswor));
        mMap.addMarker(new MarkerOptions().position(NayaBuspark).title("NayaBuspark"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(NayaBuspark));
        mMap.addMarker(new MarkerOptions().position(Gausala).title("Gausala"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Gausala));
        mMap.addMarker(new MarkerOptions().position(Chahabil).title("Chahabil"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Chahabil));

    }

    public void forSanga(){
        mMap.addMarker(new MarkerOptions().position(Sanga).title("Sanga Mahadev Tallest Statue"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic__destination_pin));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Sanga));
        mMap.addMarker(new MarkerOptions().position(KamalVinayek).title("KamalVinayek"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(KamalVinayek));
        mMap.addMarker(new MarkerOptions().position(Baneshwor).title("Baneshwor"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Baneshwor));
        mMap.addMarker(new MarkerOptions().position(MaitiGhar).title("MaitiGhar"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(MaitiGhar));
        mMap.addMarker(new MarkerOptions().position(Ratnapark).title("Ratnapark"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Ratnapark));
        mMap.addMarker(new MarkerOptions().position(PuranoBuspark).title("PuranoBuspark"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng( PuranoBuspark));
        mMap.addMarker(new MarkerOptions().position(Koteswor).title("Koteswor"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Koteswor));
        mMap.addMarker(new MarkerOptions().position(NayaBuspark).title("NayaBuspark"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(NayaBuspark));
        mMap.addMarker(new MarkerOptions().position(Lagankhel).title("Lagankhel"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lagankhel));
    }

    public void forRatnapark(){
        mMap.addMarker(new MarkerOptions().position(Ratnapark).title("Ratnapark"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic__destination_pin));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Ratnapark));
        mMap.addMarker(new MarkerOptions().position(Baneshwor).title("Baneshwor"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Baneshwor));
        mMap.addMarker(new MarkerOptions().position(Lagankhel).title("Lagankhel"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lagankhel));
        mMap.addMarker(new MarkerOptions().position(Kalanki).title("Kalanki"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng( Kalanki));
        mMap.addMarker(new MarkerOptions().position(Koteswor).title("Koteswor"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Koteswor));
        mMap.addMarker(new MarkerOptions().position(Kalimati).title("Kalimati"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Kalimati));
        mMap.addMarker(new MarkerOptions().position(Balkhu).title("Balkhu"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Balkhu));
    }
    public void forChampadevi(){
        mMap.addMarker(new MarkerOptions().position(Champadevi).title("Champadevi"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Champadevi));
        mMap.addMarker(new MarkerOptions().position(Lagankhel).title("Lagankhel"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lagankhel));
        mMap.addMarker(new MarkerOptions().position(Ratnapark).title("Ratnapark"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Ratnapark));
        mMap.addMarker(new MarkerOptions().position(PuranoBuspark).title("PuranoBuspark"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng( PuranoBuspark));
        mMap.addMarker(new MarkerOptions().position(EkantaKuna).title("EkantaKuna"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(EkantaKuna));
    }
    public void forKalanki(){
        mMap.addMarker(new MarkerOptions().position(Kalanki).title("Kalanki"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic__destination_pin));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Kalanki));
        mMap.addMarker(new MarkerOptions().position(Ratnapark).title("Ratnapark"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Ratnapark));
        mMap.addMarker(new MarkerOptions().position(PuranoBuspark).title("PuranoBuspark"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng( PuranoBuspark));
        mMap.addMarker(new MarkerOptions().position(Koteswor).title("Koteswor")).setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Koteswor));
        mMap.addMarker(new MarkerOptions().position(NayaBuspark).title("NayaBuspark")).setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(NayaBuspark));
        mMap.addMarker(new MarkerOptions().position(Kalimati).title("Kalimati")).setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Kalimati));
        mMap.addMarker(new MarkerOptions().position(Baneshwor).title("Baneshwor")).setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng( Baneshwor));
        mMap.addMarker(new MarkerOptions().position(Tikathali).title("Tikathali")).setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Tikathali));
        mMap.addMarker(new MarkerOptions().position(Pepsicola).title("Pepsicola")).setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Pepsicola));
        mMap.addMarker(new MarkerOptions().position(Chahabil).title("Chahabil")).setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Chahabil));
    }
    public void forPilotBaba(){
        mMap.addMarker(new MarkerOptions().position(PilotBaba).title("Pilot Baba Ashram"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic__destination_pin));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(PilotBaba));
        mMap.addMarker(new MarkerOptions().position(PilotBaba1).title("Pilot Baba Crashed plane Model"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic__destination_pin));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(PilotBaba1));
        mMap.addMarker(new MarkerOptions().position(Ratnapark).title("Ratnapark")).setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Ratnapark));
        mMap.addMarker(new MarkerOptions().position(PuranoBuspark).title("PuranoBuspark")).setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng( PuranoBuspark));
        mMap.addMarker(new MarkerOptions().position(Koteswor).title("Koteswor")).setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Koteswor));
        mMap.addMarker(new MarkerOptions().position(KamalVinayek).title("KamalVinayek")).setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(KamalVinayek));
        mMap.addMarker(new MarkerOptions().position(Baneshwor).title("Baneshwor")).setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng( Baneshwor));
        mMap.addMarker(new MarkerOptions().position(Suryabinayek).title("Suryabinayek")).setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Suryabinayek));
    }
    public void forDolesworMahadev(){
        mMap.addMarker(new MarkerOptions().position(DolesworMahadev).title("Doleswor Mahadev"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic__destination_pin));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(DolesworMahadev));
        mMap.addMarker(new MarkerOptions().position(Ratnapark).title("Ratnapark")).setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Ratnapark));
        mMap.addMarker(new MarkerOptions().position(PuranoBuspark).title("PuranoBuspark")).setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng( PuranoBuspark));
        mMap.addMarker(new MarkerOptions().position(Koteswor).title("Koteswor")).setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Koteswor));
        mMap.addMarker(new MarkerOptions().position(KamalVinayek).title("KamalVinayek")).setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(KamalVinayek));
        mMap.addMarker(new MarkerOptions().position(Baneshwor).title("Baneshwor")).setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng( Baneshwor));
        mMap.addMarker(new MarkerOptions().position(Suryabinayek).title("Suryabinayek")).setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Suryabinayek));
    }
    public void forNagarkot(){
        mMap.addMarker(new MarkerOptions().position(Nagarkot).title("Nagarkot ViewTower"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic__destination_pin));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Nagarkot));
        mMap.addMarker(new MarkerOptions().position(KamalVinayek).title("KamalVinayek")).setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(KamalVinayek));
    }
    public void forDhulikhel(){
        mMap.addMarker(new MarkerOptions().position(Dhulikhel).title("Dhulikhel"))
                .setIcon(BitmapFromVector(mContext, R.drawable.ic__destination_pin));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Dhulikhel));
        mMap.addMarker(new MarkerOptions().position(Ratnapark).title("Ratnapark")).setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Ratnapark));
        mMap.addMarker(new MarkerOptions().position(PuranoBuspark).title("PuranoBuspark")).setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng( PuranoBuspark));
        mMap.addMarker(new MarkerOptions().position(Koteswor).title("Koteswor")).setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Koteswor));
        mMap.addMarker(new MarkerOptions().position(KamalVinayek).title("KamalVinayek")).setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(KamalVinayek));
        mMap.addMarker(new MarkerOptions().position(Baneshwor).title("Baneshwor")).setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng( Baneshwor));
        mMap.addMarker(new MarkerOptions().position(Suryabinayek).title("Suryabinayek")).setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Suryabinayek));
        mMap.addMarker(new MarkerOptions().position(MaitiGhar).title("MaitiGhar")).setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(MaitiGhar));
        mMap.addMarker(new MarkerOptions().position(Lagankhel).title("Lagankhel")).setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lagankhel));
        mMap.addMarker(new MarkerOptions().position(Chahabil).title("Chahabil")).setIcon(BitmapFromVector(mContext, R.drawable.ic_bus_icon_for_map));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Chahabil));
    }
    private BitmapDescriptor BitmapFromVector(Context context, int vectorResId) {
        // below line is use to generate a drawable.
        Drawable vectorDrawable = ContextCompat.getDrawable(context, vectorResId);

        // below line is use to set bounds to our vector drawable.
        vectorDrawable.setBounds(0, 0, vectorDrawable.getIntrinsicWidth(), vectorDrawable.getIntrinsicHeight());

        // below line is use to create a bitmap for our
        // drawable which we have added.
        Bitmap bitmap = Bitmap.createBitmap(vectorDrawable.getIntrinsicWidth(), vectorDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);

        // below line is use to add bitmap in our canvas.
        Canvas canvas = new Canvas(bitmap);

        // below line is use to draw our
        // vector drawable in canvas.
        vectorDrawable.draw(canvas);

        // after generating our bitmap we are returning our bitmap.
        return BitmapDescriptorFactory.fromBitmap(bitmap);
    }
}
