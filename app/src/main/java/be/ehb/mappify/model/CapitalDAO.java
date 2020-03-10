package be.ehb.mappify.model;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

public class CapitalDAO {

    public static CapitalDAO INSTANCE = new CapitalDAO();
    private ArrayList<Capital> capitals;

    private CapitalDAO(){

    }

    public  ArrayList<Capital> getCapitals(){
        if (capitals == null){
            capitals = new ArrayList<>();
            capitals.add(new Capital(new LatLng(51.528308, -0.381789), "Londen", "Lorem Ipsum dubbeldekker doctor who"));
            capitals.add(new Capital(new LatLng(60.1098678, 24.738504), "Helsinki", "Korpiklaani perkele vodka"));
            capitals.add(new Capital(new LatLng(-33.87365, 151.20689), "Sidney", "Is not the capital cricket toilet paper vegemite sandwich"));

        }
        return capitals;
    }

}
