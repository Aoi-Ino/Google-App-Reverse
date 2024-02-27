package pyxis.uzuki.live.richutilskt.service;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;
import cm.l;
import pl.u;

@SuppressLint({"MissingPermission"})
public final class RLocationService extends Service {

    /* renamed from: e  reason: collision with root package name */
    private final c f30528e = new c();

    /* renamed from: f  reason: collision with root package name */
    private final c f30529f = new c();

    /* renamed from: g  reason: collision with root package name */
    private final d f30530g = new d();

    /* renamed from: h  reason: collision with root package name */
    private final a f30531h = new a();

    /* renamed from: i  reason: collision with root package name */
    private final int f30532i = 120000;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final float f30533j = 2.0f;

    /* renamed from: k  reason: collision with root package name */
    private final long f30534k = 1000;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public float f30535l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public int f30536m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public int f30537n;

    /* renamed from: o  reason: collision with root package name */
    private Location f30538o;

    public final class a extends Binder {
        public a() {
        }
    }

    public interface b {
    }

    private final class c implements LocationListener {
        public c() {
        }

        public void onLocationChanged(Location location) {
            if (location != null) {
                RLocationService rLocationService = RLocationService.this;
                if (rLocationService.k(location, rLocationService.i())) {
                    RLocationService.this.o(location);
                    Location i10 = RLocationService.this.i();
                    if (i10 != null) {
                        i10.setBearing(RLocationService.this.f30535l);
                    }
                    b unused = RLocationService.this.getClass();
                }
            }
        }

        public void onProviderDisabled(String str) {
        }

        public void onProviderEnabled(String str) {
        }

        public void onStatusChanged(String str, int i10, Bundle bundle) {
        }
    }

    private final class d implements SensorEventListener {
        public d() {
        }

        public void onAccuracyChanged(Sensor sensor, int i10) {
            if (sensor != null && sensor.getType() == 11) {
                String simpleName = RLocationService.class.getSimpleName();
                Log.i(simpleName, "Rotation sensor accuracy changed to: " + i10);
            }
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            float[] fArr = new float[16];
            SensorManager.getRotationMatrixFromVector(fArr, sensorEvent != null ? sensorEvent.values : null);
            float[] fArr2 = new float[3];
            RLocationService.this.n();
            SensorManager.remapCoordinateSystem(fArr, RLocationService.this.f30536m, RLocationService.this.f30537n, fArr);
            SensorManager.getOrientation(fArr, fArr2);
            double degrees = Math.toDegrees((double) fArr2[0]);
            if (Math.abs((float) (((double) RLocationService.this.f30535l) - degrees)) > RLocationService.this.f30533j) {
                RLocationService.this.f30535l = (float) degrees;
                Location i10 = RLocationService.this.i();
                if (i10 != null) {
                    i10.setBearing(RLocationService.this.f30535l);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final boolean k(Location location, Location location2) {
        if (location2 == null) {
            return true;
        }
        long time = location.getTime() - location2.getTime();
        int i10 = this.f30532i;
        boolean z10 = time > ((long) i10);
        boolean z11 = time < ((long) (-i10));
        boolean z12 = time > 0;
        if (z10) {
            return true;
        }
        if (z11) {
            return false;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z13 = accuracy > 0;
        boolean z14 = accuracy < 0;
        boolean z15 = accuracy > 200;
        boolean l10 = l(location.getProvider(), location2.getProvider());
        if (z14) {
            return true;
        }
        if (!z12 || z13) {
            return z12 && !z15 && l10;
        }
        return true;
    }

    private final boolean l(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return l.a(str, str2);
    }

    /* access modifiers changed from: private */
    public final void n() {
        int i10 = 1;
        this.f30536m = 1;
        this.f30537n = 2;
        Object systemService = getSystemService("window");
        if (systemService != null) {
            int rotation = ((WindowManager) systemService).getDefaultDisplay().getRotation();
            if (rotation == 1) {
                this.f30536m = 2;
                i10 = 129;
            } else if (rotation == 2) {
                this.f30537n = 130;
                return;
            } else if (rotation == 3) {
                this.f30536m = 130;
            } else {
                return;
            }
            this.f30537n = i10;
            return;
        }
        throw new u("null cannot be cast to non-null type android.view.WindowManager");
    }

    public final Location i() {
        return this.f30538o;
    }

    public final void j() {
        Object systemService = getSystemService("location");
        if (systemService != null) {
            Location lastKnownLocation = ((LocationManager) systemService).getLastKnownLocation("gps");
            Object systemService2 = getSystemService("location");
            if (systemService2 != null) {
                Location lastKnownLocation2 = ((LocationManager) systemService2).getLastKnownLocation("network");
                Location location = this.f30538o;
                if (lastKnownLocation == null || !k(lastKnownLocation, location)) {
                    lastKnownLocation = location;
                }
                if (lastKnownLocation2 == null || !k(lastKnownLocation2, lastKnownLocation)) {
                    lastKnownLocation2 = lastKnownLocation;
                }
                this.f30538o = lastKnownLocation2;
                Object systemService3 = getSystemService("location");
                if (systemService3 != null) {
                    if (((LocationManager) systemService3).getAllProviders().contains("gps")) {
                        Object systemService4 = getSystemService("location");
                        if (systemService4 == null) {
                            throw new u("null cannot be cast to non-null type android.location.LocationManager");
                        } else if (((LocationManager) systemService4).isProviderEnabled("gps")) {
                            Object systemService5 = getSystemService("location");
                            if (systemService5 != null) {
                                ((LocationManager) systemService5).requestLocationUpdates("gps", this.f30534k, 0.0f, this.f30528e);
                            } else {
                                throw new u("null cannot be cast to non-null type android.location.LocationManager");
                            }
                        }
                    }
                    Object systemService6 = getSystemService("location");
                    if (systemService6 != null) {
                        if (((LocationManager) systemService6).getAllProviders().contains("network")) {
                            Object systemService7 = getSystemService("location");
                            if (systemService7 == null) {
                                throw new u("null cannot be cast to non-null type android.location.LocationManager");
                            } else if (((LocationManager) systemService7).isProviderEnabled("network")) {
                                Object systemService8 = getSystemService("location");
                                if (systemService8 != null) {
                                    ((LocationManager) systemService8).requestLocationUpdates("network", this.f30534k, 0.0f, this.f30529f);
                                } else {
                                    throw new u("null cannot be cast to non-null type android.location.LocationManager");
                                }
                            }
                        }
                        if (lastKnownLocation2 != null) {
                            lastKnownLocation2.setBearing(this.f30535l);
                        }
                        Object systemService9 = getSystemService("sensor");
                        if (systemService9 != null) {
                            Sensor defaultSensor = ((SensorManager) systemService9).getDefaultSensor(11);
                            Object systemService10 = getSystemService("sensor");
                            if (systemService10 != null) {
                                ((SensorManager) systemService10).registerListener(this.f30530g, defaultSensor, 15);
                                return;
                            }
                            throw new u("null cannot be cast to non-null type android.hardware.SensorManager");
                        }
                        throw new u("null cannot be cast to non-null type android.hardware.SensorManager");
                    }
                    throw new u("null cannot be cast to non-null type android.location.LocationManager");
                }
                throw new u("null cannot be cast to non-null type android.location.LocationManager");
            }
            throw new u("null cannot be cast to non-null type android.location.LocationManager");
        }
        throw new u("null cannot be cast to non-null type android.location.LocationManager");
    }

    /* renamed from: m */
    public a onBind(Intent intent) {
        return this.f30531h;
    }

    public final void o(Location location) {
        this.f30538o = location;
    }

    public void onCreate() {
        super.onCreate();
        j();
    }

    public void onDestroy() {
        super.onDestroy();
        p();
        Object systemService = getSystemService("sensor");
        if (systemService != null) {
            ((SensorManager) systemService).unregisterListener(this.f30530g);
            return;
        }
        throw new u("null cannot be cast to non-null type android.hardware.SensorManager");
    }

    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        return 1;
    }

    public final void p() {
        Object systemService = getSystemService("location");
        if (systemService != null) {
            ((LocationManager) systemService).removeUpdates(this.f30528e);
            Object systemService2 = getSystemService("location");
            if (systemService2 != null) {
                ((LocationManager) systemService2).removeUpdates(this.f30529f);
                Object systemService3 = getSystemService("sensor");
                if (systemService3 != null) {
                    ((SensorManager) systemService3).unregisterListener(this.f30530g);
                    return;
                }
                throw new u("null cannot be cast to non-null type android.hardware.SensorManager");
            }
            throw new u("null cannot be cast to non-null type android.location.LocationManager");
        }
        throw new u("null cannot be cast to non-null type android.location.LocationManager");
    }
}
