package us.inneract;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;
import com.google.android.maps.Overlay;
import com.google.android.maps.OverlayItem;

public class InneractMap extends MapActivity {

    LinearLayout linearLayout;
	MapView mapView;
	List<Overlay> mapOverlays;
	ScaleDrawable scaled;
	InneractItemizedOverlay itemizedOverlay;
    private Set<Inneract> inneracts;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        MapView mapView = (MapView) findViewById(R.id.mapview);
        
        mapOverlays = mapView.getOverlays();
        Drawable drawable = this.getResources().getDrawable(R.drawable.blank);
        ScaleDrawable scale = new ScaleDrawable(drawable, 0, new Float(0.25), new Float(0.25));
        itemizedOverlay = new InneractItemizedOverlay(scale);
        
        inneracts = new HashSet<Inneract>();
        inneracts.add(new Inneract(40752600, -73428200, null, null));
        inneracts.add(new Inneract(40852600, -73528200, null, null));

        for ( Inneract i : inneracts ) {
            System.out.println(i);
            Log.d(null, i.toString());
            Log.d(NOTIFICATION_SERVICE, i.getPlace().toString());
            
            itemizedOverlay.addOverlay(new OverlayItem(i.getPlace(), i.getAction(), i.getDescription()));
        }

        mapOverlays.add(itemizedOverlay);

    }

	@Override
	protected boolean isRouteDisplayed() {
		return false;
	}
}