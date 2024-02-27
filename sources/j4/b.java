package j4;

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import k4.a;
import l4.f;
import s3.o;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private static a f12697a;

    public static a a(LatLng latLng, float f10) {
        o.j(latLng, "latLng must not be null");
        try {
            return new a(c().S(latLng, f10));
        } catch (RemoteException e10) {
            throw new f(e10);
        }
    }

    public static void b(a aVar) {
        f12697a = (a) o.i(aVar);
    }

    private static a c() {
        return (a) o.j(f12697a, "CameraUpdateFactory is not initialized");
    }
}
