package com.example.ec2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ec2.databinding.ActivityMapaBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapaActivity : AppCompatActivity(), OnMapReadyCallback{
    private lateinit var binding: ActivityMapaBinding
    private lateinit var googleMap: GoogleMap
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentMap = supportFragmentManager.findFragmentById(R.id.fcv_map) as SupportMapFragment
        fragmentMap.getMapAsync(this)
    }

    override fun onMapReady(map: GoogleMap){
        googleMap = map
        val idatCentroLocation = LatLng(-12.067086203470378, -77.0357478768596)
        val idatTomasValleLocation = LatLng(-12.011681266011196, -77.07131737428988)
        val idatSJMLocation = LatLng(-12.156970826086152, -76.98102791786265)
        googleMap.addMarker(MarkerOptions().position(idatCentroLocation). title("IDAT - Lima Centro"))
        googleMap.addMarker(MarkerOptions().position(idatTomasValleLocation). title("IDAT - Tomás Valle"))
        googleMap.addMarker(MarkerOptions().position(idatSJMLocation). title("IDAT - San Juan de Miraflores"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(idatCentroLocation))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(idatTomasValleLocation))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(idatSJMLocation))
    }
}