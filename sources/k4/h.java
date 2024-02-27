package k4;

import android.os.Bundle;
import android.os.Parcelable;
import s3.o;

public abstract class h {
    public static Parcelable a(Bundle bundle, String str) {
        ClassLoader d10 = d();
        bundle.setClassLoader(d10);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(d10);
        return bundle2.getParcelable(str);
    }

    public static void b(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            Parcelable a10 = a(bundle, "MapOptions");
            if (a10 != null) {
                c(bundle2, "MapOptions", a10);
            }
            Parcelable a11 = a(bundle, "StreetViewPanoramaOptions");
            if (a11 != null) {
                c(bundle2, "StreetViewPanoramaOptions", a11);
            }
            Parcelable a12 = a(bundle, "camera");
            if (a12 != null) {
                c(bundle2, "camera", a12);
            }
            if (bundle.containsKey("position")) {
                bundle2.putString("position", bundle.getString("position"));
            }
            if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
                bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
            }
        }
    }

    public static void c(Bundle bundle, String str, Parcelable parcelable) {
        ClassLoader d10 = d();
        bundle.setClassLoader(d10);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(d10);
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }

    private static ClassLoader d() {
        return (ClassLoader) o.i(h.class.getClassLoader());
    }
}
