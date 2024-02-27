package j9;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.IBinder;

public class a extends Service implements LocationListener {

    /* renamed from: e  reason: collision with root package name */
    private final Context f12760e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f12761f = false;

    /* renamed from: g  reason: collision with root package name */
    boolean f12762g = false;

    /* renamed from: h  reason: collision with root package name */
    boolean f12763h = false;

    /* renamed from: i  reason: collision with root package name */
    Location f12764i;

    /* renamed from: j  reason: collision with root package name */
    public double f12765j;

    /* renamed from: k  reason: collision with root package name */
    public double f12766k;

    /* renamed from: l  reason: collision with root package name */
    public double f12767l;

    /* renamed from: m  reason: collision with root package name */
    protected LocationManager f12768m;

    public a(Context context) {
        this.f12760e = context;
        a();
    }

    public Location a() {
        if (this.f12768m != null && (androidx.core.content.a.a(this, "android.permission.ACCESS_FINE_LOCATION") == 0 || androidx.core.content.a.a(this, "android.permission.ACCESS_COARSE_LOCATION") == 0)) {
            this.f12768m.removeUpdates(this);
        }
        if (androidx.core.content.a.a(this.f12760e, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            androidx.core.content.a.a(this.f12760e, "android.permission.ACCESS_COARSE_LOCATION");
        }
        try {
            LocationManager locationManager = (LocationManager) this.f12760e.getSystemService("location");
            this.f12768m = locationManager;
            this.f12761f = locationManager.isProviderEnabled("gps");
            boolean isProviderEnabled = this.f12768m.isProviderEnabled("network");
            this.f12762g = isProviderEnabled;
            boolean z10 = this.f12761f;
            if (!z10 && !isProviderEnabled) {
                return this.f12764i;
            }
            this.f12763h = true;
            if (z10) {
                this.f12768m.requestLocationUpdates("network", 10000, 10.0f, this);
                LocationManager locationManager2 = this.f12768m;
                if (locationManager2 != null) {
                    Location lastKnownLocation = locationManager2.getLastKnownLocation("network");
                    this.f12764i = lastKnownLocation;
                    if (lastKnownLocation != null) {
                        this.f12765j = lastKnownLocation.getLatitude();
                        this.f12766k = this.f12764i.getLongitude();
                    }
                }
            }
            if (this.f12762g && this.f12764i == null) {
                this.f12768m.requestLocationUpdates("gps", 10000, 10.0f, this);
                LocationManager locationManager3 = this.f12768m;
                if (locationManager3 != null) {
                    Location lastKnownLocation2 = locationManager3.getLastKnownLocation("gps");
                    this.f12764i = lastKnownLocation2;
                    if (lastKnownLocation2 != null) {
                        this.f12765j = lastKnownLocation2.getLatitude();
                        this.f12766k = this.f12764i.getLongitude();
                    }
                }
            }
            return this.f12764i;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onLocationChanged(Location location) {
        this.f12767l = (double) location.getSpeed();
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i10, Bundle bundle) {
    }
}
