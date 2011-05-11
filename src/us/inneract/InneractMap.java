package us.inneract;

import java.util.List;
import java.util.Set;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;
import com.google.android.maps.Overlay;
import com.google.android.maps.OverlayItem;

public class InneractMap extends MapActivity {

    LinearLayout linearLayout;
	MapView mapView;
	List<Overlay> mapOverlays;
	Drawable drawable;
	InneractItemizedOverlay itemizedOverlay;
    private Set<Inneract> inneracts;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        MapView mapView = (MapView) findViewById(R.id.mapview);
        mapView.setBuiltInZoomControls(true);
        
        mapOverlays = mapView.getOverlays();
        drawable = this.getResources().getDrawable(R.drawable.act);
        itemizedOverlay = new InneractItemizedOverlay(drawable);
        
        for ( Inneract i : inneracts )
            itemizedOverlay.addOverlay(new OverlayItem(i.getPlace(), i.getAction(), i.getDescription()));
        
        mapOverlays.add(itemizedOverlay);

    }

	@Override
	protected boolean isRouteDisplayed() {
		return false;
	}
}