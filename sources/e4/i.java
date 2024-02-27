package e4;

import android.app.Activity;
import android.os.Looper;
import com.google.android.gms.common.api.internal.c;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.location.LocationRequest;
import i4.b;
import q3.a;
import q3.d;
import s3.o;

public final class i extends d implements b {

    /* renamed from: k  reason: collision with root package name */
    static final a.g f10061k;

    /* renamed from: l  reason: collision with root package name */
    public static final a f10062l;

    static {
        a.g gVar = new a.g();
        f10061k = gVar;
        f10062l = new a("LocationServices.API", new f(), gVar);
    }

    public i(Activity activity) {
        super(activity, f10062l, (a.d) a.d.f14939a, d.a.f14951c);
    }

    private final p4.i m(LocationRequest locationRequest, c cVar) {
        h hVar = new h(this, cVar, c.f10049a);
        return e(f.a().b(new d(hVar, locationRequest)).d(hVar).e(cVar).c(2436).a());
    }

    public final p4.i a(LocationRequest locationRequest, i4.d dVar, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            o.j(looper, "invalid null looper");
        }
        return m(locationRequest, com.google.android.gms.common.api.internal.d.a(dVar, looper, i4.d.class.getSimpleName()));
    }
}
