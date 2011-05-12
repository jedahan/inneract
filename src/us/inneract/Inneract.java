package us.inneract;

import com.google.android.maps.GeoPoint;

public class Inneract {
    private String action;
    private String description;
    private GeoPoint place;
    
    // TODO: Add private Inneracter inneracter
    
    public Inneract(int longitude, int latitude, String action, String description) {
        this.place = new GeoPoint(longitude, latitude);
        this.action = action;
        this.description = description;
    }
    
    public String toString() {
        return new String("hi i am an inneract!");
    }
    
    public void setAction(String action) {
        this.action = action;
    }
    public String getAction() {
        return action;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public void setPlace(GeoPoint place) {
        this.place = place;
    }
    public GeoPoint getPlace() {
        return place;
    }
}
