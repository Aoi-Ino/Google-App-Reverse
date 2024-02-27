package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.core.content.d;
import java.util.Calendar;

class b0 {

    /* renamed from: d  reason: collision with root package name */
    private static b0 f617d;

    /* renamed from: a  reason: collision with root package name */
    private final Context f618a;

    /* renamed from: b  reason: collision with root package name */
    private final LocationManager f619b;

    /* renamed from: c  reason: collision with root package name */
    private final a f620c = new a();

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f621a;

        /* renamed from: b  reason: collision with root package name */
        long f622b;

        a() {
        }
    }

    b0(Context context, LocationManager locationManager) {
        this.f618a = context;
        this.f619b = locationManager;
    }

    static b0 a(Context context) {
        if (f617d == null) {
            Context applicationContext = context.getApplicationContext();
            f617d = new b0(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f617d;
    }

    private Location b() {
        Location location = null;
        Location c10 = d.b(this.f618a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        if (d.b(this.f618a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = c("gps");
        }
        return (location == null || c10 == null) ? location != null ? location : c10 : location.getTime() > c10.getTime() ? location : c10;
    }

    private Location c(String str) {
        try {
            if (this.f619b.isProviderEnabled(str)) {
                return this.f619b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }

    private boolean e() {
        return this.f620c.f622b > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j10;
        a aVar = this.f620c;
        long currentTimeMillis = System.currentTimeMillis();
        a0 b10 = a0.b();
        a0 a0Var = b10;
        a0Var.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        a0Var.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z10 = true;
        if (b10.f616c != 1) {
            z10 = false;
        }
        boolean z11 = z10;
        long j11 = b10.f615b;
        long j12 = b10.f614a;
        long j13 = j11;
        b10.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j14 = b10.f615b;
        if (j13 == -1 || j12 == -1) {
            j10 = currentTimeMillis + 43200000;
        } else {
            if (currentTimeMillis <= j12) {
                j14 = currentTimeMillis > j13 ? j12 : j13;
            }
            j10 = j14 + 60000;
        }
        aVar.f621a = z11;
        aVar.f622b = j10;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        a aVar = this.f620c;
        if (e()) {
            return aVar.f621a;
        }
        Location b10 = b();
        if (b10 != null) {
            f(b10);
            return aVar.f621a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }
}
