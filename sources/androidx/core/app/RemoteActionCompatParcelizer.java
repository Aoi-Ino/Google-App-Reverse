package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.a;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f2196a = (IconCompat) aVar.v(remoteActionCompat.f2196a, 1);
        remoteActionCompat.f2197b = aVar.l(remoteActionCompat.f2197b, 2);
        remoteActionCompat.f2198c = aVar.l(remoteActionCompat.f2198c, 3);
        remoteActionCompat.f2199d = (PendingIntent) aVar.r(remoteActionCompat.f2199d, 4);
        remoteActionCompat.f2200e = aVar.h(remoteActionCompat.f2200e, 5);
        remoteActionCompat.f2201f = aVar.h(remoteActionCompat.f2201f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f2196a, 1);
        aVar.D(remoteActionCompat.f2197b, 2);
        aVar.D(remoteActionCompat.f2198c, 3);
        aVar.H(remoteActionCompat.f2199d, 4);
        aVar.z(remoteActionCompat.f2200e, 5);
        aVar.z(remoteActionCompat.f2201f, 6);
    }
}
