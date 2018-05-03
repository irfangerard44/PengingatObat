package pillapp.ViewController;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import IrfanGerardWM.PengingatObat.R;

public class pharmacy extends ActionBarActivity implements OnMapReadyCallback   {
    private GoogleMap gMap, GMap;
    private float zoom = 18.0f;
    private static final int REQUEST_LOCATION_PERMISSION = 1;
    private LocationManager locationManager;
    private static final long MIN_TIME = 400;
    private static final float MIN_DISTANCE = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharmacy);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

//    public void onLocationChanged(Location location) {
//        LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
//        CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLngZoom(latLng, 15    );
//        GMap.animateCamera(cameraUpdate);
//        locationManager.removeUpdates((LocationListener) this);
//    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.normal_map :
                gMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                return true;
            case R.id.hybird_map :
                gMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
                return true;
            case R.id.satelite_map :
                gMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
                return true;
            case R.id.terrain_map :
                gMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_map    , menu); //your file name
        return super.onCreateOptionsMenu(menu);
    }

    public void onMapReady(GoogleMap googleMap) {
        

        GMap = googleMap;

        GMap.addMarker(new MarkerOptions().position(new LatLng(-5.354366, 105.285088)).title("Apotek Gigi").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_ta)));
        GMap.addMarker(new MarkerOptions().position(new LatLng(-5.360815, 105.275508)).title("Apotek Kimia Farma Raden Saleh").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_ta)));
        GMap.addMarker(new MarkerOptions().position(new LatLng(-5.361756, 105.292240)).title("Apotek ").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_ta)));
        GMap.addMarker(new MarkerOptions().position(new LatLng(-5.369951, 105.296289)).title("Apotek Mutiara").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_ta)));
        GMap.addMarker(new MarkerOptions().position(new LatLng(-5.371798, 105.297689)).title("Apotek Way Dadi").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_ta)));
        GMap.addMarker(new MarkerOptions().position(new LatLng(-5.377542, 105.288867)).title("Apotek Adisa").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_ta)));
        GMap.addMarker(new MarkerOptions().position(new LatLng(-5.378923, 105.286290)).title("Apotek Raja Basa").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_ta)));
        GMap.addMarker(new MarkerOptions().position(new LatLng(-5.386421, 105.292300)).title("Apotek Jaseya Farma").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_ta)));
        GMap.addMarker(new MarkerOptions().position(new LatLng(-5.387232, 105.292056)).title("Apotek Permata").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_ta)));
        GMap.addMarker(new MarkerOptions().position(new LatLng(-5.390736, 105.294909)).title("K-24 Arief").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_ta)));
        GMap.addMarker(new MarkerOptions().position(new LatLng(-5.390523, 105.294066)).title("Apotek Karimun").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_ta)));
        GMap.addMarker(new MarkerOptions().position(new LatLng(-5.385796, 105.307076)).title("Apotek Indah Farma").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_ta)));
        GMap.addMarker(new MarkerOptions().position(new LatLng(-5.402303, 105.283233)).title("Kimia Farma 467 Antasari").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_ta)));
        GMap.addMarker(new MarkerOptions().position(new LatLng(-5.404344, 105.279640)).title("Apotek Kimia Farma Antasari").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_ta)));
        GMap.addMarker(new MarkerOptions().position(new LatLng(-5.392007, 105.281118)).title("Apotek K-24").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_ta)));
        GMap.addMarker(new MarkerOptions().position(new LatLng(-5.391124, 105.275998)).title("Apotek Nova").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_ta)));
        GMap.addMarker(new MarkerOptions().position(new LatLng(-5.381860, 105.272059)).title("Apotek Chentury").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_ta)));
        GMap.addMarker(new MarkerOptions().position(new LatLng(-5.381005, 105.271218)).title("Apotek Ika Farma").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_ta)));
        GMap.addMarker(new MarkerOptions().position(new LatLng(-5.379249, 105.271942)).title("Kimia Farma 295 Ki Maja").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_ta)));
        GMap.addMarker(new MarkerOptions().position(new LatLng(-5.377919, 105.272377)).title("Apotek Sami Saras").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_ta)));
        GMap.addMarker(new MarkerOptions().position(new LatLng(-5.394111, 105.261629)).title("Apotek Kimia Farma 647").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_ta)));
        GMap.setMyLocationEnabled(true);

        GMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-5.371855, 105.297699),15 ));


        //        gMap = googleMap;
//
//        // Add a marker in Sydney and move the camera
//        LatLng itera = new LatLng(-5.358378, 105.313438);
//        gMap.addMarker(new MarkerOptions().position(itera).title("Ini Kampusku").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_ta)));
//        gMap.moveCamera(CameraUpdateFactory.newLatLngZoom(itera,zoom));


//        GroundOverlayOptions kawasanITERA = new GroundOverlayOptions().image(BitmapDescriptorFactory.fromResource(R.mipmap.ic_add_box_black_24dp)).position(itera, 1000);
        //      gMap.addGroundOverlay(kawasanITERA);
    }
    private void enableMyLocation(){
        if(ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)== PackageManager.PERMISSION_GRANTED){
            gMap.setMyLocationEnabled(true);
        }
        else ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, REQUEST_LOCATION_PERMISSION);
    }
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch(requestCode){
            case REQUEST_LOCATION_PERMISSION:

                if(grantResults.length>0&&grantResults[0]==PackageManager.PERMISSION_GRANTED){
                    enableMyLocation();
                    break;
                }
        }

    }


}
