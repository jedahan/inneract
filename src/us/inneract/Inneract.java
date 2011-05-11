package us.inneract;

import com.google.android.maps.GeoPoint;

public class Inneract {
    private String action;
    private String description;
    private GeoPoint place;
    private String person;
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
