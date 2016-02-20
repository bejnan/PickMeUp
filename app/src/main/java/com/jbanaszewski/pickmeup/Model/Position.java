package com.jbanaszewski.pickmeup.Model;

import android.location.Location;

import java.util.Date;

public class Position {
    private final Location location;
    private final Date localizationDate;

    public Position(Location location, Date localizationDate) {
        this.location = location;
        this.localizationDate = localizationDate;
    }

    public Location getLocation() {
        return location;
    }

    public Date getLocalizationDate() {
        return localizationDate;
    }

    public float getDistance(Location destination) {
        float[] distance = new float[1];
        Location.distanceBetween(location.getLatitude(), location.getLongitude(), destination.getLatitude(), destination.getLongitude(), distance);
        return distance[0];
    }
}
