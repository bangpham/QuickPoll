package com.example.hungdo.quickpoll;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.widget.Toast;

import java.io.IOException;
import java.util.List;


/**
 * Created by Nhu Ng on 10/22/2016.
 */

public class map {

    String address;
    Context context;

    public map(Context context, String address) {
        this.address = address;
        this.context = context;
    }



    public double getLat() {
        Geocoder geocoder = new Geocoder(context);
        List<Address> addresses;
        double latitude = 0;
        try
        {
            addresses = geocoder.getFromLocationName(address, 1);
            if(addresses.size() > 0)
            {
                latitude = addresses.get(0).getLatitude();
                double longitude = addresses.get(0).getLongitude();
                return latitude;
            }
            Toast.makeText(context, "please input a location", Toast.LENGTH_LONG);

        }
        catch (IOException e) {
            e.printStackTrace();
            //return 00;

        }
        return latitude;
    }


    public double getLong() {
        Geocoder geocoder = new Geocoder(context);
        List<Address> addresses;
        double longitude = 0;
        try
        {
            addresses = geocoder.getFromLocationName(address, 1);
            if(addresses.size() > 0)
            {
                longitude = addresses.get(0).getLongitude();
                return longitude;
            }
            Toast.makeText(context, "please input a location", Toast.LENGTH_LONG);

        }
        catch (IOException e) {
            e.printStackTrace();
            return 00;
        }
        return longitude;
    }
}
