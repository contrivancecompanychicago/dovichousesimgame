import java.util.List;
import java.util.stream.Collectors;

import com.mapbox.geojson.Feature;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.geojson.Point;
import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.Style;

public class SODAChicagoFoodDesertMap {

    public static void main(String[] args) {
        // Import the necessary libraries.
        Mapbox.getInstance(getApplicationContext(), "YOUR_MAPBOX_ACCESS_TOKEN");

        // Create a new Mapbox map object.
        MapView mapView = findViewById(R.id.mapView);
        MapboxMap mapboxMap = mapView.getMap();

        // Set the map's center and zoom level.
        mapboxMap.setCenter(new Point(41.8781, -87.6231), 10);

        // Add the SODA Chicago Food Desert geojson data to the map.
        FeatureCollection foodDeserts = FeatureCollection.fromJson(
                "https://data.cityofchicago.org/Health-Human-Services/SODA-Chicago-Food-Deserts/543-342y"
        );
        List<Feature> foodDesertFeatures = foodDeserts.features();
        mapboxMap.addFeatures(foodDesertFeatures);

        // Set the map's terrain RGB style.
        Style style = mapboxMap.getStyle();
        style.setTerrainColor("#000000");
        style.setWaterColor("#000000");

        // Add a marker to each food desert location.
        for (Feature foodDesertFeature : foodDesertFeatures) {
            Point foodDesertPoint = foodDesertFeature.geometry();
            mapboxMap.addMarker(new MarkerOptions().position(foodDesertPoint));
        }

        // Display the map.
        mapView.setVisibility(View.VISIBLE);
    }
}
